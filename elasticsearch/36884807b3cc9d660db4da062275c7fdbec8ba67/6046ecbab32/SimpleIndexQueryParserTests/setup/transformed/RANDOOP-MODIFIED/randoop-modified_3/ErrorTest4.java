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
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.weekly");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) strArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray4);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.weekly");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) strArray17);
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray30);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 10.0d, (double) 10.0f);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader12, terms13, terms14, true);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests5.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "enwiki.random.lines.txt");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields22, fields29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests3.ensureCleanedUp();
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) floatArray42);
        float[] floatArray47 = new float[] {};
        float[] floatArray49 = new float[] {};
        float[] floatArray50 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray50, (float) 1L);
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray49, floatArray53, 0.0f);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray49, floatArray60, 0.0f);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray47, floatArray60, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray47, 0.0f);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 1L);
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray70, floatArray74, 0.0f);
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray81, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray81, 0.0f);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray47, floatArray81, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) "node_s_0");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        java.lang.String[] strArray14 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray14);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader28, 10, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService33);
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests1.longToPrefixCoded((long) ' ', 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) 5);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields29, fields36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests38.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '4');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues54 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (-1), numericDocValues54, numericDocValues55);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields29, fields36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests38.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '4');
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef54 = simpleIndexQueryParserTests52.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests52.queryParser;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("tests.slow", indexReader57, (int) '4', postingsEnum59, postingsEnum60);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests62.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests62.failureAndSuccessEvents;
        simpleIndexQueryParserTests52.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests52.ensureCleanedUp();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain68 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef70 = simpleIndexQueryParserTests52.indexedValueForSearch((-1L));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef73 = simpleIndexQueryParserTests71.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService74 = simpleIndexQueryParserTests71.queryParser;
        org.apache.lucene.index.IndexReader indexReader76 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        simpleIndexQueryParserTests71.assertPositionsSkippingEquals("tests.slow", indexReader76, (int) '4', postingsEnum78, postingsEnum79);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests81.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain83 = simpleIndexQueryParserTests81.failureAndSuccessEvents;
        simpleIndexQueryParserTests71.failureAndSuccessEvents = ruleChain83;
        simpleIndexQueryParserTests71.ensureCleanedUp();
        simpleIndexQueryParserTests71.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain87 = simpleIndexQueryParserTests71.failureAndSuccessEvents;
        simpleIndexQueryParserTests52.failureAndSuccessEvents = ruleChain87;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests89 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef91 = simpleIndexQueryParserTests89.indexedValueForSearch((long) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain87, (java.lang.Object) bytesRef91);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain87;
        org.apache.lucene.index.NumericDocValues numericDocValues96 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues97 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) (short) 0, numericDocValues96, numericDocValues97);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) -1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (short) -1, (double) 1.0f);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain13;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("random", indexReader19, (-1), postingsEnum21, postingsEnum22);
        java.lang.String str24 = simpleIndexQueryParserTests1.getTestName();
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray25, (java.lang.Object[]) executorServiceArray28);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray25);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, 0L);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        double[] doubleArray11 = new double[] { 0.0f };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        double[] doubleArray14 = new double[] { 0.0f };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        double[] doubleArray17 = new double[] { 0.0f };
        double[][] doubleArray18 = new double[][] { doubleArray17 };
        double[] doubleArray20 = new double[] { 0.0f };
        double[][] doubleArray21 = new double[][] { doubleArray20 };
        double[][][] doubleArray22 = new double[][][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        double[] doubleArray24 = new double[] { 0.0f };
        double[][] doubleArray25 = new double[][] { doubleArray24 };
        double[] doubleArray27 = new double[] { 0.0f };
        double[][] doubleArray28 = new double[][] { doubleArray27 };
        double[] doubleArray30 = new double[] { 0.0f };
        double[][] doubleArray31 = new double[][] { doubleArray30 };
        double[] doubleArray33 = new double[] { 0.0f };
        double[][] doubleArray34 = new double[][] { doubleArray33 };
        double[][][] doubleArray35 = new double[][][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        double[] doubleArray37 = new double[] { 0.0f };
        double[][] doubleArray38 = new double[][] { doubleArray37 };
        double[] doubleArray40 = new double[] { 0.0f };
        double[][] doubleArray41 = new double[][] { doubleArray40 };
        double[] doubleArray43 = new double[] { 0.0f };
        double[][] doubleArray44 = new double[][] { doubleArray43 };
        double[] doubleArray46 = new double[] { 0.0f };
        double[][] doubleArray47 = new double[][] { doubleArray46 };
        double[][][] doubleArray48 = new double[][][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        double[][][][] doubleArray49 = new double[][][][] { doubleArray22, doubleArray35, doubleArray48 };
        java.util.List<double[][][]> doubleArrayList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, doubleArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) doubleArray49);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        java.lang.Object[] objArray1 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet(objArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet(objArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        org.junit.Assert.assertArrayEquals(objArray11, objArray16);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray6, objArray11);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        org.junit.Assert.assertArrayEquals(objArray29, objArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray24, objArray29);
        org.junit.Assert.assertEquals(objArray11, objArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", objArray1, objArray11);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "<unknown>");
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("europarl.lines.txt.gz", 0, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray9, charArray17);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        org.junit.Assert.assertArrayEquals(charArray17, charArray20);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray17, charArray28);
        org.junit.Assert.assertArrayEquals(charArray4, charArray17);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray4, (java.lang.Object) serializableSet37);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader6, 10, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", 10, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain31;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests39.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests39.queryParser;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Terms terms45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        simpleIndexQueryParserTests39.assertTermsEquals("europarl.lines.txt.gz", indexReader44, terms45, terms46, true);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "enwiki.random.lines.txt");
        java.lang.String[] strArray61 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests39.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields56, fields63);
        org.apache.lucene.index.IndexReader indexReader66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("hi!", indexReader66, 10, postingsEnum68, postingsEnum69);
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("node_s_0", indexReader72, 4, postingsEnum74, postingsEnum75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) bytesRef38, (java.lang.Object) postingsEnum74);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader13, terms14, terms15, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) terms14);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService23);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        char[] charArray1 = null;
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray7, charArray15);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray20, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray28, charArray39);
        org.junit.Assert.assertArrayEquals(charArray7, charArray28);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray3, charArray7);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals(charArray49, charArray53);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray49, charArray57);
        org.junit.Assert.assertArrayEquals(charArray45, charArray57);
        org.junit.Assert.assertArrayEquals(charArray3, charArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray1, charArray3);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        int[] intArray0 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "");
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][][] strArray14 = new java.lang.String[][][] { strArray9, strArray10, strArray11, strArray12, strArray13 };
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] {};
        java.lang.String[][] strArray18 = new java.lang.String[][] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][][] strArray20 = new java.lang.String[][][] { strArray15, strArray16, strArray17, strArray18, strArray19 };
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        java.lang.String[][] strArray24 = new java.lang.String[][] {};
        java.lang.String[][] strArray25 = new java.lang.String[][] {};
        java.lang.String[][][] strArray26 = new java.lang.String[][][] { strArray21, strArray22, strArray23, strArray24, strArray25 };
        java.lang.String[][] strArray27 = new java.lang.String[][] {};
        java.lang.String[][] strArray28 = new java.lang.String[][] {};
        java.lang.String[][] strArray29 = new java.lang.String[][] {};
        java.lang.String[][] strArray30 = new java.lang.String[][] {};
        java.lang.String[][] strArray31 = new java.lang.String[][] {};
        java.lang.String[][][] strArray32 = new java.lang.String[][][] { strArray27, strArray28, strArray29, strArray30, strArray31 };
        java.lang.String[][][][] strArray33 = new java.lang.String[][][][] { strArray14, strArray20, strArray26, strArray32 };
        java.util.Set<java.lang.String[][][]> strArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(strArray33);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, (-1), postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader17, 3, postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (int) '#', numericDocValues28, numericDocValues29);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 2, (long) 3);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.queryParser;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.slow", indexReader15, (int) '4', postingsEnum17, postingsEnum18);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objArray49);
        java.lang.Iterable[] iterableArray52 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray53 = (java.lang.Iterable<java.lang.Object>[]) iterableArray52;
        objIterableArray53[0] = objSet25;
        objIterableArray53[1] = objSet30;
        objIterableArray53[2] = objSet35;
        objIterableArray53[3] = objSet40;
        objIterableArray53[4] = objSet45;
        objIterableArray53[5] = objSet50;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet66 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray53);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests10, (java.lang.Object) objIterableSet66);
        org.junit.rules.RuleChain ruleChain68 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) ruleChain68);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain68;
        org.apache.lucene.index.NumericDocValues numericDocValues73 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 5, numericDocValues73, numericDocValues74);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.junit.Assert.assertNotNull((java.lang.Object) fields18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) fields18);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray4);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) strArray11);
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.maxfailures");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.badapples");
        double[][][] doubleArray19 = new double[][][] {};
        double[][][] doubleArray20 = new double[][][] {};
        double[][][] doubleArray21 = new double[][][] {};
        double[][][][] doubleArray22 = new double[][][][] { doubleArray19, doubleArray20, doubleArray21 };
        java.util.Set<double[][][]> doubleArraySet23 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray11, (java.lang.Object[]) doubleArray22);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = null;
        simpleIndexQueryParserTests4.queryParser = indexQueryParserService6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("", indexReader9, terms10, terms11, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests4.queryParser();
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertDocsSkippingEquals("tests.weekly", indexReader21, (int) (byte) 100, postingsEnum23, postingsEnum24, false);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.weekly");
        java.lang.String[] strArray42 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "");
        simpleIndexQueryParserTests30.assertFieldsEquals("tests.weekly", indexReader34, fields37, fields46, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.weekly");
        java.lang.String[] strArray61 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "");
        simpleIndexQueryParserTests49.assertFieldsEquals("tests.weekly", indexReader53, fields56, fields65, true);
        simpleIndexQueryParserTests19.assertFieldsEquals("enwiki.random.lines.txt", indexReader29, fields46, fields56, true);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "node_s_0");
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "<unknown>");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "random");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "tests.slow");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("tests.monster", fields56, fields84);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.queryParser;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, true);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "enwiki.random.lines.txt");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests10.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields27, fields34);
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests10.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum8, (java.lang.Object) bytesRef40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService45 = simpleIndexQueryParserTests42.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = simpleIndexQueryParserTests42.queryParser;
        simpleIndexQueryParserTests42.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests42.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests42.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) bytesRef40, (java.lang.Object) indexQueryParserService49);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        int[] intArray6 = new int[] { (-1), 6, (-1), (short) -1, (byte) -1, 0 };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals(intArray8, intArray10);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        org.junit.Assert.assertArrayEquals("random", intArray19, intArray22);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray16, intArray22);
        org.junit.Assert.assertArrayEquals(intArray10, intArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray10);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        double[] doubleArray6 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray19 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray24, (double) (short) 10);
        double[] doubleArray32 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray37 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray32, doubleArray37, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray32, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray19, 10.0d);
        double[] doubleArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", doubleArray19, doubleArray44, (double) 100);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        java.lang.String[] strArray1 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "enwiki.random.lines.txt");
        java.util.Set<java.io.Serializable> serializableSet13 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray11, intArray17);
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        org.junit.Assert.assertArrayEquals(intArray24, intArray26);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        org.junit.Assert.assertArrayEquals("random", intArray35, intArray38);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray32, intArray38);
        org.junit.Assert.assertArrayEquals(intArray26, intArray32);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray26);
        int[] intArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray45);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader5, terms6, terms7, false);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "node_s_0");
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.weekly");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "random");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader11, fields22, fields29, false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", 0L, (long) (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, 0L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (short) 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        java.lang.String[][][] strArray5 = new java.lang.String[][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][] strArray6 = new java.lang.String[][] {};
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][][] strArray11 = new java.lang.String[][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][] strArray12 = new java.lang.String[][] {};
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][][] strArray17 = new java.lang.String[][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][] strArray18 = new java.lang.String[][] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] {};
        java.lang.String[][][] strArray23 = new java.lang.String[][][] { strArray18, strArray19, strArray20, strArray21, strArray22 };
        java.lang.String[][][][] strArray24 = new java.lang.String[][][][] { strArray5, strArray11, strArray17, strArray23 };
        java.util.Set<java.lang.String[][][]> strArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray28);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 1.0f, (double) 3);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 4);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader10, (int) 'a', postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("tests.monster", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum24, postingsEnum25, false);
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests17.ruleChain;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) testRule28);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) -1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests19.queryParser;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests19.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields36, fields43);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests19.assertPositionsSkippingEquals("hi!", indexReader46, 10, postingsEnum48, postingsEnum49);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests19.getqueryParser();
        org.junit.rules.TestRule testRule52 = simpleIndexQueryParserTests19.ruleChain;
        simpleIndexQueryParserTests19.ensureCleanedUp();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests19.queryParser();
        java.lang.Class<?> wildcardClass56 = simpleIndexQueryParserTests19.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 10.0f, (double) 6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (short) 10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader28, 10, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests1.getqueryParser();
        org.junit.rules.TestRule testRule34 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests1.queryParser();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("node_s_0", indexReader37, terms38, terms39, true);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.nightly", postingsEnum43, postingsEnum44, true);
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 5);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "node_s_0");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArray53);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests5.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("tests.slow", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests5.setUp();
        org.junit.rules.TestRule testRule16 = simpleIndexQueryParserTests5.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) objArray3, (java.lang.Object) testRule16);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain14;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests9.queryParser;
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests9.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests9);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests9.queryParser;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests9.longToPrefixCoded(10L, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 4, (double) (short) 1);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 1L);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray6 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray7 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray8 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray9 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray10 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray6, elasticsearchTestCaseArray7, elasticsearchTestCaseArray8, elasticsearchTestCaseArray9 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.slow", indexReader17, (int) '4', postingsEnum19, postingsEnum20);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("tests.maxfailures", indexReader24, terms25, terms26, false);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) elasticsearchTestCaseArray10, (java.lang.Object) indexReader24);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet30 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray10);
        java.util.List<java.lang.Object[]> objArrayList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.Object[][]) elasticsearchTestCaseArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray1, (java.lang.Object) elasticsearchTestCaseArray10);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setUp();
        org.junit.Assert.assertNotSame("", (java.lang.Object) 4, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.setup();
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.failfast", indexReader9, (int) (byte) 10, postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "<unknown>");
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray32);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.weekly");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray32, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals(objArray31, (java.lang.Object[]) executorServiceArray32);
        java.lang.String[] strArray41 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.weekly");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "random");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray31, (java.lang.Object[]) strArray41);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.maxfailures", fields29, fields50);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        java.lang.Object obj2 = null;
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet(objArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet(objArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        org.junit.Assert.assertArrayEquals(objArray11, objArray16);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        org.junit.Assert.assertArrayEquals(objArray28, objArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray23, objArray28);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet(objArray41);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet(objArray46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet52 = org.apache.lucene.util.LuceneTestCase.asSet(objArray51);
        org.junit.Assert.assertArrayEquals(objArray46, objArray51);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray41, objArray46);
        org.junit.Assert.assertEquals(objArray28, objArray41);
        org.junit.Assert.assertEquals(objArray11, objArray28);
        org.junit.Assert.assertArrayEquals(objArray6, objArray28);
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet(objArray61);
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet67 = org.apache.lucene.util.LuceneTestCase.asSet(objArray66);
        org.junit.Assert.assertArrayEquals(objArray61, objArray66);
        org.junit.Assert.assertEquals(objArray28, objArray66);
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet74 = org.apache.lucene.util.LuceneTestCase.asSet(objArray73);
        java.lang.Object[] objArray78 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet79 = org.apache.lucene.util.LuceneTestCase.asSet(objArray78);
        org.junit.Assert.assertArrayEquals(objArray73, objArray78);
        org.junit.Assert.assertArrayEquals(objArray66, objArray78);
        org.junit.Assert.assertNotSame("", obj2, (java.lang.Object) objArray66);
        java.lang.Object[] objArray83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", objArray66, objArray83);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100, (double) (byte) -1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        double[][][] doubleArray0 = new double[][][] {};
        double[][][] doubleArray1 = new double[][][] {};
        double[][][] doubleArray2 = new double[][][] {};
        double[][][][] doubleArray3 = new double[][][][] { doubleArray0, doubleArray1, doubleArray2 };
        java.util.Set<double[][][]> doubleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "node_s_0");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.weekly");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "europarl.lines.txt.gz");
        org.junit.Assert.assertNotNull((java.lang.Object) strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray3, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] { (short) 100 };
        short[] shortArray5 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray10 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray10);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray23 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (short) 100 };
        short[] shortArray28 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray26);
        short[] shortArray32 = new short[] { (short) 100 };
        short[] shortArray34 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray26);
        org.junit.Assert.assertArrayEquals("", shortArray10, shortArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray10);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.badapples");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader4, (int) '#', postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("", indexReader14, terms15, terms16, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests10.queryParser;
        simpleIndexQueryParserTests10.setUp();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.failfast", indexReader22, terms23, terms24, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests10.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum6, (java.lang.Object) indexQueryParserService28);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests6.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests6.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("europarl.lines.txt.gz", indexReader11, terms12, terms13, true);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "enwiki.random.lines.txt");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests6.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields23, fields30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests32.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain37;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain37;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain37;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain37;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService42);
        java.lang.String str44 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", 1, numericDocValues47, numericDocValues48);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader11, 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests18.queryParser;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.slow", indexReader23, (int) '4', postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("random", indexReader36, (-1), postingsEnum38, postingsEnum39);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) indexQueryParserService16, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        java.lang.String[] strArray1 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray1);
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "random");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.failfast");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests9.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests13.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests13.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray21 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests9, simpleIndexQueryParserTests13 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet22 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray21);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.weekly");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "");
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray30);
        org.junit.Assert.assertNotSame((java.lang.Object) elasticsearchSingleNodeTestArray21, (java.lang.Object) strArray23);
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) strArray23);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100L, (double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields24, fields31);
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests7.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests7.assertDocsEnumEquals("tests.weekly", postingsEnum37, postingsEnum38, true);
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) strArray3, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests43.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = simpleIndexQueryParserTests43.queryParser;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.slow", indexReader48, (int) '4', postingsEnum50, postingsEnum51);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests53.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain55;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain55;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) ruleChain55);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringBuilder();
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "");
        java.lang.Class<?> wildcardClass12 = fields11.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests13.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests13.queryParser;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("europarl.lines.txt.gz", indexReader18, terms19, terms20, true);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "enwiki.random.lines.txt");
        java.lang.String[] strArray35 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields30, fields37);
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("hi!", indexReader40, 10, postingsEnum42, postingsEnum43);
        java.lang.Class<?> wildcardClass45 = simpleIndexQueryParserTests13.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests46.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests46.queryParser;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, true);
        java.lang.Class<?> wildcardClass56 = simpleIndexQueryParserTests46.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests57.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = simpleIndexQueryParserTests57.queryParser;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        simpleIndexQueryParserTests57.assertTermsEquals("europarl.lines.txt.gz", indexReader62, terms63, terms64, true);
        java.lang.Class<?> wildcardClass67 = simpleIndexQueryParserTests57.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef70 = simpleIndexQueryParserTests68.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService71 = simpleIndexQueryParserTests68.queryParser;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        simpleIndexQueryParserTests68.assertTermsEquals("europarl.lines.txt.gz", indexReader73, terms74, terms75, true);
        java.lang.Class<?> wildcardClass78 = simpleIndexQueryParserTests68.getClass();
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass12, wildcardClass45, wildcardClass56, wildcardClass67, wildcardClass78 };
        java.util.List<java.lang.reflect.Type> typeList80 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, typeArray79);
        java.util.List<java.lang.reflect.Type> typeList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, typeArray79);
        java.util.concurrent.ExecutorService[] executorServiceArray82 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray82);
        java.lang.String[] strArray84 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray84, "tests.weekly");
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray84, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray82, (java.lang.Object[]) strArray84);
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) typeArray79, (java.lang.Object[]) executorServiceArray82);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 4, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 2);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader29, (int) (byte) 0, postingsEnum31, postingsEnum32, true);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader3, (int) (byte) 1, postingsEnum5, postingsEnum6);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", (-1), numericDocValues13, numericDocValues14);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.failfast", (int) (short) 100, numericDocValues17, numericDocValues18);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (-1.0d));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests3.getqueryParser();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.weekly");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "");
        simpleIndexQueryParserTests5.assertFieldsEquals("tests.weekly", indexReader9, fields12, fields21, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests25.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests25.queryParser;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("europarl.lines.txt.gz", indexReader30, terms31, terms32, true);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "enwiki.random.lines.txt");
        java.lang.String[] strArray47 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests25.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields42, fields49);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef53 = simpleIndexQueryParserTests51.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests51.queryParser;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        simpleIndexQueryParserTests51.assertTermsEquals("europarl.lines.txt.gz", indexReader56, terms57, terms58, true);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "enwiki.random.lines.txt");
        java.lang.String[] strArray73 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests51.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields68, fields75);
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("", fields49, fields75);
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.index.NumericDocValues numericDocValues83 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues84 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests5.assertDocValuesEquals("tests.maxfailures", 2, numericDocValues83, numericDocValues84);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray8);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray18, byteArray21);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray21, byteArray24);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray30, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray24);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray41, byteArray44);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray44, byteArray47);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray53);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray53, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray47);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray67, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray67);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) byteArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray24, byteArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray1, byteArray62);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields24, fields31);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests33.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain38;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService43);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.nightly", postingsEnum47, postingsEnum48, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("random", (java.lang.Object) indexQueryParserService51);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "node_s_0");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "<unknown>");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "random");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.slow");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.slow");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus24 = simpleIndexQueryParserTests1.ensureGreen(strArray11);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader2, (int) (byte) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader9, 6, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "node_s_0");
        org.junit.Assert.assertNotNull((java.lang.Object) fields28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.weekly");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader17, fields28, fields34, false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "<unknown>");
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        org.junit.Assert.assertArrayEquals(objArray16, objArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, objArray21);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.weekly");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray3);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests18.queryParser;
        org.junit.rules.TestRule testRule22 = simpleIndexQueryParserTests18.ruleChain;
        java.lang.Class<?> wildcardClass23 = testRule22.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray13, (java.lang.Object) wildcardClass23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray13);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        char[] charArray0 = null;
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray2, charArray10);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray14, charArray22);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals(charArray25, charArray29);
        org.junit.Assert.assertArrayEquals(charArray22, charArray25);
        org.junit.Assert.assertArrayEquals(charArray10, charArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray22);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader7, (int) '4', postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum14, postingsEnum15, false);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded(100L, (int) (byte) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "hi!");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields17, fields26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.weekly");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "");
        simpleIndexQueryParserTests3.assertFieldsEquals("tests.weekly", indexReader7, fields10, fields19, true);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) 10.0d, (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests3.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("", postingsEnum26, postingsEnum27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("", indexReader31, 4, postingsEnum33, postingsEnum34, true);
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        double[] doubleArray40 = new double[] { 0.0f };
        double[][] doubleArray41 = new double[][] { doubleArray40 };
        double[] doubleArray43 = new double[] { 0.0f };
        double[][] doubleArray44 = new double[][] { doubleArray43 };
        double[] doubleArray46 = new double[] { 0.0f };
        double[][] doubleArray47 = new double[][] { doubleArray46 };
        double[] doubleArray49 = new double[] { 0.0f };
        double[][] doubleArray50 = new double[][] { doubleArray49 };
        double[][][] doubleArray51 = new double[][][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        double[] doubleArray53 = new double[] { 0.0f };
        double[][] doubleArray54 = new double[][] { doubleArray53 };
        double[] doubleArray56 = new double[] { 0.0f };
        double[][] doubleArray57 = new double[][] { doubleArray56 };
        double[] doubleArray59 = new double[] { 0.0f };
        double[][] doubleArray60 = new double[][] { doubleArray59 };
        double[] doubleArray62 = new double[] { 0.0f };
        double[][] doubleArray63 = new double[][] { doubleArray62 };
        double[][][] doubleArray64 = new double[][][] { doubleArray54, doubleArray57, doubleArray60, doubleArray63 };
        double[] doubleArray66 = new double[] { 0.0f };
        double[][] doubleArray67 = new double[][] { doubleArray66 };
        double[] doubleArray69 = new double[] { 0.0f };
        double[][] doubleArray70 = new double[][] { doubleArray69 };
        double[] doubleArray72 = new double[] { 0.0f };
        double[][] doubleArray73 = new double[][] { doubleArray72 };
        double[] doubleArray75 = new double[] { 0.0f };
        double[][] doubleArray76 = new double[][] { doubleArray75 };
        double[][][] doubleArray77 = new double[][][] { doubleArray67, doubleArray70, doubleArray73, doubleArray76 };
        double[][][][] doubleArray78 = new double[][][][] { doubleArray51, doubleArray64, doubleArray77 };
        java.util.List<double[][][]> doubleArrayList79 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, doubleArray78);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) doubleArray78);
        java.lang.String[] strArray82 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet85 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray82);
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "random");
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) doubleArray78, (java.lang.Object[]) strArray82);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests3.queryParser;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("europarl.lines.txt.gz", indexReader8, terms9, terms10, true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "enwiki.random.lines.txt");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields20, fields27);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("hi!", indexReader30, 10, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (short) 10, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain39;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests44.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = simpleIndexQueryParserTests44.queryParser;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests44.assertPositionsSkippingEquals("tests.slow", indexReader49, (int) '4', postingsEnum51, postingsEnum52);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests54.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain56 = simpleIndexQueryParserTests54.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain56;
        simpleIndexQueryParserTests44.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) (byte) -1, (java.lang.Object) simpleIndexQueryParserTests44);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray4 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
        short[] shortArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray9, shortArray12);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 3, (double) (byte) 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) 100);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) (byte) 1, 0L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        short[] shortArray20 = new short[] { (short) 100 };
        short[] shortArray22 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) shortArray20);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (-1L), (double) 6);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests27.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain32;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.Assert.assertNotSame(obj0, (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields29, fields36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests38.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain43;
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '4');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests51.assertDocsSkippingEquals("tests.weekly", indexReader53, (int) (byte) 100, postingsEnum55, postingsEnum56, false);
        simpleIndexQueryParserTests51.resetCheckIndexStatus();
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) '4', (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 2, (long) 5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 0.0d, (double) (short) 1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.weekly", indexReader8, (int) (byte) 100, postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.weekly", indexReader15, 6, postingsEnum17, postingsEnum18, false);
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("<unknown>", indexReader23, (int) (short) 0, postingsEnum25, postingsEnum26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        java.lang.Object[] objArray1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) executorServiceArray3);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded(100L, (int) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests9.queryParser;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.slow", indexReader14, (int) '4', postingsEnum16, postingsEnum17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("random", indexReader27, (-1), postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests32.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests32.queryParser;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests32.assertPositionsSkippingEquals("tests.slow", indexReader37, (int) '4', postingsEnum39, postingsEnum40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain44;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests46.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests46.queryParser;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, true);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "enwiki.random.lines.txt");
        java.lang.String[] strArray68 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests46.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields63, fields70);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef74 = simpleIndexQueryParserTests72.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests75.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests75.failureAndSuccessEvents;
        simpleIndexQueryParserTests72.failureAndSuccessEvents = ruleChain77;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain77;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain77;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain77;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain77;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain77;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain77;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 2, 0L);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = null;
        simpleIndexQueryParserTests3.queryParser = indexQueryParserService5;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests9.queryParser;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, true);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests9.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields26, fields33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests35.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain40;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain40;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain40;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain40;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService45 = null;
        simpleIndexQueryParserTests3.setqueryParser(indexQueryParserService45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests47.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray5, objArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray19 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet20 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", objArray10, (java.lang.Object[]) throttlingArray19);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.monster", indexReader6, terms7, terms8, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests11.queryParser;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.slow", indexReader16, (int) '4', postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("tests.maxfailures", indexReader23, terms24, terms25, false);
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain28;
        java.lang.Object[] objArray30 = new java.lang.Object[] { simpleIndexQueryParserTests2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", objArray1, objArray30);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, (-1), postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests16.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests16.getqueryParser();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests22.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests22.queryParser;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.slow", indexReader27, (int) '4', postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests22.ensureCleanedUp();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests22.indexedValueForSearch((-1L));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests41.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests41.queryParser;
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("tests.slow", indexReader46, (int) '4', postingsEnum48, postingsEnum49);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain53;
        simpleIndexQueryParserTests41.ensureCleanedUp();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain57;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef61 = simpleIndexQueryParserTests59.indexedValueForSearch((long) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain57, (java.lang.Object) bytesRef61);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain57;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain57);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        double[] doubleArray6 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray19 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray24, (double) (short) 10);
        double[] doubleArray32 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray37 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray32, doubleArray37, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray32, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray19, 10.0d);
        double[] doubleArray50 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray55 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray50, doubleArray55, (double) (short) 10);
        double[] doubleArray63 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray68 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray63, doubleArray68, (double) (short) 10);
        double[] doubleArray76 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray81 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray76, doubleArray81, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray76, 0.0d);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray55, doubleArray63, (double) ' ');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray55, (double) (short) 1);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray4);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) objArray1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.weekly");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray3);
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "node_s_0");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.weekly");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.weekly");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) strArray17);
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray30 = new java.lang.String[] { "node_s_0", "tests.weekly", "node_s_0", "" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray30);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
        short[] shortArray0 = null;
        short[] shortArray4 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray9);
        short[] shortArray16 = new short[] { (short) 100 };
        short[] shortArray18 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray18);
        short[] shortArray22 = new short[] { (short) 100 };
        short[] shortArray24 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        short[] shortArray27 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray24, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray18, shortArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray9, shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray9);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, 0.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (-1), 100.0d, (double) (byte) 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain7;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain15;
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) ruleChain7, (java.lang.Object) simpleIndexQueryParserTests10);
        java.lang.Class<?> wildcardClass19 = simpleIndexQueryParserTests10.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests20.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests20.queryParser;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, true);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.failfast", indexReader31, 4, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests20.assertPositionsSkippingEquals("tests.monster", indexReader37, 1, postingsEnum39, postingsEnum40);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) wildcardClass19, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
        double[] doubleArray4 = new double[] { (-1.0d), (short) 10, 100 };
        double[] doubleArray8 = new double[] { (-1.0d), (short) 10, 100 };
        double[] doubleArray12 = new double[] { (-1.0d), (short) 10, 100 };
        double[][] doubleArray13 = new double[][] { doubleArray4, doubleArray8, doubleArray12 };
        java.util.Set<double[]> doubleArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
        java.util.Set<double[]> doubleArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray13);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.weekly");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) strArray22);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) executorServiceArray20);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.weekly");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray31, (java.lang.Object[]) strArray33);
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) strArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) doubleArray13, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "hi!");
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, objArray9);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { 1 };
        long[] longArray11 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray15 = new long[] { 1 };
        long[] longArray17 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        org.junit.Assert.assertArrayEquals(longArray9, longArray15);
        long[] longArray21 = new long[] { 1 };
        long[] longArray23 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        long[] longArray26 = new long[] { 1 };
        long[] longArray28 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        org.junit.Assert.assertArrayEquals(longArray23, longArray26);
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        long[] longArray33 = new long[] { 1 };
        long[] longArray35 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        long[] longArray38 = new long[] { 1 };
        long[] longArray40 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        org.junit.Assert.assertArrayEquals(longArray35, longArray38);
        org.junit.Assert.assertArrayEquals(longArray15, longArray35);
        long[] longArray45 = new long[] { 1 };
        long[] longArray47 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray45, longArray47);
        long[] longArray50 = new long[] { 1 };
        long[] longArray52 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray50, longArray52);
        org.junit.Assert.assertArrayEquals(longArray47, longArray50);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray35, longArray50);
        long[] longArray58 = new long[] { 1 };
        long[] longArray60 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray58, longArray60);
        long[] longArray63 = new long[] { 1 };
        long[] longArray65 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray63, longArray65);
        org.junit.Assert.assertArrayEquals(longArray60, longArray63);
        long[] longArray69 = new long[] { 1 };
        long[] longArray71 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray69, longArray71);
        org.junit.Assert.assertArrayEquals(longArray63, longArray69);
        long[] longArray75 = new long[] { 1 };
        long[] longArray77 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray75, longArray77);
        org.junit.Assert.assertArrayEquals("<unknown>", longArray63, longArray75);
        org.junit.Assert.assertArrayEquals(longArray50, longArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray1, longArray63);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader6, (int) (byte) 10, postingsEnum8, postingsEnum9, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.slow", indexReader17, 100, postingsEnum19, postingsEnum20);
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        java.lang.String str23 = simpleIndexQueryParserTests12.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26, true);
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) "<unknown>", (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        float[] floatArray0 = null;
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray1, floatArray2, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray1, (float) 4);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        int[] intArray1 = null;
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals(intArray3, intArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("random", intArray14, intArray17);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray11, intArray17);
        org.junit.Assert.assertArrayEquals(intArray5, intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray11);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain7;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService10;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.weekly", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17, false);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] { strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][][] strArray12 = new java.lang.String[][][] { strArray7, strArray8, strArray9, strArray10, strArray11 };
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] { strArray13, strArray14, strArray15, strArray16, strArray17 };
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        java.lang.String[][][] strArray24 = new java.lang.String[][][] { strArray19, strArray20, strArray21, strArray22, strArray23 };
        java.lang.String[][][][] strArray25 = new java.lang.String[][][][] { strArray6, strArray12, strArray18, strArray24 };
        java.util.Set<java.lang.String[][][]> strArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String[][][]> strArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean37 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        boolean boolean38 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        java.util.concurrent.ExecutorService executorService39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] { executorService39 };
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray30, (java.lang.Object[]) executorServiceArray40);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray25, (java.lang.Object[]) executorServiceArray30);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (int) '#', postingsEnum43, postingsEnum44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService46;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "node_s_0");
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "node_s_0");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.weekly");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("<unknown>", fields56, fields65);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef70 = simpleIndexQueryParserTests68.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService71 = simpleIndexQueryParserTests68.queryParser;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        simpleIndexQueryParserTests68.assertTermsEquals("europarl.lines.txt.gz", indexReader73, terms74, terms75, true);
        java.lang.String[] strArray83 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "enwiki.random.lines.txt");
        java.lang.String[] strArray90 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields92 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray90, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests68.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields85, fields92);
        org.junit.rules.TestRule testRule94 = simpleIndexQueryParserTests68.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule94;
        org.junit.Assert.assertNotNull("", (java.lang.Object) testRule94);
        java.lang.Class<?> wildcardClass97 = testRule94.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "<unknown>", (java.lang.Object) wildcardClass97);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures0, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures7 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray17 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures9, testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures16 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures18 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures18);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures20);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures22);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures24);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray26 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures18, testRuleIgnoreAfterMaxFailures21, testRuleIgnoreAfterMaxFailures23, testRuleIgnoreAfterMaxFailures25 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures27 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures27);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures29);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures31);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures33);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray35 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures27, testRuleIgnoreAfterMaxFailures30, testRuleIgnoreAfterMaxFailures32, testRuleIgnoreAfterMaxFailures34 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray36 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray8, testRuleIgnoreAfterMaxFailuresArray17, testRuleIgnoreAfterMaxFailuresArray26, testRuleIgnoreAfterMaxFailuresArray35 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet37 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray36);
        double[] doubleArray44 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray51 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray58 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray65 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray72 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray79 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray80 = new double[][] { doubleArray44, doubleArray51, doubleArray58, doubleArray65, doubleArray72, doubleArray79 };
        double[][][] doubleArray81 = new double[][][] { doubleArray80 };
        java.util.Set<double[][]> doubleArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray36, (java.lang.Object[]) doubleArray81);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 0, (-1L));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, false);
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray23 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (short) 100 };
        short[] shortArray28 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray26);
        short[] shortArray32 = new short[] { (short) 100 };
        short[] shortArray34 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray34);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray26, shortArray34);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray43 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray43);
        short[] shortArray46 = new short[] { (short) 100 };
        short[] shortArray48 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray48);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray43, shortArray46);
        short[] shortArray52 = new short[] { (short) 100 };
        short[] shortArray54 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray46, shortArray54);
        short[] shortArray59 = new short[] { (short) 100 };
        short[] shortArray61 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        short[] shortArray65 = new short[] { (short) 100 };
        short[] shortArray67 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray65, shortArray67);
        short[] shortArray70 = new short[] { (short) 100 };
        short[] shortArray72 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray70, shortArray72);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray67, shortArray70);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray61, shortArray70);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray54, shortArray61);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray34, shortArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) false, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100L, (long) 1);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        java.lang.Iterable[] iterableArray36 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray37 = (java.lang.Iterable<java.lang.Object>[]) iterableArray36;
        objIterableArray37[0] = objSet9;
        objIterableArray37[1] = objSet14;
        objIterableArray37[2] = objSet19;
        objIterableArray37[3] = objSet24;
        objIterableArray37[4] = objSet29;
        objIterableArray37[5] = objSet34;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray37);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objIterableSet50);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService52);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum55, postingsEnum56);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService14);
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.queryParser;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.slow", indexReader15, 100, postingsEnum17, postingsEnum18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests22.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests22.queryParser;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, true);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "enwiki.random.lines.txt");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests22.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields39, fields46);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests48.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests51.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests48.failureAndSuccessEvents = ruleChain53;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain53;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain53;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests10.indexedValueForSearch((long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests7.assertDocsEnumEquals("tests.monster", postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests7);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader16, (int) (short) 0, postingsEnum18, postingsEnum19);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray0, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests5.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("tests.slow", indexReader10, (int) '4', postingsEnum12, postingsEnum13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests20.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests23.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain28;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain28);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray2);
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "node_s_0");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.weekly");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) strArray16);
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray16);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.badapples");
        java.util.concurrent.ExecutorService executorService27 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray28 = new java.util.concurrent.ExecutorService[] { executorService27 };
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) executorServiceArray28);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests16.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests16.queryParser;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "enwiki.random.lines.txt");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields33, fields40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests42.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests45.failureAndSuccessEvents;
        simpleIndexQueryParserTests42.failureAndSuccessEvents = ruleChain47;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain47;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain47;
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = null;
        simpleIndexQueryParserTests14.setqueryParser(indexQueryParserService52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.maxfailures", indexReader55, (int) '#', postingsEnum57, postingsEnum58);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = null;
        simpleIndexQueryParserTests14.queryParser = indexQueryParserService60;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = simpleIndexQueryParserTests14.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray63 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests9, simpleIndexQueryParserTests14 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet64 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) elasticsearchSingleNodeTestArray63);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "enwiki.random.lines.txt", "tests.monster", "tests.maxfailures", "hi!" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.slow");
        java.lang.String[] strArray20 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "<unknown>");
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields13, fields22, false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "");
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) executorServiceArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray6);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.monster", indexReader5, 100, postingsEnum7, postingsEnum8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 100);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader17, (int) (short) 0, postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService23;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str22 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100L, (long) 10);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1L, (long) 6);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) 100, (double) 2);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
        double[] doubleArray23 = new double[] { (-1.0d), (short) 10, 100 };
        double[] doubleArray27 = new double[] { (-1.0d), (short) 10, 100 };
        double[] doubleArray31 = new double[] { (-1.0d), (short) 10, 100 };
        double[][] doubleArray32 = new double[][] { doubleArray23, doubleArray27, doubleArray31 };
        java.util.Set<double[]> doubleArraySet33 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray32);
        java.util.Set<double[]> doubleArraySet34 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) doubleArray32);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests11.queryParser();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests11.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService15);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 1);
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 'a');
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("hi!", (int) (byte) 0, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 100, (double) (-1));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 0L, (double) '#');
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests3.getqueryParser();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 1.0d, (double) 10);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) -1, (long) ' ');
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        double[] doubleArray7 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray12 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray7, doubleArray12, (double) (short) 10);
        double[] doubleArray20 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray25 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray20, doubleArray25, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray25, (double) '#');
        double[] doubleArray35 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray40 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray35, doubleArray40, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray35, (double) (short) 1);
        double[] doubleArray50 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray55 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray50, doubleArray55, (double) (short) 10);
        double[] doubleArray63 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray68 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray63, doubleArray68, (double) (short) 10);
        double[] doubleArray76 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray81 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray76, doubleArray81, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray76, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray55, doubleArray63, 10.0d);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray55, (double) 10.0f);
        double[] doubleArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray35, doubleArray90, (double) (byte) 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Iterable[] iterableArray43 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray44 = (java.lang.Iterable<java.lang.Object>[]) iterableArray43;
        objIterableArray44[0] = objSet16;
        objIterableArray44[1] = objSet21;
        objIterableArray44[2] = objSet26;
        objIterableArray44[3] = objSet31;
        objIterableArray44[4] = objSet36;
        objIterableArray44[5] = objSet41;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray44);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objIterableSet57);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = simpleIndexQueryParserTests1.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues63 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.monster", (int) (byte) 10, numericDocValues63, numericDocValues64);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray3, floatArray4, (float) 1L);
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray3, floatArray7, 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests17.queryParser;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests17.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, true);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "enwiki.random.lines.txt");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields34, fields41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests43.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain48;
        simpleIndexQueryParserTests15.ensureCleanedUp();
        float[] floatArray53 = new float[] {};
        float[] floatArray54 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray54, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests15, (java.lang.Object) floatArray54);
        float[] floatArray59 = new float[] {};
        float[] floatArray60 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray60, (float) 1L);
        float[] floatArray63 = new float[] {};
        float[] floatArray64 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray63, floatArray64, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray59, floatArray63, 0.0f);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray59, floatArray70, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray54, floatArray70, (float) 1L);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray77, (float) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.badapples", floatArray3, floatArray77, 0.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray3, (float) 6);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (-1L));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray3, intArray5);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        int[] intArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray10, intArray13);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests2.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests12.queryParser();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests12.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) indexQueryParserService16);
        java.lang.String str18 = simpleIndexQueryParserTests2.getTestName();
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests2.ruleChain;
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray27, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray27);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray39, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray39);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray49, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray52, byteArray55);
        byte[] byteArray60 = new byte[] {};
        byte[] byteArray61 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray60, byteArray61);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray61, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray27, byteArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) testRule20, (java.lang.Object) byteArray34);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 1, (long) (short) 100);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Iterable[] iterableArray43 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray44 = (java.lang.Iterable<java.lang.Object>[]) iterableArray43;
        objIterableArray44[0] = objSet16;
        objIterableArray44[1] = objSet21;
        objIterableArray44[2] = objSet26;
        objIterableArray44[3] = objSet31;
        objIterableArray44[4] = objSet36;
        objIterableArray44[5] = objSet41;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet57 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray44);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objIterableSet57);
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef63 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, (int) (short) 1);
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum66, postingsEnum67);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader11, 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        java.lang.Object obj19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) ruleChain18, obj19);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) 6);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray1, throttlingArray2, throttlingArray3, throttlingArray4 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, throttlingArray5);
        double[] doubleArray13 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray20 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray27 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray34 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray41 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray48 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray49 = new double[][] { doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41, doubleArray48 };
        double[][][] doubleArray50 = new double[][][] { doubleArray49 };
        java.util.Set<double[][]> doubleArraySet51 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray50);
        double[] doubleArray58 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray65 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray72 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray79 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray86 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray93 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray94 = new double[][] { doubleArray58, doubleArray65, doubleArray72, doubleArray79, doubleArray86, doubleArray93 };
        double[][][] doubleArray95 = new double[][][] { doubleArray94 };
        java.util.Set<double[][]> doubleArraySet96 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray95);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray50, (java.lang.Object[]) doubleArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) doubleArray50);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) -1);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "node_s_0");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.weekly");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 10, (long) (short) 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 1, (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) ' ', 100.0d, (double) '#');
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 0, (double) 100, (double) ' ');
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (-1.0d), (double) 10.0f, (-1.0d));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.maxfailures");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests9.queryParser;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.slow", indexReader14, (int) '4', postingsEnum16, postingsEnum17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain21;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.weekly");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "random");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.nightly");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "");
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.weekly", indexReader27, fields34, fields39, true);
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = null;
        simpleIndexQueryParserTests9.setqueryParser(indexQueryParserService44);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields8, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, 0.0d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (-1L));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray5);
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) executorServiceArray3);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.weekly");
        org.junit.Assert.assertEquals(objArray2, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests18.queryParser;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.slow", indexReader23, (int) '4', postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain30;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests32.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests32.queryParser;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("europarl.lines.txt.gz", indexReader37, terms38, terms39, true);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "enwiki.random.lines.txt");
        java.lang.String[] strArray54 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests32.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields49, fields56);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef60 = simpleIndexQueryParserTests58.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests61.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain63 = simpleIndexQueryParserTests61.failureAndSuccessEvents;
        simpleIndexQueryParserTests58.failureAndSuccessEvents = ruleChain63;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain63;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain63;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain63;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) fields17, (java.lang.Object) ruleChain63);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef72 = simpleIndexQueryParserTests70.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService73 = simpleIndexQueryParserTests70.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests70);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService75 = simpleIndexQueryParserTests70.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService76 = simpleIndexQueryParserTests70.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) fields17, (java.lang.Object) simpleIndexQueryParserTests70);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.weekly");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "");
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader5, fields8, fields17, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests21.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests21.queryParser;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        java.lang.String[] strArray43 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields38, fields45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests47.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests47.queryParser;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("europarl.lines.txt.gz", indexReader52, terms53, terms54, true);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "enwiki.random.lines.txt");
        java.lang.String[] strArray69 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests47.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields64, fields71);
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("", fields45, fields71);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("<unknown>", indexReader77, (int) (short) 10, postingsEnum79, postingsEnum80, true);
        simpleIndexQueryParserTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService16;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain23;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests18.queryParser;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader27, (-1), postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.weekly", indexReader34, (int) 'a', postingsEnum36, postingsEnum37, false);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("", indexReader41, (int) (short) 1, postingsEnum43, postingsEnum44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = simpleIndexQueryParserTests18.queryParser();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) indexQueryParserService16, (java.lang.Object) simpleIndexQueryParserTests18);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) '4');
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10L, (double) 3);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray4);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.weekly");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) strArray17);
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) executorServiceArray15);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.weekly");
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "node_s_0");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader13, (int) '#', postingsEnum15, postingsEnum16, true);
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 0);
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) ' ', numericDocValues24, numericDocValues25);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 1L, (long) 4);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum18, postingsEnum19, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, false);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray20, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray28, charArray39);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals(charArray45, charArray49);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray45, charArray53);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray59, charArray60);
        org.junit.Assert.assertArrayEquals(charArray56, charArray60);
        org.junit.Assert.assertArrayEquals(charArray53, charArray56);
        char[] charArray64 = new char[] {};
        char[] charArray65 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray64, charArray65);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray53, charArray64);
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray28, charArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) false, (java.lang.Object) "tests.nightly");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, 0.0d, (double) 1);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 6);
        java.lang.String str25 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests26.queryParser();
        simpleIndexQueryParserTests26.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.monster", indexReader30, 100, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.nightly", indexReader36, (int) '#', postingsEnum38, postingsEnum39);
        simpleIndexQueryParserTests26.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests26.assertDocsEnumEquals("tests.failfast", postingsEnum43, postingsEnum44, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests26.queryParser = indexQueryParserService47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) str25, (java.lang.Object) indexQueryParserService47);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.monster", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests2.ruleChain;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
        long[] longArray13 = new long[] { 1 };
        long[] longArray15 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray13, longArray15);
        long[] longArray18 = new long[] { 1 };
        long[] longArray20 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray18, longArray20);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray15, longArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) longArray15);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService15;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.badapples", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 10, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        long[] longArray1 = null;
        long[] longArray3 = new long[] { 1 };
        long[] longArray5 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray3);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (-1.0d));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 2);
        java.lang.Class<?> wildcardClass6 = simpleIndexQueryParserTests0.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("tests.slow", indexReader12, 100, postingsEnum14, postingsEnum15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests19.queryParser;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("europarl.lines.txt.gz", indexReader24, terms25, terms26, true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests19.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields36, fields43);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests45.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests48.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests48.failureAndSuccessEvents;
        simpleIndexQueryParserTests45.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain50;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain50;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests7.queryParser();
        java.lang.String str56 = simpleIndexQueryParserTests7.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) str56);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields31, fields38);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests40.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues56 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues57 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) '#', numericDocValues56, numericDocValues57);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { 1 };
        long[] longArray6 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray4, longArray6);
        long[] longArray9 = new long[] { 1 };
        long[] longArray11 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray9, longArray11);
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
        long[] longArray15 = new long[] { 1 };
        long[] longArray17 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray15, longArray17);
        org.junit.Assert.assertArrayEquals(longArray9, longArray15);
        long[] longArray21 = new long[] { 1 };
        long[] longArray23 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray21, longArray23);
        long[] longArray26 = new long[] { 1 };
        long[] longArray28 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray26, longArray28);
        org.junit.Assert.assertArrayEquals(longArray23, longArray26);
        org.junit.Assert.assertArrayEquals(longArray15, longArray26);
        long[] longArray33 = new long[] { 1 };
        long[] longArray35 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray15, longArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray15);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader11, 4, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader17, 1, postingsEnum19, postingsEnum20);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader23, 10, postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (short) 10, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader4, terms5, terms6, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests9.queryParser;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("europarl.lines.txt.gz", indexReader14, terms15, terms16, true);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        java.lang.String[] strArray31 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests9.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields26, fields33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests35.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests38.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain40;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain40;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain40;
        simpleIndexQueryParserTests7.ensureCleanedUp();
        float[] floatArray45 = new float[] {};
        float[] floatArray46 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray45, floatArray46, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests7, (java.lang.Object) floatArray46);
        java.lang.String[] strArray57 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "<unknown>");
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "node_s_0");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("enwiki.random.lines.txt", fields59, fields66);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.weekly");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader5, fields66, fields72, false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
        double[] doubleArray3 = new double[] { (-1.0d), (short) 10, 100 };
        double[] doubleArray7 = new double[] { (-1.0d), (short) 10, 100 };
        double[] doubleArray11 = new double[] { (-1.0d), (short) 10, 100 };
        double[][] doubleArray12 = new double[][] { doubleArray3, doubleArray7, doubleArray11 };
        java.util.Set<double[]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray12);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("hi!", indexReader29, 10, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests2.getqueryParser();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (short) 10, (java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain38;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("", postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum46, postingsEnum47);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray12 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 1, 1);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus18 = simpleIndexQueryParserTests0.ensureGreen(strArray13);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, 100L);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
        byte[] byteArray1 = null;
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray8, byteArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray1, byteArray11);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 3, (long) (byte) -1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 100);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 'a');
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, 0.0d, 0.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) 1, 10L);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader17, terms18, terms19, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", (int) (byte) 0, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader10, (-1), postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.TestRule testRule17 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests14.queryParser;
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests14.longToPrefixCoded(1L, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests14.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields18, fields25);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader28, 10, postingsEnum30, postingsEnum31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests1.getqueryParser();
        org.junit.rules.TestRule testRule34 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests38.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests38.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests38.queryParser = indexQueryParserService46;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests48.assertDocsSkippingEquals("tests.weekly", indexReader50, (int) (byte) 100, postingsEnum52, postingsEnum53, false);
        simpleIndexQueryParserTests48.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests38, (java.lang.Object) simpleIndexQueryParserTests48);
        simpleIndexQueryParserTests48.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests48.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests48.assertPositionsSkippingEquals("<unknown>", indexReader61, 100, postingsEnum63, postingsEnum64);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService66 = null;
        simpleIndexQueryParserTests48.setqueryParser(indexQueryParserService66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests48);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "node_s_0");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "<unknown>");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "random");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests16.assertDocsSkippingEquals("tests.weekly", indexReader18, (int) (byte) 100, postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests16.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) strArray5, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 6, (double) 6);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
        double[] doubleArray6 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray13 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray20 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray27 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray34 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray41 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray42 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27, doubleArray34, doubleArray41 };
        double[][][] doubleArray43 = new double[][][] { doubleArray42 };
        java.util.Set<double[][]> doubleArraySet44 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray43);
        double[] doubleArray51 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray58 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray65 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray72 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray79 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray86 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray87 = new double[][] { doubleArray51, doubleArray58, doubleArray65, doubleArray72, doubleArray79, doubleArray86 };
        double[][][] doubleArray88 = new double[][][] { doubleArray87 };
        java.util.Set<double[][]> doubleArraySet89 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray43, (java.lang.Object[]) doubleArray88);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray91 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet92 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray88, (java.lang.Object[]) throttlingArray91);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray9, charArray17);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        org.junit.Assert.assertArrayEquals(charArray17, charArray20);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray17, charArray28);
        org.junit.Assert.assertArrayEquals(charArray4, charArray17);
        org.junit.Assert.assertNotNull((java.lang.Object) charArray17);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray34, charArray38);
        org.junit.Assert.assertArrayEquals(charArray17, charArray38);
        char[] charArray42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray38, charArray42);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService12);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (short) 100, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray9, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray12, byteArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray21);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray28);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray39, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray39);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) byteArray34);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray34, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray4, byteArray34);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray56, byteArray59);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray59, byteArray62);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray68, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray68);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray75);
        org.junit.Assert.assertArrayEquals("random", byteArray34, byteArray75);
        byte[] byteArray80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray75, byteArray80);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) -1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 10, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService23);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", 6, numericDocValues28, numericDocValues29);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '#', (int) '4');
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (byte) 1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "node_s_0");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray14);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 1, (double) 100L);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) 0, (double) 0.0f);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, (-1), postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests16.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests16.getqueryParser();
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader22, (int) 'a', postingsEnum24, postingsEnum25, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests28.queryParser;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests28.assertTermsEquals("europarl.lines.txt.gz", indexReader33, terms34, terms35, true);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "enwiki.random.lines.txt");
        java.lang.String[] strArray50 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests28.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields45, fields52);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("hi!", indexReader55, 10, postingsEnum57, postingsEnum58);
        simpleIndexQueryParserTests28.ensureCheckIndexPassed();
        simpleIndexQueryParserTests28.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) postingsEnum24, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) 5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService10;
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests15.queryParser;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "enwiki.random.lines.txt");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests15.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields32, fields39);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests41.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = null;
        simpleIndexQueryParserTests13.setqueryParser(indexQueryParserService51);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.maxfailures", indexReader54, (int) '#', postingsEnum56, postingsEnum57);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = null;
        simpleIndexQueryParserTests13.queryParser = indexQueryParserService59;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = simpleIndexQueryParserTests13.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = simpleIndexQueryParserTests13.queryParser();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 6, (double) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 10, (long) 5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests20.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests20.queryParser;
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests20.assertTermsEquals("europarl.lines.txt.gz", indexReader25, terms26, terms27, true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "enwiki.random.lines.txt");
        java.lang.String[] strArray42 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests20.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields37, fields44);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests46.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests46.queryParser;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests46.assertTermsEquals("europarl.lines.txt.gz", indexReader51, terms52, terms53, true);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "enwiki.random.lines.txt");
        java.lang.String[] strArray68 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests46.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields63, fields70);
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields44, fields70);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule75 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) '4', numericDocValues78, numericDocValues79);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        java.lang.Object[] objArray11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, objArray11);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray2);
        double[] doubleArray14 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray21 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray28 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray35 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray42 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray49 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        double[][][] doubleArray51 = new double[][][] { doubleArray50 };
        java.util.Set<double[][]> doubleArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray51);
        double[] doubleArray59 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray66 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray73 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray80 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray87 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray94 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray95 = new double[][] { doubleArray59, doubleArray66, doubleArray73, doubleArray80, doubleArray87, doubleArray94 };
        double[][][] doubleArray96 = new double[][][] { doubleArray95 };
        java.util.Set<double[][]> doubleArraySet97 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray96);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray51, (java.lang.Object[]) doubleArray96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) doubleArray96);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        org.junit.Assert.assertArrayEquals(objArray3, objArray8);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        org.junit.Assert.assertArrayEquals(objArray20, objArray25);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray15, objArray20);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        java.lang.Object[] objArray38 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet39 = org.apache.lucene.util.LuceneTestCase.asSet(objArray38);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet44 = org.apache.lucene.util.LuceneTestCase.asSet(objArray43);
        org.junit.Assert.assertArrayEquals(objArray38, objArray43);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray33, objArray38);
        org.junit.Assert.assertEquals(objArray20, objArray33);
        org.junit.Assert.assertEquals(objArray3, objArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray49);
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray49, (java.lang.Object[]) executorServiceArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray3, (java.lang.Object[]) executorServiceArray52);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("europarl.lines.txt.gz", indexReader19, terms20, terms21, true);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields31, fields38);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests40.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain45;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain45;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests14.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = null;
        simpleIndexQueryParserTests14.setqueryParser(indexQueryParserService49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.weekly");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "");
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.weekly", indexReader6, fields9, fields18, true);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) 10.0d, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests2.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("", postingsEnum25, postingsEnum26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("", indexReader30, 4, postingsEnum32, postingsEnum33, true);
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        double[] doubleArray39 = new double[] { 0.0f };
        double[][] doubleArray40 = new double[][] { doubleArray39 };
        double[] doubleArray42 = new double[] { 0.0f };
        double[][] doubleArray43 = new double[][] { doubleArray42 };
        double[] doubleArray45 = new double[] { 0.0f };
        double[][] doubleArray46 = new double[][] { doubleArray45 };
        double[] doubleArray48 = new double[] { 0.0f };
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        double[][][] doubleArray50 = new double[][][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        double[] doubleArray52 = new double[] { 0.0f };
        double[][] doubleArray53 = new double[][] { doubleArray52 };
        double[] doubleArray55 = new double[] { 0.0f };
        double[][] doubleArray56 = new double[][] { doubleArray55 };
        double[] doubleArray58 = new double[] { 0.0f };
        double[][] doubleArray59 = new double[][] { doubleArray58 };
        double[] doubleArray61 = new double[] { 0.0f };
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        double[][][] doubleArray63 = new double[][][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        double[] doubleArray65 = new double[] { 0.0f };
        double[][] doubleArray66 = new double[][] { doubleArray65 };
        double[] doubleArray68 = new double[] { 0.0f };
        double[][] doubleArray69 = new double[][] { doubleArray68 };
        double[] doubleArray71 = new double[] { 0.0f };
        double[][] doubleArray72 = new double[][] { doubleArray71 };
        double[] doubleArray74 = new double[] { 0.0f };
        double[][] doubleArray75 = new double[][] { doubleArray74 };
        double[][][] doubleArray76 = new double[][][] { doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        double[][][][] doubleArray77 = new double[][][][] { doubleArray50, doubleArray63, doubleArray76 };
        java.util.List<double[][][]> doubleArrayList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, doubleArray77);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) doubleArray77);
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum81, postingsEnum82);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100, (double) (short) 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
        long[] longArray2 = new long[] { 1 };
        long[] longArray4 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { 1 };
        long[] longArray9 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) longArray7);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 3);
        java.lang.Class<?> wildcardClass15 = bytesRef14.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests16.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests16.queryParser;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "enwiki.random.lines.txt");
        java.lang.String[] strArray38 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields33, fields40);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("hi!", indexReader43, 10, postingsEnum45, postingsEnum46);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests16.getqueryParser();
        org.junit.rules.TestRule testRule49 = simpleIndexQueryParserTests16.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) bytesRef14, (java.lang.Object) testRule49);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet(objArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet(objArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        org.junit.Assert.assertArrayEquals(objArray11, objArray16);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray6, objArray11);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        org.junit.Assert.assertArrayEquals(objArray29, objArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray24, objArray29);
        org.junit.Assert.assertEquals(objArray11, objArray24);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) objArray11);
        java.util.concurrent.ExecutorService executorService40 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] { executorService40 };
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean51 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray11, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "hi!");
        java.lang.Object[] objArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, objArray9);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 'a', (double) 100L);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 3, (double) 10.0f);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader17, (int) (short) 0, postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests26.queryParser;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.slow", indexReader31, (int) '4', postingsEnum33, postingsEnum34);
        simpleIndexQueryParserTests26.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests26, (java.lang.Object) "<unknown>");
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.weekly");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.weekly");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        simpleIndexQueryParserTests26.assertFieldsEquals("tests.monster", indexReader43, fields48, fields53, true);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests65.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests65.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService68 = simpleIndexQueryParserTests65.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests65.queryParser;
        simpleIndexQueryParserTests65.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef73 = simpleIndexQueryParserTests65.longToPrefixCoded(1L, 4);
        org.junit.Assert.assertNotSame((java.lang.Object) fields64, (java.lang.Object) bytesRef73);
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader24, fields53, fields64, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues81 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (short) 10, numericDocValues81, numericDocValues82);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray6);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (byte) 10, (long) 2);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 0L, (double) 1);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (byte) 0, (double) ' ');
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 10L, (double) (byte) 1);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "enwiki.random.lines.txt");
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray6);
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.maxfailures");
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) strArray6);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray21);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
        long[] longArray2 = new long[] { 1 };
        long[] longArray4 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { 1 };
        long[] longArray9 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        long[] longArray13 = new long[] { 1 };
        long[] longArray15 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray13, longArray15);
        org.junit.Assert.assertArrayEquals(longArray7, longArray13);
        long[] longArray19 = new long[] { 1 };
        long[] longArray21 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray19, longArray21);
        long[] longArray24 = new long[] { 1 };
        long[] longArray26 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray24, longArray26);
        long[] longArray29 = new long[] { 1 };
        long[] longArray31 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray29, longArray31);
        org.junit.Assert.assertArrayEquals(longArray26, longArray29);
        org.junit.Assert.assertArrayEquals(longArray21, longArray26);
        org.junit.Assert.assertArrayEquals(longArray13, longArray21);
        long[] longArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray13, longArray36);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 3, (long) (short) 10);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests5.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray13 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests5 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet14 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray13);
        java.util.List<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (org.elasticsearch.test.ElasticsearchTestCase[]) elasticsearchSingleNodeTestArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "node_s_0", "tests.weekly", "node_s_0", "" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray13, (java.lang.Object[]) strArray20);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests11.queryParser;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, true);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests11.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields28, fields35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests37.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests40.failureAndSuccessEvents;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests9.setqueryParser(indexQueryParserService47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.maxfailures", indexReader50, (int) '#', postingsEnum52, postingsEnum53);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = null;
        simpleIndexQueryParserTests9.queryParser = indexQueryParserService55;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests9.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray58 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests4, simpleIndexQueryParserTests9 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet59 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray58);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet60 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) elasticsearchSingleNodeTestArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) elasticsearchSingleNodeTestArray58);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals(intArray2, intArray4);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("random", intArray13, intArray16);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray10, intArray16);
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray23, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals("random", intArray34, intArray37);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray31, intArray37);
        org.junit.Assert.assertArrayEquals(intArray25, intArray31);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray4, intArray25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests44.assertDocsSkippingEquals("tests.weekly", indexReader46, (int) (byte) 100, postingsEnum48, postingsEnum49, false);
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests55.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests55.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader59 = null;
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.weekly");
        java.lang.String[] strArray67 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "");
        simpleIndexQueryParserTests55.assertFieldsEquals("tests.weekly", indexReader59, fields62, fields71, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests74 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests74.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain76 = simpleIndexQueryParserTests74.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader78 = null;
        java.lang.String[] strArray79 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "tests.weekly");
        java.lang.String[] strArray86 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "");
        simpleIndexQueryParserTests74.assertFieldsEquals("tests.weekly", indexReader78, fields81, fields90, true);
        simpleIndexQueryParserTests44.assertFieldsEquals("enwiki.random.lines.txt", indexReader54, fields71, fields81, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray25, (java.lang.Object) fields71);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, (long) (byte) 10);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 1, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100, (double) 0);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) '#', numericDocValues5, numericDocValues6);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
        double[] doubleArray5 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray10 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray10, (double) (short) 10);
        double[] doubleArray19 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray24, (double) (short) 10);
        double[] doubleArray32 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray37 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray32, doubleArray37, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray19, doubleArray37, (double) '#');
        double[] doubleArray47 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray52 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray47, doubleArray52, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray52, 10.0d);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray52, (double) (byte) 1);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader7, (int) '4', postingsEnum9, postingsEnum10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests2.indexedValueForSearch((-1L));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests21.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests21.queryParser;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.slow", indexReader26, (int) '4', postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests21.ensureCleanedUp();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain37;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests40.queryParser = indexQueryParserService42;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        simpleIndexQueryParserTests40.assertTermsEquals("", indexReader45, terms46, terms47, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests40.queryParser();
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests40.indexedValueForSearch((long) '#');
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) ruleChain37, (java.lang.Object) simpleIndexQueryParserTests40);
        short[] shortArray56 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray56, shortArray58);
        short[] shortArray62 = new short[] { (short) 100 };
        short[] shortArray64 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray64);
        short[] shortArray67 = new short[] { (short) 100 };
        short[] shortArray69 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray64, shortArray67);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray58, shortArray67);
        short[] shortArray74 = new short[] { (short) 100 };
        short[] shortArray76 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray74, shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray76);
        short[] shortArray82 = new short[] { (short) 100 };
        short[] shortArray84 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray82, shortArray84);
        short[] shortArray87 = new short[] { (short) 100 };
        short[] shortArray89 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray87, shortArray89);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray84, shortArray87);
        short[] shortArray93 = new short[] { (short) 100 };
        short[] shortArray95 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray93, shortArray95);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray87, shortArray95);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) ruleChain37, (java.lang.Object) shortArray58);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 10.0d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
        java.lang.Object[] objArray0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray4);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.weekly");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) strArray17);
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) executorServiceArray15);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.weekly");
        org.junit.Assert.assertEquals(objArray14, (java.lang.Object[]) strArray24);
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) executorServiceArray2);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray5);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.Object[] objArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, objArray13);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain7;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService10;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.weekly", indexReader14, (int) (byte) 100, postingsEnum16, postingsEnum17, false);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests12);
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests12.getqueryParser();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests25.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests25.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests25.assertTermsEquals("europarl.lines.txt.gz", indexReader29, terms30, terms31, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests35.queryParser();
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests35.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = simpleIndexQueryParserTests35.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests25, (java.lang.Object) indexQueryParserService39);
        java.lang.String str41 = simpleIndexQueryParserTests25.getTestName();
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) str41);
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests12.indexedValueForSearch((long) 3);
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests12.ruleChain;
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "node_s_0");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "<unknown>");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "random");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.weekly");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields59, fields66);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService4;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule6;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule6;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) testRule6);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { 1 };
        long[] longArray5 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { 1 };
        long[] longArray10 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
        long[] longArray14 = new long[] { 1 };
        long[] longArray16 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray14, longArray16);
        org.junit.Assert.assertArrayEquals(longArray8, longArray14);
        long[] longArray20 = new long[] { 1 };
        long[] longArray22 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray20, longArray22);
        long[] longArray25 = new long[] { 1 };
        long[] longArray27 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray25, longArray27);
        org.junit.Assert.assertArrayEquals(longArray22, longArray25);
        org.junit.Assert.assertArrayEquals(longArray14, longArray25);
        long[] longArray32 = new long[] { 1 };
        long[] longArray34 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray32, longArray34);
        long[] longArray37 = new long[] { 1 };
        long[] longArray39 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray37, longArray39);
        org.junit.Assert.assertArrayEquals(longArray34, longArray37);
        long[] longArray43 = new long[] { 1 };
        long[] longArray45 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        org.junit.Assert.assertArrayEquals(longArray37, longArray43);
        long[] longArray49 = new long[] { 1 };
        long[] longArray51 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray49, longArray51);
        long[] longArray54 = new long[] { 1 };
        long[] longArray56 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray54, longArray56);
        org.junit.Assert.assertArrayEquals(longArray51, longArray54);
        org.junit.Assert.assertArrayEquals(longArray43, longArray54);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray14, longArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray54);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), (double) ' ');
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) '#', (double) (short) 10);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService38);
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader41, (int) '#', postingsEnum43, postingsEnum44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService46;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum50, postingsEnum51);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader2, (int) (byte) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader9, 6, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum16, postingsEnum17, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests24.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests24.queryParser;
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests24.assertPositionsSkippingEquals("tests.slow", indexReader29, (int) '4', postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests24.ensureCleanedUp();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.weekly");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "random");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.nightly");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "");
        simpleIndexQueryParserTests24.assertFieldsEquals("tests.weekly", indexReader42, fields49, fields54, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests57.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef61 = simpleIndexQueryParserTests57.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests57.assertPositionsSkippingEquals("tests.monster", indexReader63, 10, postingsEnum65, postingsEnum66);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService68 = simpleIndexQueryParserTests57.queryParser();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        java.lang.String[] strArray77 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "<unknown>");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "");
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.weekly");
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        simpleIndexQueryParserTests57.assertFieldsEquals("tests.weekly", indexReader70, fields81, fields86, false);
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader23, fields54, fields81, true);
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum92, postingsEnum93);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
        double[] doubleArray6 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray19 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray24, (double) (short) 10);
        double[] doubleArray32 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray37 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray32, doubleArray37, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray19, doubleArray32, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray19, (double) 100.0f);
        double[] doubleArray50 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray55 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray50, doubleArray55, (double) (short) 10);
        double[] doubleArray63 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray68 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray63, doubleArray68, (double) (short) 10);
        double[] doubleArray76 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray81 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray76, doubleArray81, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray76, 0.0d);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray55, doubleArray63, (double) ' ');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray19, doubleArray55, (double) (short) -1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        java.lang.Object obj17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) bytesRef16, obj17);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
        java.lang.String[] strArray1 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str10 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str11 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str12 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str13 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str14 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str15 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str16 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str17 = mockMoreLikeThisFetchService9.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str19 = mockMoreLikeThisFetchService18.nodeName();
        java.lang.String str20 = mockMoreLikeThisFetchService18.nodeName();
        java.lang.String str21 = mockMoreLikeThisFetchService18.nodeName();
        java.lang.String str22 = mockMoreLikeThisFetchService18.nodeName();
        java.lang.String str23 = mockMoreLikeThisFetchService18.nodeName();
        java.lang.String str24 = mockMoreLikeThisFetchService18.nodeName();
        java.lang.String str25 = mockMoreLikeThisFetchService18.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str27 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str28 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str29 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str30 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str31 = mockMoreLikeThisFetchService26.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str33 = mockMoreLikeThisFetchService32.nodeName();
        java.lang.String str34 = mockMoreLikeThisFetchService32.nodeName();
        java.lang.String str35 = mockMoreLikeThisFetchService32.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str37 = mockMoreLikeThisFetchService36.nodeName();
        java.lang.String str38 = mockMoreLikeThisFetchService36.nodeName();
        java.lang.String str39 = mockMoreLikeThisFetchService36.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] { mockMoreLikeThisFetchService9, mockMoreLikeThisFetchService18, mockMoreLikeThisFetchService26, mockMoreLikeThisFetchService32, mockMoreLikeThisFetchService36 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, mockMoreLikeThisFetchServiceArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) mockMoreLikeThisFetchServiceArray40);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        double[] doubleArray6 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray19 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray24, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray24, (double) '#');
        double[] doubleArray33 = new double[] { (-1), (byte) 100, 5, 100.0f };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray33, (double) 0.0f);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray2, charArray10);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray23, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray23, charArray31);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray36, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray47, charArray51);
        org.junit.Assert.assertArrayEquals(charArray44, charArray47);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray44, charArray55);
        org.junit.Assert.assertArrayEquals(charArray23, charArray44);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray65, charArray69);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray65, charArray73);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
        char[] charArray84 = new char[] {};
        char[] charArray85 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray84, charArray85);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray77, charArray85);
        org.junit.Assert.assertArrayEquals("", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals(charArray60, charArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray60);
        org.junit.Assert.assertArrayEquals(charArray10, charArray60);
        char[] charArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray60, charArray92);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { '#', 6 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray7 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray7);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray12 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray10, shortArray12);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray7, shortArray10);
        short[] shortArray16 = new short[] { (short) 100 };
        short[] shortArray18 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray18);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray10, shortArray18);
        short[] shortArray22 = new short[] { (short) 100 };
        short[] shortArray24 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray22, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray24);
        short[] shortArray29 = new short[] { (short) 100 };
        short[] shortArray31 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray31);
        short[] shortArray34 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray34, shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray36);
        short[] shortArray42 = new short[] { (short) 100 };
        short[] shortArray44 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray44);
        short[] shortArray47 = new short[] { (short) 100 };
        short[] shortArray49 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray44, shortArray47);
        short[] shortArray53 = new short[] { (short) 100 };
        short[] shortArray55 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray47, shortArray55);
        short[] shortArray59 = new short[] { (short) 100 };
        short[] shortArray61 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray59, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray61);
        org.junit.Assert.assertArrayEquals("", shortArray31, shortArray61);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray24, shortArray61);
        short[] shortArray67 = new short[] { (short) 100 };
        short[] shortArray69 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray67, shortArray69);
        short[] shortArray72 = new short[] { (short) 100 };
        short[] shortArray74 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray72, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray24, shortArray69);
        short[] shortArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray78);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray5 = new int[] {};
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("random", intArray7, intArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray5, intArray7);
        int[] intArray16 = new int[] {};
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("random", intArray18, intArray21);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray16, intArray18);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray5, intArray18);
        int[] intArray29 = new int[] {};
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("random", intArray31, intArray34);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray29, intArray31);
        int[] intArray40 = new int[] {};
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        int[] intArray45 = new int[] {};
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray45, intArray46);
        org.junit.Assert.assertArrayEquals("random", intArray42, intArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray40, intArray42);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray29, intArray42);
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.setup();
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        java.util.Set<java.io.Serializable> serializableSet44 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray41);
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.maxfailures");
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray41);
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.failfast");
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.weekly");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader36, fields49, fields54, true);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 0, (long) (short) 10);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 10, 4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] { executorService12 };
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray13);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) strArray27);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) (short) 1, 10L);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (byte) -1, (double) '#', (double) 2);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 1, (double) '#', (double) (short) -1);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests5.queryParser;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "enwiki.random.lines.txt");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields22, fields29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain36;
        simpleIndexQueryParserTests3.ensureCleanedUp();
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) floatArray42);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) 1L);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray47, floatArray51, 0.0f);
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray58, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray42, floatArray58, (float) 1L);
        float[] floatArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray42, floatArray65, (float) (byte) -1);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum3, postingsEnum4, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 0, numericDocValues10, numericDocValues11);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, 0L);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("europarl.lines.txt.gz", indexReader7, terms8, terms9, true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "enwiki.random.lines.txt");
        java.lang.String[] strArray24 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields19, fields26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain33;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 1);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (-1), (int) (short) 0);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues49 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues49, numericDocValues50);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain13;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests15.queryParser;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests15.assertTermsEquals("europarl.lines.txt.gz", indexReader20, terms21, terms22, true);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "enwiki.random.lines.txt");
        java.lang.String[] strArray37 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests15.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields32, fields39);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests41.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain46;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain46;
        java.lang.String str50 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef53 = simpleIndexQueryParserTests1.indexedValueForSearch(1L);
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader55, terms56, terms57, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests60.assertDocsSkippingEquals("tests.weekly", indexReader62, (int) (byte) 100, postingsEnum64, postingsEnum65, false);
        simpleIndexQueryParserTests60.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests60.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests60);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader10, (int) (short) 0, postingsEnum12, postingsEnum13);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests1.indexedValueForSearch((long) ' ');
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService18);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "node_s_0");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        org.junit.Assert.assertNotNull((java.lang.Object) strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "node_s_0");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "<unknown>");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "random");
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet26 = org.apache.lucene.util.LuceneTestCase.asSet(objArray25);
        org.junit.Assert.assertArrayEquals(objArray20, objArray25);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet(objArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet(objArray42);
        org.junit.Assert.assertArrayEquals(objArray37, objArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray32, objArray37);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet(objArray50);
        java.lang.Object[] objArray55 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet56 = org.apache.lucene.util.LuceneTestCase.asSet(objArray55);
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet61 = org.apache.lucene.util.LuceneTestCase.asSet(objArray60);
        org.junit.Assert.assertArrayEquals(objArray55, objArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray50, objArray55);
        org.junit.Assert.assertEquals(objArray37, objArray50);
        org.junit.Assert.assertEquals(objArray20, objArray37);
        org.junit.Assert.assertArrayEquals(objArray15, objArray37);
        java.lang.Object[] objArray70 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet71 = org.apache.lucene.util.LuceneTestCase.asSet(objArray70);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet76 = org.apache.lucene.util.LuceneTestCase.asSet(objArray75);
        org.junit.Assert.assertArrayEquals(objArray70, objArray75);
        org.junit.Assert.assertEquals(objArray37, objArray75);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, objArray37);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 3, 100.0d, (double) '4');
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 0, (double) 2);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) (byte) 0, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray7 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray11 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray12 = new double[][] { doubleArray3, doubleArray7, doubleArray11 };
        double[] doubleArray16 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray20 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray24 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray25 = new double[][] { doubleArray16, doubleArray20, doubleArray24 };
        double[][][] doubleArray26 = new double[][][] { doubleArray12, doubleArray25 };
        double[] doubleArray30 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray34 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray38 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray39 = new double[][] { doubleArray30, doubleArray34, doubleArray38 };
        double[] doubleArray43 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray47 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray51 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray52 = new double[][] { doubleArray43, doubleArray47, doubleArray51 };
        double[][][] doubleArray53 = new double[][][] { doubleArray39, doubleArray52 };
        double[] doubleArray57 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray61 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray65 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray66 = new double[][] { doubleArray57, doubleArray61, doubleArray65 };
        double[] doubleArray70 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray74 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray78 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray79 = new double[][] { doubleArray70, doubleArray74, doubleArray78 };
        double[][][] doubleArray80 = new double[][][] { doubleArray66, doubleArray79 };
        double[][][][] doubleArray81 = new double[][][][] { doubleArray26, doubleArray53, doubleArray80 };
        java.util.Set<double[][][]> doubleArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray81);
        java.util.concurrent.ExecutorService[] executorServiceArray83 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray81, (java.lang.Object[]) executorServiceArray83);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("random", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray3, intArray9);
        int[] intArray20 = new int[] { 0, (byte) 100, 5, 2, 2, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray9, intArray20);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain12;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader18, (-1), postingsEnum20, postingsEnum21);
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader4, (int) (byte) -1, postingsEnum6, postingsEnum7);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.queryParser;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader17, terms18, terms19, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        java.lang.String[] strArray34 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields29, fields36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests38.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests41.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests41.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain43;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = simpleIndexQueryParserTests12.getqueryParser();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests12.setqueryParser(indexQueryParserService48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests4.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("europarl.lines.txt.gz", indexReader9, terms10, terms11, true);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "enwiki.random.lines.txt");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields21, fields28);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests30.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain35;
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = simpleIndexQueryParserTests2.getqueryParser();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray12 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests4 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet13 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("tests.monster", postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) elasticsearchSingleNodeTestArray12, (java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray12, (java.lang.Object[]) strArray27);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 0);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) executorServiceArray6);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.lang.Iterable[] iterableArray23 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray24 = (java.lang.Iterable<java.lang.Object>[]) iterableArray23;
        objIterableArray24[0] = objSet16;
        objIterableArray24[1] = objSet21;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) objIterableArray24);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
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
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals(charArray11, charArray15);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray11);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals(charArray20, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray20, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        org.junit.Assert.assertArrayEquals(charArray28, charArray31);
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
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        org.junit.Assert.assertArrayEquals(charArray47, charArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray40, charArray47);
        org.junit.Assert.assertArrayEquals(charArray31, charArray47);
        org.junit.Assert.assertArrayEquals(charArray11, charArray47);
        org.junit.Assert.assertArrayEquals(charArray1, charArray11);
        char[] charArray58 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray58);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, 1L);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
        org.apache.lucene.search.QueryCachingPolicy[][][] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[][][] {};
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[][]> queryCachingPolicyArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "node_s_0");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.weekly");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        org.junit.Assert.assertNotNull((java.lang.Object) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) queryCachingPolicyArray1, (java.lang.Object[]) strArray7);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.weekly", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("hi!", indexReader23, (int) '#', postingsEnum25, postingsEnum26);
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests1.ruleChain;
        java.lang.Object obj29 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, obj29);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader12, 4, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader18, terms19, terms20, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 2);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) '#');
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
        short[] shortArray4 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray9);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray17 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray9, shortArray17);
        short[] shortArray20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray17, shortArray20);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray1, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray12, charArray16);
        org.junit.Assert.assertArrayEquals(charArray9, charArray12);
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
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray21, charArray28);
        org.junit.Assert.assertArrayEquals(charArray12, charArray28);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray42, charArray50);
        org.junit.Assert.assertArrayEquals(charArray38, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray50, charArray54);
        org.junit.Assert.assertArrayEquals(charArray28, charArray54);
        char[] charArray59 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray54, charArray59);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (-1));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray20 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray25 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray20, doubleArray25, (double) (short) 10);
        double[] doubleArray33 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray38 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray33, doubleArray38, (double) (short) 10);
        double[] doubleArray46 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray51 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray46, doubleArray51, (double) (short) 10);
        double[] doubleArray59 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray64 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray59, doubleArray64, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray59, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray46, 10.0d);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray20, doubleArray46, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray46, (double) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray46, (double) (-1));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader24 = null;
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.weekly");
        java.lang.String[] strArray32 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "");
        simpleIndexQueryParserTests20.assertFieldsEquals("tests.weekly", indexReader24, fields27, fields36, true);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = null;
        simpleIndexQueryParserTests20.queryParser = indexQueryParserService40;
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests20.indexedValueForSearch((long) (byte) 100);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain18, (java.lang.Object) simpleIndexQueryParserTests20);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 1, (double) ' ', 0.0d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 0, (long) (short) 1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str3 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str4 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str7 = mockMoreLikeThisFetchService6.nodeName();
        java.lang.String str8 = mockMoreLikeThisFetchService6.nodeName();
        java.lang.String str9 = mockMoreLikeThisFetchService6.nodeName();
        java.lang.String str10 = mockMoreLikeThisFetchService6.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.queryParser;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader20, (-1), postingsEnum22, postingsEnum23, false);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.weekly", indexReader27, (int) 'a', postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.weekly", indexReader34, (int) (short) 10, postingsEnum36, postingsEnum37, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) mockMoreLikeThisFetchService6, (java.lang.Object) true);
        java.lang.String str41 = mockMoreLikeThisFetchService6.nodeName();
        java.lang.String str42 = mockMoreLikeThisFetchService6.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str44 = mockMoreLikeThisFetchService43.nodeName();
        java.lang.String str45 = mockMoreLikeThisFetchService43.nodeName();
        java.lang.String str46 = mockMoreLikeThisFetchService43.nodeName();
        java.lang.String str47 = mockMoreLikeThisFetchService43.nodeName();
        java.lang.String str48 = mockMoreLikeThisFetchService43.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService43, mockMoreLikeThisFetchService49 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[][] mockMoreLikeThisFetchServiceArray51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[][] { mockMoreLikeThisFetchServiceArray50 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[]> mockMoreLikeThisFetchServiceArraySet52 = org.apache.lucene.util.LuceneTestCase.asSet(mockMoreLikeThisFetchServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) mockMoreLikeThisFetchServiceArray51);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1L, (long) (byte) 10);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 4, (long) 6);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) 1L);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, (int) (short) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.badapples", false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 'a', (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray5, objArray10);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        org.junit.Assert.assertArrayEquals(objArray28, objArray33);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray23, objArray28);
        org.junit.Assert.assertEquals(objArray10, objArray23);
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        java.util.concurrent.ExecutorService[] executorServiceArray41 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray38, (java.lang.Object[]) executorServiceArray41);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", objArray10, (java.lang.Object[]) executorServiceArray41);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) 6, (double) (-1.0f));
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 100, (long) 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        org.junit.Assert.assertArrayEquals(objArray23, objArray28);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray18, objArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) strArray5, objArray23);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures6);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray8 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures6 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.weekly");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "");
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray8, (java.lang.Object[]) strArray10);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("tests.monster", indexReader10, (int) (byte) 1, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests17.queryParser;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("tests.slow", indexReader22, (int) '4', postingsEnum24, postingsEnum25);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet32 = org.apache.lucene.util.LuceneTestCase.asSet(objArray31);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet(objArray36);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet(objArray41);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet(objArray46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet52 = org.apache.lucene.util.LuceneTestCase.asSet(objArray51);
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet(objArray56);
        java.lang.Iterable[] iterableArray59 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray60 = (java.lang.Iterable<java.lang.Object>[]) iterableArray59;
        objIterableArray60[0] = objSet32;
        objIterableArray60[1] = objSet37;
        objIterableArray60[2] = objSet42;
        objIterableArray60[3] = objSet47;
        objIterableArray60[4] = objSet52;
        objIterableArray60[5] = objSet57;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet73 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray60);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests17, (java.lang.Object) objIterableSet73);
        org.junit.rules.RuleChain ruleChain75 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) ruleChain75);
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain75;
        simpleIndexQueryParserTests7.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests12.getqueryParser();
        java.lang.String str16 = simpleIndexQueryParserTests12.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests12.queryParser;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule11, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("europarl.lines.txt.gz", indexReader12, terms13, terms14, true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        java.lang.String[] strArray29 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields24, fields31);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests33.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests44.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = simpleIndexQueryParserTests44.queryParser;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        simpleIndexQueryParserTests44.assertTermsEquals("europarl.lines.txt.gz", indexReader49, terms50, terms51, true);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "enwiki.random.lines.txt");
        java.lang.String[] strArray66 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests44.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields61, fields68);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests44.assertPositionsSkippingEquals("hi!", indexReader71, 10, postingsEnum73, postingsEnum74);
        simpleIndexQueryParserTests44.ensureCleanedUp();
        simpleIndexQueryParserTests44.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService80 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService80;
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.NumericDocValues numericDocValues85 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.monster", 0, numericDocValues85, numericDocValues86);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) 1L);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray4, floatArray8, 0.0f);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 1L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests21.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests21.queryParser;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests21.assertTermsEquals("europarl.lines.txt.gz", indexReader26, terms27, terms28, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        java.lang.String[] strArray43 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields38, fields45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests47.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        simpleIndexQueryParserTests47.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain52;
        simpleIndexQueryParserTests19.ensureCleanedUp();
        float[] floatArray57 = new float[] {};
        float[] floatArray58 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray58, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests19, (java.lang.Object) floatArray58);
        float[] floatArray63 = new float[] {};
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) 1L);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray65, floatArray69, 0.0f);
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray76, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray76, 0.0f);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray63, floatArray76, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray63, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray58, (float) 0);
        org.junit.Assert.assertArrayEquals("tests.slow", floatArray8, floatArray58, (float) (-1));
        float[] floatArray89 = new float[] {};
        float[] floatArray90 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray89, floatArray90, (float) 1L);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray8, floatArray90, 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) 10.0f);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) '4', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader6, 10, postingsEnum8, postingsEnum9);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '#', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader5, terms6, terms7, true);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.monster", postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum19, postingsEnum20, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests12.queryParser();
        simpleIndexQueryParserTests12.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests27.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests27.queryParser;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("tests.slow", indexReader32, (int) '4', postingsEnum34, postingsEnum35);
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet(objArray41);
        java.lang.Object[] objArray46 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet47 = org.apache.lucene.util.LuceneTestCase.asSet(objArray46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet52 = org.apache.lucene.util.LuceneTestCase.asSet(objArray51);
        java.lang.Object[] objArray56 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet57 = org.apache.lucene.util.LuceneTestCase.asSet(objArray56);
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet(objArray61);
        java.lang.Object[] objArray66 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet67 = org.apache.lucene.util.LuceneTestCase.asSet(objArray66);
        java.lang.Iterable[] iterableArray69 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray70 = (java.lang.Iterable<java.lang.Object>[]) iterableArray69;
        objIterableArray70[0] = objSet42;
        objIterableArray70[1] = objSet47;
        objIterableArray70[2] = objSet52;
        objIterableArray70[3] = objSet57;
        objIterableArray70[4] = objSet62;
        objIterableArray70[5] = objSet67;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet83 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray70);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests27, (java.lang.Object) objIterableSet83);
        org.junit.rules.RuleChain ruleChain85 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain85;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain85);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("node_s_0", obj1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertDocsSkippingEquals("tests.weekly", indexReader13, (int) (byte) 100, postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests11);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("europarl.lines.txt.gz", 0, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, (int) (short) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
        long[] longArray1 = new long[] { 1 };
        long[] longArray3 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray12 = new long[] { 1 };
        long[] longArray14 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray12, longArray14);
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
        long[] longArray18 = new long[] { 1 };
        long[] longArray20 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray18, longArray20);
        long[] longArray23 = new long[] { 1 };
        long[] longArray25 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray23, longArray25);
        org.junit.Assert.assertArrayEquals(longArray20, longArray23);
        org.junit.Assert.assertArrayEquals(longArray12, longArray23);
        long[] longArray30 = new long[] { 1 };
        long[] longArray32 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray30, longArray32);
        long[] longArray35 = new long[] { 1 };
        long[] longArray37 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray35, longArray37);
        org.junit.Assert.assertArrayEquals(longArray32, longArray35);
        org.junit.Assert.assertArrayEquals(longArray12, longArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray12);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
        java.lang.Object[] objArray1 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray4 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray4);
        org.junit.Assert.assertEquals(objArray1, (java.lang.Object[]) executorServiceArray2);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "random");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray1, (java.lang.Object[]) strArray11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests19.getqueryParser();
        java.lang.String str23 = simpleIndexQueryParserTests19.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests19.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) strArray11, (java.lang.Object) simpleIndexQueryParserTests19);
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests19.testTermsQueryFilter();
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, objArray7);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) '4');
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader2, (int) (byte) 100, postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader10, 0, postingsEnum12, postingsEnum13);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService15);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests18.queryParser;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.slow", indexReader23, 100, postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        java.lang.String str29 = simpleIndexQueryParserTests18.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = null;
        simpleIndexQueryParserTests18.setqueryParser(indexQueryParserService30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain17, (java.lang.Object) indexQueryParserService30);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader9, (int) 'a', postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule14);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet21 = org.apache.lucene.util.LuceneTestCase.asSet(objArray20);
        java.util.Collection[] collectionArray23 = new java.util.Collection[4];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[] objCollectionArray24 = (java.util.Collection<java.lang.Object>[]) collectionArray23;
        objCollectionArray24[0] = objSet6;
        objCollectionArray24[1] = objSet11;
        objCollectionArray24[2] = objSet16;
        objCollectionArray24[3] = objSet21;
        java.util.List<java.util.Collection<java.lang.Object>> objCollectionList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, objCollectionArray24);
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.weekly");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "");
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray42);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.badapples");
        java.util.concurrent.ExecutorService[] executorServiceArray48 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        boolean boolean50 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray48);
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.weekly");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray51, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray48, (java.lang.Object[]) executorServiceArray51);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray35, (java.lang.Object[]) executorServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) objCollectionArray24, (java.lang.Object[]) executorServiceArray51);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray4, byteArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) byteArray12);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 10, (long) 4);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
        java.lang.String[][] strArray1 = new java.lang.String[][] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] {};
        java.lang.String[][] strArray3 = new java.lang.String[][] {};
        java.lang.String[][] strArray4 = new java.lang.String[][] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] {};
        java.lang.String[][][] strArray6 = new java.lang.String[][][] { strArray1, strArray2, strArray3, strArray4, strArray5 };
        java.lang.String[][] strArray7 = new java.lang.String[][] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.lang.String[][] strArray10 = new java.lang.String[][] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] {};
        java.lang.String[][][] strArray12 = new java.lang.String[][][] { strArray7, strArray8, strArray9, strArray10, strArray11 };
        java.lang.String[][] strArray13 = new java.lang.String[][] {};
        java.lang.String[][] strArray14 = new java.lang.String[][] {};
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        java.lang.String[][] strArray16 = new java.lang.String[][] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] {};
        java.lang.String[][][] strArray18 = new java.lang.String[][][] { strArray13, strArray14, strArray15, strArray16, strArray17 };
        java.lang.String[][] strArray19 = new java.lang.String[][] {};
        java.lang.String[][] strArray20 = new java.lang.String[][] {};
        java.lang.String[][] strArray21 = new java.lang.String[][] {};
        java.lang.String[][] strArray22 = new java.lang.String[][] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        java.lang.String[][][] strArray24 = new java.lang.String[][][] { strArray19, strArray20, strArray21, strArray22, strArray23 };
        java.lang.String[][][][] strArray25 = new java.lang.String[][][][] { strArray6, strArray12, strArray18, strArray24 };
        java.util.Set<java.lang.String[][][]> strArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.String[][][]> strArraySet27 = org.apache.lucene.util.LuceneTestCase.asSet(strArray25);
        java.util.Set<java.lang.Object[][][]> objArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[][][][]) strArray25);
        java.util.concurrent.ExecutorService[] executorServiceArray29 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray29);
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.weekly");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray29, (java.lang.Object[]) strArray31);
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "node_s_0");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray31);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        java.lang.Iterable[] iterableArray36 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray37 = (java.lang.Iterable<java.lang.Object>[]) iterableArray36;
        objIterableArray37[0] = objSet9;
        objIterableArray37[1] = objSet14;
        objIterableArray37[2] = objSet19;
        objIterableArray37[3] = objSet24;
        objIterableArray37[4] = objSet29;
        objIterableArray37[5] = objSet34;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray37);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objIterableSet50);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests56.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService58 = simpleIndexQueryParserTests56.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexQueryParserService55, (java.lang.Object) simpleIndexQueryParserTests56);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, 1L);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray14 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray9, doubleArray14, (double) (short) 10);
        double[] doubleArray22 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray27 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray22, doubleArray27, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray9, doubleArray27, (double) '#');
        double[] doubleArray39 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray44 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray39, doubleArray44, (double) (short) 10);
        double[] doubleArray52 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray57 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray52, doubleArray57, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray39, doubleArray57, (double) '#');
        double[] doubleArray67 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray72 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray67, doubleArray72, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray67, (double) (short) 10);
        double[] doubleArray82 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray87 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray82, doubleArray87, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray39, doubleArray82, (-1.0d));
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray27, doubleArray39, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray1, doubleArray39, (double) (byte) 1);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, (int) (short) 1, postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray3 = new java.lang.String[][] { strArray2 };
        java.lang.String[][][] strArray4 = new java.lang.String[][][] { strArray3 };
        java.lang.String[][][][] strArray5 = new java.lang.String[][][][] { strArray4 };
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray7 };
        java.lang.String[][][] strArray9 = new java.lang.String[][][] { strArray8 };
        java.lang.String[][][][] strArray10 = new java.lang.String[][][][] { strArray9 };
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray12 };
        java.lang.String[][][] strArray14 = new java.lang.String[][][] { strArray13 };
        java.lang.String[][][][] strArray15 = new java.lang.String[][][][] { strArray14 };
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray18 = new java.lang.String[][] { strArray17 };
        java.lang.String[][][] strArray19 = new java.lang.String[][][] { strArray18 };
        java.lang.String[][][][] strArray20 = new java.lang.String[][][][] { strArray19 };
        java.lang.String[][][][][] strArray21 = new java.lang.String[][][][][] { strArray5, strArray10, strArray15, strArray20 };
        java.util.Set<java.lang.String[][][][]> strArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.weekly");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) strArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray25);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader9, (-1), postingsEnum11, postingsEnum12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader16, (int) 'a', postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader23, (int) (short) 1, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests0.queryParser();
        java.lang.String str29 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray32);
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "random");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests38.queryParser;
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests38.assertPositionsSkippingEquals("tests.slow", indexReader43, 100, postingsEnum45, postingsEnum46);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests38.setqueryParser(indexQueryParserService48);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests38.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef54 = simpleIndexQueryParserTests52.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests52.queryParser;
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests52.assertPositionsSkippingEquals("tests.slow", indexReader57, (int) '4', postingsEnum59, postingsEnum60);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests62.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests62.failureAndSuccessEvents;
        simpleIndexQueryParserTests52.failureAndSuccessEvents = ruleChain64;
        simpleIndexQueryParserTests52.ensureCleanedUp();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests52.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader70 = null;
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.weekly");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "random");
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.nightly");
        java.lang.String[] strArray80 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray80, "");
        simpleIndexQueryParserTests52.assertFieldsEquals("tests.weekly", indexReader70, fields77, fields82, true);
        java.lang.String[] strArray91 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields93 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray91, "<unknown>");
        org.apache.lucene.index.Fields fields95 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray91, "");
        simpleIndexQueryParserTests38.assertFieldStatisticsEquals("random", fields82, fields95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.weekly", fields37, fields82);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum14, postingsEnum15, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.Class<?> wildcardClass20 = mockMoreLikeThisFetchService19.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) wildcardClass20);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests6.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests6.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("europarl.lines.txt.gz", indexReader11, terms12, terms13, true);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "enwiki.random.lines.txt");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests6.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields23, fields30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests32.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain37;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain37;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain37;
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests4.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 1);
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService46);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.monster", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum8, postingsEnum9, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests14.queryParser;
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests14.queryParser();
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests22.queryParser;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.slow", indexReader27, 100, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests22.setqueryParser(indexQueryParserService32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) indexQueryParserService32);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) (-1.0f));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.queryParser;
        java.lang.String[][] strArray9 = new java.lang.String[][] {};
        java.util.Set<java.lang.String[]> strArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(strArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.awaitsfix", (java.lang.Object) indexQueryParserService8, (java.lang.Object) strArray9);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, 100, postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("tests.monster", indexReader17, terms18, terms19, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests23.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests23.queryParser;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.slow", indexReader28, (int) '4', postingsEnum30, postingsEnum31);
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet(objArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet(objArray42);
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet48 = org.apache.lucene.util.LuceneTestCase.asSet(objArray47);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet(objArray52);
        java.lang.Object[] objArray57 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet58 = org.apache.lucene.util.LuceneTestCase.asSet(objArray57);
        java.lang.Object[] objArray62 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet63 = org.apache.lucene.util.LuceneTestCase.asSet(objArray62);
        java.lang.Iterable[] iterableArray65 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray66 = (java.lang.Iterable<java.lang.Object>[]) iterableArray65;
        objIterableArray66[0] = objSet38;
        objIterableArray66[1] = objSet43;
        objIterableArray66[2] = objSet48;
        objIterableArray66[3] = objSet53;
        objIterableArray66[4] = objSet58;
        objIterableArray66[5] = objSet63;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet79 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray66);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests23, (java.lang.Object) objIterableSet79);
        org.junit.rules.RuleChain ruleChain81 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain81;
        org.apache.lucene.index.IndexReader indexReader84 = null;
        org.apache.lucene.index.Terms terms85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("tests.monster", indexReader84, terms85, terms86, true);
        simpleIndexQueryParserTests14.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef92 = simpleIndexQueryParserTests14.longToPrefixCoded((long) (short) 10, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) testRule13, (java.lang.Object) bytesRef92);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
        double[] doubleArray5 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray10 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray10, (double) (short) 10);
        double[] doubleArray18 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray23 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray18, doubleArray23, (double) (short) 10);
        double[] doubleArray31 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray36 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray31, doubleArray36, (double) (short) 10);
        double[] doubleArray44 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray49 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray44, doubleArray49, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray44, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray31, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray18, (double) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) doubleArray5);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray11 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray11 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray12);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet(objArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        org.junit.Assert.assertArrayEquals(objArray24, objArray29);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray19, objArray24);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet(objArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet(objArray42);
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet48 = org.apache.lucene.util.LuceneTestCase.asSet(objArray47);
        org.junit.Assert.assertArrayEquals(objArray42, objArray47);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray37, objArray42);
        org.junit.Assert.assertEquals(objArray24, objArray37);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) objArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray12, objArray24);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) 10, 0.0d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 2, 0L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray8, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray11, byteArray14);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray20);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray34, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray34);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) byteArray29);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray29, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray20, byteArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray29);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum4, postingsEnum5, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser;
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray11 };
        java.lang.String[][][] strArray13 = new java.lang.String[][][] { strArray12 };
        java.lang.String[][][][] strArray14 = new java.lang.String[][][][] { strArray13 };
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray16 };
        java.lang.String[][][] strArray18 = new java.lang.String[][][] { strArray17 };
        java.lang.String[][][][] strArray19 = new java.lang.String[][][][] { strArray18 };
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray22 = new java.lang.String[][] { strArray21 };
        java.lang.String[][][] strArray23 = new java.lang.String[][][] { strArray22 };
        java.lang.String[][][][] strArray24 = new java.lang.String[][][][] { strArray23 };
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray26 };
        java.lang.String[][][] strArray28 = new java.lang.String[][][] { strArray27 };
        java.lang.String[][][][] strArray29 = new java.lang.String[][][][] { strArray28 };
        java.lang.String[][][][][] strArray30 = new java.lang.String[][][][][] { strArray14, strArray19, strArray24, strArray29 };
        java.util.Set<java.lang.String[][][][]> strArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(strArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArray30);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray15);
        org.junit.Assert.assertNotNull("europarl.lines.txt.gz", (java.lang.Object) byteArray10);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray26, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray29, byteArray32);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray38);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray38, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray6);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 1, (long) 0);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.weekly");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) strArray16);
        org.junit.Assert.assertEquals(objArray13, (java.lang.Object[]) executorServiceArray14);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.weekly");
        org.junit.Assert.assertEquals(objArray13, (java.lang.Object[]) strArray23);
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray23);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        long[] longArray1 = new long[] { 1 };
        long[] longArray3 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
        long[] longArray12 = new long[] { 1 };
        long[] longArray14 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray12, longArray14);
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
        long[] longArray18 = new long[] { 1 };
        long[] longArray20 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray18, longArray20);
        long[] longArray23 = new long[] { 1 };
        long[] longArray25 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray23, longArray25);
        org.junit.Assert.assertArrayEquals(longArray20, longArray23);
        org.junit.Assert.assertArrayEquals(longArray12, longArray23);
        long[] longArray31 = new long[] { 1 };
        long[] longArray33 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray31, longArray33);
        long[] longArray36 = new long[] { 1 };
        long[] longArray38 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray36, longArray38);
        org.junit.Assert.assertArrayEquals(longArray33, longArray36);
        long[] longArray42 = new long[] { 1 };
        long[] longArray44 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray42, longArray44);
        org.junit.Assert.assertArrayEquals(longArray36, longArray42);
        long[] longArray48 = new long[] { 1 };
        long[] longArray50 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray48, longArray50);
        long[] longArray53 = new long[] { 1 };
        long[] longArray55 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray53, longArray55);
        org.junit.Assert.assertArrayEquals(longArray50, longArray53);
        org.junit.Assert.assertArrayEquals(longArray42, longArray53);
        long[] longArray60 = new long[] { 1 };
        long[] longArray62 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray60, longArray62);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray42, longArray62);
        org.junit.Assert.assertArrayEquals(longArray12, longArray42);
        long[] longArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray12, longArray66);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader13, (int) '#', postingsEnum15, postingsEnum16, true);
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests22.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests22.queryParser;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, true);
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests22.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests22.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests22.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests36.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = simpleIndexQueryParserTests36.queryParser;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("tests.slow", indexReader41, (int) '4', postingsEnum43, postingsEnum44);
        simpleIndexQueryParserTests36.setUp();
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain47;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests8.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests8.queryParser;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests8.assertTermsEquals("europarl.lines.txt.gz", indexReader13, terms14, terms15, true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        java.lang.String[] strArray30 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests8.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields25, fields32);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests34.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests34.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = null;
        simpleIndexQueryParserTests6.setqueryParser(indexQueryParserService44);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.maxfailures", indexReader47, (int) '#', postingsEnum49, postingsEnum50);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = null;
        simpleIndexQueryParserTests6.queryParser = indexQueryParserService52;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests6.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray55 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests6 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet56 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray55);
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.lang.String[] strArray61 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.weekly");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertEquals(objArray58, (java.lang.Object[]) executorServiceArray59);
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.weekly");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "random");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray58, (java.lang.Object[]) strArray68);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests76.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain78 = simpleIndexQueryParserTests76.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService79 = simpleIndexQueryParserTests76.getqueryParser();
        java.lang.String str80 = simpleIndexQueryParserTests76.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService81 = simpleIndexQueryParserTests76.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) strArray68, (java.lang.Object) simpleIndexQueryParserTests76);
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "");
        java.util.concurrent.ExecutorService[] executorServiceArray85 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean86 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray85);
        java.lang.String[] strArray87 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "tests.weekly");
        org.apache.lucene.index.Fields fields91 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray85, (java.lang.Object[]) strArray87);
        org.apache.lucene.index.Fields fields94 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "node_s_0");
        org.apache.lucene.index.Fields fields96 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray68, (java.lang.Object[]) strArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) elasticsearchSingleNodeTestArray55, (java.lang.Object[]) strArray87);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader2, (int) (byte) 100, postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader9, 1, postingsEnum11, postingsEnum12, false);
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.weekly");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) strArray18);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "node_s_0");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.weekly");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.awaitsfix");
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.weekly");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "");
        java.lang.String[] strArray37 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 1, (java.lang.Object) strArray37);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 5, (double) (short) 0);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) 'a');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader7, (int) '4', postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet32 = org.apache.lucene.util.LuceneTestCase.asSet(objArray31);
        java.lang.Object[] objArray36 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet37 = org.apache.lucene.util.LuceneTestCase.asSet(objArray36);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet(objArray41);
        java.lang.Iterable[] iterableArray44 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray45 = (java.lang.Iterable<java.lang.Object>[]) iterableArray44;
        objIterableArray45[0] = objSet17;
        objIterableArray45[1] = objSet22;
        objIterableArray45[2] = objSet27;
        objIterableArray45[3] = objSet32;
        objIterableArray45[4] = objSet37;
        objIterableArray45[5] = objSet42;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray45);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) objIterableSet58);
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testDisMaxBuilder();
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        org.junit.Assert.assertArrayEquals(objArray5, objArray10);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet(objArray17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        org.junit.Assert.assertArrayEquals(objArray22, objArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray17, objArray22);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        org.junit.Assert.assertArrayEquals(objArray40, objArray45);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray35, objArray40);
        org.junit.Assert.assertEquals(objArray22, objArray35);
        org.junit.Assert.assertEquals(objArray5, objArray22);
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet55 = org.apache.lucene.util.LuceneTestCase.asSet(objArray54);
        org.junit.Assert.assertEquals(objArray22, objArray54);
        double[][][] doubleArray58 = new double[][][] {};
        double[][][] doubleArray59 = new double[][][] {};
        double[][][] doubleArray60 = new double[][][] {};
        double[][][][] doubleArray61 = new double[][][][] { doubleArray58, doubleArray59, doubleArray60 };
        java.util.Set<double[][][]> doubleArraySet62 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray61);
        java.util.List<java.lang.Object[][]> objArrayList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Object[][][]) doubleArray61);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) objArray54, (java.lang.Object) doubleArray61);
        java.util.concurrent.ExecutorService[] executorServiceArray65 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        java.lang.String[] strArray70 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.weekly");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray68, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray65, (java.lang.Object[]) executorServiceArray68);
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray54, (java.lang.Object[]) executorServiceArray65);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader5, terms6, terms7, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader5);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
        char[] charArray0 = null;
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray2, charArray10);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals(charArray13, charArray17);
        org.junit.Assert.assertArrayEquals(charArray10, charArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray13);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        org.junit.Assert.assertArrayEquals(objArray9, objArray14);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet32 = org.apache.lucene.util.LuceneTestCase.asSet(objArray31);
        org.junit.Assert.assertArrayEquals(objArray26, objArray31);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray21, objArray26);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objArray49);
        org.junit.Assert.assertArrayEquals(objArray44, objArray49);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray39, objArray44);
        org.junit.Assert.assertEquals(objArray26, objArray39);
        org.junit.Assert.assertEquals(objArray9, objArray26);
        org.junit.Assert.assertArrayEquals(objArray4, objArray26);
        java.lang.Object[] objArray56 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", objArray26, objArray56);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader4, fields7, fields16, true);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("tests.monster", postingsEnum24, postingsEnum25, true);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests22.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests34.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests34.queryParser;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("tests.slow", indexReader39, (int) '4', postingsEnum41, postingsEnum42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests34.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain46;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule21, (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, 100L);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet(objArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        java.lang.Iterable[] iterableArray36 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray37 = (java.lang.Iterable<java.lang.Object>[]) iterableArray36;
        objIterableArray37[0] = objSet9;
        objIterableArray37[1] = objSet14;
        objIterableArray37[2] = objSet19;
        objIterableArray37[3] = objSet24;
        objIterableArray37[4] = objSet29;
        objIterableArray37[5] = objSet34;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet50 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray37);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) objIterableSet50);
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService53 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService53);
        java.lang.String str55 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) fields59);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests5.assertDocsSkippingEquals("tests.weekly", indexReader7, (int) (byte) 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.weekly");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "");
        simpleIndexQueryParserTests16.assertFieldsEquals("tests.weekly", indexReader20, fields23, fields32, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader39 = null;
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.weekly");
        java.lang.String[] strArray47 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "");
        simpleIndexQueryParserTests35.assertFieldsEquals("tests.weekly", indexReader39, fields42, fields51, true);
        simpleIndexQueryParserTests5.assertFieldsEquals("enwiki.random.lines.txt", indexReader15, fields32, fields42, true);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "node_s_0");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "<unknown>");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "random");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.maxfailures", fields42, fields68);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) (short) 10);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader12, terms13, terms14, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService18;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests11.queryParser;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests11.assertTermsEquals("europarl.lines.txt.gz", indexReader16, terms17, terms18, true);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        java.lang.String[] strArray33 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests11.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields28, fields35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests37.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests40.failureAndSuccessEvents;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests9, (java.lang.Object) floatArray48);
        java.lang.String[] strArray59 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "<unknown>");
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "node_s_0");
        simpleIndexQueryParserTests9.assertFieldStatisticsEquals("enwiki.random.lines.txt", fields61, fields68);
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.weekly");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "random");
        org.apache.lucene.index.Fields fields18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader12, fields17, fields18, true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
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
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3, testRuleIgnoreAfterMaxFailures5, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet11 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray10);
        java.lang.Object[] objArray12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray10, objArray12);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        double[] doubleArray0 = null;
        double[] doubleArray8 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray13 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray8, doubleArray13, (double) (short) 10);
        double[] doubleArray21 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray26 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray21, doubleArray26, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray8, doubleArray26, (double) '#');
        double[] doubleArray38 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray43 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray38, doubleArray43, (double) (short) 10);
        double[] doubleArray51 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray56 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray51, doubleArray56, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray38, doubleArray56, (double) '#');
        double[] doubleArray66 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray71 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray66, doubleArray71, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray66, (double) (short) 10);
        double[] doubleArray81 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray86 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray81, doubleArray86, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray38, doubleArray81, (-1.0d));
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray26, doubleArray38, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray38, (double) 10);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "enwiki.random.lines.txt");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields17, fields24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader27, 10, postingsEnum29, postingsEnum30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain19;
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests14.queryParser = indexQueryParserService22;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests24.assertDocsSkippingEquals("tests.weekly", indexReader26, (int) (byte) 100, postingsEnum28, postingsEnum29, false);
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests14, (java.lang.Object) simpleIndexQueryParserTests24);
        simpleIndexQueryParserTests24.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests24.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) str12, (java.lang.Object) simpleIndexQueryParserTests24);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", obj1);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 2, (double) (byte) 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f, (double) '4');
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (byte) 1);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 6, numericDocValues8, numericDocValues9);
    }
}

