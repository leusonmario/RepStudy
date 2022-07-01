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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        synonymsAnalysisTest0.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.ensureCleanedUp();
        java.lang.String str13 = synonymsAnalysisTest10.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        synonymsAnalysisTest10.assertFieldsEquals("tests.monster", indexReader15, fields16, fields17, false);
        java.lang.String str20 = synonymsAnalysisTest10.getTestName();
        synonymsAnalysisTest10.ensureCheckIndexPassed();
        synonymsAnalysisTest10.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10.0f, (double) 3, (double) 100L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) 100, (double) (short) 100, (double) 4);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 10.0d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest2.assertDocsEnumEquals("tests.awaitsfix", postingsEnum6, postingsEnum7, true);
        synonymsAnalysisTest2.assertPathHasBeenCleared("tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", obj1, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray19);
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
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray40, (java.lang.Object) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray52);
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        java.lang.Object[] objArray63 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray52, objArray63);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (-1.0f));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 10.0d, (double) (byte) -1);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
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
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray47);
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule57 = synonymsAnalysisTest56.ruleChain;
        synonymsAnalysisTest56.ensureCleanedUp();
        org.junit.Assert.assertNotEquals("<unknown>", (java.lang.Object) boolean55, (java.lang.Object) synonymsAnalysisTest56);
        synonymsAnalysisTest56.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray3, (java.lang.Object) synonymsAnalysisTest56);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy6 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray7 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy6 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet8 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray4, (java.lang.Object[]) queryCachingPolicyArray7);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        byte[] byteArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray16);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        float[] floatArray4 = new float[] { (-1), 1, 5, 10L };
        float[] floatArray9 = new float[] { 10L, (-1L), 6, 3 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) 1);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
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
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray18);
        org.junit.Assert.assertArrayEquals(intArray10, intArray15);
        org.junit.Assert.assertArrayEquals("", intArray3, intArray15);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray25, intArray28);
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
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        int[] intArray54 = new int[] {};
        int[] intArray55 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray54, intArray55);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray52, intArray55);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray60, intArray63);
        org.junit.Assert.assertArrayEquals(intArray55, intArray60);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        org.junit.Assert.assertArrayEquals("", intArray55, intArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray46, intArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray37, intArray67);
        org.junit.Assert.assertArrayEquals(intArray25, intArray37);
        org.junit.Assert.assertArrayEquals("", intArray15, intArray25);
        java.lang.Object obj75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray25, obj75);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (byte) 10, (long) (byte) 10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
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
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        org.junit.Assert.assertArrayEquals(charArray8, charArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "tests.weekly", (java.lang.Object) charArray16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 5, (long) (byte) 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) 1L, (float) (short) 100, (float) ' ');
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (float) (short) -1, (float) (short) 10, (float) (short) 10);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) (short) 100, 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, false);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "random", (java.lang.Object) shortArray40);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 1L, (double) 1L);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms11);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (float) 1L, (float) 100, (float) 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str11 = synonymsAnalysisTest10.getTestName();
        java.lang.String str12 = synonymsAnalysisTest10.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest13.ruleChain;
        synonymsAnalysisTest13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest10.failureAndSuccessEvents = ruleChain16;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 100, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest1.ruleChain;
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray17);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray22, intArray25);
        org.junit.Assert.assertArrayEquals(intArray17, intArray22);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray30);
        org.junit.Assert.assertArrayEquals(intArray17, intArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) intArray30);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (-1L), (float) 4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
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
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) executorServiceArray54);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        float[] floatArray6 = new float[] { (short) 10, (short) 1, 100, (short) 10, (byte) 10 };
        float[] floatArray8 = new float[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray6, floatArray8, (float) (-1));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        float[] floatArray6 = new float[] { ' ', 10.0f, (byte) 0, '#', 10.0f, (-1.0f) };
        float[] floatArray12 = new float[] { 10L, (byte) 1, (byte) 100, 0L, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) (byte) 0);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray17);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        float[] floatArray3 = new float[] { 10.0f, 100 };
        float[] floatArray5 = new float[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray3, floatArray5, (float) 3);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        synonymsAnalysisTest9.assertTermsEquals("europarl.lines.txt.gz", indexReader11, terms12, terms13, false);
        synonymsAnalysisTest9.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest9.assertTermsEquals("tests.weekly", indexReader19, terms20, terms21, true);
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest9.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain7, (java.lang.Object) synonymsAnalysisTest9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10L, (float) 1L, 0.0f);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader6, fields7, fields8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12, true);
        org.elasticsearch.test.ESTestCase[] eSTestCaseArray15 = new org.elasticsearch.test.ESTestCase[] { synonymsAnalysisTest1 };
        java.util.Set<org.elasticsearch.test.ESTestCase> eSTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray15);
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray19 = new java.lang.CharSequence[][][] { charSequenceArray17, charSequenceArray18 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) eSTestCaseArray15, (java.lang.Object[]) charSequenceArray19);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) (byte) 1);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray5, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest11.assertPositionsSkippingEquals("", indexReader15, (int) ' ', postingsEnum17, postingsEnum18);
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest11.ensureCleanedUp();
        double[] doubleArray22 = new double[] {};
        double[] doubleArray23 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray23, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest11, (java.lang.Object) doubleArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray1, doubleArray23, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) '#');
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str7 = synonymsAnalysisTest6.getTestName();
        java.lang.String str8 = synonymsAnalysisTest6.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        synonymsAnalysisTest9.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest9.failureAndSuccessEvents;
        synonymsAnalysisTest6.failureAndSuccessEvents = ruleChain12;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest6.assertTermsEquals("tests.maxfailures", indexReader15, terms16, terms17, false);
        java.lang.Class<?> wildcardClass20 = synonymsAnalysisTest6.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass20;
        java.util.Set<java.lang.Class<?>> wildcardClassSet26 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray23);
        java.util.List<java.lang.reflect.Type> typeList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain3, (java.lang.Object) typeList27);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule30 = synonymsAnalysisTest29.ruleChain;
        synonymsAnalysisTest29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest29.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        synonymsAnalysisTest29.assertPositionsSkippingEquals("tests.awaitsfix", indexReader34, (int) (short) 100, postingsEnum36, postingsEnum37);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest39.ruleChain;
        synonymsAnalysisTest39.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest39.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain42);
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain3, (java.lang.Object) ruleChain42);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.failfast", false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) byteArray3, (java.lang.Object) (-1L));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        float[] floatArray7 = new float[] { (byte) 0, (short) 0, 'a', (byte) 10, (short) 0, ' ' };
        float[] floatArray11 = new float[] { 1, 0.0f, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray11, (float) (short) 10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.weekly", indexReader10, terms11, terms12, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest15.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest15.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        synonymsAnalysisTest15.assertPositionsSkippingEquals("tests.nightly", indexReader25, 0, postingsEnum27, postingsEnum28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) postingsEnum28);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", 0, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest0.ruleChain;
        java.lang.Class<?> wildcardClass12 = testRule11.getClass();
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
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray65);
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass12, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) 10.0f, (double) (byte) -1, (double) '#');
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
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
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest14.assertFieldsEquals("<unknown>", indexReader21, fields22, fields23, false);
        java.lang.Object obj26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) false, obj26);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1L), (long) 2);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
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
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
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
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray18);
        char[] charArray35 = new char[] { '#' };
        char[] charArray37 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        char[] charArray40 = new char[] { '#' };
        char[] charArray42 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray35, charArray40);
        char[] charArray46 = new char[] { '#' };
        char[] charArray48 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray46, charArray48);
        char[] charArray51 = new char[] { '#' };
        char[] charArray53 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray51, charArray53);
        org.junit.Assert.assertArrayEquals(charArray48, charArray53);
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray57);
        org.junit.Assert.assertArrayEquals("", charArray35, charArray53);
        char[] charArray61 = new char[] { '#' };
        char[] charArray63 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray61, charArray63);
        org.junit.Assert.assertArrayEquals(charArray35, charArray63);
        char[] charArray67 = new char[] { '#' };
        char[] charArray69 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray67, charArray69);
        char[] charArray72 = new char[] { '#' };
        char[] charArray74 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray72, charArray74);
        org.junit.Assert.assertArrayEquals(charArray69, charArray74);
        org.junit.Assert.assertArrayEquals("hi!", charArray63, charArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) executorServiceArray18, (java.lang.Object) "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        float[] floatArray0 = new float[] {};
        float[] floatArray5 = new float[] { 0, (short) -1, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) 4);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 3);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) longArray3);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum5, postingsEnum6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.tearDown();
        synonymsAnalysisTest0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 1L, (float) 6);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 100);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
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
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray44);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        float[] floatArray1 = null;
        float[] floatArray8 = new float[] { ' ', (byte) 100, 0L, 3, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray8, (float) (byte) 100);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        float[] floatArray2 = new float[] { (-1L) };
        float[] floatArray6 = new float[] { (short) 100, 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray2, floatArray6, (float) ' ');
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', 0L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        float[] floatArray1 = null;
        float[] floatArray2 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray2, 0.0f);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (byte) 100);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        synonymsAnalysisTest43.assertTermsEquals("europarl.lines.txt.gz", indexReader45, terms46, terms47, false);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        synonymsAnalysisTest43.assertDocsSkippingEquals("tests.maxfailures", indexReader51, (-1), postingsEnum53, postingsEnum54, true);
        synonymsAnalysisTest43.ensureCheckIndexPassed();
        java.lang.String str58 = synonymsAnalysisTest43.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) "<unknown>", (java.lang.Object) str58);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) 0, (float) 10L, (float) 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 100, 0L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        float[] floatArray5 = new float[] { ' ', '#', 10, (short) 10 };
        float[] floatArray12 = new float[] { (-1.0f), 1.0f, 1.0f, (short) 1, (short) 100, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray5, floatArray12, (-1.0f));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        float[] floatArray1 = new float[] {};
        float[] floatArray3 = new float[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray1, floatArray3, (float) 2);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
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
        java.lang.Object[] objArray15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray7, objArray15);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) 0, (float) (byte) 1, (float) (-1L));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("<unknown>", (double) (short) -1, (double) 6, (double) 10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (byte) 1);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        float[] floatArray1 = new float[] { 0.0f };
        float[] floatArray8 = new float[] { (byte) 0, (-1), 100L, 'a', 10.0f, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray8, (float) (short) 10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        float[] floatArray5 = new float[] { (-1L), 3, (byte) 100, '4', (short) 10 };
        float[] floatArray8 = new float[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray8, 1.0f);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.failfast", "tests.monster" };
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray20, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray48);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray58);
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray48);
        java.lang.Object obj68 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray48, obj68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray48);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray1, shortArray2);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray12, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray22, shortArray27);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray7, shortArray17);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        short[] shortArray44 = new short[] {};
        short[] shortArray45 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray44, shortArray45);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray48, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray44, shortArray49);
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
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray64);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray49);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray71, shortArray72);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray71, shortArray76);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray81);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray76);
        org.junit.Assert.assertArrayEquals("random", shortArray17, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        char[] charArray1 = new char[] { '#' };
        char[] charArray3 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
        char[] charArray6 = new char[] { '#' };
        char[] charArray8 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
        char[] charArray14 = new char[] { '#' };
        char[] charArray16 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray14, charArray16);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray16);
        org.junit.Assert.assertArrayEquals(charArray3, charArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray16);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray2, shortArray7);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray7);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 100, (float) ' ');
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        synonymsAnalysisTest1.assertFieldsEquals("", indexReader13, fields14, fields15, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        java.lang.String str15 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str22 = synonymsAnalysisTest21.getTestName();
        java.lang.String str23 = synonymsAnalysisTest21.getTestName();
        synonymsAnalysisTest21.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest21.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) synonymsAnalysisTest21);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
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
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (-1), (double) (short) 0, 100.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
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
        char[] charArray37 = new char[] { '#' };
        char[] charArray39 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        char[] charArray42 = new char[] { '#' };
        char[] charArray44 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray37, charArray42);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray4, charArray37);
        char[] charArray49 = new char[] { '#' };
        char[] charArray51 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray49, charArray51);
        char[] charArray54 = new char[] { '#' };
        char[] charArray56 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray54, charArray56);
        org.junit.Assert.assertArrayEquals(charArray51, charArray56);
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
        org.junit.Assert.assertArrayEquals(charArray4, charArray56);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray78);
        java.util.concurrent.ExecutorService executorService81 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] { executorService81 };
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray82);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray78, (java.lang.Object[]) executorServiceArray82);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray66, (java.lang.Object) executorServiceArray78);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray56, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest12.ensureCleanedUp();
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) doubleArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray2, doubleArray24, (double) '#');
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) (byte) 1);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray32, doubleArray35, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray35, (double) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) doubleArray2);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (-1.0d));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain9 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        float[] floatArray6 = new float[] { 100.0f, 0.0f, 100L, (byte) -1, 0.0f, 100.0f };
        float[] floatArray8 = new float[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray8, (float) (short) -1);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
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
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", 2, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) 4, (double) 10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        float[] floatArray4 = new float[] { (short) 100, '4', 'a', 100L };
        float[] floatArray8 = new float[] { ' ', 1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray8, (float) (byte) -1);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        char[][][] charArray0 = new char[][][] {};
        java.util.Set<char[][]> charArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(charArray0);
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charArray0, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) '#', 0.0d, (double) (byte) 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray2, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray15, longArray16);
        org.junit.Assert.assertArrayEquals(longArray11, longArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray11);
        long[] longArray20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray11, longArray20);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        float[] floatArray1 = new float[] { '4' };
        float[] floatArray7 = new float[] { ' ', 6, 100.0f, 100, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, (float) (short) 10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        java.lang.Class<?> wildcardClass6 = synonymsAnalysisTest1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) wildcardClass6);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 10, (double) 2, (double) (short) 100);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("<unknown>", indexReader6, (int) '#', postingsEnum8, postingsEnum9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) (byte) -1, (double) (-1));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        float[] floatArray5 = new float[] { 0.0f, 0, (short) -1, 10 };
        float[] floatArray12 = new float[] { (-1L), 100.0f, ' ', 100L, 10.0f, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray5, floatArray12, 10.0f);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (short) 0, 100.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest1.tearDown();
        synonymsAnalysisTest1.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.weekly", indexReader7, (int) '4', postingsEnum9, postingsEnum10, true);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) "", (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2, throttling3, throttling4, throttling5 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray6);
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
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
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
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray46, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray25, (java.lang.Object) executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) executorServiceArray46);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        java.lang.Object obj1 = null;
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) synonymsAnalysisTest16);
        synonymsAnalysisTest16.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest16.assertDocsEnumEquals("tests.monster", postingsEnum23, postingsEnum24, false);
        synonymsAnalysisTest16.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest16);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", obj1, (java.lang.Object) synonymsAnalysisTest16);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest16.assertDocsAndPositionsEnumEquals("", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(10.0d, 0.0d, (double) (short) 10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
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
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray37, shortArray42);
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray46, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray47);
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) (-1L), (java.lang.Object) shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray47);
        java.lang.Object obj52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) shortArray13, obj52);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", 0.0d, (double) (short) -1, 100.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (-1L), (double) 1L);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1.0d), (double) 1.0f);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        java.lang.Object obj0 = null;
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
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray21, shortArray26);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray21);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray31);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray39, shortArray40);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray39, shortArray44);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray44);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray50, shortArray51);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray55, shortArray56);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray59, shortArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray55, shortArray60);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray65, shortArray66);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray65, shortArray70);
        short[] shortArray74 = new short[] {};
        short[] shortArray75 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray74, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray75);
        org.junit.Assert.assertArrayEquals("", shortArray50, shortArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray44, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) shortArray14);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
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
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray45, shortArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray46);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray51, shortArray56);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray61);
        org.junit.Assert.assertArrayEquals("", shortArray36, shortArray46);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray68, shortArray69);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray68, shortArray73);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray78);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray73);
        org.junit.Assert.assertArrayEquals("random", shortArray14, shortArray73);
        short[] shortArray84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray73, shortArray84);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0L, 0L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        float[] floatArray3 = new float[] { (byte) -1, (byte) 100 };
        float[] floatArray10 = new float[] { (byte) 10, '4', '4', 10.0f, 10, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray3, floatArray10, (float) 'a');
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 10L);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        float[] floatArray5 = new float[] { 10L, (byte) 1, 1, (short) -1, (byte) 10 };
        float[] floatArray8 = new float[] { (-1.0f), (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray8, 100.0f);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        java.lang.Object obj2 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray4, longArray5);
        long[] longArray8 = new long[] {};
        long[] longArray9 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray8, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        org.junit.Assert.assertNotEquals("tests.weekly", obj2, (java.lang.Object) longArray4);
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray20, longArray29);
        org.junit.Assert.assertArrayEquals(longArray4, longArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) longArray20, (java.lang.Object) "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        float[] floatArray3 = new float[] { 10, ' ' };
        float[] floatArray9 = new float[] { (short) 0, 10L, 1L, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray3, floatArray9, (float) (byte) -1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.setIndexWriterMaxDocs(4);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray33, (java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray67);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray57);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) 4, (java.lang.Object) executorServiceArray26);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100L, (long) 3);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str5 = synonymsAnalysisTest4.getTestName();
        java.lang.String str6 = synonymsAnalysisTest4.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule8 = synonymsAnalysisTest7.ruleChain;
        synonymsAnalysisTest7.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest7.failureAndSuccessEvents;
        synonymsAnalysisTest4.failureAndSuccessEvents = ruleChain10;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain10;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) ruleChain10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str11 = synonymsAnalysisTest10.getTestName();
        java.lang.String str12 = synonymsAnalysisTest10.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest10.assertPositionsSkippingEquals("", indexReader14, (int) ' ', postingsEnum16, postingsEnum17);
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest10.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest10.ensureCleanedUp();
        synonymsAnalysisTest10.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) testRule9, (java.lang.Object) synonymsAnalysisTest10);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray15);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray20, intArray23);
        org.junit.Assert.assertArrayEquals(intArray15, intArray20);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("", intArray15, intArray27);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray6, intArray27);
        int[] intArray34 = new int[] { 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray27, intArray34);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
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
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray46);
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
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray46);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        float[] floatArray7 = new float[] { (byte) 0, 'a', 5, (-1.0f), 0.0f, 4 };
        float[] floatArray12 = new float[] { 100, 100L, (byte) 0, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray7, floatArray12, (-1.0f));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, (int) ' ', postingsEnum7, postingsEnum8);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.weekly", indexReader16, 0, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("enwiki.random.lines.txt", (int) ' ', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray1);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray11, (java.lang.Object) synonymsAnalysisTest18);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray46);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest69 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule70 = synonymsAnalysisTest69.ruleChain;
        synonymsAnalysisTest69.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest72 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        synonymsAnalysisTest72.assertTermsEquals("europarl.lines.txt.gz", indexReader74, terms75, terms76, false);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        synonymsAnalysisTest72.assertDocsSkippingEquals("tests.maxfailures", indexReader80, (-1), postingsEnum82, postingsEnum83, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray86 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest69, synonymsAnalysisTest72 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet87 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray86);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray11, (java.lang.Object) synonymsAnalysisTestSet87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) typeArray1, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) ' ', postingsEnum21, postingsEnum22, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.badapples", indexReader6, fields7, fields8, false);
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
        synonymsAnalysisTest24.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str37 = synonymsAnalysisTest24.getTestName();
        java.lang.Class<?> wildcardClass38 = synonymsAnalysisTest24.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) indexReader6, (java.lang.Object) synonymsAnalysisTest24);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
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
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
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
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray11, (java.lang.Object) executorServiceArray27);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '#', (float) 'a', (float) (short) 10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, (double) ' ');
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("", indexReader9, fields10, fields11, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) fields10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
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
        java.util.concurrent.ExecutorService executorService46 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] { executorService46 };
        boolean boolean48 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray47);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray63, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strSetArray32, (java.lang.Object[]) executorServiceArray63);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 'a');
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), 10.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
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
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.monster", postingsEnum20, postingsEnum21, false);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str26 = synonymsAnalysisTest13.getTestName();
        synonymsAnalysisTest13.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        synonymsAnalysisTest13.assertTermsEquals("tests.monster", indexReader30, terms31, terms32, true);
        synonymsAnalysisTest13.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocValuesEquals("tests.failfast", (int) (short) -1, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
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
        org.junit.rules.RuleChain ruleChain34 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str36 = synonymsAnalysisTest35.getTestName();
        java.lang.String str37 = synonymsAnalysisTest35.getTestName();
        java.lang.String str38 = synonymsAnalysisTest35.getTestName();
        synonymsAnalysisTest35.setUp();
        synonymsAnalysisTest35.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest14, (java.lang.Object) synonymsAnalysisTest35);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) 3);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("<unknown>", (int) (byte) 10, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
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
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray21);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray24);
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
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) executorServiceArray43);
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
        java.lang.Class<?> wildcardClass64 = synonymsAnalysisTest50.getClass();
        java.lang.Class[] classArray66 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        wildcardClassArray67[0] = wildcardClass64;
        java.util.Set<java.lang.Class<?>> wildcardClassSet70 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray67);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray81);
        java.util.concurrent.ExecutorService executorService84 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] { executorService84 };
        boolean boolean86 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray85);
        java.util.concurrent.ExecutorService executorService87 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray88 = new java.util.concurrent.ExecutorService[] { executorService87 };
        boolean boolean89 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray88);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray85, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray88);
        org.junit.Assert.assertNotSame((java.lang.Object) wildcardClassArray67, (java.lang.Object) executorServiceArray88);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) wildcardClassArray67);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        float[] floatArray3 = new float[] { 10.0f, 100.0f };
        float[] floatArray6 = new float[] { (byte) 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray3, floatArray6, (float) 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.tearDown();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest15.ruleChain;
        synonymsAnalysisTest15.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = synonymsAnalysisTest15.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain18;
        synonymsAnalysisTest12.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest12.setUp();
        synonymsAnalysisTest12.ensureCheckIndexPassed();
        synonymsAnalysisTest12.resetCheckIndexStatus();
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
        synonymsAnalysisTest38.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest38.assertDocsEnumEquals("tests.monster", postingsEnum45, postingsEnum46, false);
        synonymsAnalysisTest38.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule50 = synonymsAnalysisTest38.ruleChain;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        synonymsAnalysisTest38.assertDocsSkippingEquals("tests.slow", indexReader52, (int) (byte) 10, postingsEnum54, postingsEnum55, false);
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest38.failureAndSuccessEvents;
        synonymsAnalysisTest12.failureAndSuccessEvents = ruleChain58;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest12);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) '4', (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        char[] charArray0 = null;
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
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray27, charArray32);
        org.junit.Assert.assertArrayEquals(charArray23, charArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray23);
        char[] charArray41 = new char[] { '#' };
        char[] charArray43 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray41, charArray43);
        char[] charArray46 = new char[] { '#' };
        char[] charArray48 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray46, charArray48);
        char[] charArray51 = new char[] { '#' };
        char[] charArray53 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray51, charArray53);
        char[] charArray56 = new char[] { '#' };
        char[] charArray58 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray56, charArray58);
        org.junit.Assert.assertArrayEquals(charArray53, charArray58);
        org.junit.Assert.assertArrayEquals(charArray48, charArray53);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray43, charArray48);
        org.junit.Assert.assertArrayEquals(charArray23, charArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray48);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        int[] intArray4 = new int[] { '4', 100, '#', (byte) 1 };
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray11, intArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        synonymsAnalysisTest17.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, false);
        synonymsAnalysisTest17.setIndexWriterMaxDocs(1);
        java.lang.String str26 = synonymsAnalysisTest17.getTestName();
        java.lang.String str27 = synonymsAnalysisTest17.getTestName();
        synonymsAnalysisTest17.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) intArray11, (java.lang.Object) synonymsAnalysisTest17);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray36, intArray39);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray47);
        org.junit.Assert.assertArrayEquals(intArray39, intArray44);
        org.junit.Assert.assertArrayEquals("", intArray32, intArray44);
        org.junit.Assert.assertArrayEquals(intArray11, intArray32);
        org.junit.Assert.assertArrayEquals(intArray6, intArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, 1L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 0, (double) 0L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        synonymsAnalysisTest2.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        synonymsAnalysisTest12.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str19 = synonymsAnalysisTest18.getTestName();
        java.lang.String str20 = synonymsAnalysisTest18.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest21.ruleChain;
        synonymsAnalysisTest21.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest21.failureAndSuccessEvents;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain24;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        synonymsAnalysisTest18.assertTermsEquals("tests.maxfailures", indexReader27, terms28, terms29, false);
        java.lang.Class<?> wildcardClass32 = synonymsAnalysisTest18.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.util.Set<java.lang.Class<?>> wildcardClassSet38 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray35);
        java.util.List<java.lang.reflect.Type> typeList39 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain15, (java.lang.Object) typeList39);
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest2.setUp();
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
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray60);
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
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        java.util.concurrent.ExecutorService executorService83 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] { executorService83 };
        boolean boolean85 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray81, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray81, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray60, (java.lang.Object) executorServiceArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest2, (java.lang.Object) executorServiceArray60);
        synonymsAnalysisTest2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) locale1, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (short) 10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("random", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.nightly", indexReader19, (int) ' ', postingsEnum21, postingsEnum22, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest1);
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest1.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest3.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, false);
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("random", indexReader14, (int) (short) 10, postingsEnum16, postingsEnum17, false);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("tests.nightly", indexReader21, (int) ' ', postingsEnum23, postingsEnum24, true);
        org.junit.Assert.assertNotNull("", (java.lang.Object) synonymsAnalysisTest3);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        synonymsAnalysisTest3.assertTermsEquals("tests.failfast", indexReader29, terms30, terms31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        synonymsAnalysisTest3.assertDocsSkippingEquals("random", indexReader35, (-1), postingsEnum37, postingsEnum38, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) (short) -1, (java.lang.Object) synonymsAnalysisTest3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        java.lang.String str5 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (short) 10, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, 0.0f);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        float[] floatArray6 = new float[] { 0L, 0L, 0.0f, 10, 1L, (short) 10 };
        float[] floatArray10 = new float[] { 4, (short) 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) (short) 1);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
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
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet51 = org.apache.lucene.util.LuceneTestCase.asSet(strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strSetArray32, (java.lang.Object[]) strArray50);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest9.ruleChain;
        synonymsAnalysisTest9.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest9.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain12);
        synonymsAnalysisTest6.failureAndSuccessEvents = ruleChain12;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) ruleChain12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
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
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray13);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray23, longArray24);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray24, longArray27);
        org.junit.Assert.assertArrayEquals(longArray13, longArray24);
        long[] longArray34 = new long[] {};
        long[] longArray35 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray34, longArray35);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray38, longArray39);
        org.junit.Assert.assertArrayEquals(longArray34, longArray39);
        long[] longArray43 = new long[] {};
        long[] longArray44 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray43, longArray44);
        long[] longArray47 = new long[] {};
        long[] longArray48 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray47, longArray48);
        org.junit.Assert.assertArrayEquals(longArray43, longArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray34, longArray43);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray24, longArray43);
        long[] longArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray43, longArray53);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        char[] charArray2 = new char[] { '#' };
        char[] charArray4 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray4);
        char[] charArray7 = new char[] { '#' };
        char[] charArray9 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray7, charArray9);
        org.junit.Assert.assertArrayEquals(charArray4, charArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) charArray4, (java.lang.Object) str13);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) (byte) 1);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray6, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str13 = synonymsAnalysisTest12.getTestName();
        java.lang.String str14 = synonymsAnalysisTest12.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest12.assertPositionsSkippingEquals("", indexReader16, (int) ' ', postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest12.ensureCleanedUp();
        double[] doubleArray23 = new double[] {};
        double[] doubleArray24 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray24, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest12, (java.lang.Object) doubleArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray2, doubleArray24, (double) '#');
        double[] doubleArray31 = new double[] {};
        double[] doubleArray32 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray32, (double) (byte) 1);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray32, doubleArray35, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray35, (double) 2);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest56 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule57 = synonymsAnalysisTest56.ruleChain;
        synonymsAnalysisTest56.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain59 = synonymsAnalysisTest56.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray49, (java.lang.Object) synonymsAnalysisTest56);
        synonymsAnalysisTest56.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        synonymsAnalysisTest56.assertDocsEnumEquals("tests.monster", postingsEnum63, postingsEnum64, false);
        synonymsAnalysisTest56.setIndexWriterMaxDocs((int) (byte) 0);
        java.lang.String str69 = synonymsAnalysisTest56.getTestName();
        synonymsAnalysisTest56.assertPathHasBeenCleared("random");
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        synonymsAnalysisTest56.assertTermsEquals("tests.monster", indexReader73, terms74, terms75, true);
        synonymsAnalysisTest56.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest56.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) doubleArray35, (java.lang.Object) synonymsAnalysisTest56);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
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
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, 0, postingsEnum15, postingsEnum16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) (short) 100, (float) 2, (float) 3);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        int[] intArray5 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[] intArray11 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        int[] intArray18 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[] intArray24 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[][] intArray25 = new int[][] { intArray18, intArray24 };
        int[] intArray31 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[] intArray37 = new int[] { (byte) 10, 5, 4, (short) 0, (byte) 0 };
        int[][] intArray38 = new int[][] { intArray31, intArray37 };
        int[][][] intArray39 = new int[][][] { intArray12, intArray25, intArray38 };
        java.util.Set<int[][]> intArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(intArray39);
        short[] shortArray45 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray46 = new short[][] { shortArray45 };
        java.util.Set<short[]> shortArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) intArray39, (java.lang.Object[]) shortArray46);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) synonymsAnalysisTest16);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray46);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray46);
        java.lang.Object[] objArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray46, objArray51);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        java.lang.Object obj2 = null;
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
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray11, longArray20);
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
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray26, longArray35);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray45, longArray46);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray49, longArray50);
        org.junit.Assert.assertArrayEquals(longArray46, longArray50);
        org.junit.Assert.assertArrayEquals(longArray35, longArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray20, longArray50);
        org.junit.Assert.assertNotSame("", obj2, (java.lang.Object) longArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest58 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str59 = synonymsAnalysisTest58.getTestName();
        java.lang.String str60 = synonymsAnalysisTest58.getTestName();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        synonymsAnalysisTest58.assertPositionsSkippingEquals("", indexReader62, (int) ' ', postingsEnum64, postingsEnum65);
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest58.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain68 = synonymsAnalysisTest58.failureAndSuccessEvents;
        synonymsAnalysisTest58.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest58);
        java.lang.Object obj72 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest58, obj72);
        java.lang.Class<?> wildcardClass74 = synonymsAnalysisTest58.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) "", (java.lang.Object) wildcardClass74);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        char[] charArray1 = new char[] { '#' };
        char[] charArray3 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray1, charArray3);
        char[] charArray6 = new char[] { '#' };
        char[] charArray8 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray6, charArray8);
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
        char[] charArray12 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        char[] charArray19 = new char[] { '#' };
        char[] charArray21 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray21);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray24);
        char[] charArray30 = new char[] { '#' };
        char[] charArray32 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        char[] charArray35 = new char[] { '#' };
        char[] charArray37 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        org.junit.Assert.assertArrayEquals(charArray32, charArray37);
        char[] charArray41 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray41);
        org.junit.Assert.assertArrayEquals("", charArray19, charArray37);
        char[] charArray45 = new char[] { '#' };
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        org.junit.Assert.assertArrayEquals(charArray19, charArray47);
        char[] charArray52 = new char[] { '#' };
        char[] charArray54 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray52, charArray54);
        char[] charArray57 = new char[] { '#' };
        char[] charArray59 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray57, charArray59);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray52, charArray57);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray19, charArray52);
        char[] charArray64 = new char[] { '#' };
        char[] charArray66 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray64, charArray66);
        char[] charArray69 = new char[] { '#' };
        char[] charArray71 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray69, charArray71);
        org.junit.Assert.assertArrayEquals(charArray66, charArray71);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray19, charArray71);
        org.junit.Assert.assertArrayEquals(charArray8, charArray71);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray77, byteArray78);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray81, byteArray82);
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray71, (java.lang.Object) byteArray84);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
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
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray18);
        org.junit.Assert.assertArrayEquals(intArray10, intArray15);
        org.junit.Assert.assertArrayEquals("", intArray3, intArray15);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray25, intArray28);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray33, intArray36);
        org.junit.Assert.assertArrayEquals(intArray28, intArray33);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray41);
        org.junit.Assert.assertArrayEquals(intArray28, intArray41);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray41);
        org.junit.Assert.assertArrayEquals(intArray15, intArray41);
        int[] intArray48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray15, intArray48);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 'a');
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) 1, (long) 4);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 100.0f, (double) ' ');
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) strArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest11.assertDocsEnumEquals("tests.slow", postingsEnum15, postingsEnum16, false);
        synonymsAnalysisTest11.tearDown();
        synonymsAnalysisTest11.setUp();
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
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain45;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest11);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        synonymsAnalysisTest6.assertDocsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17, true);
        synonymsAnalysisTest6.ensureCheckIndexPassed();
        java.lang.String str21 = synonymsAnalysisTest6.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        synonymsAnalysisTest6.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray3, (java.lang.Object) "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
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
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) 'a', numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        java.lang.String str6 = synonymsAnalysisTest1.getTestName();
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) str6, (java.lang.Object) executorServiceArray24);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 1, (double) (short) -1);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        float[] floatArray0 = null;
        float[] floatArray7 = new float[] { (-1L), 1, 100.0f, ' ', (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray7, (float) (byte) 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray26);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 1, (double) 5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("<unknown>", indexReader6, (int) '#', postingsEnum8, postingsEnum9);
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("europarl.lines.txt.gz", 6, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray23, shortArray28);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray19);
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
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray56, shortArray57);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray56, shortArray61);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray66, shortArray67);
        short[] shortArray70 = new short[] {};
        short[] shortArray71 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray70, shortArray71);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray66, shortArray71);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray76);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray51, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray51);
        short[] shortArray82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray82);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        synonymsAnalysisTest0.assertFieldsEquals("hi!", indexReader9, fields10, fields11, true);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("tests.nightly", indexReader16, (int) (short) 0, postingsEnum18, postingsEnum19, false);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        char[] charArray29 = new char[] { '#' };
        char[] charArray31 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray31);
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        char[] charArray35 = new char[] { '#' };
        char[] charArray37 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray37);
        char[] charArray40 = new char[] { '#' };
        char[] charArray42 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray40, charArray42);
        char[] charArray45 = new char[] { '#' };
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray47);
        org.junit.Assert.assertArrayEquals(charArray42, charArray47);
        org.junit.Assert.assertArrayEquals(charArray37, charArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray29, charArray37);
        char[] charArray55 = new char[] { '#' };
        char[] charArray57 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray55, charArray57);
        char[] charArray60 = new char[] { '#' };
        char[] charArray62 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray60, charArray62);
        org.junit.Assert.assertArrayEquals(charArray57, charArray62);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray57);
        org.junit.Assert.assertArrayEquals(charArray29, charArray57);
        char[] charArray70 = new char[] { '#' };
        char[] charArray72 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        char[] charArray75 = new char[] { '#' };
        char[] charArray77 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray75, charArray77);
        org.junit.Assert.assertArrayEquals(charArray72, charArray77);
        org.junit.Assert.assertNotEquals("random", (java.lang.Object) (byte) 1, (java.lang.Object) charArray72);
        org.junit.Assert.assertArrayEquals(charArray57, charArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.nightly", (java.lang.Object) charArray72);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray19);
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
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray29);
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy37 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray38 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy37 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicySet39 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray38);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) queryCachingPolicyArray38);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        float[] floatArray6 = new float[] { 1.0f, 5, 10L, (short) 1, (-1.0f) };
        float[] floatArray10 = new float[] { 5, 10L, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray6, floatArray10, (float) 0);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str5 = synonymsAnalysisTest4.getTestName();
        java.lang.String str6 = synonymsAnalysisTest4.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        synonymsAnalysisTest4.assertPositionsSkippingEquals("", indexReader8, (int) ' ', postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest4.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest4.setIndexWriterMaxDocs((int) (byte) 100);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest4);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTest4, obj18);
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest4.ruleChain;
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) synonymsAnalysisTest4);
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest4.ruleChain;
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
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
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray43);
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
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray53);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        java.util.concurrent.ExecutorService executorService66 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray67 = new java.util.concurrent.ExecutorService[] { executorService66 };
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray67);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray64, (java.lang.Object[]) executorServiceArray67);
        java.util.concurrent.ExecutorService executorService72 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray73 = new java.util.concurrent.ExecutorService[] { executorService72 };
        boolean boolean74 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray73);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray76);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray73, (java.lang.Object[]) executorServiceArray76);
        java.util.concurrent.ExecutorService executorService79 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] { executorService79 };
        boolean boolean81 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray80);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray64, (java.lang.Object) executorServiceArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) synonymsAnalysisTest4, (java.lang.Object) executorServiceArray76);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (-1));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '4', 1L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (float) (short) 1, (float) 6, (float) (byte) 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        float[] floatArray2 = new float[] { (short) 0, 0 };
        float[] floatArray9 = new float[] { ' ', 1, 0, 10L, 3, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray9, (float) (-1));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        java.lang.String str10 = synonymsAnalysisTest7.getTestName();
        synonymsAnalysisTest7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest7.failureAndSuccessEvents;
        java.lang.String str13 = synonymsAnalysisTest7.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest17 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str18 = synonymsAnalysisTest17.getTestName();
        java.lang.String str19 = synonymsAnalysisTest17.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest20 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule21 = synonymsAnalysisTest20.ruleChain;
        synonymsAnalysisTest20.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest20.failureAndSuccessEvents;
        synonymsAnalysisTest17.failureAndSuccessEvents = ruleChain23;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain23;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingArray5, (java.lang.Object) ruleChain23);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
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
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "hi!");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100L, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 10L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ' ');
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray12, longArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray3, longArray12);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) (byte) 1);
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray26, doubleArray27, (double) (byte) 1);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray27, doubleArray30, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray27, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) "tests.failfast", (java.lang.Object) doubleArray27);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        float[] floatArray7 = new float[] { (byte) 100, (-1L), (short) 10, (byte) 0, 100, 1 };
        float[] floatArray14 = new float[] { (short) 100, 100L, (byte) -1, ' ', (byte) -1, 1.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray7, floatArray14, (float) '4');
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
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
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray45);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet60 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) charSequenceArray59);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        java.lang.String str9 = synonymsAnalysisTest0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        char[][][] charArray1 = new char[][][] {};
        java.util.Set<char[][]> charArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(charArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray20);
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
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray41);
        java.util.concurrent.ExecutorService executorService43 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] { executorService43 };
        boolean boolean45 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray44);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray41, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray20, (java.lang.Object) executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) charArray1, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        float[] floatArray4 = new float[] { 0, (-1.0f), 2, 10L };
        float[] floatArray9 = new float[] { 5, 0, 3, 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 5, 0L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        float[] floatArray7 = new float[] { 100, ' ', 1, 1, 100, (byte) -1 };
        float[] floatArray13 = new float[] { (short) 10, (short) 10, 10, 2, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray7, floatArray13, (float) (byte) 100);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray15);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class[][] classArray23 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray24 = (java.lang.Class<?>[][]) classArray23;
        wildcardClassArray24[0] = wildcardClassArray21;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray24);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) wildcardClassArray24);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str3 = synonymsAnalysisTest2.getTestName();
        java.lang.String str4 = synonymsAnalysisTest2.getTestName();
        synonymsAnalysisTest2.overrideTestDefaultQueryCache();
        synonymsAnalysisTest2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", obj1, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray9, intArray12);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray18, intArray21);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray27, intArray30);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray35, intArray38);
        org.junit.Assert.assertArrayEquals(intArray30, intArray35);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("", intArray30, intArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray21, intArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray12, intArray42);
        int[] intArray50 = new int[] {};
        int[] intArray51 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray50, intArray51);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray51, intArray54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray59, intArray62);
        org.junit.Assert.assertArrayEquals("", intArray54, intArray62);
        org.junit.Assert.assertArrayEquals("", intArray12, intArray54);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        int[] intArray71 = new int[] {};
        int[] intArray72 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray71, intArray72);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray69, intArray72);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        int[] intArray79 = new int[] {};
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray79, intArray80);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray77, intArray80);
        org.junit.Assert.assertArrayEquals(intArray72, intArray77);
        int[] intArray85 = new int[] {};
        int[] intArray86 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray85, intArray86);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray85);
        org.junit.Assert.assertArrayEquals(intArray72, intArray85);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray54, intArray72);
        org.junit.Assert.assertArrayEquals(intArray2, intArray54);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest92 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule93 = synonymsAnalysisTest92.ruleChain;
        synonymsAnalysisTest92.ensureCleanedUp();
        synonymsAnalysisTest92.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) intArray2, (java.lang.Object) synonymsAnalysisTest92);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) '#', (long) ' ');
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        float[] floatArray1 = new float[] {};
        float[] floatArray7 = new float[] { 0, 100.0f, (byte) 1, 0L, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray7, 1.0f);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray4, intArray7);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray12, intArray15);
        org.junit.Assert.assertArrayEquals(intArray7, intArray12);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray24, intArray27);
        org.junit.Assert.assertArrayEquals(intArray19, intArray24);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray7, intArray24);
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
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray53, intArray56);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray61, intArray64);
        org.junit.Assert.assertArrayEquals(intArray56, intArray61);
        int[] intArray68 = new int[] {};
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray68, intArray69);
        org.junit.Assert.assertArrayEquals("", intArray56, intArray68);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray47, intArray68);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray38, intArray68);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray7, intArray68);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest75.assertTermsEquals("europarl.lines.txt.gz", indexReader77, terms78, terms79, false);
        synonymsAnalysisTest75.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain84 = synonymsAnalysisTest75.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule85 = synonymsAnalysisTest75.ruleChain;
        synonymsAnalysisTest75.ensureAllSearchContextsReleased();
        synonymsAnalysisTest75.overrideTestDefaultQueryCache();
        synonymsAnalysisTest75.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain89 = synonymsAnalysisTest75.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray68, (java.lang.Object) synonymsAnalysisTest75);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        byte[] byteArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray33);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
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
        short[] shortArray46 = new short[] {};
        short[] shortArray47 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray46, shortArray47);
        short[] shortArray50 = new short[] {};
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray50, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray46, shortArray51);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray56);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray25, shortArray56);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray63, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray63, shortArray68);
        short[] shortArray72 = new short[] {};
        short[] shortArray73 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray72, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray73);
        short[] shortArray78 = new short[] {};
        short[] shortArray79 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray78, shortArray79);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray78, shortArray83);
        org.junit.Assert.assertArrayEquals("", shortArray68, shortArray83);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", shortArray56, shortArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) shortArray56);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (float) (byte) 100, (float) (byte) 1, (float) (short) 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        char[] charArray6 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray12 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[] charArray18 = new char[] { ' ', 'a', ' ', '#', 'a' };
        char[][] charArray19 = new char[][] { charArray6, charArray12, charArray18 };
        java.util.Set<char[]> charArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(charArray19);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray37, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray37);
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
        java.util.concurrent.ExecutorService executorService70 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] { executorService70 };
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray71);
        java.util.concurrent.ExecutorService executorService74 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] { executorService74 };
        boolean boolean76 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray75);
        java.util.concurrent.ExecutorService executorService77 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray78 = new java.util.concurrent.ExecutorService[] { executorService77 };
        boolean boolean79 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray78);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray75);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray75);
        boolean boolean83 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) charArray19, (java.lang.Object[]) executorServiceArray65);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
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
        java.lang.Class<?> wildcardClass13 = executorServiceArray2.getClass();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str15 = synonymsAnalysisTest14.getTestName();
        java.lang.String str16 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.tearDown();
        synonymsAnalysisTest14.ensureCleanedUp();
        java.lang.String str19 = synonymsAnalysisTest14.getTestName();
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest14.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) wildcardClass13, (java.lang.Object) ruleChain20);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
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
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocValuesEquals("tests.nightly", (int) (byte) 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        float[] floatArray6 = new float[] { 4, 2, 1.0f, '4', 1L, 100 };
        float[] floatArray10 = new float[] { (short) 100, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray10, (float) (short) -1);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray19);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray3, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray15);
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        java.util.concurrent.ExecutorService executorService34 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] { executorService34 };
        boolean boolean36 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray32);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest39 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest39.ruleChain;
        synonymsAnalysisTest39.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain42 = synonymsAnalysisTest39.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray32, (java.lang.Object) synonymsAnalysisTest39);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService54 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] { executorService54 };
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray55);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService executorService61 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] { executorService61 };
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray49);
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        java.lang.Class[][] classArray72 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray73 = (java.lang.Class<?>[][]) classArray72;
        wildcardClassArray73[0] = wildcardClassArray70;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet76 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray73);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) wildcardClassArray73);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (-1.0f), 0.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        char[] charArray3 = new char[] { '#' };
        char[] charArray5 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray5);
        char[] charArray8 = new char[] { '#' };
        char[] charArray10 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray10);
        org.junit.Assert.assertArrayEquals(charArray5, charArray10);
        char[] charArray14 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray18 = new char[] { '#' };
        char[] charArray20 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray18, charArray20);
        char[] charArray24 = new char[] { '#' };
        char[] charArray26 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray24, charArray26);
        char[] charArray29 = new char[] { '#' };
        char[] charArray31 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray31);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray24, charArray29);
        org.junit.Assert.assertArrayEquals(charArray20, charArray29);
        char[] charArray36 = new char[] { '#' };
        char[] charArray38 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        char[] charArray42 = new char[] { '#' };
        char[] charArray44 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray44);
        char[] charArray47 = new char[] { '#' };
        char[] charArray49 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray47, charArray49);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray42, charArray47);
        org.junit.Assert.assertArrayEquals(charArray38, charArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray20, charArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray10, charArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) charArray38);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
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
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
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
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray18);
        java.lang.Object obj32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) executorServiceArray18, obj32);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 0L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        float[] floatArray5 = new float[] { 100, (byte) 0, (short) -1, 100L, (byte) 10 };
        float[] floatArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (-1));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        short[] shortArray0 = null;
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
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray19, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray15, shortArray20);
        short[] shortArray24 = new short[] {};
        short[] shortArray25 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray24, shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray25);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray20);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10L, (double) 4);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
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
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest2.assertDocValuesEquals("", 5, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 2);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray12, longArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray3, longArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) longArray12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain3);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
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
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray30, intArray33);
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
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray33, intArray54);
        int[] intArray59 = new int[] {};
        int[] intArray60 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray59, intArray60);
        org.junit.Assert.assertArrayEquals("", intArray33, intArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) executorServiceArray16, (java.lang.Object) intArray59);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, true);
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest15 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest15.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, false);
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest15.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        synonymsAnalysisTest15.assertFieldsEquals("", indexReader27, fields28, fields29, true);
        synonymsAnalysisTest15.ensureCheckIndexPassed();
        synonymsAnalysisTest15.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest15.resetCheckIndexStatus();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest35.ruleChain;
        synonymsAnalysisTest35.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain38);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain38;
        synonymsAnalysisTest15.failureAndSuccessEvents = ruleChain38;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum13, (java.lang.Object) ruleChain38);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1L, (long) (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', 1L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (short) 100, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) synonymsAnalysisTest16);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray22);
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
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray44);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest67 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule68 = synonymsAnalysisTest67.ruleChain;
        synonymsAnalysisTest67.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest70 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        synonymsAnalysisTest70.assertTermsEquals("europarl.lines.txt.gz", indexReader72, terms73, terms74, false);
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        synonymsAnalysisTest70.assertDocsSkippingEquals("tests.maxfailures", indexReader78, (-1), postingsEnum80, postingsEnum81, true);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray84 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest67, synonymsAnalysisTest70 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet85 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray84);
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) synonymsAnalysisTestSet85);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest87 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader89 = null;
        org.apache.lucene.index.Terms terms90 = null;
        org.apache.lucene.index.Terms terms91 = null;
        synonymsAnalysisTest87.assertTermsEquals("europarl.lines.txt.gz", indexReader89, terms90, terms91, false);
        synonymsAnalysisTest87.ensureAllSearchContextsReleased();
        synonymsAnalysisTest87.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest87.resetCheckIndexStatus();
        synonymsAnalysisTest87.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) synonymsAnalysisTestSet85, (java.lang.Object) synonymsAnalysisTest87);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10, (double) 1L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (float) ' ', (float) (short) 100, (float) 2);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest4 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest4.ruleChain;
        synonymsAnalysisTest4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = synonymsAnalysisTest4.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str10 = synonymsAnalysisTest9.getTestName();
        java.lang.String str11 = synonymsAnalysisTest9.getTestName();
        java.lang.String str12 = synonymsAnalysisTest9.getTestName();
        synonymsAnalysisTest9.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest9.failureAndSuccessEvents;
        java.lang.String str15 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest19 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str20 = synonymsAnalysisTest19.getTestName();
        java.lang.String str21 = synonymsAnalysisTest19.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule23 = synonymsAnalysisTest22.ruleChain;
        synonymsAnalysisTest22.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain25 = synonymsAnalysisTest22.failureAndSuccessEvents;
        synonymsAnalysisTest19.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain25;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain25;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum31, postingsEnum32);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (byte) 1, 10.0d, (double) 100L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
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
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest14);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray34, intArray37);
        org.junit.Assert.assertArrayEquals(intArray29, intArray34);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray44, intArray47);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray53, intArray56);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        int[] intArray64 = new int[] {};
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray64, intArray65);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray62, intArray65);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray70, intArray73);
        org.junit.Assert.assertArrayEquals(intArray65, intArray70);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray77, intArray78);
        org.junit.Assert.assertArrayEquals("", intArray65, intArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray56, intArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray47, intArray77);
        org.junit.Assert.assertArrayEquals("", intArray34, intArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) intArray47);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest43 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        synonymsAnalysisTest43.assertTermsEquals("europarl.lines.txt.gz", indexReader45, terms46, terms47, false);
        synonymsAnalysisTest43.setIndexWriterMaxDocs(1);
        java.lang.String str52 = synonymsAnalysisTest43.getTestName();
        java.lang.String str53 = synonymsAnalysisTest43.getTestName();
        synonymsAnalysisTest43.restoreIndexWriterMaxDocs();
        java.lang.String str55 = synonymsAnalysisTest43.getTestName();
        synonymsAnalysisTest43.overrideTestDefaultQueryCache();
        synonymsAnalysisTest43.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) byteArray37, (java.lang.Object) synonymsAnalysisTest43);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.failfast", true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100.0d, (double) (byte) 0, (double) ' ');
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (short) 100, (double) (byte) 1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) locale1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 2, (long) (byte) 1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest0.tearDown();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.maxfailures", 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 2, (long) (byte) 1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        synonymsAnalysisTest3.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, false);
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        synonymsAnalysisTest3.setIndexWriterMaxDocs((int) (short) 100);
        synonymsAnalysisTest3.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule14 = synonymsAnalysisTest3.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        org.junit.Assert.assertNotEquals("tests.maxfailures", (java.lang.Object) testRule14, (java.lang.Object) (short) 0);
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.monster", (java.lang.Object) testRule14);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) 10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 2, (long) 'a');
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
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
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray27, (java.lang.Object) executorServiceArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray39);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", objArray1, (java.lang.Object[]) executorServiceArray39);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
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
        java.util.concurrent.ExecutorService executorService47 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] { executorService47 };
        boolean boolean49 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strSetArray32, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((long) (short) 10, (long) (byte) 10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 0, (-1L));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str6 = synonymsAnalysisTest5.getTestName();
        java.lang.String str7 = synonymsAnalysisTest5.getTestName();
        java.lang.String str8 = synonymsAnalysisTest5.getTestName();
        synonymsAnalysisTest5.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest5.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        synonymsAnalysisTest11.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest11.assertPathHasBeenCleared("tests.awaitsfix");
        synonymsAnalysisTest11.tearDown();
        synonymsAnalysisTest11.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotEquals((java.lang.Object) synonymsAnalysisTest5, (java.lang.Object) synonymsAnalysisTest11);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest11.assertDocsEnumEquals("tests.failfast", postingsEnum21, postingsEnum22, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) postingsEnum21);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.slow", postingsEnum5, postingsEnum6, false);
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
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
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        synonymsAnalysisTest25.assertDocsEnumEquals("tests.monster", postingsEnum32, postingsEnum33, false);
        synonymsAnalysisTest25.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule37 = synonymsAnalysisTest25.ruleChain;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest25.assertDocsSkippingEquals("tests.slow", indexReader39, (int) (byte) 10, postingsEnum41, postingsEnum42, false);
        org.junit.rules.RuleChain ruleChain45 = synonymsAnalysisTest25.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        synonymsAnalysisTest46.assertTermsEquals("europarl.lines.txt.gz", indexReader48, terms49, terms50, false);
        synonymsAnalysisTest46.ensureAllSearchContextsReleased();
        synonymsAnalysisTest46.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str56 = synonymsAnalysisTest46.getTestName();
        java.lang.String str57 = synonymsAnalysisTest46.getTestName();
        org.junit.rules.RuleChain ruleChain58 = synonymsAnalysisTest46.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) ruleChain45, (java.lang.Object) synonymsAnalysisTest46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) ruleChain45);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        synonymsAnalysisTest2.tearDown();
        synonymsAnalysisTest2.assertPathHasBeenCleared("enwiki.random.lines.txt");
        synonymsAnalysisTest2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", obj1, (java.lang.Object) synonymsAnalysisTest2);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) '4');
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        float[] floatArray6 = new float[] { 1L, 1.0f, 3, 100, (short) 100, (-1L) };
        float[] floatArray7 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (double) 0.0f, (double) 0.0f, (double) 1L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) 10.0f);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
        char[] charArray21 = new char[] { '#' };
        char[] charArray23 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray23);
        char[] charArray27 = new char[] { '#' };
        char[] charArray29 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray29);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray27, charArray32);
        org.junit.Assert.assertArrayEquals(charArray23, charArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray5, charArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
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
        synonymsAnalysisTest1.setIndexWriterMaxDocs((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        float[] floatArray6 = new float[] { ' ', (short) 100, '4', (short) 10, (byte) -1 };
        float[] floatArray13 = new float[] { 'a', (byte) 100, ' ', 10.0f, (-1L), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray6, floatArray13, (float) (byte) 1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        float[] floatArray5 = new float[] { 100.0f, 3, (byte) 1, 4 };
        float[] floatArray9 = new float[] { ' ', 1.0f, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray5, floatArray9, (float) (short) 10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, 100.0f, (float) 6);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        float[] floatArray2 = new float[] { '4' };
        float[] floatArray9 = new float[] { 1.0f, (short) 1, (short) 0, (short) 1, 10.0f, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray2, floatArray9, (float) '4');
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 0L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        byte[] byteArray1 = null;
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
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray16, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray4, byteArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray16);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) ' ');
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 1L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (-1L));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1), (double) 6);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
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
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.weekly", indexReader19, fields20, fields21, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest24 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        synonymsAnalysisTest24.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, false);
        synonymsAnalysisTest24.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain33 = synonymsAnalysisTest24.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule34 = synonymsAnalysisTest24.ruleChain;
        synonymsAnalysisTest24.ensureAllSearchContextsReleased();
        synonymsAnalysisTest24.overrideTestDefaultQueryCache();
        synonymsAnalysisTest24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        synonymsAnalysisTest24.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader39, (int) 'a', postingsEnum41, postingsEnum42, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) fields20, (java.lang.Object) false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain2 = null;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.maxfailures", indexReader5, fields6, fields7, true);
        synonymsAnalysisTest1.setUp();
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray13, longArray17);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray13, longArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) longArray13);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 1, (long) 4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.setIndexWriterMaxDocs((int) (short) 100);
        java.lang.String str10 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("random", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
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
        java.lang.Object[] objArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, objArray13);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray8, obj11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", obj11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) '#');
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
        synonymsAnalysisTest2.ensureCleanedUp();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest2.ruleChain;
        java.lang.String str20 = synonymsAnalysisTest2.getTestName();
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest35.ruleChain;
        synonymsAnalysisTest35.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray28, (java.lang.Object) synonymsAnalysisTest35);
        synonymsAnalysisTest35.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        synonymsAnalysisTest35.assertDocsEnumEquals("tests.monster", postingsEnum42, postingsEnum43, false);
        synonymsAnalysisTest35.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest35);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) str20, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
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
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 10, (long) (byte) 100);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
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
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader16, 2, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        double[] doubleArray1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str4 = synonymsAnalysisTest3.getTestName();
        java.lang.String str5 = synonymsAnalysisTest3.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        synonymsAnalysisTest3.assertPositionsSkippingEquals("", indexReader7, (int) ' ', postingsEnum9, postingsEnum10);
        org.junit.rules.RuleChain ruleChain12 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest3.ensureCleanedUp();
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray15, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest3, (java.lang.Object) doubleArray15);
        double[] doubleArray20 = new double[] {};
        double[] doubleArray21 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray21, (double) (byte) 1);
        double[] doubleArray24 = new double[] {};
        double[] doubleArray25 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray25, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray24, (double) (byte) -1);
        double[] doubleArray30 = new double[] {};
        double[] doubleArray31 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray31, (double) (byte) 1);
        double[] doubleArray34 = new double[] {};
        double[] doubleArray35 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray35, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray34, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray20, doubleArray34, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray15, doubleArray34, (double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray1, doubleArray15, 0.0d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        float[] floatArray7 = new float[] { (-1.0f), (short) 100, (short) 10, (short) 100, 4, 0.0f };
        float[] floatArray9 = new float[] { 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", floatArray7, floatArray9, (float) 3);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        float[] floatArray4 = new float[] { 10L, (byte) 0, 3, (-1L) };
        float[] floatArray9 = new float[] { (short) 1, (-1L), 10, 0.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) 3);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100.0f, (double) 1, (double) 2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        float[] floatArray6 = new float[] { 3, 1.0f, 3, (-1), 4 };
        float[] floatArray10 = new float[] { 100L, (short) -1, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray6, floatArray10, (float) (short) 100);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.slow", 0L, (long) (byte) 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        float[] floatArray5 = new float[] { 10, 100, 1L, 0.0f };
        float[] floatArray10 = new float[] { ' ', 1L, 0.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray5, floatArray10, (float) '4');
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) 100, (double) (short) -1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        float[] floatArray5 = new float[] { 3, ' ', (-1.0f), (short) 10, (byte) 1 };
        float[] floatArray8 = new float[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray8, (float) 3);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        float[] floatArray2 = new float[] { 0.0f };
        float[] floatArray4 = new float[] { 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray2, floatArray4, 0.0f);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) 100L);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (float) 0L, (float) 6, (float) 3);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 0, (double) 2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        synonymsAnalysisTest0.resetCheckIndexStatus();
        java.lang.String str4 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureCleanedUp();
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (byte) 10, (long) (byte) 1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) 10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
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
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest0.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest13.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        synonymsAnalysisTest13.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        synonymsAnalysisTest13.assertTermsEquals("tests.weekly", indexReader23, terms24, terms25, true);
        char[] charArray32 = new char[] { '#' };
        char[] charArray34 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray34);
        char[] charArray37 = new char[] { '#' };
        char[] charArray39 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray39);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray32, charArray37);
        char[] charArray43 = new char[] { '#' };
        char[] charArray45 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray45);
        char[] charArray48 = new char[] { '#' };
        char[] charArray50 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray48, charArray50);
        org.junit.Assert.assertArrayEquals(charArray45, charArray50);
        char[] charArray54 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray50, charArray54);
        org.junit.Assert.assertArrayEquals("", charArray32, charArray50);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        org.junit.Assert.assertArrayEquals(charArray32, charArray60);
        char[] charArray65 = new char[] { '#' };
        char[] charArray67 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray65, charArray67);
        char[] charArray70 = new char[] { '#' };
        char[] charArray72 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray65, charArray70);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray32, charArray65);
        char[] charArray77 = new char[] { '#' };
        char[] charArray79 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray77, charArray79);
        char[] charArray82 = new char[] { '#' };
        char[] charArray84 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray82, charArray84);
        org.junit.Assert.assertArrayEquals(charArray79, charArray84);
        char[] charArray88 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray84, charArray88);
        org.junit.Assert.assertArrayEquals(charArray32, charArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest13, (java.lang.Object) charArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule12, (java.lang.Object) charArray32);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 3, (long) 6);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray4, (double) (byte) 1);
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
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) (byte) 1);
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (byte) -1);
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) (byte) 1);
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray39, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray25, doubleArray39, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray20, doubleArray39, (double) (short) 0);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray4, doubleArray20, 100.0d);
        double[] doubleArray52 = new double[] {};
        double[] doubleArray53 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray53, (double) (byte) 1);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray56, (double) (byte) -1);
        double[] doubleArray62 = new double[] {};
        double[] doubleArray63 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray63, (double) (byte) 1);
        double[] doubleArray66 = new double[] {};
        double[] doubleArray67 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray67, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray66, (double) (byte) -1);
        org.junit.Assert.assertArrayEquals("random", doubleArray52, doubleArray66, (double) 0L);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray20, doubleArray52, (double) (byte) 0);
        double[] doubleArray76 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray52, doubleArray76, (double) (short) 10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '4', (long) (short) 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 100, (long) (short) -1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling0 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling0, throttling1, throttling2, throttling3, throttling4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet7 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
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
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray11, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) executorServiceArray23, (java.lang.Object) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) throttlingSet7, (java.lang.Object) executorServiceArray23);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        boolean boolean9 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray8);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        java.util.concurrent.ExecutorService executorService38 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] { executorService38 };
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray39);
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        float[] floatArray6 = new float[] { (short) 10, 5, 5, ' ', (short) 1 };
        float[] floatArray10 = new float[] { 0L, 100.0f, 100.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray6, floatArray10, (float) (short) 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) longArray72);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        float[] floatArray5 = new float[] { '#', 6, (byte) 10, (byte) 1, 1 };
        float[] floatArray7 = new float[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray7, 1.0f);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        float[] floatArray2 = new float[] { (byte) 10, 100L };
        float[] floatArray9 = new float[] { 0L, 4, 'a', (short) 10, 10.0f, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray9, (float) 5);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        java.lang.Object obj1 = null;
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray7, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray8);
        org.junit.Assert.assertNotEquals("tests.weekly", obj1, (java.lang.Object) longArray3);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray14, longArray15);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray18, longArray19);
        org.junit.Assert.assertArrayEquals(longArray14, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray23, longArray24);
        long[] longArray27 = new long[] {};
        long[] longArray28 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray27, longArray28);
        org.junit.Assert.assertArrayEquals(longArray23, longArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray19, longArray28);
        org.junit.Assert.assertArrayEquals(longArray3, longArray19);
        long[] longArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray19, longArray33);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
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
        org.junit.Assert.assertNotEquals((java.lang.Object) wildcardClassSet21, (java.lang.Object) "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        float[] floatArray7 = new float[] { 1L, 10.0f, 'a', (byte) 100, 0L, 4 };
        float[] floatArray14 = new float[] { 1.0f, ' ', 4, ' ', 100.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray7, floatArray14, (float) (short) 1);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        org.junit.rules.TestRule testRule5 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule7 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest9 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str10 = synonymsAnalysisTest9.getTestName();
        java.lang.String str11 = synonymsAnalysisTest9.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest12 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest12.ruleChain;
        synonymsAnalysisTest12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest12.failureAndSuccessEvents;
        synonymsAnalysisTest9.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest6.failureAndSuccessEvents = ruleChain15;
        synonymsAnalysisTest6.setIndexWriterMaxDocs(5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) testRule5, (java.lang.Object) 5);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        float[] floatArray1 = new float[] {};
        float[] floatArray7 = new float[] { (byte) 100, 0.0f, (byte) -1, 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray1, floatArray7, (float) 4);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        java.lang.Object obj1 = null;
        java.lang.Object obj3 = null;
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule19 = synonymsAnalysisTest18.ruleChain;
        synonymsAnalysisTest18.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain21 = synonymsAnalysisTest18.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray11, (java.lang.Object) synonymsAnalysisTest18);
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        synonymsAnalysisTest18.assertDocsEnumEquals("tests.monster", postingsEnum25, postingsEnum26, false);
        synonymsAnalysisTest18.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest18);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", obj3, (java.lang.Object) synonymsAnalysisTest18);
        synonymsAnalysisTest18.ensureCheckIndexPassed();
        synonymsAnalysisTest18.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", obj1, (java.lang.Object) synonymsAnalysisTest18);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100.0f, (double) (byte) 10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        char[] charArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        short[] shortArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray13);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) 6);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        float[] floatArray2 = new float[] { (byte) 1, '#' };
        float[] floatArray5 = new float[] { 0, 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray5, (float) (-1L));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
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
        synonymsAnalysisTest1.resetCheckIndexStatus();
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        boolean boolean17 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule28 = synonymsAnalysisTest27.ruleChain;
        synonymsAnalysisTest27.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain30 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray20, (java.lang.Object) synonymsAnalysisTest27);
        synonymsAnalysisTest27.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        synonymsAnalysisTest27.assertDocsEnumEquals("tests.monster", postingsEnum34, postingsEnum35, false);
        synonymsAnalysisTest27.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule39 = synonymsAnalysisTest27.ruleChain;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        synonymsAnalysisTest27.assertDocsSkippingEquals("tests.slow", indexReader41, (int) (byte) 10, postingsEnum43, postingsEnum44, false);
        org.junit.rules.RuleChain ruleChain47 = synonymsAnalysisTest27.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, (-1.0d));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        float[] floatArray1 = new float[] {};
        float[] floatArray6 = new float[] { 'a', 1L, 10.0f, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray1, floatArray6, 100.0f);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
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
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) shortArray6, (java.lang.Object[]) executorServiceArray9);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) 10L, (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        byte[] byteArray1 = null;
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
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray18);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray27);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray32, byteArray33);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray37);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray37, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray48);
        org.junit.Assert.assertArrayEquals("", byteArray27, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray15, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray1, byteArray44);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
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
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
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
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray17);
        org.junit.Assert.assertArrayEquals(intArray9, intArray14);
        org.junit.Assert.assertArrayEquals("", intArray2, intArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest22 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str23 = synonymsAnalysisTest22.getTestName();
        java.lang.String str24 = synonymsAnalysisTest22.getTestName();
        java.lang.String str25 = synonymsAnalysisTest22.getTestName();
        synonymsAnalysisTest22.setUp();
        synonymsAnalysisTest22.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray14, (java.lang.Object) synonymsAnalysisTest22);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 10L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 6, (long) '#');
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        float[] floatArray6 = new float[] { (short) 0, (byte) -1, 0L, 10L, (-1), 0.0f };
        float[] floatArray7 = new float[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, 0.0f);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        java.lang.String str4 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest1.failureAndSuccessEvents;
        java.lang.String str7 = synonymsAnalysisTest1.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest8.ruleChain;
        synonymsAnalysisTest8.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str12 = synonymsAnalysisTest11.getTestName();
        java.lang.String str13 = synonymsAnalysisTest11.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule15 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain17 = synonymsAnalysisTest14.failureAndSuccessEvents;
        synonymsAnalysisTest11.failureAndSuccessEvents = ruleChain17;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain17;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain17;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) ruleChain17);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 5, 10.0d, 0.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.monster", indexReader5, fields6, fields7, false);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        synonymsAnalysisTest0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
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
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray14, shortArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) shortArray19);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (-1L), (long) (byte) 100);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 100, 0.0d, (double) ' ');
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0.0d, (double) 3);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 6, (long) 4);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 0, (float) '#', (float) (short) 1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.ensureCleanedUp();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("", (int) (byte) 0, numericDocValues6, numericDocValues7);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet7 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray6);
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet15 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray6, (java.lang.Object[]) charSequenceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charSequenceArray14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
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
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule65 = synonymsAnalysisTest64.ruleChain;
        synonymsAnalysisTest64.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain67 = synonymsAnalysisTest64.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) executorServiceArray45, (java.lang.Object) synonymsAnalysisTest64);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        float[] floatArray5 = new float[] { (-1L), (-1L), 3, (-1), 1.0f };
        float[] floatArray12 = new float[] { 4, (byte) 10, (byte) 1, 0.0f, 0.0f, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray12, 100.0f);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 100L, (double) (-1L), (double) (byte) 100);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        float[] floatArray1 = new float[] { (byte) 1 };
        float[] floatArray7 = new float[] { (short) 1, 10L, 100L, (-1L), 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray7, (float) (short) 1);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 3, (double) '4');
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
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
        java.lang.String str33 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        synonymsAnalysisTest1.assertFieldsEquals("tests.awaitsfix", indexReader35, fields36, fields37, true);
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray42 = new java.lang.CharSequence[][][] { charSequenceArray40, charSequenceArray41 };
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet43 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) fields37, (java.lang.Object) charSequenceArraySet43);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest1);
        java.lang.String str13 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("random", indexReader15, (int) (byte) -1, postingsEnum17, postingsEnum18);
        char[] charArray25 = new char[] { '#' };
        char[] charArray27 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray25, charArray27);
        char[] charArray30 = new char[] { '#' };
        char[] charArray32 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray25, charArray30);
        char[] charArray36 = new char[] { '#' };
        char[] charArray38 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray36, charArray38);
        char[] charArray41 = new char[] { '#' };
        char[] charArray43 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray41, charArray43);
        org.junit.Assert.assertArrayEquals(charArray38, charArray43);
        char[] charArray47 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray43, charArray47);
        org.junit.Assert.assertArrayEquals("", charArray25, charArray43);
        char[] charArray51 = new char[] { '#' };
        char[] charArray53 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray51, charArray53);
        org.junit.Assert.assertArrayEquals(charArray25, charArray53);
        char[] charArray58 = new char[] { '#' };
        char[] charArray60 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray58, charArray60);
        char[] charArray63 = new char[] { '#' };
        char[] charArray65 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray63, charArray65);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray58, charArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray25, charArray58);
        char[] charArray70 = new char[] { '#' };
        char[] charArray72 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray70, charArray72);
        char[] charArray75 = new char[] { '#' };
        char[] charArray77 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray75, charArray77);
        org.junit.Assert.assertArrayEquals(charArray72, charArray77);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray25, charArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (byte) -1, (java.lang.Object) charArray77);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (-1.0f), (double) 'a');
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("hi!", (double) 100L, (double) 100L, (double) 100.0f);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        float[] floatArray0 = new float[] {};
        float[] floatArray2 = new float[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) (byte) -1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        synonymsAnalysisTest0.assertPositionsSkippingEquals("", indexReader4, (int) ' ', postingsEnum6, postingsEnum7);
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.badapples", (int) (short) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, (int) ' ', postingsEnum7, postingsEnum8);
        java.lang.String str10 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        synonymsAnalysisTest1.assertDocsSkippingEquals("tests.badapples", indexReader12, 2, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain19 = null;
        synonymsAnalysisTest18.failureAndSuccessEvents = ruleChain19;
        synonymsAnalysisTest18.resetCheckIndexStatus();
        java.lang.String str22 = synonymsAnalysisTest18.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        synonymsAnalysisTest23.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, false);
        synonymsAnalysisTest23.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain32 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        synonymsAnalysisTest34.assertTermsEquals("europarl.lines.txt.gz", indexReader36, terms37, terms38, false);
        synonymsAnalysisTest34.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest34);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray46 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest18, synonymsAnalysisTest23, synonymsAnalysisTest34 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet47 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) 2, (java.lang.Object) synonymsAnalysisTestArray46);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet19 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) strArray18);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 10, (long) 3);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = synonymsAnalysisTest1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        java.lang.String str3 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        synonymsAnalysisTest0.assertTermsEquals("", indexReader7, terms8, terms9, false);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("random", true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 10L, (double) (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        float[] floatArray3 = new float[] { 2, 100L };
        float[] floatArray8 = new float[] { (short) 1, 10L, (byte) 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray3, floatArray8, (float) (short) 10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray10);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest21 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule22 = synonymsAnalysisTest21.ruleChain;
        synonymsAnalysisTest21.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain24 = synonymsAnalysisTest21.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray14, (java.lang.Object) synonymsAnalysisTest21);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        java.util.concurrent.ExecutorService executorService36 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] { executorService36 };
        boolean boolean38 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        boolean boolean56 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService62 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] { executorService62 };
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray63);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray63, (java.lang.Object[]) executorServiceArray66);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray49);
        boolean boolean72 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
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
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray87);
        java.util.concurrent.ExecutorService executorService89 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] { executorService89 };
        boolean boolean91 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray87, (java.lang.Object[]) executorServiceArray90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray83, (java.lang.Object[]) executorServiceArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray90);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray90);
        java.lang.Object[] objArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, objArray96);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest0.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest6 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        synonymsAnalysisTest6.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, false);
        synonymsAnalysisTest6.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain15 = synonymsAnalysisTest6.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule16 = synonymsAnalysisTest6.ruleChain;
        synonymsAnalysisTest6.ensureAllSearchContextsReleased();
        synonymsAnalysisTest6.overrideTestDefaultQueryCache();
        synonymsAnalysisTest6.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain20 = synonymsAnalysisTest6.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain20;
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest0.assertPathHasBeenCleared("tests.awaitsfix");
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("enwiki.random.lines.txt", 4, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        synonymsAnalysisTest0.assertTermsEquals("europarl.lines.txt.gz", indexReader2, terms3, terms4, false);
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = synonymsAnalysisTest0.ruleChain;
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) charSequenceArray11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 3);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, 10.0d, 0.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
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
        synonymsAnalysisTest13.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        synonymsAnalysisTest13.assertDocsEnumEquals("tests.monster", postingsEnum20, postingsEnum21, false);
        synonymsAnalysisTest13.setIndexWriterMaxDocs((int) (byte) 0);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest13.assertDocValuesEquals("tests.failfast", (int) (byte) 10, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) 10, 10.0d, (double) 3);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 3, (double) (short) 1);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray17, byteArray24);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray28);
        org.junit.Assert.assertArrayEquals("", byteArray7, byteArray24);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        synonymsAnalysisTest35.assertTermsEquals("europarl.lines.txt.gz", indexReader37, terms38, terms39, false);
        synonymsAnalysisTest35.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        synonymsAnalysisTest35.assertPositionsSkippingEquals("tests.nightly", indexReader45, 0, postingsEnum47, postingsEnum48);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        synonymsAnalysisTest35.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, true);
        synonymsAnalysisTest35.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "", (java.lang.Object) synonymsAnalysisTest35);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        float[] floatArray1 = null;
        float[] floatArray5 = new float[] { 1L, 1.0f, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray5, (float) 6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        float[] floatArray3 = new float[] { 10L, 10L, (-1L) };
        float[] floatArray8 = new float[] { 'a', (short) 0, 10.0f, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray8, 0.0f);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        float[] floatArray4 = new float[] { ' ', (-1), (-1.0f) };
        float[] floatArray6 = new float[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray4, floatArray6, (float) (short) 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) 10);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        java.lang.String str13 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
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
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        synonymsAnalysisTest0.assertDocsSkippingEquals("<unknown>", indexReader16, 2, postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.slow", (int) (short) 1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (short) 100);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
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
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        char[][][] charArray60 = new char[][][] {};
        java.util.Set<char[][]> charArraySet61 = org.apache.lucene.util.LuceneTestCase.asSet(charArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) charArray60);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        float[] floatArray3 = new float[] { (-1), (short) -1, 3 };
        float[] floatArray7 = new float[] { (short) 100, 2, ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray7, (float) (short) 100);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10, (double) 6, 0.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray17, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray3, byteArray17);
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
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray55, shortArray56);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray60, shortArray65);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray65);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray50, shortArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", (java.lang.Object) shortArray65);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) 6);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (-1), (long) (byte) 10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.slow", "tests.failfast", "europarl.lines.txt.gz" };
        java.util.Set<java.lang.String> strSet5 = org.apache.lucene.util.LuceneTestCase.asSet(strArray4);
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray4);
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray4);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str9 = synonymsAnalysisTest8.getTestName();
        java.lang.String str10 = synonymsAnalysisTest8.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest11 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule12 = synonymsAnalysisTest11.ruleChain;
        synonymsAnalysisTest11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain14 = synonymsAnalysisTest11.failureAndSuccessEvents;
        synonymsAnalysisTest8.failureAndSuccessEvents = ruleChain14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest8.assertTermsEquals("tests.maxfailures", indexReader17, terms18, terms19, false);
        java.lang.Class<?> wildcardClass22 = synonymsAnalysisTest8.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        wildcardClassArray25[0] = wildcardClass22;
        java.util.Set<java.lang.Class<?>> wildcardClassSet28 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray25);
        java.util.Set<java.lang.Class<?>> wildcardClassSet29 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray4, (java.lang.Object[]) wildcardClassArray25);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        synonymsAnalysisTest0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = wildcardClassArray2;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray5);
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray5, objArray9);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0d, (double) 'a');
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        float[] floatArray6 = new float[] { (short) 0, (-1), 'a', (-1L), 4, 100.0f };
        float[] floatArray9 = new float[] { 2, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray9, (-1.0f));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 100);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
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
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray18, shortArray23);
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray28, shortArray29);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray28, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray13, shortArray38);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray47, shortArray52);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) shortArray52);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray58, shortArray59);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray63, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray63, shortArray68);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray73, shortArray78);
        short[] shortArray82 = new short[] {};
        short[] shortArray83 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray82, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray78, shortArray83);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray83);
        org.junit.Assert.assertArrayEquals("", shortArray58, shortArray68);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray52, shortArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray38, (java.lang.Object) shortArray52);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, 10.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        synonymsAnalysisTest0.assertFieldsEquals("random", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (-1.0f));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (short) 1, (long) (byte) 100);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray2, longArray3);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray6, longArray7);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray12, longArray13);
        long[] longArray16 = new long[] {};
        long[] longArray17 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray16, longArray17);
        org.junit.Assert.assertArrayEquals(longArray12, longArray17);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray21, longArray22);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray25, longArray26);
        org.junit.Assert.assertArrayEquals(longArray21, longArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray12, longArray21);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray31, longArray32);
        long[] longArray35 = new long[] {};
        long[] longArray36 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray35, longArray36);
        org.junit.Assert.assertArrayEquals(longArray32, longArray35);
        org.junit.Assert.assertArrayEquals(longArray21, longArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray32);
        long[] longArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray32, longArray41);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.badapples", "", "tests.awaitsfix" };
        java.util.Set<java.lang.String> strSet13 = org.apache.lucene.util.LuceneTestCase.asSet(strArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) strArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) synonymsAnalysisTest1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
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
        synonymsAnalysisTest40.resetCheckIndexStatus();
        synonymsAnalysisTest40.tearDown();
        java.lang.String[] strArray48 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray50 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray52 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray54 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray56 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[] strArray58 = new java.lang.String[] { "europarl.lines.txt.gz" };
        java.lang.String[][] strArray59 = new java.lang.String[][] { strArray48, strArray50, strArray52, strArray54, strArray56, strArray58 };
        java.util.Set<java.lang.String[]> strArraySet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest40, (java.lang.Object) strArraySet60);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        short[] shortArray4 = new short[] { (byte) 0, (short) 10, (short) 1, (byte) 100 };
        short[][] shortArray5 = new short[][] { shortArray4 };
        java.util.Set<short[]> shortArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray5);
        org.junit.Assert.assertNotNull((java.lang.Object) shortArraySet6);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str9 = synonymsAnalysisTest8.getTestName();
        java.lang.String str10 = synonymsAnalysisTest8.getTestName();
        java.lang.String str11 = synonymsAnalysisTest8.getTestName();
        synonymsAnalysisTest8.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArraySet6, (java.lang.Object) synonymsAnalysisTest8);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(1.0d, (double) (byte) 1, (double) 'a');
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
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
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 3, (float) 100, 0.0f);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) '4', (double) (short) 10);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "tests.slow", "enwiki.random.lines.txt", "random", "tests.maxfailures", "<unknown>", "tests.badapples" };
        java.util.Set<java.lang.CharSequence> charSequenceSet16 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) charSequenceArray15);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
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
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray43, (java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) executorServiceArray55);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 1, (long) 'a');
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        float[] floatArray6 = new float[] { (byte) 100, 3, 'a', 2, 10L, (byte) 10 };
        float[] floatArray11 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray16 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray11, floatArray16, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray16, (float) (short) 100);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        synonymsAnalysisTest1.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest7 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str8 = synonymsAnalysisTest7.getTestName();
        java.lang.String str9 = synonymsAnalysisTest7.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest10 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule11 = synonymsAnalysisTest10.ruleChain;
        synonymsAnalysisTest10.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = synonymsAnalysisTest10.failureAndSuccessEvents;
        synonymsAnalysisTest7.failureAndSuccessEvents = ruleChain13;
        synonymsAnalysisTest7.setIndexWriterMaxDocs((-1));
        synonymsAnalysisTest7.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        synonymsAnalysisTest7.assertPositionsSkippingEquals("tests.badapples", indexReader19, 3, postingsEnum21, postingsEnum22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 3);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '#', (long) (byte) -1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray1 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet2 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray3, throttlingArray4 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) luceneTestCaseArray1, (java.lang.Object[]) throttlingArray5);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader11, 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest35.ruleChain;
        synonymsAnalysisTest35.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray28, (java.lang.Object) synonymsAnalysisTest35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest40.ruleChain;
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest40.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain43);
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain43;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest49 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        synonymsAnalysisTest49.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, false);
        synonymsAnalysisTest49.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        synonymsAnalysisTest49.assertTermsEquals("tests.weekly", indexReader59, terms60, terms61, true);
        org.junit.rules.RuleChain ruleChain64 = synonymsAnalysisTest49.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest49);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", 0L, 0L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 100, 1L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        synonymsAnalysisTest1.assertPathHasBeenCleared("tests.badapples");
        synonymsAnalysisTest1.ensureAllSearchContextsReleased();
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        java.lang.String str8 = synonymsAnalysisTest1.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) synonymsAnalysisTest1);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) 3);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.overrideTestDefaultQueryCache();
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.slow", indexReader13, 10, postingsEnum15, postingsEnum16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) postingsEnum15);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        long[] longArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray57);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 4, (long) (byte) 10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
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
        synonymsAnalysisTest0.setUp();
        java.lang.String str21 = synonymsAnalysisTest0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocValuesEquals("tests.weekly", 3, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (short) -1, (double) 10, (double) 4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
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
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        synonymsAnalysisTest0.assertDocsEnumEquals("tests.awaitsfix", postingsEnum4, postingsEnum5, true);
        synonymsAnalysisTest0.ensureCheckIndexPassed();
        synonymsAnalysisTest0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) (short) 100);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 1.0d, (double) (byte) 0, (double) (byte) 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str2 = synonymsAnalysisTest1.getTestName();
        java.lang.String str3 = synonymsAnalysisTest1.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("", indexReader5, (int) ' ', postingsEnum7, postingsEnum8);
        org.junit.rules.RuleChain ruleChain10 = synonymsAnalysisTest1.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCleanedUp();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        synonymsAnalysisTest14.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, false);
        synonymsAnalysisTest14.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain23 = synonymsAnalysisTest14.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest14.ruleChain;
        synonymsAnalysisTest14.ensureAllSearchContextsReleased();
        synonymsAnalysisTest14.overrideTestDefaultQueryCache();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest27 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str28 = synonymsAnalysisTest27.getTestName();
        java.lang.String str29 = synonymsAnalysisTest27.getTestName();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        synonymsAnalysisTest27.assertPositionsSkippingEquals("", indexReader31, (int) ' ', postingsEnum33, postingsEnum34);
        org.junit.rules.RuleChain ruleChain36 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest27.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest38 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str39 = synonymsAnalysisTest38.getTestName();
        java.lang.String str40 = synonymsAnalysisTest38.getTestName();
        java.lang.String str41 = synonymsAnalysisTest38.getTestName();
        synonymsAnalysisTest38.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest38.failureAndSuccessEvents;
        java.lang.String str44 = synonymsAnalysisTest38.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest45 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule46 = synonymsAnalysisTest45.ruleChain;
        synonymsAnalysisTest45.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest48 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str49 = synonymsAnalysisTest48.getTestName();
        java.lang.String str50 = synonymsAnalysisTest48.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest51 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule52 = synonymsAnalysisTest51.ruleChain;
        synonymsAnalysisTest51.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain54 = synonymsAnalysisTest51.failureAndSuccessEvents;
        synonymsAnalysisTest48.failureAndSuccessEvents = ruleChain54;
        synonymsAnalysisTest45.failureAndSuccessEvents = ruleChain54;
        synonymsAnalysisTest38.failureAndSuccessEvents = ruleChain54;
        synonymsAnalysisTest27.failureAndSuccessEvents = ruleChain54;
        synonymsAnalysisTest14.failureAndSuccessEvents = ruleChain54;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) synonymsAnalysisTest14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        short[] shortArray3 = new short[] { (byte) 100, (short) 0, (short) 0 };
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray22, shortArray23);
        short[] shortArray26 = new short[] {};
        short[] shortArray27 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray26, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray22, shortArray27);
        org.junit.Assert.assertArrayEquals("", shortArray12, shortArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.util.Set<java.lang.reflect.Type> typeSet1 = org.apache.lucene.util.LuceneTestCase.asSet(typeArray0);
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
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService50 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] { executorService50 };
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray51);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray42, (java.lang.Object) executorServiceArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray54);
        boolean boolean63 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        boolean boolean64 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService65 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] { executorService65 };
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray66);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) executorServiceArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) typeArray0, (java.lang.Object[]) executorServiceArray69);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 1, (float) 3);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (float) (byte) 0, (float) 100, (float) 1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
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
        org.junit.rules.TestRule testRule13 = synonymsAnalysisTest1.ruleChain;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest14 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str15 = synonymsAnalysisTest14.getTestName();
        java.lang.String str16 = synonymsAnalysisTest14.getTestName();
        synonymsAnalysisTest14.ensureCheckIndexPassed();
        synonymsAnalysisTest14.setUp();
        synonymsAnalysisTest14.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) synonymsAnalysisTest1, (java.lang.Object) 1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        java.lang.Object obj0 = null;
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
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray4, byteArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) byteArray4);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        double[] doubleArray6 = new double[] { 10, 1.0d, 2, (byte) 100, '#' };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray9, (double) (byte) 1);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) (byte) 1);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray12, (double) (byte) -1);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest18 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str19 = synonymsAnalysisTest18.getTestName();
        java.lang.String str20 = synonymsAnalysisTest18.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        synonymsAnalysisTest18.assertPositionsSkippingEquals("", indexReader22, (int) ' ', postingsEnum24, postingsEnum25);
        org.junit.rules.RuleChain ruleChain27 = synonymsAnalysisTest18.failureAndSuccessEvents;
        synonymsAnalysisTest18.ensureCleanedUp();
        double[] doubleArray29 = new double[] {};
        double[] doubleArray30 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray30, (double) (byte) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) synonymsAnalysisTest18, (java.lang.Object) doubleArray30);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray8, doubleArray30, (double) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray30, (double) 10);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest2 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule3 = synonymsAnalysisTest2.ruleChain;
        synonymsAnalysisTest2.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest5 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str6 = synonymsAnalysisTest5.getTestName();
        java.lang.String str7 = synonymsAnalysisTest5.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest8 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule9 = synonymsAnalysisTest8.ruleChain;
        synonymsAnalysisTest8.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest8.failureAndSuccessEvents;
        synonymsAnalysisTest5.failureAndSuccessEvents = ruleChain11;
        synonymsAnalysisTest2.failureAndSuccessEvents = ruleChain11;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame(obj1, (java.lang.Object) ruleChain11);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        synonymsAnalysisTest16.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        synonymsAnalysisTest16.assertDocsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27, true);
        synonymsAnalysisTest16.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest31 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str32 = synonymsAnalysisTest31.getTestName();
        java.lang.String str33 = synonymsAnalysisTest31.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest34 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule35 = synonymsAnalysisTest34.ruleChain;
        synonymsAnalysisTest34.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain37 = synonymsAnalysisTest34.failureAndSuccessEvents;
        synonymsAnalysisTest31.failureAndSuccessEvents = ruleChain37;
        synonymsAnalysisTest16.failureAndSuccessEvents = ruleChain37;
        org.junit.rules.TestRule testRule40 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.tearDown();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        synonymsAnalysisTest16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader43, (int) (short) 0, postingsEnum45, postingsEnum46);
        synonymsAnalysisTest16.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest16.assertFieldsEquals("random", indexReader50, fields51, fields52, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) ruleChain11, (java.lang.Object) synonymsAnalysisTest16);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain1 = null;
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain1;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        synonymsAnalysisTest0.assertFieldsEquals("tests.maxfailures", indexReader4, fields5, fields6, true);
        synonymsAnalysisTest0.setUp();
        synonymsAnalysisTest0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 2, (float) 100L, (float) 1L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        float[] floatArray16 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray21 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray21, 0.0f);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        float[] floatArray5 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray10 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray10, (float) (byte) 100);
        float[] floatArray17 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray22 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray22, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("", floatArray5, floatArray22, (float) 6);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str1 = synonymsAnalysisTest0.getTestName();
        java.lang.String str2 = synonymsAnalysisTest0.getTestName();
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) synonymsAnalysisTest0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
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
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.slow", obj1);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) ' ', 0.0d);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 1L, (double) (-1));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 1, (long) (short) -1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] synonymsAnalysisTestArray0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[][] {};
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[]> synonymsAnalysisTestArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray0);
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
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService executorService41 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] { executorService41 };
        boolean boolean43 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService executorService44 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] { executorService44 };
        boolean boolean46 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService56 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] { executorService56 };
        boolean boolean58 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray57);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        java.util.concurrent.ExecutorService executorService63 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray64 = new java.util.concurrent.ExecutorService[] { executorService63 };
        boolean boolean65 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray61, (java.lang.Object[]) executorServiceArray64);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray64);
        boolean boolean68 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray54);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray81);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        java.util.concurrent.ExecutorService executorService88 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray89 = new java.util.concurrent.ExecutorService[] { executorService88 };
        boolean boolean90 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray89);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray86, (java.lang.Object[]) executorServiceArray89);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray86, (java.lang.Object) 100L);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray86);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) synonymsAnalysisTestArray0, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule2 = synonymsAnalysisTest1.ruleChain;
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        synonymsAnalysisTest1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum5, postingsEnum6, true);
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        synonymsAnalysisTest1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain11 = synonymsAnalysisTest1.failureAndSuccessEvents;
        synonymsAnalysisTest1.ensureCheckIndexPassed();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest13 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        synonymsAnalysisTest13.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.overrideTestDefaultQueryCache();
        synonymsAnalysisTest13.ensureCleanedUp();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest23 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule24 = synonymsAnalysisTest23.ruleChain;
        synonymsAnalysisTest23.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain26 = synonymsAnalysisTest23.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest29 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        java.lang.String str30 = synonymsAnalysisTest29.getTestName();
        java.lang.String str31 = synonymsAnalysisTest29.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest32 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule33 = synonymsAnalysisTest32.ruleChain;
        synonymsAnalysisTest32.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain35 = synonymsAnalysisTest32.failureAndSuccessEvents;
        synonymsAnalysisTest29.failureAndSuccessEvents = ruleChain35;
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        synonymsAnalysisTest29.assertTermsEquals("tests.maxfailures", indexReader38, terms39, terms40, false);
        java.lang.Class<?> wildcardClass43 = synonymsAnalysisTest29.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass43;
        java.util.Set<java.lang.Class<?>> wildcardClassSet49 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray46);
        java.util.List<java.lang.reflect.Type> typeList50 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.reflect.Type[]) wildcardClassArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) typeList50);
        synonymsAnalysisTest13.failureAndSuccessEvents = ruleChain26;
        org.junit.rules.RuleChain ruleChain53 = synonymsAnalysisTest13.failureAndSuccessEvents;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain53;
        char[] charArray57 = new char[] { '#' };
        char[] charArray59 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray57, charArray59);
        char[] charArray62 = new char[] { '#' };
        char[] charArray64 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray62, charArray64);
        char[] charArray67 = new char[] { '#' };
        char[] charArray69 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray67, charArray69);
        char[] charArray72 = new char[] { '#' };
        char[] charArray74 = new char[] { '#' };
        org.junit.Assert.assertArrayEquals(charArray72, charArray74);
        org.junit.Assert.assertArrayEquals(charArray69, charArray74);
        org.junit.Assert.assertArrayEquals(charArray64, charArray69);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray59, charArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) ruleChain53, (java.lang.Object) charArray59);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest0 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule1 = synonymsAnalysisTest0.ruleChain;
        synonymsAnalysisTest0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest3 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule4 = synonymsAnalysisTest3.ruleChain;
        synonymsAnalysisTest3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = synonymsAnalysisTest3.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain6);
        synonymsAnalysisTest0.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        synonymsAnalysisTest0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
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
        java.util.concurrent.ExecutorService executorService64 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] { executorService64 };
        boolean boolean66 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService executorService67 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] { executorService67 };
        boolean boolean69 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        boolean boolean75 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray74);
        java.util.concurrent.ExecutorService executorService76 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] { executorService76 };
        boolean boolean78 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray77);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray77);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray77, (java.lang.Object[]) executorServiceArray81);
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) executorServiceArray65, (java.lang.Object) executorServiceArray77);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray77);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray54);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest87 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain88 = null;
        synonymsAnalysisTest87.failureAndSuccessEvents = ruleChain88;
        java.lang.String str90 = synonymsAnalysisTest87.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.monster", (java.lang.Object) synonymsAnalysisTest87);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) 1);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray8);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray3);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray13);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray18, shortArray19);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray23, shortArray28);
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray19);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (short) 0, (double) (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        java.lang.String str40 = synonymsAnalysisTest0.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest41 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        synonymsAnalysisTest41.assertTermsEquals("europarl.lines.txt.gz", indexReader43, terms44, terms45, false);
        synonymsAnalysisTest41.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        org.apache.lucene.index.Fields fields52 = null;
        synonymsAnalysisTest41.assertFieldsEquals("hi!", indexReader50, fields51, fields52, true);
        synonymsAnalysisTest41.ensureCleanedUp();
        synonymsAnalysisTest41.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) synonymsAnalysisTest0, (java.lang.Object) (-1));
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (float) '4', (float) (short) 0, (float) 10L);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) (-1.0f), (double) 0.0f);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) '#');
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray3, intArray6);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) intArray19);
        org.junit.Assert.assertArrayEquals(intArray6, intArray19);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray28, intArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray37, intArray40);
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
        org.junit.Assert.assertArrayEquals(intArray49, intArray54);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray61, intArray62);
        org.junit.Assert.assertArrayEquals("", intArray49, intArray61);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray40, intArray61);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray31, intArray61);
        int[] intArray69 = new int[] {};
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray69, intArray70);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray70, intArray73);
        int[] intArray77 = new int[] {};
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray77, intArray78);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray80, intArray81);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray78, intArray81);
        org.junit.Assert.assertArrayEquals("", intArray73, intArray81);
        org.junit.Assert.assertArrayEquals("", intArray31, intArray73);
        org.junit.Assert.assertArrayEquals(intArray19, intArray31);
        int[] intArray87 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray31, intArray87);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest1 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader3, terms4, terms5, false);
        synonymsAnalysisTest1.setIndexWriterMaxDocs(1);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        synonymsAnalysisTest1.assertPositionsSkippingEquals("tests.nightly", indexReader11, 0, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        synonymsAnalysisTest1.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray28);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray28);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest35 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule36 = synonymsAnalysisTest35.ruleChain;
        synonymsAnalysisTest35.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain38 = synonymsAnalysisTest35.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray28, (java.lang.Object) synonymsAnalysisTest35);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest40 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule41 = synonymsAnalysisTest40.ruleChain;
        synonymsAnalysisTest40.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain43 = synonymsAnalysisTest40.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain43);
        synonymsAnalysisTest35.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        synonymsAnalysisTest1.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest50 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        synonymsAnalysisTest50.assertTermsEquals("europarl.lines.txt.gz", indexReader52, terms53, terms54, false);
        synonymsAnalysisTest50.overrideTestDefaultQueryCache();
        synonymsAnalysisTest50.restoreIndexWriterMaxDocs();
        synonymsAnalysisTest50.ensureCleanedUp();
        java.lang.String str60 = synonymsAnalysisTest50.getTestName();
        synonymsAnalysisTest50.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        synonymsAnalysisTest50.assertTermsEquals("tests.slow", indexReader63, terms64, terms65, false);
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        org.apache.lucene.index.Fields fields71 = null;
        synonymsAnalysisTest50.assertFieldsEquals("enwiki.random.lines.txt", indexReader69, fields70, fields71, false);
        org.junit.rules.RuleChain ruleChain74 = synonymsAnalysisTest50.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) ruleChain43, (java.lang.Object) synonymsAnalysisTest50);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 100, (long) 6);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("random", (double) (short) 10, (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        synonymsAnalysisTest15.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields22, fields23, false);
        synonymsAnalysisTest15.setIndexWriterMaxDocs((int) (short) 0);
        synonymsAnalysisTest15.setIndexWriterMaxDocs(5);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray35);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray34, shortArray39);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray44);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray49, shortArray54);
        org.junit.Assert.assertArrayEquals("", shortArray39, shortArray54);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray60, shortArray65);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray70);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray76, shortArray77);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray76, shortArray81);
        org.junit.Assert.assertNotNull("", (java.lang.Object) shortArray76);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray86, shortArray87);
        org.junit.Assert.assertArrayEquals(shortArray76, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray86);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray39, shortArray86);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) synonymsAnalysisTest15, (java.lang.Object) shortArray86);
        short[] shortArray93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray86, shortArray93);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray31);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray5);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray9);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest16 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.TestRule testRule17 = synonymsAnalysisTest16.ruleChain;
        synonymsAnalysisTest16.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain19 = synonymsAnalysisTest16.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) executorServiceArray9, (java.lang.Object) synonymsAnalysisTest16);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        boolean boolean26 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        boolean boolean33 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray22);
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
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        java.util.concurrent.ExecutorService executorService53 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] { executorService53 };
        boolean boolean55 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray54);
        java.util.concurrent.ExecutorService executorService57 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] { executorService57 };
        boolean boolean59 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray58);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray44);
        boolean boolean67 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) boolean67);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
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
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray24);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray31);
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        boolean boolean35 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray40);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) executorServiceArray40, (java.lang.Object) 100L);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray40);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) wildcardClassArray18, (java.lang.Object[]) executorServiceArray34);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        float[] floatArray4 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray9 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (byte) 100);
        float[] floatArray16 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray21 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray21, (float) (byte) 100);
        float[] floatArray28 = new float[] { 6, 10, 5, (-1L) };
        float[] floatArray33 = new float[] { 10.0f, (byte) 1, 10L, (-1L) };
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray33, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray33, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray16, 100.0f);
        float[] floatArray42 = new float[] { (byte) -1, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray42, (float) 2);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
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
        java.util.concurrent.ExecutorService executorService25 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] { executorService25 };
        boolean boolean27 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        java.util.concurrent.ExecutorService executorService28 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] { executorService28 };
        boolean boolean30 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        java.util.concurrent.ExecutorService executorService32 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] { executorService32 };
        boolean boolean34 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray33);
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        boolean boolean37 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray36);
        boolean boolean40 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService executorService42 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] { executorService42 };
        boolean boolean44 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService executorService49 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] { executorService49 };
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray50);
        java.util.concurrent.ExecutorService executorService52 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] { executorService52 };
        boolean boolean54 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray53);
        boolean boolean57 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray43);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest59 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.junit.rules.RuleChain ruleChain60 = null;
        synonymsAnalysisTest59.failureAndSuccessEvents = ruleChain60;
        synonymsAnalysisTest59.resetCheckIndexStatus();
        java.lang.String str63 = synonymsAnalysisTest59.getTestName();
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest64 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.Terms terms67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        synonymsAnalysisTest64.assertTermsEquals("europarl.lines.txt.gz", indexReader66, terms67, terms68, false);
        synonymsAnalysisTest64.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain73 = synonymsAnalysisTest64.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest synonymsAnalysisTest75 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.Terms terms78 = null;
        org.apache.lucene.index.Terms terms79 = null;
        synonymsAnalysisTest75.assertTermsEquals("europarl.lines.txt.gz", indexReader77, terms78, terms79, false);
        synonymsAnalysisTest75.setIndexWriterMaxDocs(1);
        org.junit.rules.RuleChain ruleChain84 = synonymsAnalysisTest75.failureAndSuccessEvents;
        synonymsAnalysisTest75.ensureCleanedUp();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.awaitsfix", (java.lang.Object) synonymsAnalysisTest75);
        org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] synonymsAnalysisTestArray87 = new org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest[] { synonymsAnalysisTest59, synonymsAnalysisTest64, synonymsAnalysisTest75 };
        java.util.Set<org.elasticsearch.index.analysis.synonyms.SynonymsAnalysisTest> synonymsAnalysisTestSet88 = org.apache.lucene.util.LuceneTestCase.asSet(synonymsAnalysisTestArray87);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet89 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) synonymsAnalysisTestArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) synonymsAnalysisTestArray87);
    }
}

