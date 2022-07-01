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
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray7);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        long[] longArray5 = new long[] { '#', (short) -1, (short) 10, (-1L) };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 0.0f);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        int[] intArray1 = new int[] { 100 };
        int[] intArray7 = new int[] { (byte) 10, 0, 'a', '#', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 0.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray9);
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        long[] longArray2 = new long[] { 2, 1 };
        long[] longArray5 = new long[] { 'a', '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) 100, (long) (byte) -1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str11 = mockMoreLikeThisFetchService10.nodeName();
        java.lang.String str12 = mockMoreLikeThisFetchService10.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) str12);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 10, 100L, 10, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray1, longArray6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService3);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        float[] floatArray4 = new float[] { 0L, 1.0f, (byte) 1, 1L };
        float[] floatArray6 = new float[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray6, (float) (byte) -1);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.weekly", indexReader44, terms45, terms46, true);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain49;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests1.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.awaitsfix");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = null;
        simpleIndexQueryParserTests11.queryParser = indexQueryParserService24;
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests11.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests11.queryParser = indexQueryParserService28;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests11.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests11.longToPrefixCoded((long) 'a', (int) ' ');
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader39, (int) (byte) 0, postingsEnum41, postingsEnum42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strSet10, (java.lang.Object) postingsEnum42);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) (byte) 10, (-1.0d), (double) (-1));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray5 = new java.util.Locale[] { locale2, locale4 };
        java.util.List<java.util.Locale> localeList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, localeArray5);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray5, (java.lang.Object[]) executorServiceArray15);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0L, (long) (byte) 10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) ruleChain13, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields23, (java.lang.Object) locale25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields23, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.weekly", indexReader35, terms36, terms37, true);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("tests.maxfailures", indexReader43, (-1), postingsEnum45, postingsEnum46);
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests41.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService49);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray9);
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) strArray1);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        float[] floatArray5 = new float[] { '4', 0L, 'a', 1 };
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray5, floatArray7, (float) '4');
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.junit.rules.RuleChain ruleChain21 = null;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain21;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (int) (short) 1, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests23.queryParser = indexQueryParserService36;
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests23.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = null;
        simpleIndexQueryParserTests23.queryParser = indexQueryParserService40;
        simpleIndexQueryParserTests23.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain43;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) executorServiceArray2, (java.lang.Object) ruleChain43);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues44 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (-1), numericDocValues44, numericDocValues45);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', 0.0d, 0.0d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        float[] floatArray4 = new float[] { 0L, '#', 100L, (short) -1 };
        float[] floatArray10 = new float[] { 100.0f, 1L, (byte) 1, 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray10, 10.0f);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests12.indexedValueForSearch(100L);
        simpleIndexQueryParserTests12.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        float[] floatArray4 = new float[] { 100L, 0.0f, 10.0f };
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray4, floatArray5, (float) (-1L));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1.0d, (double) 1.0f);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray7 = new int[] { 1, (byte) 100, (byte) 0, 0, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        long[] longArray2 = new long[] { (short) 10 };
        long[] longArray5 = new long[] { 100, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray2, longArray5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        double[] doubleArray6 = new double[] { (short) -1, 0.0d, 0, 100.0d, 0L, (short) 10 };
        double[] doubleArray13 = new double[] { 10, 10, 100.0f, 100.0f, ' ', 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray13, (double) 0.0f);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str6 = mockMoreLikeThisFetchService5.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str8 = mockMoreLikeThisFetchService7.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray10 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService5, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService9 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet11 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray10);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray18);
        short[] shortArray24 = new short[] { (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray54);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray59);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray13, (java.lang.Object) executorServiceArray45);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) abstractComponentArray10, (java.lang.Object[]) executorServiceArray45);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        int[] intArray1 = null;
        int[] intArray8 = new int[] { '4', (byte) -1, 2, (byte) 0, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray8);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 0, (long) (byte) 10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        char[] charArray5 = new char[] { ' ', 'a', '4', 'a' };
        char[] charArray8 = new char[] { 'a', '#' };
        char[] charArray11 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray8, charArray11);
        char[] charArray15 = new char[] { 'a', '#' };
        char[] charArray18 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray15, charArray18);
        org.junit.Assert.assertArrayEquals(charArray8, charArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray5, charArray8);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader14, fields15, fields26, true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) '4');
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) bytesRef20);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) locale13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (int) (short) 1, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests15.queryParser = indexQueryParserService28;
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests15.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader33 = null;
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields37, (java.lang.Object) locale39);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.badapples");
        simpleIndexQueryParserTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields37, fields45, false);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.weekly", indexReader49, terms50, terms51, true);
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) locale13, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling15);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling18 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling26);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling17, throttling18, throttling20, throttling23, throttling26 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet29 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        java.lang.Class<?> wildcardClass30 = throttlingArray28.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) fields12, (java.lang.Object) wildcardClass30);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        long[] longArray6 = new long[] { (byte) 0, (short) 10, (-1), 1, (-1), 0 };
        long[] longArray9 = new long[] { 2, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray21 = new double[] { (-1L), '#', (short) -1, 1.0d, 0L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray7, doubleArray21, (-1.0d));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader11, (int) (short) 10, postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "random");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[][] strArray46 = new java.lang.String[][] { strArray15, strArray21, strArray27, strArray33, strArray39, strArray45 };
        java.util.Set<java.lang.String[]> strArraySet47 = org.apache.lucene.util.LuceneTestCase.asSet(strArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray1, (java.lang.Object[]) strArray46);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        double[] doubleArray6 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray12 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray12, (double) 100);
        double[] doubleArray21 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray27 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray21, doubleArray27, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray27, (double) 1.0f);
        double[] doubleArray35 = new double[] { ' ', 0L, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray35, 1.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (short) 1);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray2, byteArray6);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0.0d, (double) (short) 100);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray46);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray55);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray51);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray37);
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray67);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) strArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling75);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling77 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling78 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling83 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling83);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling86);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray88 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling75, throttling77, throttling78, throttling80, throttling83, throttling86 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet89 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray88);
        java.util.Set<java.io.Serializable> serializableSet90 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) throttlingArray88);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray5);
        char[] charArray12 = new char[] { 'a', '#' };
        char[] charArray15 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray12, charArray15);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals(charArray12, charArray22);
        char[] charArray27 = new char[] { 'a', '#' };
        char[] charArray30 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray12, charArray30);
        char[] charArray35 = new char[] { 'a', '#' };
        char[] charArray38 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        char[] charArray42 = new char[] { 'a', '#' };
        char[] charArray45 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        org.junit.Assert.assertArrayEquals(charArray35, charArray45);
        org.junit.Assert.assertArrayEquals(charArray30, charArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray5, (java.lang.Object) charArray35);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1L), (double) (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) (short) 10, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.monster");
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.badapples");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "random");
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray0, (java.lang.Object) "hi!");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling60 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling63 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling63);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling55, throttling57, throttling58, throttling60, throttling63, throttling66 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray68);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet70 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray68);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet71 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) throttlingArray68);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 1, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.failfast");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 10, (long) (-1));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        long[] longArray5 = new long[] { 2, (short) 10, 0L, 10L };
        long[] longArray7 = new long[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray5, longArray7);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule9);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) (short) 100);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) -1 };
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests27.setqueryParser(indexQueryParserService28);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests27, (java.lang.Object) fields37);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = simpleIndexQueryParserTests27.queryParser();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) executorServiceArray50);
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.badapples");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.awaitsfix");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests59.assertPositionsSkippingEquals("tests.maxfailures", indexReader61, (-1), postingsEnum63, postingsEnum64);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        simpleIndexQueryParserTests59.assertPositionsSkippingEquals("tests.maxfailures", indexReader67, (int) (short) 1, postingsEnum69, postingsEnum70);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService72 = null;
        simpleIndexQueryParserTests59.queryParser = indexQueryParserService72;
        org.apache.lucene.util.BytesRef bytesRef75 = simpleIndexQueryParserTests59.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader77 = null;
        java.lang.String[] strArray79 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "tests.monster");
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields81, (java.lang.Object) locale83);
        java.lang.String[] strArray85 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.badapples");
        simpleIndexQueryParserTests59.assertFieldsEquals("europarl.lines.txt.gz", indexReader77, fields81, fields89, false);
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.monster", indexReader41, fields58, fields81, false);
        org.apache.lucene.index.Fields fields94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader25, fields58, fields94, false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        int[] intArray2 = new int[] { 'a', (byte) -1 };
        int[] intArray9 = new int[] { 1, (-1), 10, (short) 100, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray9);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray9, shortArray13);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray36 = new short[] { (byte) 1 };
        short[] shortArray38 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray26);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        short[] shortArray49 = new short[] { (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray49);
        short[] shortArray55 = new short[] { (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray55);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        short[] shortArray67 = new short[] { (byte) 1 };
        short[] shortArray69 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        short[] shortArray72 = new short[] { (byte) 1 };
        short[] shortArray74 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray74);
        short[] shortArray79 = new short[] { (byte) 1 };
        short[] shortArray81 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray81);
        short[] shortArray84 = new short[] { (byte) 1 };
        short[] shortArray86 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray84);
        short[] shortArray90 = new short[] { (byte) 1 };
        short[] shortArray92 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray90, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray44);
        short[] shortArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray98);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        int[] intArray7 = new int[] { (short) 0, (short) 0, 2, (byte) 10, (short) 0, (short) 1 };
        int[] intArray12 = new int[] { (short) 100, (short) 100, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray7, intArray12);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) ruleChain17);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) (short) 0);
        float[] floatArray5 = new float[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray5, (float) 0L);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("", indexReader24, terms25, terms26, true);
        org.junit.rules.RuleChain ruleChain29 = null;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (-1), postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader39, (int) (short) 1, postingsEnum41, postingsEnum42);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = null;
        simpleIndexQueryParserTests31.queryParser = indexQueryParserService44;
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests31.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests31.queryParser = indexQueryParserService48;
        simpleIndexQueryParserTests31.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain51;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests13.assertDocsEnumEquals("tests.maxfailures", postingsEnum54, postingsEnum55, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (-1), (double) (byte) 100, (double) 100);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        long[] longArray2 = new long[] { 0L };
        long[] longArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray2, longArray3);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.lang.Class<?> wildcardClass21 = executorServiceArray7.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (int) (short) 1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests22.queryParser = indexQueryParserService35;
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests22.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader40 = null;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields44, (java.lang.Object) locale46);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.badapples");
        simpleIndexQueryParserTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields44, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("tests.weekly", indexReader56, terms57, terms58, true);
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass62 = ruleChain61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        wildcardClassArray65[0] = wildcardClass21;
        wildcardClassArray65[1] = wildcardClass62;
        java.util.Set<java.lang.Class<?>> wildcardClassSet70 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray65);
        org.junit.Assert.assertNotNull((java.lang.Object) wildcardClassArray65);
        java.util.List<java.lang.Class<?>> wildcardClassList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, wildcardClassArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray75);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) wildcardClassArray65, (java.lang.Object[]) executorServiceArray80);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) ' ', (double) 'a', (double) (-1L));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 100, (long) 2);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.badapples");
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray18);
        java.lang.Class<?> wildcardClass21 = executorServiceArray15.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) strArray6, (java.lang.Object) executorServiceArray15);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray6);
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "node_s_0");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests12.queryParser = indexQueryParserService25;
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests12.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests12.setqueryParser(indexQueryParserService29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests12.queryParser;
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) strArray6, (java.lang.Object) '4');
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) '#');
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0, 10.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        int[] intArray3 = new int[] { ' ', 'a' };
        int[] intArray8 = new int[] { (byte) -1, '4', (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray3, intArray8);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        int[] intArray5 = new int[] { (short) 100, 10, (byte) 100, (byte) -1, (short) 100 };
        int[] intArray12 = new int[] { ' ', (short) 0, (byte) 1, 0, 10, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray12);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray2, shortArray6);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        double[] doubleArray6 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray12 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray6, doubleArray12, (double) 100);
        double[] doubleArray21 = new double[] { 0, (-1.0f), 0.0d, 100.0f, 1.0d, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray21, (double) '#');
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        int[] intArray3 = new int[] { (byte) 1, (byte) 10, (short) -1 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.Object obj24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj24);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) '#');
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        int[] intArray4 = new int[] { ' ', 10, ' ' };
        int[] intArray11 = new int[] { '#', 1, 'a', '4', '#', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader12, (int) (byte) -1, postingsEnum14, postingsEnum15, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService18);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        long[] longArray7 = new long[] { (short) 1, (-1L), ' ', (byte) -1, 2, (byte) 0 };
        long[] longArray11 = new long[] { 'a', 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray7, longArray11);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        long[] longArray6 = new long[] { (byte) 0, (short) 100, ' ', (short) 100, 10, 1 };
        long[] longArray8 = new long[] { (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        char[] charArray2 = new char[] { 'a', '#' };
        char[] charArray5 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray2, charArray5);
        char[] charArray9 = new char[] { 'a', '#' };
        char[] charArray12 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
        org.junit.Assert.assertArrayEquals(charArray2, charArray12);
        short[] shortArray17 = new short[] { (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray19);
        short[] shortArray22 = new short[] { (byte) 1 };
        short[] shortArray24 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray24);
        short[] shortArray28 = new short[] { (byte) 1 };
        short[] shortArray30 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray30);
        short[] shortArray33 = new short[] { (byte) 1 };
        short[] shortArray35 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray24, shortArray28);
        short[] shortArray41 = new short[] { (byte) 1 };
        short[] shortArray43 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray43);
        short[] shortArray46 = new short[] { (byte) 1 };
        short[] shortArray48 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        short[] shortArray51 = new short[] { (byte) 1 };
        short[] shortArray53 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray53);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray41, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray2, (java.lang.Object) shortArray41);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 100.0d, 0.0d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray10 = new char[] { 'a', '#' };
        char[] charArray13 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray26 = new char[] { 'a', '#' };
        char[] charArray29 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        org.junit.Assert.assertArrayEquals(charArray19, charArray29);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray37);
        char[] charArray42 = new char[] { 'a', '#' };
        char[] charArray45 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        char[] charArray49 = new char[] { 'a', '#' };
        char[] charArray52 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        org.junit.Assert.assertArrayEquals(charArray42, charArray52);
        org.junit.Assert.assertArrayEquals(charArray37, charArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray37);
        char[] charArray57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray57);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        java.lang.Class<?> wildcardClass3 = serializableArray1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) serializableArray1);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 10.0d, (double) (short) 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 1L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum19, postingsEnum20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader21, (int) (short) 0, postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str29 = mockMoreLikeThisFetchService28.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str32 = mockMoreLikeThisFetchService31.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str35 = mockMoreLikeThisFetchService34.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str37 = mockMoreLikeThisFetchService36.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray39 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService30, mockMoreLikeThisFetchService31, mockMoreLikeThisFetchService33, mockMoreLikeThisFetchService34, mockMoreLikeThisFetchService36, mockMoreLikeThisFetchService38 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet40 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray39);
        org.junit.Assert.assertNotSame("", (java.lang.Object) mockMoreLikeThisFetchService28, (java.lang.Object) abstractComponentSet40);
        java.lang.String str42 = mockMoreLikeThisFetchService28.nodeName();
        java.lang.String str43 = mockMoreLikeThisFetchService28.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum23, (java.lang.Object) str43);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (int) (short) 1, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests9.queryParser = indexQueryParserService22;
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests9.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader27 = null;
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields31, (java.lang.Object) locale33);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.badapples");
        simpleIndexQueryParserTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields31, fields39, false);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.weekly", indexReader43, terms44, terms45, true);
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain48;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests51.assertPositionsSkippingEquals("tests.maxfailures", indexReader53, (-1), postingsEnum55, postingsEnum56);
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests51.queryParser;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        simpleIndexQueryParserTests51.assertTermsEquals("tests.nightly", indexReader61, terms62, terms63, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService66 = simpleIndexQueryParserTests51.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = null;
        simpleIndexQueryParserTests51.queryParser = indexQueryParserService67;
        org.junit.rules.RuleChain ruleChain69 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain69;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        simpleIndexQueryParserTests71.assertPositionsSkippingEquals("tests.maxfailures", indexReader73, (-1), postingsEnum75, postingsEnum76);
        simpleIndexQueryParserTests71.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService79 = simpleIndexQueryParserTests71.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService80 = simpleIndexQueryParserTests71.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef82 = simpleIndexQueryParserTests71.indexedValueForSearch(1L);
        simpleIndexQueryParserTests71.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain69, (java.lang.Object) simpleIndexQueryParserTests71);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 0, (long) 'a');
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "hi!");
        org.apache.lucene.index.Fields fields33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader24, fields32, fields33, true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (int) (short) 1, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService29;
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests16.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader34 = null;
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields38, (java.lang.Object) locale40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.badapples");
        simpleIndexQueryParserTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields38, fields46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.weekly", indexReader50, terms51, terms52, true);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService56;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.badapples", (java.lang.Object) indexQueryParserService56);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling3, throttling4, throttling6, throttling9, throttling12 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) throttlingArray14);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.monster");
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.badapples");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "random");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("tests.monster", postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("tests.maxfailures", indexReader22, terms23, terms24, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "random", (java.lang.Object) terms23);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService2);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) fields11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.slow", postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("", postingsEnum28, postingsEnum29, true);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum16, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        long[] longArray4 = new long[] { 100L, ' ', (short) 0, 100L };
        long[] longArray11 = new long[] { (-1), 1, (byte) 10, (short) -1, 0, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray1, longArray3);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray6 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray3, charArray6);
        char[] charArray10 = new char[] { 'a', '#' };
        char[] charArray13 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray3, charArray13);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        char[] charArray26 = new char[] { 'a', '#' };
        char[] charArray29 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray26, charArray29);
        org.junit.Assert.assertArrayEquals(charArray19, charArray29);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray19, charArray37);
        char[] charArray42 = new char[] { 'a', '#' };
        char[] charArray45 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray42, charArray45);
        char[] charArray49 = new char[] { 'a', '#' };
        char[] charArray52 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray49, charArray52);
        org.junit.Assert.assertArrayEquals(charArray42, charArray52);
        org.junit.Assert.assertArrayEquals(charArray37, charArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray37);
        char[] charArray62 = new char[] { 'a', '#', 'a', '4', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray3, charArray62);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        int[] intArray3 = new int[] { 2, '#', (short) 100 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (byte) 10, (double) 1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (byte) 10, (double) 1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("random", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14, true);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) postingsEnum14, (java.lang.Object) executorServiceArray24);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 100.0d, (double) (-1L), (double) (short) 100);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        long[] longArray4 = new long[] { (short) 1, (short) 1, 100 };
        long[] longArray7 = new long[] { 1L, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray4, longArray7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService21;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (int) (short) 1, postingsEnum33, postingsEnum34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests23.queryParser = indexQueryParserService36;
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests23.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader41 = null;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields45, (java.lang.Object) locale47);
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.badapples");
        simpleIndexQueryParserTests23.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields45, fields53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests23.assertTermsEquals("tests.weekly", indexReader57, terms58, terms59, true);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain62;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain62;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) 'a', numericDocValues67, numericDocValues68);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 'a', (int) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields23, (java.lang.Object) locale25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields23, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader35, (int) (byte) 10, postingsEnum37, postingsEnum38, false);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.slow", indexReader42, terms43, terms44, true);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        java.util.concurrent.ExecutorService[] executorServiceArray55 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray55);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray50, (java.lang.Object[]) executorServiceArray55);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray55, (java.lang.Object[]) executorServiceArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray62);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 1, (double) 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (short) 100);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (-1.0d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 2, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling44 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling44);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling49 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling55 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling44, throttling46, throttling47, throttling49, throttling52, throttling55 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet59 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray57);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet60 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) throttlingArray57);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("", postingsEnum11, postingsEnum12, true);
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests2.ruleChain;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) testRule15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) testRule15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) strArray40);
        java.util.concurrent.ExecutorService executorService45 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] { executorService45 };
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray40, (java.lang.Object[]) executorServiceArray46);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceSet2 = org.apache.lucene.util.LuceneTestCase.asSet(mockMoreLikeThisFetchServiceArray1);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet3 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.common.component.AbstractComponent[]) mockMoreLikeThisFetchServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("tests.maxfailures", indexReader6, (-1), postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("", indexReader15, terms16, terms17, true);
        org.junit.rules.RuleChain ruleChain20 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("tests.monster", indexReader23, (int) (short) 1, postingsEnum25, postingsEnum26, true);
        java.lang.String str29 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.TestRule testRule31 = simpleIndexQueryParserTests4.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) abstractComponentSet3, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0.0f, (double) 1L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 10, (double) 0.0f);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) strArray22);
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "node_s_0");
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.maxfailures", fields27, fields32);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader36, (-1), postingsEnum38, postingsEnum39);
        org.junit.rules.TestRule testRule41 = simpleIndexQueryParserTests34.ruleChain;
        simpleIndexQueryParserTests34.setIndexWriterMaxDocs((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) fields27, (java.lang.Object) simpleIndexQueryParserTests34);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.weekly", indexReader44, terms45, terms46, true);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain49;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("tests.maxfailures", indexReader54, (-1), postingsEnum56, postingsEnum57);
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = simpleIndexQueryParserTests52.queryParser;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        simpleIndexQueryParserTests52.assertTermsEquals("tests.nightly", indexReader62, terms63, terms64, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = simpleIndexQueryParserTests52.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService68 = null;
        simpleIndexQueryParserTests52.queryParser = indexQueryParserService68;
        org.junit.rules.RuleChain ruleChain70 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain70;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (int) (short) 1, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService29;
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests16.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService33;
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("<unknown>", indexReader19, 2, postingsEnum21, postingsEnum22);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader32, (int) (short) 1, postingsEnum34, postingsEnum35);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = null;
        simpleIndexQueryParserTests24.queryParser = indexQueryParserService37;
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests24.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = null;
        simpleIndexQueryParserTests24.queryParser = indexQueryParserService41;
        simpleIndexQueryParserTests24.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests24.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (-1));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        int[] intArray4 = new int[] { 1, (short) -1, 10, (short) -1 };
        int[] intArray8 = new int[] { (short) 100, (short) -1, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray8);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray20 = new char[] { 'a', '#' };
        char[] charArray23 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray20, charArray23);
        char[] charArray27 = new char[] { 'a', '#' };
        char[] charArray30 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        org.junit.Assert.assertArrayEquals(charArray20, charArray30);
        char[] charArray35 = new char[] { 'a', '#' };
        char[] charArray38 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray35, charArray38);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray20, charArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray4, charArray38);
        char[] charArray42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray4, charArray42);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 'a', (-1L), (byte) 10, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[][] strArray52 = new java.lang.String[][] { strArray21, strArray27, strArray33, strArray39, strArray45, strArray51 };
        java.util.Set<java.lang.String[]> strArraySet53 = org.apache.lucene.util.LuceneTestCase.asSet(strArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) strArray52);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        char[] charArray0 = null;
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        char[] charArray27 = new char[] { 'a', '#' };
        char[] charArray30 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray27, charArray37);
        org.junit.Assert.assertArrayEquals(charArray22, charArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray27);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (short) -1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (-1.0d));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests13.queryParser();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (int) (short) 1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService38;
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests25.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader43 = null;
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        java.util.Locale locale49 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields47, (java.lang.Object) locale49);
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.badapples");
        simpleIndexQueryParserTests25.assertFieldsEquals("europarl.lines.txt.gz", indexReader43, fields47, fields55, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests58.assertPositionsSkippingEquals("tests.maxfailures", indexReader60, (-1), postingsEnum62, postingsEnum63);
        simpleIndexQueryParserTests58.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests58.resetCheckIndexStatus();
        simpleIndexQueryParserTests58.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader69 = null;
        org.apache.lucene.index.Terms terms70 = null;
        org.apache.lucene.index.Terms terms71 = null;
        simpleIndexQueryParserTests58.assertTermsEquals("", indexReader69, terms70, terms71, true);
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests58.failureAndSuccessEvents;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain74;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain74);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.Terms terms80 = null;
        org.apache.lucene.index.Terms terms81 = null;
        simpleIndexQueryParserTests77.assertTermsEquals("tests.slow", indexReader79, terms80, terms81, true);
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        simpleIndexQueryParserTests77.assertPositionsSkippingEquals("tests.nightly", indexReader85, (int) (short) 10, postingsEnum87, postingsEnum88);
        simpleIndexQueryParserTests77.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) ruleChain74, (java.lang.Object) simpleIndexQueryParserTests77);
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain74;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain74);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.junit.Assert.assertNotNull((java.lang.Object) mockMoreLikeThisFetchService0);
        java.lang.String str2 = mockMoreLikeThisFetchService0.nodeName();
        java.lang.String str3 = mockMoreLikeThisFetchService0.nodeName();
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray18);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray14);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) mockMoreLikeThisFetchService0, (java.lang.Object) boolean23);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) ' ', (long) '4');
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader12, 0, postingsEnum14, postingsEnum15, false);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) -1, (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        long[] longArray3 = new long[] { 10, 10L };
        long[] longArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray3, longArray4);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) '#', (double) (byte) -1);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.slow", obj1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) (short) 1, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) '#');
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) -1, (long) '4');
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0d, (double) 10L);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        int[] intArray6 = new int[] { 10, (byte) -1, (byte) 100, ' ', (short) 100, (byte) 10 };
        int[] intArray11 = new int[] { 0, (-1), (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        long[] longArray2 = new long[] { 100L };
        long[] longArray9 = new long[] { (short) -1, (short) 10, 'a', '#', 10L, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray2, longArray9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.nightly", false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (byte) 10, (long) (short) 1);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        int[] intArray3 = new int[] { (byte) 1, (byte) 10 };
        int[] intArray4 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray3, intArray4);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService31;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("tests.badapples", postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.awaitsfix", indexReader39, (int) 'a', postingsEnum41, postingsEnum42, false);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests47.assertPositionsSkippingEquals("tests.maxfailures", indexReader49, (-1), postingsEnum51, postingsEnum52);
        simpleIndexQueryParserTests47.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests47.resetCheckIndexStatus();
        simpleIndexQueryParserTests47.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("", indexReader58, terms59, terms60, true);
        org.junit.rules.RuleChain ruleChain63 = null;
        simpleIndexQueryParserTests47.failureAndSuccessEvents = ruleChain63;
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests47.assertDocsSkippingEquals("tests.monster", indexReader66, (int) (short) 1, postingsEnum68, postingsEnum69, true);
        java.lang.String[] strArray73 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.monster");
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.badapples");
        java.lang.String[] strArray78 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        simpleIndexQueryParserTests47.assertFieldStatisticsEquals("node_s_0", fields77, fields80);
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray86);
        java.util.concurrent.ExecutorService[] executorServiceArray90 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean91 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray90);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray90);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray86, (java.lang.Object[]) executorServiceArray90);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray82, (java.lang.Object[]) executorServiceArray90);
        org.apache.lucene.index.Fields fields96 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.badapples");
        simpleIndexQueryParserTests18.assertFieldsEquals("enwiki.random.lines.txt", indexReader46, fields80, fields96, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService16, (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Terms terms3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader2, terms3, terms4, true);
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch(0L);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("", postingsEnum20, postingsEnum21, true);
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests11.ruleChain;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "hi!");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.badapples");
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "hi!");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.badapples");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "hi!");
        simpleIndexQueryParserTests11.assertFieldStatisticsEquals("<unknown>", fields36, fields48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "hi!");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.badapples");
        java.util.Set<java.lang.String> strSet60 = org.apache.lucene.util.LuceneTestCase.asSet(strArray55);
        java.util.Set<java.lang.Object> objSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray55);
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader10, fields36, fields63, false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray3);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader18, terms19, terms20, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray5, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray13);
        byte[] byteArray25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray25);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray9, shortArray13);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray36 = new short[] { (byte) 1 };
        short[] shortArray38 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray26);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        short[] shortArray49 = new short[] { (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray49);
        short[] shortArray55 = new short[] { (byte) 1 };
        short[] shortArray57 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray55);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        short[] shortArray67 = new short[] { (byte) 1 };
        short[] shortArray69 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        short[] shortArray72 = new short[] { (byte) 1 };
        short[] shortArray74 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray74);
        short[] shortArray79 = new short[] { (byte) 1 };
        short[] shortArray81 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray81);
        short[] shortArray84 = new short[] { (byte) 1 };
        short[] shortArray86 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray84, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray84);
        short[] shortArray90 = new short[] { (byte) 1 };
        short[] shortArray92 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray90, shortArray92);
        org.junit.Assert.assertArrayEquals(shortArray79, shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray79);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray44);
        short[] shortArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray98);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (short) 100);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests23.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) bytesRef22, (java.lang.Object) simpleIndexQueryParserTests23);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests2.queryParser();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) executorServiceArray25);
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.badapples");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.awaitsfix");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader36, (-1), postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader42, (int) (short) 1, postingsEnum44, postingsEnum45);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests34.queryParser = indexQueryParserService47;
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests34.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader52 = null;
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields56, (java.lang.Object) locale58);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.badapples");
        simpleIndexQueryParserTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader52, fields56, fields64, false);
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.monster", indexReader16, fields33, fields56, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) fields33);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) (short) 10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray22 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray28 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray22, doubleArray28, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray28, (double) 1.0f);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        double[] doubleArray54 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray60 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray54, doubleArray60, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray60, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray28, doubleArray60, (double) '#');
        double[] doubleArray71 = new double[] { 0L, (byte) 100, 100L, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray71, (double) 1L);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 0, (int) (byte) 10);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("", indexReader32, (int) (short) 0, postingsEnum34, postingsEnum35, false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("tests.badapples", indexReader39, (int) ' ', postingsEnum41, postingsEnum42, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 1L, (double) (short) 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.failfast", "tests.badapples", "<unknown>", "tests.awaitsfix", "tests.maxfailures" };
        java.lang.String[][] strArray39 = new java.lang.String[][] { strArray8, strArray14, strArray20, strArray26, strArray32, strArray38 };
        java.util.Set<java.lang.String[]> strArraySet40 = org.apache.lucene.util.LuceneTestCase.asSet(strArray39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray39);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("hi!", true);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (byte) 10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "hi!");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.badapples");
        java.util.Set<java.lang.String> strSet23 = org.apache.lucene.util.LuceneTestCase.asSet(strArray18);
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) indexQueryParserService12, (java.lang.Object) objSet24);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        long[] longArray2 = new long[] { '#' };
        long[] longArray4 = new long[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray2, longArray4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 100, (double) 1.0f);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray22);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "hi!");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.badapples");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray35);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.badapples");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) "node_s_0", (java.lang.Object) executorServiceArray19);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceSet3 = org.apache.lucene.util.LuceneTestCase.asSet(mockMoreLikeThisFetchServiceArray2);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.common.component.AbstractComponent[]) mockMoreLikeThisFetchServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray16);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray37);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) executorServiceArray34);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) mockMoreLikeThisFetchServiceArray2, (java.lang.Object[]) executorServiceArray29);
        java.lang.Object[] objArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) mockMoreLikeThisFetchServiceArray2, objArray45);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        char[] charArray6 = new char[] { 'a', '#' };
        char[] charArray9 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        char[] charArray13 = new char[] { 'a', '#' };
        char[] charArray16 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray6, charArray16);
        char[] charArray22 = new char[] { 'a', '#' };
        char[] charArray25 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray22, charArray25);
        char[] charArray29 = new char[] { 'a', '#' };
        char[] charArray32 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray29, charArray32);
        org.junit.Assert.assertArrayEquals(charArray22, charArray32);
        char[] charArray37 = new char[] { 'a', '#' };
        char[] charArray40 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray37, charArray40);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray22, charArray40);
        char[] charArray45 = new char[] { 'a', '#' };
        char[] charArray48 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        char[] charArray52 = new char[] { 'a', '#' };
        char[] charArray55 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray52, charArray55);
        org.junit.Assert.assertArrayEquals(charArray45, charArray55);
        org.junit.Assert.assertArrayEquals(charArray40, charArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray6, charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) charArray6);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray22 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray28 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray22, doubleArray28, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray28, (double) 1.0f);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        double[] doubleArray54 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray60 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray54, doubleArray60, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray60, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray28, doubleArray60, (double) '#');
        double[] doubleArray68 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray68, 10.0d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        long[] longArray7 = new long[] { 0L, (short) 100, 10, (short) 10, 'a', 0L };
        long[] longArray11 = new long[] { (short) 10, ' ', (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray7, longArray11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling4, throttling5, throttling7, throttling10, throttling13 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.maxfailures", indexReader19, (-1), postingsEnum21, postingsEnum22);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("tests.monster", postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (int) (short) 1, postingsEnum39, postingsEnum40);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests29.queryParser = indexQueryParserService42;
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests29.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests29.queryParser = indexQueryParserService46;
        simpleIndexQueryParserTests29.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) throttlingArray15, (java.lang.Object) ruleChain49);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (short) 100);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray3 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        short[] shortArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain10);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (double) (byte) -1);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) -1, (long) (short) 10);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertEquals("tests.nightly", objArray2, (java.lang.Object[]) strArray8);
        java.lang.Class<?> wildcardClass13 = strArray8.getClass();
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) strArray8, (java.lang.Object) executorServiceArray17);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 1.0f, (double) 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray22 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray28 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray22, doubleArray28, (double) 100);
        double[] doubleArray37 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray43 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray37, doubleArray43, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray43, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray28, (double) (short) 100);
        double[] doubleArray56 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray62 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray56, doubleArray62, (double) 100);
        double[] doubleArray71 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray77 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray71, doubleArray77, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray62, doubleArray77, (double) 1.0f);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray77, (double) '4');
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService18;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 1, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), 1.0d, (double) (-1));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray6);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.apache.lucene.util.BytesRef[] bytesRefArray11 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray12 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray13 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray11, bytesRefArray12 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) bytesRefArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) bytesRefArray13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray15);
        short[] shortArray21 = new short[] { (byte) 1 };
        short[] shortArray23 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray33);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray43);
        short[] shortArray49 = new short[] { (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray38);
        short[] shortArray56 = new short[] { (byte) 1 };
        short[] shortArray58 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        short[] shortArray61 = new short[] { (byte) 1 };
        short[] shortArray63 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray63);
        short[] shortArray66 = new short[] { (byte) 1 };
        short[] shortArray68 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray66);
        short[] shortArray72 = new short[] { (byte) 1 };
        short[] shortArray74 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray58);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray15, shortArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 1, numericDocValues29, numericDocValues30);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        int[] intArray3 = new int[] { ' ', 0, (byte) -1 };
        int[] intArray7 = new int[] { (short) 10, (-1), ' ' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray6);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling12, throttling14, throttling15, throttling17, throttling20, throttling23 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) throttlingArray25);
        java.io.Serializable[] serializableArray29 = new java.io.Serializable[] { 'a' };
        java.util.Set<java.io.Serializable> serializableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray29);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.io.Serializable>[] serializableIterableArray33 = (java.lang.Iterable<java.io.Serializable>[]) iterableArray32;
        serializableIterableArray33[0] = serializableSet27;
        serializableIterableArray33[1] = serializableSet30;
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableIterableArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) serializableIterableArray33);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 10L, (double) (-1), (double) (short) -1);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        long[] longArray0 = new long[] {};
        long[] longArray7 = new long[] { 0L, (-1), (-1L), 10L, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) '#');
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        int[] intArray3 = new int[] { (short) 1, (short) 10 };
        int[] intArray9 = new int[] { (short) 0, (short) 0, (byte) 0, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray9);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray10);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray10, shortArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceSet26 = org.apache.lucene.util.LuceneTestCase.asSet(mockMoreLikeThisFetchServiceArray25);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet27 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.common.component.AbstractComponent[]) mockMoreLikeThisFetchServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) shortArray10, (java.lang.Object) mockMoreLikeThisFetchServiceArray25);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader11, (-1), postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests9.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests9.getqueryParser();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        java.lang.String str21 = simpleIndexQueryParserTests9.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (int) (short) 1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests22.queryParser = indexQueryParserService35;
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests22.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader40 = null;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields44, (java.lang.Object) locale46);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.badapples");
        simpleIndexQueryParserTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader40, fields44, fields52, false);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("tests.weekly", indexReader56, terms57, terms58, true);
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain61;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain61;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain61;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        simpleIndexQueryParserTests65.assertPositionsSkippingEquals("tests.maxfailures", indexReader67, (-1), postingsEnum69, postingsEnum70);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        simpleIndexQueryParserTests65.assertPositionsSkippingEquals("tests.maxfailures", indexReader73, (int) (short) 1, postingsEnum75, postingsEnum76);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService78 = null;
        simpleIndexQueryParserTests65.queryParser = indexQueryParserService78;
        org.apache.lucene.util.BytesRef bytesRef81 = simpleIndexQueryParserTests65.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService82 = null;
        simpleIndexQueryParserTests65.queryParser = indexQueryParserService82;
        simpleIndexQueryParserTests65.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain85 = simpleIndexQueryParserTests65.failureAndSuccessEvents;
        simpleIndexQueryParserTests65.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests65.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) ruleChain61, (java.lang.Object) simpleIndexQueryParserTests65);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (short) -1, (double) (short) 100);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray16);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { '#', 'a', (byte) 1, 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray1, intArray8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 1);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str6 = mockMoreLikeThisFetchService5.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str8 = mockMoreLikeThisFetchService7.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray10 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService5, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService9 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet11 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray10);
        java.lang.Class<?> wildcardClass12 = abstractComponentArray10.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests13.assertDocsEnumEquals("", postingsEnum22, postingsEnum23, true);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests13.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (-1), postingsEnum32, postingsEnum33);
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests28.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests28.getqueryParser();
        java.lang.String str38 = simpleIndexQueryParserTests28.getTestName();
        simpleIndexQueryParserTests28.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) indexQueryParserService27, (java.lang.Object) simpleIndexQueryParserTests28);
        simpleIndexQueryParserTests28.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) abstractComponentArray10, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        int[] intArray7 = new int[] { 10, (short) 100, (short) 10, (byte) 0, (byte) 1, '4' };
        int[] intArray11 = new int[] { (short) 10, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray11);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 1.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.badapples", true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, 10.0d, (double) (short) 1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        long[] longArray5 = new long[] { (short) 0, (short) 1, (byte) 10, (short) -1, (-1L) };
        long[] longArray10 = new long[] { '4', 100, '#', 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        long[] longArray5 = new long[] { (-1L), ' ', 100, (-1), 100L };
        long[] longArray9 = new long[] { (byte) 1, (byte) 10, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("node_s_0", indexReader13, 0, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService21);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray30);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("tests.maxfailures", indexReader47, (-1), postingsEnum49, postingsEnum50);
        org.junit.rules.TestRule testRule52 = simpleIndexQueryParserTests45.ruleChain;
        simpleIndexQueryParserTests45.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) executorServiceArray7, (java.lang.Object) simpleIndexQueryParserTests45);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        int[] intArray1 = new int[] { 0 };
        int[] intArray4 = new int[] { (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray4);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) (short) 0);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray2, floatArray7, 1.0f);
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray14, (float) (short) 0);
        float[] floatArray17 = new float[] {};
        float[] floatArray18 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray17, floatArray18, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray13, floatArray18, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray18, (float) (short) 0);
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray27, (float) (short) 0);
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray30, floatArray31, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray26, floatArray31, 1.0f);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) (short) 0);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray37, floatArray42, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray26, floatArray42, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray42, (float) (short) 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests51.assertPositionsSkippingEquals("tests.maxfailures", indexReader53, (-1), postingsEnum55, postingsEnum56);
        simpleIndexQueryParserTests51.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests51.queryParser();
        simpleIndexQueryParserTests51.ensureCheckIndexPassed();
        java.lang.String str61 = simpleIndexQueryParserTests51.getTestName();
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) floatArray18, (java.lang.Object) simpleIndexQueryParserTests51);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10, (double) (byte) 100);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("", indexReader27, terms28, terms29, true);
        org.junit.rules.RuleChain ruleChain32 = null;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain32;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests16.assertDocsSkippingEquals("tests.monster", indexReader35, (int) (short) 1, postingsEnum37, postingsEnum38, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests16.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) "tests.failfast", (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (-1L));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        int[] intArray0 = new int[] {};
        int[] intArray2 = new int[] { (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (short) 100);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) 2);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray22);
        org.apache.lucene.util.BytesRef[] bytesRefArray30 = new org.apache.lucene.util.BytesRef[] {};
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet31 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray30);
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet32 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray30);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) bytesRefArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) bytesRefArray30);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        long[] longArray2 = new long[] { (byte) -1, 0L };
        long[] longArray5 = new long[] { 10L, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) -1, (double) (byte) 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        long[] longArray6 = new long[] { 2, (short) -1, 100, '#', (short) 100, 100 };
        long[] longArray10 = new long[] { (short) 0, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray10);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        int[] intArray5 = new int[] { (short) 0, ' ', '#', 'a' };
        int[] intArray9 = new int[] { 100, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray5, intArray9);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', 100.0d, (double) 10L);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (-1.0f));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str6 = mockMoreLikeThisFetchService5.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str8 = mockMoreLikeThisFetchService7.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray10 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService5, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService9 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet11 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray10);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) executorServiceArray21);
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.nightly");
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) executorServiceArray36);
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.nightly");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) executorServiceArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) abstractComponentArray10, (java.lang.Object[]) strArray13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (int) (short) 1, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests20.queryParser = indexQueryParserService33;
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests20.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader38 = null;
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields42, (java.lang.Object) locale44);
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.badapples");
        simpleIndexQueryParserTests20.assertFieldsEquals("europarl.lines.txt.gz", indexReader38, fields42, fields50, false);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("tests.weekly", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests20.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray5, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray8);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields23, (java.lang.Object) locale25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields23, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader35, (int) (byte) 10, postingsEnum37, postingsEnum38, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) postingsEnum37);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) ' ');
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (long) (byte) 100);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 1, (double) (short) 10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray42);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) executorServiceArray56);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray51);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "hi!");
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "tests.badapples");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray51, (java.lang.Object) "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray3, byteArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        long[] longArray3 = new long[] { (short) 100, 100L };
        long[] longArray9 = new long[] { 100L, 10, '#', 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray3, longArray9);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) 'a', numericDocValues10, numericDocValues11);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) '4', 0L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray7);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray19 = new short[] { (byte) 1 };
        short[] shortArray21 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray21);
        short[] shortArray24 = new short[] { (byte) 1 };
        short[] shortArray26 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray24, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray14, shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (-1), postingsEnum35, postingsEnum36);
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        simpleIndexQueryParserTests31.assertTermsEquals("", indexReader42, terms43, terms44, true);
        org.junit.rules.RuleChain ruleChain47 = null;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain47;
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests31.assertDocsSkippingEquals("tests.monster", indexReader50, (int) (short) 1, postingsEnum52, postingsEnum53, true);
        java.lang.String str56 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.setUp();
        org.junit.rules.TestRule testRule58 = simpleIndexQueryParserTests31.ruleChain;
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("node_s_0", indexReader60, 100, postingsEnum62, postingsEnum63);
        org.junit.rules.TestRule testRule65 = simpleIndexQueryParserTests31.ruleChain;
        java.lang.Class<?> wildcardClass66 = testRule65.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) shortArray26, (java.lang.Object) wildcardClass66);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertEquals("tests.nightly", objArray13, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) strArray19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.maxfailures", indexReader33, (int) (short) 1, postingsEnum35, postingsEnum36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService38;
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests25.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests25.queryParser = indexQueryParserService42;
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests25.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = simpleIndexQueryParserTests25.getqueryParser();
        simpleIndexQueryParserTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader50, (int) (byte) -1, postingsEnum52, postingsEnum53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) executorServiceArray4, (java.lang.Object) simpleIndexQueryParserTests25);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        short[] shortArray4 = new short[] { (byte) 1 };
        short[] shortArray6 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray11);
        short[] shortArray15 = new short[] { (byte) 1 };
        short[] shortArray17 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray20 = new short[] { (byte) 1 };
        short[] shortArray22 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray11, shortArray15);
        short[] shortArray27 = new short[] { (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        short[] shortArray32 = new short[] { (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray32);
        short[] shortArray39 = new short[] { (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        short[] shortArray49 = new short[] { (byte) 1 };
        short[] shortArray51 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray51);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray39, shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray15, shortArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray60);
        java.util.concurrent.ExecutorService[] executorServiceArray63 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray63);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) executorServiceArray63);
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) strArray75);
        org.junit.Assert.assertEquals("tests.nightly", objArray69, (java.lang.Object[]) strArray75);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray60, (java.lang.Object[]) strArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) shortArray32, (java.lang.Object) strArray75);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray5);
        byte[] byteArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        java.lang.Object obj1 = null;
        short[] shortArray3 = new short[] { (byte) 1 };
        short[] shortArray5 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray14 = new short[] { (byte) 1 };
        short[] shortArray16 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray44 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray44);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray44, (java.lang.Object[]) executorServiceArray49);
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray35, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray3, (java.lang.Object) executorServiceArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) executorServiceArray35);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 1, 10L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService40;
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str43 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.badapples");
        java.util.Set<java.lang.String> strSet11 = org.apache.lucene.util.LuceneTestCase.asSet(strArray6);
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) fields13);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        int[] intArray5 = new int[] { 0, (short) 10, (short) 0, 100 };
        int[] intArray11 = new int[] { ' ', 0, 100, (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray5, intArray11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        double[] doubleArray7 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray13, (double) 100);
        double[] doubleArray22 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray28 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray22, doubleArray28, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray28, (double) 1.0f);
        double[] doubleArray39 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray39, doubleArray45, (double) 100);
        double[] doubleArray54 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray60 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray54, doubleArray60, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray60, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray28, doubleArray60, (double) 0.0f);
        double[] doubleArray73 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray79 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray73, doubleArray79, (double) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray60, doubleArray73, (double) (-1));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader18 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields22, (java.lang.Object) locale24);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader18, fields22, fields30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader34, terms35, terms36, true);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (-1.0d));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.junit.rules.RuleChain ruleChain13 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain13;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("", indexReader26, terms27, terms28, true);
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("tests.badapples", indexReader33, terms34, terms35, true);
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        double[] doubleArray6 = new double[] { 10.0f, (-1), 10.0d, (-1), 0.0d, 'a' };
        double[] doubleArray14 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray20 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray14, doubleArray20, (double) 100);
        double[] doubleArray29 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray35 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray29, doubleArray35, (double) 100);
        double[] doubleArray44 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray50 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray44, doubleArray50, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray50, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray14, doubleArray35, (double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray14, (double) 10.0f);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray12);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray9);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray27);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray24);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray36);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray36, (java.lang.Object[]) executorServiceArray41);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray24, (java.lang.Object[]) executorServiceArray36);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray36);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "hi!");
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.badapples");
        java.util.Set<java.lang.String> strSet63 = org.apache.lucene.util.LuceneTestCase.asSet(strArray58);
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray58);
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) strArray58);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 100, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        long[] longArray3 = new long[] { (byte) 1, (-1) };
        long[] longArray7 = new long[] { (short) 0, 0, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray3, longArray7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (int) (short) 1, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests16.queryParser = indexQueryParserService29;
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests16.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader34 = null;
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields38, (java.lang.Object) locale40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.badapples");
        simpleIndexQueryParserTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader34, fields38, fields46, false);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.weekly", indexReader50, terms51, terms52, true);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests16.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) bytesRef15, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        float[] floatArray5 = new float[] {};
        float[] floatArray6 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray6, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray1, floatArray6, 1.0f);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) (short) 0);
        float[] floatArray16 = new float[] {};
        float[] floatArray17 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray16, floatArray17, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray12, floatArray17, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray17, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray17);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (byte) 100, 0L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray1, longArray3);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader18, 2, postingsEnum20, postingsEnum21);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (-1.0d));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        double[] doubleArray8 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray14, (double) 100);
        double[] doubleArray23 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray29 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray23, doubleArray29, (double) 100);
        double[] doubleArray38 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray44 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray38, doubleArray44, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray44, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray29, (double) (short) 100);
        char[] charArray53 = new char[] { 'a', '#' };
        char[] charArray56 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray53, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) doubleArray8, (java.lang.Object) charArray56);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        short[] shortArray5 = new short[] { (short) -1, (short) 1, (byte) 100, (short) 10 };
        short[] shortArray10 = new short[] { (short) -1, (short) 1, (byte) 100, (short) 10 };
        short[][] shortArray11 = new short[][] { shortArray5, shortArray10 };
        java.util.Set<short[]> shortArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray11);
        char[] charArray16 = new char[] { 'a', '#' };
        char[] charArray19 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray16, charArray19);
        char[] charArray23 = new char[] { 'a', '#' };
        char[] charArray26 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray23, charArray26);
        org.junit.Assert.assertArrayEquals(charArray16, charArray26);
        char[] charArray32 = new char[] { 'a', '#' };
        char[] charArray35 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray32, charArray35);
        char[] charArray39 = new char[] { 'a', '#' };
        char[] charArray42 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray39, charArray42);
        org.junit.Assert.assertArrayEquals(charArray32, charArray42);
        char[] charArray47 = new char[] { 'a', '#' };
        char[] charArray50 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray47, charArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray32, charArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray16, charArray50);
        char[] charArray56 = new char[] { 'a', '#' };
        char[] charArray59 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray56, charArray59);
        org.junit.Assert.assertArrayEquals(charArray16, charArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) shortArraySet12, (java.lang.Object) charArray16);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, 1.0d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests15.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests15.assertDocsSkippingEquals("random", indexReader25, (int) (byte) 100, postingsEnum27, postingsEnum28, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "random");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        int[] intArray3 = new int[] { (-1), 10 };
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray3, intArray4);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        java.util.Set<java.lang.String> strSet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray5);
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService27;
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests10.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("node_s_0", postingsEnum34, postingsEnum35, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.badapples", (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        long[] longArray7 = new long[] { 0L, (-1L), (byte) -1, (byte) 0, 0, (short) -1 };
        long[] longArray8 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray7, longArray8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) executorServiceArray32);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling13 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling13);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray15 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling2, throttling4, throttling5, throttling7, throttling10, throttling13 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet16 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray15);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet17 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray15);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet18 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray15);
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) throttlingSet18, obj19);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        int[] intArray4 = new int[] { (short) 100, (short) 10, (byte) 100, 10 };
        int[] intArray10 = new int[] { '4', '4', 'a', (-1), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain7;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests22.setqueryParser(indexQueryParserService23);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests22, (java.lang.Object) fields32);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader36, (-1), postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader42, (int) (short) 1, postingsEnum44, postingsEnum45);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests34.queryParser = indexQueryParserService47;
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests34.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = null;
        simpleIndexQueryParserTests34.queryParser = indexQueryParserService51;
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests34.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests34.setUp();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.badapples");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests34.assertFieldStatisticsEquals("tests.monster", fields61, fields68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("enwiki.random.lines.txt", fields32, fields61);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        int[] intArray5 = new int[] { (byte) -1, 1, (-1), 1, 10 };
        int[] intArray8 = new int[] { (byte) 1, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray8);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        long[] longArray3 = new long[] { 0L, '4' };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray3, longArray4);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray2, byteArray5);
        byte[] byteArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 10, 0.0d, 1.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray20);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray42);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) boolean48);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) fields12);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 2, (double) (byte) 100);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.monster", indexReader20, (int) (short) 1, postingsEnum22, postingsEnum23, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests26.resetCheckIndexStatus();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("", indexReader37, terms38, terms39, true);
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = null;
        simpleIndexQueryParserTests26.setqueryParser(indexQueryParserService43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (-1L));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray14 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray8, doubleArray14, (double) 100);
        double[] doubleArray23 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray29 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray23, doubleArray29, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray29, (double) 1.0f);
        double[] doubleArray40 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray46 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray40, doubleArray46, (double) 100);
        double[] doubleArray55 = new double[] { (short) 0, (short) 0, 0.0d, (byte) 100, 1.0d };
        double[] doubleArray61 = new double[] { (-1.0d), '#', (short) 100, (byte) 10, 10L };
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray55, doubleArray61, (double) 100);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray61, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray61, (double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray61, (double) (byte) 10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling1);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling6 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling9);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling12 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling12);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling3, throttling4, throttling6, throttling9, throttling12 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray14);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet16 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray14);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet17 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray14);
        java.lang.Object[] objArray18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray14, objArray18);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray3, executorServiceArray5, executorServiceArray7, executorServiceArray9, executorServiceArray11 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArraySet13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader21, (int) '#', postingsEnum23, postingsEnum24, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray4);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray35);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) executorServiceArray47);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) executorServiceArray65);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        long[] longArray2 = new long[] { (byte) 1, (short) 1 };
        long[] longArray6 = new long[] { (byte) 100, (short) 10, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.maxfailures", indexReader22, (-1), postingsEnum24, postingsEnum25);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests20.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests20.getqueryParser();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        java.lang.String str32 = simpleIndexQueryParserTests20.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader35, (-1), postingsEnum37, postingsEnum38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (int) (short) 1, postingsEnum43, postingsEnum44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests33.queryParser = indexQueryParserService46;
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests33.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader51 = null;
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields55, (java.lang.Object) locale57);
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.badapples");
        simpleIndexQueryParserTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader51, fields55, fields63, false);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        simpleIndexQueryParserTests33.assertTermsEquals("tests.weekly", indexReader67, terms68, terms69, true);
        org.junit.rules.RuleChain ruleChain72 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain72;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain72;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain72;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain11, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService13);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 0);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray4, floatArray9, 1.0f);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray15, 0.0f);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 0);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray21, floatArray26, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray26, (float) (byte) 10);
        float[] floatArray34 = new float[] {};
        float[] floatArray35 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray35, (float) (short) 0);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray34, floatArray39, 1.0f);
        float[] floatArray44 = new float[] {};
        float[] floatArray45 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray44, floatArray45, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray45, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", floatArray15, floatArray34, (float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray1, floatArray15, (float) 2);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader27, (int) (short) 10, postingsEnum29, postingsEnum30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 10, (java.lang.Object) (short) 1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader18, (int) ' ', postingsEnum20, postingsEnum21, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests26.assertDocsEnumEquals("", postingsEnum35, postingsEnum36, true);
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests26.ruleChain;
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "hi!");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.badapples");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "hi!");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.badapples");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "hi!");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("<unknown>", fields51, fields63);
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.badapples");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("<unknown>", fields51, fields71);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.badapples");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "hi!");
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray34);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray52);
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray56);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) executorServiceArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray52);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray52, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) strArray61);
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader14, fields21, fields67, true);
        org.apache.lucene.index.NumericDocValues numericDocValues72 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (-1), numericDocValues72, numericDocValues73);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1L, (long) 10);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", 1, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("node_s_0", fields30, fields33);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        long[] longArray0 = new long[] {};
        long[] longArray6 = new long[] { (byte) -1, '4', '4', 100, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader19 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields23, (java.lang.Object) locale25);
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader19, fields23, fields31, false);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.weekly", indexReader35, terms36, terms37, true);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 0, (int) (byte) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("tests.maxfailures", indexReader47, (-1), postingsEnum49, postingsEnum50);
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests45.assertDocsEnumEquals("", postingsEnum54, postingsEnum55, true);
        org.junit.rules.TestRule testRule58 = simpleIndexQueryParserTests45.ruleChain;
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (byte) 10, (java.lang.Object) simpleIndexQueryParserTests45);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray3);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray2, (float) '#');
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService62);
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 10, numericDocValues66, numericDocValues67);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        long[] longArray0 = new long[] {};
        long[] longArray6 = new long[] { (short) 0, (-1L), 10L, ' ', 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        int[] intArray5 = new int[] { (short) 10, 'a', 0, '#', 'a' };
        int[] intArray9 = new int[] { (short) 0, 0, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray9);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        java.util.concurrent.ExecutorService[][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][] { executorServiceArray1, executorServiceArray3, executorServiceArray5, executorServiceArray7, executorServiceArray9, executorServiceArray11 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray29);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) strArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) strArray34);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) -1, (long) 'a');
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        short[] shortArray4 = new short[] { (byte) -1, (byte) -1, (byte) -1 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("tests.nightly", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests7.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("<unknown>", indexReader24, terms25, terms26, false);
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        short[] shortArray32 = new short[] { (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        short[] shortArray37 = new short[] { (byte) 1 };
        short[] shortArray39 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray39);
        short[] shortArray43 = new short[] { (byte) 1 };
        short[] shortArray45 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray45);
        short[] shortArray48 = new short[] { (byte) 1 };
        short[] shortArray50 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray39, shortArray43);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests7, (java.lang.Object) shortArray39);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray64);
        short[] shortArray68 = new short[] { (byte) 1 };
        short[] shortArray70 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray70);
        short[] shortArray73 = new short[] { (byte) 1 };
        short[] shortArray75 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray73, shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray68, shortArray75);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray64, shortArray68);
        short[] shortArray81 = new short[] { (byte) 1 };
        short[] shortArray83 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray81, shortArray83);
        short[] shortArray86 = new short[] { (byte) 1 };
        short[] shortArray88 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray88);
        short[] shortArray91 = new short[] { (byte) 1 };
        short[] shortArray93 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray91, shortArray93);
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray93);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray81, shortArray93);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray81);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray39, shortArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray4, shortArray64);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        int[] intArray5 = new int[] { (short) 0, '#', 10, '4' };
        int[] intArray12 = new int[] { (byte) -1, (short) -1, (-1), 2, (short) 0, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray5, intArray12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader21, (int) 'a', postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("", indexReader40, terms41, terms42, true);
        org.junit.rules.RuleChain ruleChain45 = null;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain45;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests29.assertDocsSkippingEquals("tests.monster", indexReader48, (int) (short) 1, postingsEnum50, postingsEnum51, true);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.badapples");
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        simpleIndexQueryParserTests29.assertFieldStatisticsEquals("node_s_0", fields59, fields62);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray68);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) executorServiceArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray64, (java.lang.Object[]) executorServiceArray72);
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader28, fields62, fields78, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService81 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService81;
        org.apache.lucene.index.NumericDocValues numericDocValues85 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 0, numericDocValues85, numericDocValues86);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        int[] intArray6 = new int[] { (short) 1, '4', ' ', (byte) 1, 1 };
        int[] intArray12 = new int[] { 0, (short) 100, (byte) -1, 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray6, intArray12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, 10, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService16;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests19.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests19.getqueryParser();
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        java.lang.String str31 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) indexQueryParserService18, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        long[] longArray1 = new long[] { (byte) 0 };
        long[] longArray7 = new long[] { 100L, 100L, (short) -1, (short) 10, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray7);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) (short) 0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (int) (short) 1, postingsEnum16, postingsEnum17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests6.queryParser = indexQueryParserService19;
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests6.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader24 = null;
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields28, (java.lang.Object) locale30);
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.badapples");
        simpleIndexQueryParserTests6.assertFieldsEquals("europarl.lines.txt.gz", indexReader24, fields28, fields36, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (-1), postingsEnum43, postingsEnum44);
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests39.resetCheckIndexStatus();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests39.assertTermsEquals("", indexReader50, terms51, terms52, true);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain55;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain55);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        simpleIndexQueryParserTests58.assertTermsEquals("tests.slow", indexReader60, terms61, terms62, true);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests58.assertPositionsSkippingEquals("tests.nightly", indexReader66, (int) (short) 10, postingsEnum68, postingsEnum69);
        simpleIndexQueryParserTests58.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) ruleChain55, (java.lang.Object) simpleIndexQueryParserTests58);
        org.apache.lucene.util.BytesRef bytesRef75 = simpleIndexQueryParserTests58.longToPrefixCoded(0L, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) (short) 0, (java.lang.Object) simpleIndexQueryParserTests58);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', (long) (byte) 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.badapples");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) strArray6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray9);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) executorServiceArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray18);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray13);
        org.apache.lucene.util.BytesRef[] bytesRefArray29 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray30 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray31 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray29, bytesRefArray30 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray31);
        java.util.Set<java.lang.Cloneable> cloneableSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) bytesRefArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) bytesRefArray31);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        char[] charArray4 = new char[] { 'a', '#' };
        char[] charArray7 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray4, charArray7);
        char[] charArray11 = new char[] { 'a', '#' };
        char[] charArray14 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray11, charArray14);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray19 = new char[] { 'a', '#' };
        char[] charArray22 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray19, charArray22);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray4, charArray22);
        char[] charArray27 = new char[] { 'a', '#' };
        char[] charArray30 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray27, charArray30);
        char[] charArray34 = new char[] { 'a', '#' };
        char[] charArray37 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray27, charArray37);
        org.junit.Assert.assertArrayEquals(charArray22, charArray27);
        char[] charArray41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray22, charArray41);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) 100);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        int[] intArray3 = new int[] { (byte) -1, (byte) -1 };
        int[] intArray8 = new int[] { (short) -1, 'a', (byte) 10, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray3, intArray8);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0d, (double) 1, 0.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader15, (-1), postingsEnum17, postingsEnum18);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (int) (short) 1, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = null;
        simpleIndexQueryParserTests13.queryParser = indexQueryParserService26;
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests13.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader31 = null;
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields35, (java.lang.Object) locale37);
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.badapples");
        simpleIndexQueryParserTests13.assertFieldsEquals("europarl.lines.txt.gz", indexReader31, fields35, fields43, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests46.assertPositionsSkippingEquals("tests.maxfailures", indexReader48, (-1), postingsEnum50, postingsEnum51);
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests46.resetCheckIndexStatus();
        simpleIndexQueryParserTests46.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("", indexReader57, terms58, terms59, true);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain62;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain62);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        simpleIndexQueryParserTests65.assertTermsEquals("tests.slow", indexReader67, terms68, terms69, true);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        simpleIndexQueryParserTests65.assertPositionsSkippingEquals("tests.nightly", indexReader73, (int) (short) 10, postingsEnum75, postingsEnum76);
        simpleIndexQueryParserTests65.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) ruleChain62, (java.lang.Object) simpleIndexQueryParserTests65);
        java.lang.String str80 = simpleIndexQueryParserTests65.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.failfast", (java.lang.Object) simpleIndexQueryParserTests65);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray4);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str5 = mockMoreLikeThisFetchService4.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str8 = mockMoreLikeThisFetchService7.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str10 = mockMoreLikeThisFetchService9.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray12 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService3, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService9, mockMoreLikeThisFetchService11 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet13 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray12);
        org.junit.Assert.assertNotSame("", (java.lang.Object) mockMoreLikeThisFetchService1, (java.lang.Object) abstractComponentSet13);
        java.lang.String str15 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str16 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str17 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("", indexReader29, terms30, terms31, true);
        org.junit.rules.RuleChain ruleChain34 = null;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.monster", indexReader37, (int) (short) 1, postingsEnum39, postingsEnum40, true);
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.badapples");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        simpleIndexQueryParserTests18.assertFieldStatisticsEquals("node_s_0", fields48, fields51);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("", indexReader54, (int) (short) -1, postingsEnum56, postingsEnum57);
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("tests.monster", postingsEnum60, postingsEnum61, true);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.slow", indexReader65, (int) (short) 1, postingsEnum67, postingsEnum68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) mockMoreLikeThisFetchService1, (java.lang.Object) postingsEnum68);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests5.ruleChain;
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("tests.slow", indexReader10, 100, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader17, (-1), postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (int) (short) 1, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests15.queryParser = indexQueryParserService28;
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests15.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader33 = null;
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields37, (java.lang.Object) locale39);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.badapples");
        simpleIndexQueryParserTests15.assertFieldsEquals("europarl.lines.txt.gz", indexReader33, fields37, fields45, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests48.assertPositionsSkippingEquals("tests.maxfailures", indexReader50, (-1), postingsEnum52, postingsEnum53);
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests48.resetCheckIndexStatus();
        simpleIndexQueryParserTests48.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests48.assertTermsEquals("", indexReader59, terms60, terms61, true);
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str72 = mockMoreLikeThisFetchService71.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService74 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str75 = mockMoreLikeThisFetchService74.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str78 = mockMoreLikeThisFetchService77.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str80 = mockMoreLikeThisFetchService79.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray82 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService73, mockMoreLikeThisFetchService74, mockMoreLikeThisFetchService76, mockMoreLikeThisFetchService77, mockMoreLikeThisFetchService79, mockMoreLikeThisFetchService81 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet83 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray82);
        org.junit.Assert.assertNotSame("", (java.lang.Object) mockMoreLikeThisFetchService71, (java.lang.Object) abstractComponentSet83);
        java.lang.String str85 = mockMoreLikeThisFetchService71.nodeName();
        java.lang.String str86 = mockMoreLikeThisFetchService71.nodeName();
        java.lang.String str87 = mockMoreLikeThisFetchService71.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) indexQueryParserService69, (java.lang.Object) mockMoreLikeThisFetchService71);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) 1, (long) (byte) 10);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        long[] longArray2 = new long[] { 'a' };
        long[] longArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray2, longArray3);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (byte) 1 };
        short[] shortArray6 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (byte) 1 };
        short[] shortArray11 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
        short[] shortArray16 = new short[] { (byte) 1 };
        short[] shortArray18 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray18);
        short[] shortArray21 = new short[] { (byte) 1 };
        short[] shortArray23 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray16, shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray28);
        short[] shortArray34 = new short[] { (byte) 1 };
        short[] shortArray36 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        short[] shortArray39 = new short[] { (byte) 1 };
        short[] shortArray41 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray39);
        short[] shortArray45 = new short[] { (byte) 1 };
        short[] shortArray47 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray45);
        short[] shortArray52 = new short[] { (byte) 1 };
        short[] shortArray54 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        short[] shortArray57 = new short[] { (byte) 1 };
        short[] shortArray59 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray59);
        short[] shortArray62 = new short[] { (byte) 1 };
        short[] shortArray64 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray57, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray64);
        short[] shortArray69 = new short[] { (byte) 1 };
        short[] shortArray71 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray71);
        short[] shortArray74 = new short[] { (byte) 1 };
        short[] shortArray76 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray74);
        short[] shortArray80 = new short[] { (byte) 1 };
        short[] shortArray82 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray80, shortArray82);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray52);
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray9, shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray34);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 1);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, 100.0d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        long[] longArray2 = new long[] { 'a', ' ' };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService31;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests18.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService35;
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService41;
        org.apache.lucene.index.NumericDocValues numericDocValues45 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (-1), numericDocValues45, numericDocValues46);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) ' ', (double) (-1L));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        long[] longArray1 = new long[] { (short) 0 };
        long[] longArray5 = new long[] { 100L, 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (-1), (long) (short) 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) fields12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests2.queryParser();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) executorServiceArray25);
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.badapples");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.awaitsfix");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader36, (-1), postingsEnum38, postingsEnum39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.maxfailures", indexReader42, (int) (short) 1, postingsEnum44, postingsEnum45);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests34.queryParser = indexQueryParserService47;
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests34.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader52 = null;
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields56, (java.lang.Object) locale58);
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.badapples");
        simpleIndexQueryParserTests34.assertFieldsEquals("europarl.lines.txt.gz", indexReader52, fields56, fields64, false);
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.monster", indexReader16, fields33, fields56, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.monster");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray25);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray22);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray40);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray58);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray54);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray49);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray37);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "hi!");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.badapples");
        java.util.Set<java.lang.String> strSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strArray71);
        java.util.Set<java.lang.Object> objSet77 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) strArray71);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (-1L), (double) 0L, (double) (short) -1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.slow", true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 10L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        long[] longArray2 = new long[] { (short) 1, (byte) 0 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) executorServiceArray23);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader10, terms11, terms12, false);
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray18);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray18);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray18, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "node_s_0");
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.badapples");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.maxfailures", fields26, fields31);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) (short) 0, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", 10, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        long[] longArray7 = new long[] { 2, (short) 10, 100, (byte) 1, (-1L), (byte) 10 };
        long[] longArray12 = new long[] { ' ', 100, (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray7, longArray12);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService14;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService18;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain21;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) ruleChain21);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        short[] shortArray1 = new short[] { (byte) 1 };
        short[] shortArray3 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        short[] shortArray6 = new short[] { (byte) 1 };
        short[] shortArray8 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray6);
        short[] shortArray12 = new short[] { (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray29);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray21, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray51);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        java.lang.String[] strArray56 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray1, (java.lang.Object) executorServiceArray33);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.apache.lucene.util.BytesRef[] bytesRefArray63 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[] bytesRefArray64 = new org.apache.lucene.util.BytesRef[] {};
        org.apache.lucene.util.BytesRef[][] bytesRefArray65 = new org.apache.lucene.util.BytesRef[][] { bytesRefArray63, bytesRefArray64 };
        java.util.Set<org.apache.lucene.util.BytesRef[]> bytesRefArraySet66 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray65);
        java.util.Set<java.lang.Cloneable> cloneableSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) bytesRefArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) bytesRefArray65);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        long[] longArray5 = new long[] { 10L, (byte) 10, (short) 100, 100, ' ' };
        long[] longArray10 = new long[] { 100L, (byte) 100, 100, '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.nightly");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray42 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray47);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray47, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray47);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray42);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray57);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray65);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray57, (java.lang.Object[]) executorServiceArray62);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray79);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray79);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray62, (java.lang.Object[]) executorServiceArray74);
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray42, (java.lang.Object[]) executorServiceArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) executorServiceArray19, (java.lang.Object) executorServiceArray42);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        int[] intArray1 = null;
        int[] intArray5 = new int[] { (byte) 1, (short) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (byte) 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (-1), postingsEnum7, postingsEnum8);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests3.queryParser = indexQueryParserService16;
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests3.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader21 = null;
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields25, (java.lang.Object) locale27);
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.badapples");
        simpleIndexQueryParserTests3.assertFieldsEquals("europarl.lines.txt.gz", indexReader21, fields25, fields33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.weekly", indexReader37, terms38, terms39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader43, (int) (byte) 100, postingsEnum45, postingsEnum46, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) locale2, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100.0f, (double) 10L, (double) 10L);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        int[] intArray1 = null;
        int[] intArray4 = new int[] { (byte) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray1, intArray4);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        int[] intArray5 = new int[] { (-1), (byte) -1, (-1), (short) 100 };
        int[] intArray12 = new int[] { 1, 0, (short) 10, (short) 10, (short) 100, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray12);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100L, 1L);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        int[] intArray0 = new int[] {};
        int[] intArray6 = new int[] { (byte) 100, '4', (-1), 100, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray6);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("node_s_0", fields30, fields33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("tests.maxfailures", indexReader38, (-1), postingsEnum40, postingsEnum41);
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests36.assertTermsEquals("", indexReader47, terms48, terms49, true);
        org.junit.rules.RuleChain ruleChain52 = null;
        simpleIndexQueryParserTests36.failureAndSuccessEvents = ruleChain52;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = null;
        simpleIndexQueryParserTests36.setqueryParser(indexQueryParserService54);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests36.assertDocsEnumEquals("random", postingsEnum57, postingsEnum58, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests61.assertPositionsSkippingEquals("tests.maxfailures", indexReader63, (-1), postingsEnum65, postingsEnum66);
        simpleIndexQueryParserTests61.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests61.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests61.assertDocsSkippingEquals("random", indexReader71, (int) (byte) 100, postingsEnum73, postingsEnum74, true);
        simpleIndexQueryParserTests61.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests61.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexQueryParserService35, (java.lang.Object) false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100L, (double) 10);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "hi!");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.lang.Class<?> wildcardClass28 = executorServiceArray14.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (-1), postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (int) (short) 1, postingsEnum39, postingsEnum40);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests29.queryParser = indexQueryParserService42;
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests29.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader47 = null;
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields51, (java.lang.Object) locale53);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.badapples");
        simpleIndexQueryParserTests29.assertFieldsEquals("europarl.lines.txt.gz", indexReader47, fields51, fields59, false);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("tests.weekly", indexReader63, terms64, terms65, true);
        org.junit.rules.RuleChain ruleChain68 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass69 = ruleChain68.getClass();
        java.lang.Class[] classArray71 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray72 = (java.lang.Class<?>[]) classArray71;
        wildcardClassArray72[0] = wildcardClass28;
        wildcardClassArray72[1] = wildcardClass69;
        java.util.Set<java.lang.Class<?>> wildcardClassSet77 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) strArray6, (java.lang.Object[]) wildcardClassArray72);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        long[] longArray4 = new long[] { 1L, (byte) 1, (byte) -1, 1 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) '#', (double) (short) 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray5);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str6 = mockMoreLikeThisFetchService5.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str8 = mockMoreLikeThisFetchService7.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray10 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService5, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService9 };
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet11 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader14, (-1), postingsEnum16, postingsEnum17);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests12.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests12.getqueryParser();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) abstractComponentSet11, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.maxfailures", indexReader13, (-1), postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 100, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        long[] longArray0 = new long[] {};
        long[] longArray5 = new long[] { 10, (byte) 100, 1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray5);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (byte) 1, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        int[] intArray1 = new int[] {};
        int[] intArray5 = new int[] { 1, 2, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray1, intArray5);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 100);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests12.setqueryParser(indexQueryParserService13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "hi!");
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) fields22);
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests12.ruleChain;
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.badapples");
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.badapples");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.nightly");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("tests.nightly", fields30, fields37);
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService21;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.maxfailures", indexReader32, (int) (short) 1, postingsEnum34, postingsEnum35);
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests24);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, (-1), postingsEnum22, postingsEnum23);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (int) (short) 1, postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService31;
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests18.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests18.queryParser = indexQueryParserService35;
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.badapples");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "random");
        java.util.concurrent.ExecutorService[] executorServiceArray54 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray54);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray62 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray62);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray62);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray54, (java.lang.Object[]) executorServiceArray59);
        java.util.concurrent.ExecutorService[] executorServiceArray66 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray66);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray66);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray71);
        java.util.concurrent.ExecutorService[] executorServiceArray75 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray75);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray71, (java.lang.Object[]) executorServiceArray75);
        java.util.concurrent.ExecutorService[] executorServiceArray80 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean81 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray80);
        java.util.concurrent.ExecutorService[] executorServiceArray84 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray84);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) executorServiceArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray75, (java.lang.Object[]) executorServiceArray80);
        java.lang.String[] strArray89 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields91 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray89, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray80, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray66, (java.lang.Object[]) strArray89);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray41, (java.lang.Object) "hi!");
        org.apache.lucene.index.Fields fields96 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) fields96);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray31);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray28);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray35);
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray40);
        java.util.concurrent.ExecutorService[] executorServiceArray45 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray45);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray45, (java.lang.Object[]) executorServiceArray48);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) executorServiceArray45);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) executorServiceArray28, (java.lang.Object[]) executorServiceArray40);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray40);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.Object[] objArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, objArray58);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (int) (short) 1, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests10.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader28 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields32, (java.lang.Object) locale34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.badapples");
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields32, fields40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, (-1), postingsEnum47, postingsEnum48);
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests43.assertTermsEquals("", indexReader54, terms55, terms56, true);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        org.junit.rules.TestRule testRule62 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests63.assertPositionsSkippingEquals("tests.maxfailures", indexReader65, (-1), postingsEnum67, postingsEnum68);
        simpleIndexQueryParserTests63.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests63.assertDocsEnumEquals("", postingsEnum72, postingsEnum73, true);
        simpleIndexQueryParserTests63.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef78 = simpleIndexQueryParserTests63.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 100.0f, (double) (byte) 10);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("node_s_0", indexReader8, 1, postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader16, (-1), postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("", indexReader25, terms26, terms27, true);
        org.junit.rules.RuleChain ruleChain30 = null;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("tests.monster", indexReader33, (int) (short) 1, postingsEnum35, postingsEnum36, true);
        java.lang.String str39 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        float[] floatArray1 = null;
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) (short) 0);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray4, floatArray9, 1.0f);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray15, 0.0f);
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray22, (float) (short) 0);
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray26, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray21, floatArray26, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray15, floatArray26, (float) (byte) 10);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray26, floatArray33, (float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", floatArray1, floatArray33, (float) ' ');
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 100, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader24, (-1), postingsEnum26, postingsEnum27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.maxfailures", indexReader30, (int) (short) 1, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = null;
        simpleIndexQueryParserTests22.queryParser = indexQueryParserService35;
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests22.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = null;
        simpleIndexQueryParserTests22.queryParser = indexQueryParserService39;
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests22.getqueryParser();
        simpleIndexQueryParserTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader47, (int) (byte) -1, postingsEnum49, postingsEnum50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum50);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        long[] longArray4 = new long[] { '#', '#', (byte) 0 };
        long[] longArray11 = new long[] { (byte) 1, ' ', 'a', 100, (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray4, longArray11);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, 10, postingsEnum12, postingsEnum13);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "hi!");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.badapples");
        java.util.Set<java.lang.String> strSet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "hi!");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.badapples");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields29, fields41);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService18;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader21, (int) '#', postingsEnum23, postingsEnum24, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields31, (java.lang.Object) locale33);
        java.lang.Class<?> wildcardClass35 = fields31.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) wildcardClass35);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        int[] intArray6 = new int[] { (short) 1, 0, (short) 100, (-1), (short) 100 };
        int[] intArray11 = new int[] { 2, (byte) 100, 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray6, intArray11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        int[] intArray1 = new int[] {};
        int[] intArray6 = new int[] { 10, ' ', (byte) 1, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 10);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader12, (int) '4', postingsEnum14, postingsEnum15);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum20, postingsEnum21);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        int[] intArray3 = new int[] { (short) 100, (-1), (byte) 100 };
        int[] intArray7 = new int[] { '#', (-1), 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray7);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 10);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 0, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 0L, (long) (-1));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str13 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray32);
        java.util.concurrent.ExecutorService[] executorServiceArray37 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray37);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray37, (java.lang.Object[]) executorServiceArray41);
        java.util.concurrent.ExecutorService[] executorServiceArray46 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray46);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray46);
        java.util.concurrent.ExecutorService[] executorServiceArray50 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray50);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) executorServiceArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray41, (java.lang.Object[]) executorServiceArray46);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray46, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) strArray55);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "hi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 1, (double) 1);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray7);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray27, (java.lang.Object[]) executorServiceArray34);
        java.util.concurrent.ExecutorService[] executorServiceArray39 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray39);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray39);
        java.util.concurrent.ExecutorService[] executorServiceArray43 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray43);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray39, (java.lang.Object[]) executorServiceArray43);
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray52);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray43, (java.lang.Object[]) executorServiceArray48);
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray34, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray2, (java.lang.Object) executorServiceArray34);
        short[] shortArray63 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray2, shortArray63);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (short) 10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray9 = new long[] { (-1L), 100L, (short) 10, (-1L), 2, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray9);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        int[] intArray4 = new int[] { (byte) -1, (byte) 10, (byte) 0 };
        int[] intArray8 = new int[] { (-1), (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray4, intArray8);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        short[] shortArray2 = new short[] { (byte) 1 };
        short[] shortArray4 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray9);
        short[] shortArray13 = new short[] { (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        short[] shortArray18 = new short[] { (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray9, shortArray13);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        short[] shortArray31 = new short[] { (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray33);
        short[] shortArray36 = new short[] { (byte) 1 };
        short[] shortArray38 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray26);
        short[] shortArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray43);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray11);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray24, byteArray27);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray32, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray24, byteArray32);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray41, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling54 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling54, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling57 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling58, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling61 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling61, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray64 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling54, throttling57, throttling58, throttling61 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling68 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling68, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling72 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling72, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling75 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling75, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray78 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling66, throttling68, throttling71, throttling72, throttling75 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling80 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling80);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling82 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling82, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling85 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling86 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling86, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling89 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotSame((java.lang.Object) throttling89, (java.lang.Object) 10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray92 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling80, throttling82, throttling85, throttling86, throttling89 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray93 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray64, throttlingArray78, throttlingArray92 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList94 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, throttlingArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) byteArray18, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray9, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray9, byteArray17);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray3, byteArray25);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray35, byteArray38);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray35, byteArray43);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray52, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray35);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray67, byteArray70);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray75);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray75, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray67, byteArray75);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray62, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray85 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] {};
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceSet86 = org.apache.lucene.util.LuceneTestCase.asSet(mockMoreLikeThisFetchServiceArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) byteArray3, (java.lang.Object) mockMoreLikeThisFetchServiceArray85);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray5);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray13);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray22);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray26);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray31);
        java.util.concurrent.ExecutorService[] executorServiceArray35 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray35);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) executorServiceArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray26, (java.lang.Object[]) executorServiceArray31);
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) strArray40);
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) executorServiceArray53);
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.badapples");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "node_s_0", "tests.failfast", "enwiki.random.lines.txt", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray66);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray16);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray40, byteArray43);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray40, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray35, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) (byte) 10, (java.lang.Object) byteArray2);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        short[] shortArray4 = new short[] { (short) 1, (byte) 0, (byte) 1 };
        short[] shortArray6 = new short[] { (byte) 1 };
        short[] shortArray8 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
        short[] shortArray11 = new short[] { (byte) 1 };
        short[] shortArray13 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.slow", indexReader18, terms19, terms20, true);
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests16.indexedValueForSearch(0L);
        short[] shortArray26 = new short[] { (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray28);
        short[] shortArray33 = new short[] { (byte) 1 };
        short[] shortArray35 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray35);
        short[] shortArray38 = new short[] { (byte) 1 };
        short[] shortArray40 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray38);
        short[] shortArray44 = new short[] { (byte) 1 };
        short[] shortArray46 = new short[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(shortArray44, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray44);
        java.util.concurrent.ExecutorService[] executorServiceArray53 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray53);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray53);
        java.util.concurrent.ExecutorService[] executorServiceArray58 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray58);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray61);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray53, (java.lang.Object[]) executorServiceArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray58, (java.lang.Object[]) executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray70 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray70);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray70);
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray74);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray70, (java.lang.Object[]) executorServiceArray74);
        java.util.concurrent.ExecutorService[] executorServiceArray79 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray79);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray79);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray83);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) executorServiceArray83);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray74, (java.lang.Object[]) executorServiceArray79);
        java.lang.String[] strArray88 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "tests.monster");
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray79, (java.lang.Object[]) strArray88);
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) strArray88);
        org.junit.Assert.assertNotSame((java.lang.Object) shortArray33, (java.lang.Object) executorServiceArray65);
        org.junit.Assert.assertArrayEquals(shortArray28, shortArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray4, shortArray33);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.slow", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests1.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", (java.lang.Object) indexQueryParserService14);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader11, terms12, terms13, true);
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (short) 1, postingsEnum21, postingsEnum22, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader28, (-1), postingsEnum30, postingsEnum31);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.maxfailures", indexReader34, (int) (short) 1, postingsEnum36, postingsEnum37);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = null;
        simpleIndexQueryParserTests26.queryParser = indexQueryParserService39;
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests26.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = null;
        simpleIndexQueryParserTests26.queryParser = indexQueryParserService43;
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests26.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("node_s_0", obj1);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) (short) 0);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray3, floatArray8, 1.0f);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) (short) 0);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray14, floatArray19, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray19, (float) (short) 0);
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) (short) 0);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray27, floatArray32, 1.0f);
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray39, (float) (short) 0);
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray38, floatArray43, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray43, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray43, (float) (short) 1);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray52, (float) 100L);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) (short) 0);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray59, floatArray64, 1.0f);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray70, 0.0f);
        float[] floatArray76 = new float[] {};
        float[] floatArray77 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray76, floatArray77, (float) (short) 0);
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray81, (float) (short) 0);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray76, floatArray81, 1.0f);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray81, (float) (byte) 10);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray19, floatArray70, (float) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray19, (float) (short) -1);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        long[] longArray6 = new long[] { (short) -1, 10L, (byte) 1, '4', (short) 0 };
        long[] longArray13 = new long[] { 0, (-1), ' ', (byte) 1, (short) 100, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray6, longArray13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 'a', (double) (short) 1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) '4', (double) '4');
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray15);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.Object[] objArray20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, objArray20);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray2);
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray6);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray15);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray11);
        java.lang.Class<?> wildcardClass20 = executorServiceArray6.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader23, (-1), postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService34;
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests21.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader39 = null;
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) fields43, (java.lang.Object) locale45);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.badapples");
        simpleIndexQueryParserTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields43, fields51, false);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("tests.weekly", indexReader55, terms56, terms57, true);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass61 = ruleChain60.getClass();
        java.lang.Class[] classArray63 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass20;
        wildcardClassArray64[1] = wildcardClass61;
        java.util.Set<java.lang.Class<?>> wildcardClassSet69 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray64);
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray72);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray72);
        java.lang.String[] strArray75 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray72, (java.lang.Object[]) strArray75);
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) wildcardClassArray64, (java.lang.Object[]) strArray75);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) ' ');
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader10, (int) (byte) 100, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader21, (int) (byte) 10, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) 10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        int[] intArray3 = new int[] { '#', 2 };
        int[] intArray7 = new int[] { (byte) 100, (short) 100, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray3, intArray7);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader12, terms13, terms14, true);
        org.junit.rules.RuleChain ruleChain17 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader21, (-1), postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("tests.maxfailures", indexReader27, (int) (short) 1, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests19.queryParser = indexQueryParserService32;
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests19.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests19.queryParser = indexQueryParserService36;
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain39;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) ' ', (long) '4');
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        char[] charArray1 = new char[] {};
        char[] charArray6 = new char[] { 'a', '#' };
        char[] charArray9 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray6, charArray9);
        char[] charArray13 = new char[] { 'a', '#' };
        char[] charArray16 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray6, charArray16);
        char[] charArray21 = new char[] { 'a', '#' };
        char[] charArray24 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray21, charArray24);
        char[] charArray28 = new char[] { 'a', '#' };
        char[] charArray31 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        org.junit.Assert.assertArrayEquals(charArray21, charArray31);
        org.junit.Assert.assertArrayEquals(charArray16, charArray21);
        char[] charArray38 = new char[] { 'a', '#' };
        char[] charArray41 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray38, charArray41);
        char[] charArray45 = new char[] { 'a', '#' };
        char[] charArray48 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray45, charArray48);
        org.junit.Assert.assertArrayEquals(charArray38, charArray48);
        char[] charArray54 = new char[] { 'a', '#' };
        char[] charArray57 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray54, charArray57);
        char[] charArray61 = new char[] { 'a', '#' };
        char[] charArray64 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray61, charArray64);
        org.junit.Assert.assertArrayEquals(charArray54, charArray64);
        char[] charArray69 = new char[] { 'a', '#' };
        char[] charArray72 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray69, charArray72);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray54, charArray72);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray38, charArray72);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray16, charArray38);
        char[] charArray79 = new char[] { 'a', '#' };
        char[] charArray82 = new char[] { 'a', '#' };
        org.junit.Assert.assertArrayEquals(charArray79, charArray82);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray16, charArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray1, charArray16);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader12, (int) (short) 10, postingsEnum14, postingsEnum15, true);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (-1), numericDocValues22, numericDocValues23);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 0, 100.0d, (double) (-1L));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, (-1), postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.slow", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService15);
        simpleIndexQueryParserTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService17;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) ' ');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 1, numericDocValues34, numericDocValues35);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        long[] longArray1 = new long[] {};
        long[] longArray3 = new long[] { 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray3);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (byte) -1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader2, (-1), postingsEnum4, postingsEnum5);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService13;
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum23, postingsEnum24, false);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum28, postingsEnum29);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray8);
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray8, (java.lang.Object[]) executorServiceArray11);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.monster");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.badapples");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.nightly");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray10);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray14);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray19);
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray30);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray33);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) executorServiceArray30);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) executorServiceArray19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (-1), postingsEnum43, postingsEnum44);
        simpleIndexQueryParserTests39.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = simpleIndexQueryParserTests39.queryParser();
        simpleIndexQueryParserTests39.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) strArray1, (java.lang.Object) ruleChain49);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray3);
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray7);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray16);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray12);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray26 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray26);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray26);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray33 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) 0, (java.lang.Object) executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) executorServiceArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray33);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray33);
        java.lang.String[] strArray48 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.badapples");
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) strArray48);
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "");
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray33, (java.lang.Object[]) strArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArray33);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.maxfailures", true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader3, (-1), postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }
}

