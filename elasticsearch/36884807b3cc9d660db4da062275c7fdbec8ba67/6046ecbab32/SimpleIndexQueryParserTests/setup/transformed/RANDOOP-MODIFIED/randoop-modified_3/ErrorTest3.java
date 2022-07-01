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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) 6, (double) 2);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("tests.monster", postingsEnum17, postingsEnum18, true);
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) elasticsearchSingleNodeTestArray13, (java.lang.Object) simpleIndexQueryParserTests15);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) elasticsearchSingleNodeTestArray13, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 10L);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests11.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests11.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) indexQueryParserService13);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        double[] doubleArray3 = new double[] { 0.0f };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        double[] doubleArray6 = new double[] { 0.0f };
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        double[] doubleArray9 = new double[] { 0.0f };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        double[] doubleArray12 = new double[] { 0.0f };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        double[][][] doubleArray14 = new double[][][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13 };
        double[] doubleArray16 = new double[] { 0.0f };
        double[][] doubleArray17 = new double[][] { doubleArray16 };
        double[] doubleArray19 = new double[] { 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray19 };
        double[] doubleArray22 = new double[] { 0.0f };
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        double[] doubleArray25 = new double[] { 0.0f };
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        double[][][] doubleArray27 = new double[][][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        double[] doubleArray29 = new double[] { 0.0f };
        double[][] doubleArray30 = new double[][] { doubleArray29 };
        double[] doubleArray32 = new double[] { 0.0f };
        double[][] doubleArray33 = new double[][] { doubleArray32 };
        double[] doubleArray35 = new double[] { 0.0f };
        double[][] doubleArray36 = new double[][] { doubleArray35 };
        double[] doubleArray38 = new double[] { 0.0f };
        double[][] doubleArray39 = new double[][] { doubleArray38 };
        double[][][] doubleArray40 = new double[][][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        double[][][][] doubleArray41 = new double[][][][] { doubleArray14, doubleArray27, doubleArray40 };
        java.util.List<double[][][]> doubleArrayList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, doubleArray41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests43.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain48;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests43.queryParser;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests43.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader52, (-1), postingsEnum54, postingsEnum55, false);
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = simpleIndexQueryParserTests59.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = simpleIndexQueryParserTests59.getqueryParser();
        simpleIndexQueryParserTests59.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests43, (java.lang.Object) simpleIndexQueryParserTests59);
        org.apache.lucene.index.IndexReader indexReader65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        simpleIndexQueryParserTests43.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader65, (int) 'a', postingsEnum67, postingsEnum68, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService71 = null;
        simpleIndexQueryParserTests43.setqueryParser(indexQueryParserService71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) (short) 0, (java.lang.Object) indexQueryParserService71);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        int[] intArray1 = null;
        int[] intArray2 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray2);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
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
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray40, 10.0d);
        double[] doubleArray51 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray56 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray51, doubleArray56, (double) (short) 10);
        double[] doubleArray64 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray69 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray64, doubleArray69, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray51, doubleArray69, (double) '#');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray7, doubleArray69, (double) 3);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 100, (double) 5);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
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
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader33, 4, postingsEnum35, postingsEnum36);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues42 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues42, numericDocValues43);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
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
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", objArray11, (java.lang.Object[]) executorServiceArray40);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = simpleIndexQueryParserTests49.queryParser;
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests49.assertPositionsSkippingEquals("tests.slow", indexReader54, 100, postingsEnum56, postingsEnum57);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = null;
        simpleIndexQueryParserTests49.setqueryParser(indexQueryParserService59);
        simpleIndexQueryParserTests49.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) objArray20, (java.lang.Object) simpleIndexQueryParserTests49);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) (short) 0, (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
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
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "random");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray2, (java.lang.Object[]) strArray12);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet29 = org.apache.lucene.util.LuceneTestCase.asSet(objArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet34 = org.apache.lucene.util.LuceneTestCase.asSet(objArray33);
        org.junit.Assert.assertArrayEquals(objArray28, objArray33);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet(objArray50);
        org.junit.Assert.assertArrayEquals(objArray45, objArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray40, objArray45);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet(objArray58);
        java.lang.Object[] objArray63 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet64 = org.apache.lucene.util.LuceneTestCase.asSet(objArray63);
        java.lang.Object[] objArray68 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet69 = org.apache.lucene.util.LuceneTestCase.asSet(objArray68);
        org.junit.Assert.assertArrayEquals(objArray63, objArray68);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray58, objArray63);
        org.junit.Assert.assertEquals(objArray45, objArray58);
        org.junit.Assert.assertEquals(objArray28, objArray45);
        org.junit.Assert.assertArrayEquals(objArray23, objArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", objArray2, objArray23);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
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
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (-1), 1.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) (short) 0, (long) (short) -1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 0.0f, (double) ' ');
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.weekly");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "random");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "");
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.nightly", (java.lang.Object) fields40);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader26, fields40, fields50, true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
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
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) '4', numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy0 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray1 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy0 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray1 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray2);
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray5);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) queryCachingPolicyArray2, (java.lang.Object[]) executorServiceArray5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 100.0d, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 1, (long) (short) 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 10, 1.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        java.lang.String[] strArray1 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray1);
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "random");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray17 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures7, testRuleIgnoreAfterMaxFailures9, testRuleIgnoreAfterMaxFailures12, testRuleIgnoreAfterMaxFailures13, testRuleIgnoreAfterMaxFailures15 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray18 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray17 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray18);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray1, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray18);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests3.queryParser;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.slow", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) "<unknown>");
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests3.indexedValueForSearch((long) 3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) 'a', (java.lang.Object) 3);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1L), (long) (byte) 1);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
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
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests0.longToPrefixCoded(0L, 10);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader20, terms21, terms22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests29.queryParser = indexQueryParserService31;
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
        java.lang.Object[] objArray61 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet62 = org.apache.lucene.util.LuceneTestCase.asSet(objArray61);
        java.lang.Iterable[] iterableArray64 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray65 = (java.lang.Iterable<java.lang.Object>[]) iterableArray64;
        objIterableArray65[0] = objSet37;
        objIterableArray65[1] = objSet42;
        objIterableArray65[2] = objSet47;
        objIterableArray65[3] = objSet52;
        objIterableArray65[4] = objSet57;
        objIterableArray65[5] = objSet62;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet78 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray65);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests29, (java.lang.Object) objIterableSet78);
        simpleIndexQueryParserTests29.setUp();
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.weekly");
        java.lang.String[] strArray85 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.weekly");
        simpleIndexQueryParserTests29.assertFieldStatisticsEquals("tests.awaitsfix", fields84, fields87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader26, fields27, fields87, false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (short) -1, (double) 10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        short[] shortArray1 = null;
        short[] shortArray4 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray6);
        short[] shortArray9 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray6, shortArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray1, shortArray6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader4, terms5, terms6, true);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (byte) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) 0.0f);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.failfast");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef65 = simpleIndexQueryParserTests63.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService66 = simpleIndexQueryParserTests63.queryParser;
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests63.assertPositionsSkippingEquals("tests.slow", indexReader68, (int) '4', postingsEnum70, postingsEnum71);
        simpleIndexQueryParserTests63.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests63, (java.lang.Object) "<unknown>");
        org.junit.rules.RuleChain ruleChain76 = simpleIndexQueryParserTests63.failureAndSuccessEvents;
        simpleIndexQueryParserTests63.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader80 = null;
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.weekly");
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray81, "tests.monster");
        java.lang.String[] strArray86 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.weekly");
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.monster");
        simpleIndexQueryParserTests63.assertFieldsEquals("tests.monster", indexReader80, fields85, fields90, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader52, fields61, fields90, true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        int[] intArray1 = new int[] { 10 };
        int[] intArray5 = new int[] { (short) 1, (short) 100, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray13, charArray21);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray26, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray37, charArray41);
        org.junit.Assert.assertArrayEquals(charArray34, charArray37);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray34, charArray45);
        org.junit.Assert.assertArrayEquals(charArray13, charArray34);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray9, charArray13);
        org.junit.Assert.assertArrayEquals(charArray1, charArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef56 = simpleIndexQueryParserTests52.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain57 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests52.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) charArray1, (java.lang.Object) bytesRef59);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (short) 100);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setUp();
        org.junit.Assert.assertNotSame("", (java.lang.Object) 4, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testBoolQueryBuilder();
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        int[] intArray5 = new int[] { ' ', 100, 5, 10 };
        int[] intArray10 = new int[] { (short) 1, 100, 6, (byte) -1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray5, intArray10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, (long) 100);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
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
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("tests.failfast", postingsEnum28, postingsEnum29, true);
        java.lang.Object[] objArray32 = new java.lang.Object[] { "tests.failfast" };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, objArray32);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.failfast");
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
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
        java.util.concurrent.ExecutorService executorService58 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray59 = new java.util.concurrent.ExecutorService[] { executorService58 };
        boolean boolean60 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray59);
        java.util.concurrent.ExecutorService executorService68 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray69 = new java.util.concurrent.ExecutorService[] { executorService68 };
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean75 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean76 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray69);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray59, (java.lang.Object[]) executorServiceArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) elasticsearchSingleNodeTestArray55, (java.lang.Object[]) executorServiceArray59);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 0.0d, 100.0d, (double) 4);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { 2, (byte) 10, (byte) 100, (byte) -1, (short) 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray1, intArray8);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "hi!");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.awaitsfix");
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
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) objIterableArray44);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests13.queryParser;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.slow", indexReader18, 100, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests13.setqueryParser(indexQueryParserService23);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests13.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests27.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests27.queryParser;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("tests.slow", indexReader32, (int) '4', postingsEnum34, postingsEnum35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests27.ensureCleanedUp();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.weekly");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "random");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.nightly");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "");
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.weekly", indexReader45, fields52, fields57, true);
        java.lang.String[] strArray66 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "<unknown>");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("random", fields57, fields70);
        java.lang.String[] strArray76 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader12, fields57, fields80, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields57);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("tests.monster", postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain12;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests7.getqueryParser();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray24);
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "random");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests30.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests30.assertPositionsSkippingEquals("tests.monster", indexReader36, 10, postingsEnum38, postingsEnum39);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests30.queryParser();
        org.apache.lucene.index.IndexReader indexReader43 = null;
        java.lang.String[] strArray50 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "<unknown>");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "");
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.weekly");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        simpleIndexQueryParserTests30.assertFieldsEquals("tests.weekly", indexReader43, fields54, fields59, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.badapples", fields29, fields59);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("enwiki.random.lines.txt");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        int[] intArray6 = new int[] { '4', (short) 0, 2, 10, 6, 100 };
        int[] intArray13 = new int[] { 3, (-1), 0, 'a', (byte) 1, 5 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray13);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet(objArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray33 = (java.lang.Iterable<java.lang.Object>[]) iterableArray32;
        objIterableArray33[0] = objSet5;
        objIterableArray33[1] = objSet10;
        objIterableArray33[2] = objSet15;
        objIterableArray33[3] = objSet20;
        objIterableArray33[4] = objSet25;
        objIterableArray33[5] = objSet30;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray33);
        java.util.concurrent.ExecutorService[] executorServiceArray47 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) objIterableArray33, (java.lang.Object[]) executorServiceArray47);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        float[] floatArray2 = new float[] {};
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
        simpleIndexQueryParserTests4.ensureCleanedUp();
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) floatArray43);
        float[] floatArray48 = new float[] {};
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) 1L);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray50, floatArray54, 0.0f);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray61, 0.0f);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray48, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray43, (float) (byte) -1);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray73, (float) 10);
        float[] floatArray78 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", floatArray73, floatArray78, (float) 5);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded(100L, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
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
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        char[] charArray25 = new char[] {};
        char[] charArray26 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray25, charArray26);
        org.junit.Assert.assertArrayEquals(charArray22, charArray26);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray22, charArray30);
        org.junit.Assert.assertArrayEquals("hi!", charArray19, charArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) charArray30);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 3, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
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
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray0, charArray1);
        char[] charArray7 = new char[] { '#', 'a', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray7);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "");
        java.lang.Class<?> wildcardClass24 = fields23.getClass();
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
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("hi!", indexReader52, 10, postingsEnum54, postingsEnum55);
        java.lang.Class<?> wildcardClass57 = simpleIndexQueryParserTests25.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests58 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef60 = simpleIndexQueryParserTests58.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = simpleIndexQueryParserTests58.queryParser;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.Terms terms64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        simpleIndexQueryParserTests58.assertTermsEquals("europarl.lines.txt.gz", indexReader63, terms64, terms65, true);
        java.lang.Class<?> wildcardClass68 = simpleIndexQueryParserTests58.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef71 = simpleIndexQueryParserTests69.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService72 = simpleIndexQueryParserTests69.queryParser;
        org.apache.lucene.index.IndexReader indexReader74 = null;
        org.apache.lucene.index.Terms terms75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        simpleIndexQueryParserTests69.assertTermsEquals("europarl.lines.txt.gz", indexReader74, terms75, terms76, true);
        java.lang.Class<?> wildcardClass79 = simpleIndexQueryParserTests69.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef82 = simpleIndexQueryParserTests80.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = simpleIndexQueryParserTests80.queryParser;
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        simpleIndexQueryParserTests80.assertTermsEquals("europarl.lines.txt.gz", indexReader85, terms86, terms87, true);
        java.lang.Class<?> wildcardClass90 = simpleIndexQueryParserTests80.getClass();
        java.lang.reflect.Type[] typeArray91 = new java.lang.reflect.Type[] { wildcardClass24, wildcardClass57, wildcardClass68, wildcardClass79, wildcardClass90 };
        java.util.List<java.lang.reflect.Type> typeList92 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, typeArray91);
        java.util.List<java.lang.reflect.Type> typeList93 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, typeArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) typeArray91);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests13.queryParser;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests13.assertPositionsSkippingEquals("tests.slow", indexReader18, 100, postingsEnum20, postingsEnum21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests13.setqueryParser(indexQueryParserService23);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests13.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests27.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests27.queryParser;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests27.assertPositionsSkippingEquals("tests.slow", indexReader32, (int) '4', postingsEnum34, postingsEnum35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests37.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests27.ensureCleanedUp();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.weekly");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "random");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.nightly");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "");
        simpleIndexQueryParserTests27.assertFieldsEquals("tests.weekly", indexReader45, fields52, fields57, true);
        java.lang.String[] strArray66 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "<unknown>");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("random", fields57, fields70);
        java.lang.String[] strArray76 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "");
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader12, fields57, fields80, false);
        org.apache.lucene.index.PostingsEnum postingsEnum84 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum84, postingsEnum85);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "");
        java.lang.Class<?> wildcardClass25 = fields24.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests26.queryParser;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("europarl.lines.txt.gz", indexReader31, terms32, terms33, true);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "enwiki.random.lines.txt");
        java.lang.String[] strArray48 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields43, fields50);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("hi!", indexReader53, 10, postingsEnum55, postingsEnum56);
        java.lang.Class<?> wildcardClass58 = simpleIndexQueryParserTests26.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef61 = simpleIndexQueryParserTests59.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = simpleIndexQueryParserTests59.queryParser;
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.Terms terms65 = null;
        org.apache.lucene.index.Terms terms66 = null;
        simpleIndexQueryParserTests59.assertTermsEquals("europarl.lines.txt.gz", indexReader64, terms65, terms66, true);
        java.lang.Class<?> wildcardClass69 = simpleIndexQueryParserTests59.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef72 = simpleIndexQueryParserTests70.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService73 = simpleIndexQueryParserTests70.queryParser;
        org.apache.lucene.index.IndexReader indexReader75 = null;
        org.apache.lucene.index.Terms terms76 = null;
        org.apache.lucene.index.Terms terms77 = null;
        simpleIndexQueryParserTests70.assertTermsEquals("europarl.lines.txt.gz", indexReader75, terms76, terms77, true);
        java.lang.Class<?> wildcardClass80 = simpleIndexQueryParserTests70.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef83 = simpleIndexQueryParserTests81.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService84 = simpleIndexQueryParserTests81.queryParser;
        org.apache.lucene.index.IndexReader indexReader86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        org.apache.lucene.index.Terms terms88 = null;
        simpleIndexQueryParserTests81.assertTermsEquals("europarl.lines.txt.gz", indexReader86, terms87, terms88, true);
        java.lang.Class<?> wildcardClass91 = simpleIndexQueryParserTests81.getClass();
        java.lang.reflect.Type[] typeArray92 = new java.lang.reflect.Type[] { wildcardClass25, wildcardClass58, wildcardClass69, wildcardClass80, wildcardClass91 };
        java.util.List<java.lang.reflect.Type> typeList93 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, typeArray92);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) typeArray92);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) strArray5, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (-1.0f));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        int[] intArray2 = new int[] { (short) 100 };
        int[] intArray9 = new int[] { (-1), (byte) -1, 2, (short) 100, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray2, intArray9);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        long[] longArray1 = null;
        long[] longArray8 = new long[] { (byte) 1, 10, 2, (short) -1, 10L, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray1, longArray8);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray4 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray7 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray7, shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
        short[] shortArray17 = new short[] { (short) 10, (byte) 10, (short) 100, (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray4, shortArray17);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 10);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 100.0f, (double) (byte) 100);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) (short) 10);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.util.Set[] setArray12 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[] objSetArray13 = (java.util.Set<java.lang.Object>[]) setArray12;
        objSetArray13[0] = objSet5;
        objSetArray13[1] = objSet10;
        java.util.Set<java.util.Set<java.lang.Object>> objSetSet18 = org.apache.lucene.util.LuceneTestCase.asSet(objSetArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) objSetArray13);
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) objSetArray13, (java.lang.Object) postingsEnum33);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests52.assertDocsSkippingEquals("tests.weekly", indexReader54, (int) (byte) 100, postingsEnum56, postingsEnum57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests52.assertDocsSkippingEquals("tests.weekly", indexReader61, 6, postingsEnum63, postingsEnum64, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = simpleIndexQueryParserTests52.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests52);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService12;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.slow", indexReader19, (int) '4', postingsEnum21, postingsEnum22);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain26;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) indexQueryParserService12, (java.lang.Object) ruleChain26);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) ruleChain6, (java.lang.Object) simpleIndexQueryParserTests9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests9.testEmptyBooleanQuery();
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        int[] intArray1 = new int[] {};
        int[] intArray4 = new int[] { (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray4);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray4 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray10 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        short[] shortArray13 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray13, shortArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray10, shortArray13);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray4, shortArray13);
        short[] shortArray25 = new short[] { (byte) -1, (byte) 10, (short) -1, (short) 0, (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray25);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures5 };
        java.util.List<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, testRuleIgnoreAfterMaxFailuresArray7);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet13 = org.apache.lucene.util.LuceneTestCase.asSet(objArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet18 = org.apache.lucene.util.LuceneTestCase.asSet(objArray17);
        org.junit.Assert.assertArrayEquals(objArray12, objArray17);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        org.junit.Assert.assertArrayEquals(objArray29, objArray34);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray24, objArray29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet(objArray42);
        java.lang.Object[] objArray47 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet48 = org.apache.lucene.util.LuceneTestCase.asSet(objArray47);
        java.lang.Object[] objArray52 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet53 = org.apache.lucene.util.LuceneTestCase.asSet(objArray52);
        org.junit.Assert.assertArrayEquals(objArray47, objArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray42, objArray47);
        org.junit.Assert.assertEquals(objArray29, objArray42);
        org.junit.Assert.assertEquals(objArray12, objArray29);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray7, objArray29);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus12 = simpleIndexQueryParserTests0.ensureGreen(strArray7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = null;
        simpleIndexQueryParserTests4.queryParser = indexQueryParserService6;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests36.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        simpleIndexQueryParserTests36.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) (byte) 100);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "enwiki.random.lines.txt");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef58 = simpleIndexQueryParserTests56.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests56.queryParser;
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        simpleIndexQueryParserTests56.assertTermsEquals("europarl.lines.txt.gz", indexReader61, terms62, terms63, true);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "enwiki.random.lines.txt");
        java.lang.String[] strArray78 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests56.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields73, fields80);
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields55, fields80);
        org.apache.lucene.index.Fields fields83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader3, fields80, fields83, false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 10, 4);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
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
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        org.junit.Assert.assertArrayEquals(objArray3, objArray8);
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray13);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.weekly");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) strArray15);
        org.junit.Assert.assertEquals(objArray12, (java.lang.Object[]) executorServiceArray13);
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.weekly");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "random");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray12, (java.lang.Object[]) strArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray8, objArray12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 1.0d, (double) (-1.0f));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService49);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues54 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues54, numericDocValues55);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        double[] doubleArray1 = null;
        double[] doubleArray7 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray12 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray7, doubleArray12, (double) (short) 10);
        double[] doubleArray20 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray25 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray20, doubleArray25, (double) (short) 10);
        double[] doubleArray33 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray38 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray33, doubleArray38, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray33, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray20, 10.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray1, doubleArray20, (double) 10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
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
        org.junit.rules.TestRule testRule33 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 100, numericDocValues39, numericDocValues40);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        double[] doubleArray5 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray10 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray10, (double) (short) 10);
        double[] doubleArray18 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray23 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray18, doubleArray23, (double) (short) 10);
        double[] doubleArray31 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray36 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray31, doubleArray36, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray31, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray18, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100.0f);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) fields9);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", objArray1, (java.lang.Object[]) strArray4);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.weekly");
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.monster");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
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
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        float[] floatArray2 = new float[] {};
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
        simpleIndexQueryParserTests4.ensureCleanedUp();
        float[] floatArray42 = new float[] {};
        float[] floatArray43 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray43, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) floatArray43);
        float[] floatArray48 = new float[] {};
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) 1L);
        float[] floatArray54 = new float[] {};
        float[] floatArray55 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray54, floatArray55, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray50, floatArray54, 0.0f);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray61, 0.0f);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray48, floatArray61, (float) (short) 0);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray48, 0.0f);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray2, floatArray43, (float) (byte) -1);
        float[] floatArray73 = new float[] {};
        float[] floatArray74 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray73, floatArray74, (float) 1L);
        float[] floatArray77 = new float[] {};
        float[] floatArray78 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray77, floatArray78, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray73, floatArray77, 0.0f);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray77, (float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) floatArray77);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.monster", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader11, (int) (short) 0, postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.badapples", indexReader19, (int) (short) 100, postingsEnum21, postingsEnum22, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", (java.lang.Object) indexQueryParserService25);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 10, (double) (-1.0f), (double) 2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 1, (double) 6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
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
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray19 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray20 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray21 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray22 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray23 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray19, elasticsearchTestCaseArray20, elasticsearchTestCaseArray21, elasticsearchTestCaseArray22 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray23);
        java.util.Set<java.lang.Cloneable> cloneableSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) elasticsearchTestCaseArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray1, (java.lang.Object[]) elasticsearchTestCaseArray23);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields3Builder();
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        double[] doubleArray6 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray6, doubleArray11, (double) (short) 10);
        double[] doubleArray19 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray24 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray19, doubleArray24, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray6, doubleArray24, (double) '#');
        double[] doubleArray34 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray39 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray34, doubleArray39, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray34, (double) (short) 10);
        double[] doubleArray44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray34, doubleArray44, (double) 'a');
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.weekly");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertEquals(objArray5, (java.lang.Object[]) executorServiceArray6);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.weekly");
        org.junit.Assert.assertEquals(objArray5, (java.lang.Object[]) strArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, objArray5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        java.lang.Object obj1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        int[] intArray2 = new int[] { (byte) 0 };
        int[] intArray5 = new int[] { '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray2, intArray5);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray14, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals("", byteArray8, byteArray20);
        org.junit.Assert.assertNotSame((java.lang.Object) 100.0f, (java.lang.Object) byteArray8);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray32);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray32, byteArray35);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray41, byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray41);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray48);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray8, byteArray48);
        byte[] byteArray53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray53);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService60 = simpleIndexQueryParserTests2.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) indexQueryParserService60);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        long[] longArray4 = new long[] { ' ', (short) 1, 100, (byte) 0 };
        long[] longArray6 = new long[] { 1 };
        long[] longArray8 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
        long[] longArray11 = new long[] { 1 };
        long[] longArray13 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray11, longArray13);
        org.junit.Assert.assertArrayEquals(longArray8, longArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.weekly");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray2);
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "node_s_0");
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet(objArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        org.junit.Assert.assertArrayEquals(objArray19, objArray24);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray14, objArray19);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet38 = org.apache.lucene.util.LuceneTestCase.asSet(objArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet43 = org.apache.lucene.util.LuceneTestCase.asSet(objArray42);
        org.junit.Assert.assertArrayEquals(objArray37, objArray42);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray32, objArray37);
        org.junit.Assert.assertEquals(objArray19, objArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, objArray19);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
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
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain47;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain47;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests53.queryParser;
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum61 = null;
        simpleIndexQueryParserTests53.assertPositionsSkippingEquals("tests.slow", indexReader58, 100, postingsEnum60, postingsEnum61);
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        java.lang.String str64 = simpleIndexQueryParserTests53.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService65 = null;
        simpleIndexQueryParserTests53.setqueryParser(indexQueryParserService65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService52, (java.lang.Object) simpleIndexQueryParserTests53);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.weekly");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray10, (java.lang.Object[]) strArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray7, (java.lang.Object[]) executorServiceArray10);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray7);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded(100L, (int) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        int[] intArray2 = new int[] { 4 };
        int[] intArray7 = new int[] { '4', (byte) 1, (byte) -1, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray7);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) (byte) 10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
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
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray13, charArray22);
        char[] charArray25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray13, charArray25);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        int[] intArray1 = new int[] {};
        int[] intArray5 = new int[] { 6, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray5);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        int[] intArray1 = new int[] { (byte) 10 };
        int[] intArray5 = new int[] { (byte) 1, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray5);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str4 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str6 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str7 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str8 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str9 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str10 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str12 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str13 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str14 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str15 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str16 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str17 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str18 = mockMoreLikeThisFetchService11.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str20 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str21 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str22 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str23 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str24 = mockMoreLikeThisFetchService19.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str26 = mockMoreLikeThisFetchService25.nodeName();
        java.lang.String str27 = mockMoreLikeThisFetchService25.nodeName();
        java.lang.String str28 = mockMoreLikeThisFetchService25.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str30 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str31 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str32 = mockMoreLikeThisFetchService29.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] { mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService11, mockMoreLikeThisFetchService19, mockMoreLikeThisFetchService25, mockMoreLikeThisFetchService29 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, mockMoreLikeThisFetchServiceArray33);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) mockMoreLikeThisFetchServiceArray33, (java.lang.Object[]) strArray36);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 0L);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray25);
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "random");
        org.apache.lucene.index.Fields fields31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.nightly", indexReader23, fields30, fields31, true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures3);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures4, testRuleIgnoreAfterMaxFailures6, testRuleIgnoreAfterMaxFailures8 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures10);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures12);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures17 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures16);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray18 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures10, testRuleIgnoreAfterMaxFailures13, testRuleIgnoreAfterMaxFailures15, testRuleIgnoreAfterMaxFailures17 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures19 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures20 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures19);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures21 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures22 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures21);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures23 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures24 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures23);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures25 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures26 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures25);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray27 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures19, testRuleIgnoreAfterMaxFailures22, testRuleIgnoreAfterMaxFailures24, testRuleIgnoreAfterMaxFailures26 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures28 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures29 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures28);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures30 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures31 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures30);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures32 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures33 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures32);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures34 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures35 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures34);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray36 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures28, testRuleIgnoreAfterMaxFailures31, testRuleIgnoreAfterMaxFailures33, testRuleIgnoreAfterMaxFailures35 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray37 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray9, testRuleIgnoreAfterMaxFailuresArray18, testRuleIgnoreAfterMaxFailuresArray27, testRuleIgnoreAfterMaxFailuresArray36 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray37);
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray41 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray42 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray43 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray44 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray45 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray41, elasticsearchTestCaseArray42, elasticsearchTestCaseArray43, elasticsearchTestCaseArray44 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet46 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests47.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests47.queryParser;
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests47.assertPositionsSkippingEquals("tests.slow", indexReader52, (int) '4', postingsEnum54, postingsEnum55);
        simpleIndexQueryParserTests47.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("tests.maxfailures", indexReader59, terms60, terms61, false);
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) elasticsearchTestCaseArray45, (java.lang.Object) indexReader59);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet65 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray45);
        java.util.List<java.lang.Object[]> objArrayList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.Object[][]) elasticsearchTestCaseArray45);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray37, (java.lang.Object[]) elasticsearchTestCaseArray45);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) 6);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) (-1.0f));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests6.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests6.queryParser;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests6.assertPositionsSkippingEquals("tests.slow", indexReader11, (int) '4', postingsEnum13, postingsEnum14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain18;
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain51;
        java.lang.String str55 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef58 = simpleIndexQueryParserTests6.indexedValueForSearch((long) (short) 1);
        org.junit.Assert.assertNotSame((java.lang.Object) bytesRef58, (java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService5, (java.lang.Object) bytesRef58);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, 100.0d, (double) 1.0f);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        int[] intArray6 = new int[] { 100, 100, (short) 100, ' ', 5 };
        int[] intArray11 = new int[] { 2, 5, (-1), (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", intArray6, intArray11);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests11.queryParser;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.slow", indexReader16, (int) '4', postingsEnum18, postingsEnum19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain23;
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.weekly");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "random");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.nightly");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "");
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.weekly", indexReader29, fields36, fields41, true);
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
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests44.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader62 = null;
        java.lang.String[] strArray63 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.weekly");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "random");
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.nightly");
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "");
        simpleIndexQueryParserTests44.assertFieldsEquals("tests.weekly", indexReader62, fields69, fields74, true);
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader10, fields41, fields69, false);
        java.lang.String str79 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues82 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", 0, numericDocValues82, numericDocValues83);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str4 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str6 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain12;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader16, (-1), postingsEnum18, postingsEnum19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("tests.weekly", indexReader23, (int) 'a', postingsEnum25, postingsEnum26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("tests.weekly", indexReader30, (int) (short) 10, postingsEnum32, postingsEnum33, true);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) mockMoreLikeThisFetchService2, (java.lang.Object) true);
        java.lang.String str37 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str38 = mockMoreLikeThisFetchService2.nodeName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) str38);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10.0f, (double) 0);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
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
        short[] shortArray34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray9, shortArray34);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader7, (int) '4', postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "<unknown>");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests15.queryParser;
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests15.assertPositionsSkippingEquals("tests.slow", indexReader20, (int) '4', postingsEnum22, postingsEnum23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain27;
        simpleIndexQueryParserTests15.ensureCleanedUp();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain31;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests2.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests34.queryParser();
        simpleIndexQueryParserTests34.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests34.assertDocsEnumEquals("tests.monster", postingsEnum38, postingsEnum39, true);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests34.assertPositionsSkippingEquals("node_s_0", indexReader43, 0, postingsEnum45, postingsEnum46);
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) indexQueryParserService33, (java.lang.Object) simpleIndexQueryParserTests34);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "");
        java.lang.Object[] objArray18 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet19 = org.apache.lucene.util.LuceneTestCase.asSet(objArray18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet24 = org.apache.lucene.util.LuceneTestCase.asSet(objArray23);
        org.junit.Assert.assertArrayEquals(objArray18, objArray23);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet31 = org.apache.lucene.util.LuceneTestCase.asSet(objArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet36 = org.apache.lucene.util.LuceneTestCase.asSet(objArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        org.junit.Assert.assertArrayEquals(objArray35, objArray40);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray30, objArray35);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet49 = org.apache.lucene.util.LuceneTestCase.asSet(objArray48);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet54 = org.apache.lucene.util.LuceneTestCase.asSet(objArray53);
        java.lang.Object[] objArray58 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet59 = org.apache.lucene.util.LuceneTestCase.asSet(objArray58);
        org.junit.Assert.assertArrayEquals(objArray53, objArray58);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray48, objArray53);
        org.junit.Assert.assertEquals(objArray35, objArray48);
        org.junit.Assert.assertEquals(objArray18, objArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, objArray35);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        int[] intArray4 = new int[] { (byte) 1, '#', 2, ' ' };
        int[] intArray6 = new int[] { ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (short) 100);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        long[] longArray3 = new long[] { 0L, 10L };
        long[] longArray5 = new long[] { 1 };
        long[] longArray7 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray5, longArray7);
        long[] longArray10 = new long[] { 1 };
        long[] longArray12 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray10, longArray12);
        org.junit.Assert.assertArrayEquals(longArray7, longArray10);
        long[] longArray16 = new long[] { 1 };
        long[] longArray18 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray16, longArray18);
        org.junit.Assert.assertArrayEquals(longArray10, longArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray3, longArray16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        int[] intArray1 = new int[] {};
        int[] intArray8 = new int[] { 3, '#', (byte) 100, (-1), 2, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray8);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 1, (int) (byte) 10);
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) strArray11);
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "node_s_0");
        java.lang.String[] strArray23 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.slow", fields18, fields29);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet11 = org.apache.lucene.util.LuceneTestCase.asSet(objArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertArrayEquals(objArray10, objArray15);
        java.lang.Object[] objArray22 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet23 = org.apache.lucene.util.LuceneTestCase.asSet(objArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet28 = org.apache.lucene.util.LuceneTestCase.asSet(objArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet33 = org.apache.lucene.util.LuceneTestCase.asSet(objArray32);
        org.junit.Assert.assertArrayEquals(objArray27, objArray32);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray22, objArray27);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet41 = org.apache.lucene.util.LuceneTestCase.asSet(objArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        java.lang.Object[] objArray50 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet51 = org.apache.lucene.util.LuceneTestCase.asSet(objArray50);
        org.junit.Assert.assertArrayEquals(objArray45, objArray50);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray40, objArray45);
        org.junit.Assert.assertEquals(objArray27, objArray40);
        org.junit.Assert.assertEquals(objArray10, objArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, objArray10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
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
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("hi!", postingsEnum47, postingsEnum48);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        int[] intArray6 = new int[] { (-1), 0, (byte) 10, (byte) 10, 2, 4 };
        int[] intArray11 = new int[] { 3, 10, 100, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray11);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
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
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray65, (float) (short) 10);
        float[] floatArray71 = new float[] {};
        float[] floatArray72 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray71, floatArray72, (float) 1L);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray65, floatArray71, (float) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray65);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "node_s_0");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.weekly");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.weekly");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) ruleChain6, (java.lang.Object) simpleIndexQueryParserTests9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests9.testBoolQueryBuilder();
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
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
        org.apache.lucene.index.IndexReader indexReader13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "enwiki.random.lines.txt", "tests.monster", "tests.maxfailures", "hi!" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.slow");
        java.lang.String[] strArray26 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "node_s_0");
        org.junit.Assert.assertNotNull((java.lang.Object) fields32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader13, fields21, fields32, false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        float[] floatArray1 = new float[] {};
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
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray42, (float) (byte) -1);
        float[] floatArray71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray71, (float) 2);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        double[] doubleArray5 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray10 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray10, (double) (short) 10);
        double[] doubleArray17 = new double[] { 100, 100L, (-1.0d), 10.0d };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray17, (double) 1L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setUp();
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests35.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests35.queryParser;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        simpleIndexQueryParserTests35.assertTermsEquals("europarl.lines.txt.gz", indexReader40, terms41, terms42, true);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "enwiki.random.lines.txt");
        java.lang.String[] strArray57 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests35.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields52, fields59);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef63 = simpleIndexQueryParserTests61.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain66 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        simpleIndexQueryParserTests61.failureAndSuccessEvents = ruleChain66;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain66;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain66;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain66;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain66;
        org.apache.lucene.index.NumericDocValues numericDocValues74 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) 100, numericDocValues74, numericDocValues75);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) 3);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        short[] shortArray3 = new short[] { (short) 100 };
        short[] shortArray5 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray10 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray5, shortArray8);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray8, shortArray16);
        short[] shortArray21 = new short[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray21);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
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
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setUp();
        org.junit.Assert.assertNotSame("", (java.lang.Object) 4, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testEmptyBooleanQuery();
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        int[] intArray3 = new int[] { '#', 3, '4' };
        int[] intArray8 = new int[] { (byte) 100, 6, 10, (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray3, intArray8);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray13 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray8, doubleArray13, (double) (short) 10);
        double[] doubleArray21 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray26 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray21, doubleArray26, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray8, doubleArray26, (double) '#');
        double[] doubleArray36 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray41 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray36, doubleArray41, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray36, (double) (short) 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests46.assertDocsEnumEquals("tests.monster", postingsEnum48, postingsEnum49, true);
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests46.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum53, postingsEnum54, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests46.queryParser();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame((java.lang.Object) doubleArray36, (java.lang.Object) simpleIndexQueryParserTests46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray1, doubleArray36, 1.0d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) 4, (long) '#');
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) (short) 10, (long) (byte) 0);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
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
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertDocsAndPositionsEnumEquals("hi!", postingsEnum26, postingsEnum27);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.Class<?> wildcardClass48 = ruleChain47.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef51 = simpleIndexQueryParserTests49.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService52 = simpleIndexQueryParserTests49.queryParser;
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        org.apache.lucene.index.Terms terms56 = null;
        simpleIndexQueryParserTests49.assertTermsEquals("europarl.lines.txt.gz", indexReader54, terms55, terms56, true);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "enwiki.random.lines.txt");
        java.lang.String[] strArray71 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests49.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields66, fields73);
        org.apache.lucene.util.BytesRef bytesRef77 = simpleIndexQueryParserTests49.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef79 = simpleIndexQueryParserTests49.indexedValueForSearch((long) (byte) 0);
        org.apache.lucene.util.BytesRef bytesRef81 = simpleIndexQueryParserTests49.indexedValueForSearch((long) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain47, (java.lang.Object) bytesRef81);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 100, (long) 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 100L, (double) 'a', (double) (short) 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs(10);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("", indexReader16, terms17, terms18, true);
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests12.ruleChain;
        java.lang.Class<?> wildcardClass22 = testRule21.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) testRule11, (java.lang.Object) wildcardClass22);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum7, postingsEnum8, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, false);
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (short) 100, numericDocValues22, numericDocValues23);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService15;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests18.queryParser();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (-1));
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) bytesRef22, obj23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, obj23);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests29.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain34;
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 10, 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) bytesRef40);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { 2, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        double[] doubleArray0 = null;
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
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray35, (double) (short) 10);
        double[] doubleArray51 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray56 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray51, doubleArray56, (double) (short) 10);
        double[] doubleArray64 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray69 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray64, doubleArray69, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray51, doubleArray69, (double) '#');
        double[] doubleArray79 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray84 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray79, doubleArray84, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray79, (double) (short) 1);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray79, (double) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray35, 0.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, 1L);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray13 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray8, doubleArray13, (double) (short) 10);
        double[] doubleArray21 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray26 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray21, doubleArray26, (double) (short) 10);
        double[] doubleArray34 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray39 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray34, doubleArray39, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray34, 0.0d);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray13, doubleArray21, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray1, doubleArray13, (double) 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
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
        java.lang.Object[] objArray59 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet60 = org.apache.lucene.util.LuceneTestCase.asSet(objArray59);
        java.lang.Object[] objArray64 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet65 = org.apache.lucene.util.LuceneTestCase.asSet(objArray64);
        org.junit.Assert.assertArrayEquals(objArray59, objArray64);
        org.junit.Assert.assertEquals(objArray26, objArray64);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "enwiki.random.lines.txt");
        java.util.Set<java.io.Serializable> serializableSet75 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray72);
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", objArray26, (java.lang.Object[]) strArray72);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService6);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        int[] intArray7 = new int[] { 6, (short) 100, (byte) -1, (byte) -1, (byte) 1, (short) 1 };
        int[] intArray8 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray7, intArray8);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
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
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray15 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray16 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray17 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray18 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray19 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray15, elasticsearchTestCaseArray16, elasticsearchTestCaseArray17, elasticsearchTestCaseArray18 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) elasticsearchTestCaseArray19);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.weekly");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) strArray11);
        org.junit.Assert.assertEquals(objArray8, (java.lang.Object[]) executorServiceArray9);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.weekly");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "random");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray8, (java.lang.Object[]) strArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) executorServiceArray2, objArray8);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 10, 4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.util.Set[] setArray11 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[] objSetArray12 = (java.util.Set<java.lang.Object>[]) setArray11;
        objSetArray12[0] = objSet4;
        objSetArray12[1] = objSet9;
        java.util.Set[][] setArray18 = new java.util.Set[1][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[][] objSetArray19 = (java.util.Set<java.lang.Object>[][]) setArray18;
        objSetArray19[0] = objSetArray12;
        java.util.Set<java.util.Set<java.lang.Object>[]> objSetArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(objSetArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "node_s_0");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "<unknown>");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) objSetArray19, (java.lang.Object[]) strArray27);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef61 = simpleIndexQueryParserTests59.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests62.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain64 = simpleIndexQueryParserTests62.failureAndSuccessEvents;
        simpleIndexQueryParserTests59.failureAndSuccessEvents = ruleChain64;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService66 = simpleIndexQueryParserTests59.queryParser;
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        simpleIndexQueryParserTests59.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader68, (-1), postingsEnum70, postingsEnum71, false);
        simpleIndexQueryParserTests59.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService76 = simpleIndexQueryParserTests75.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService77 = simpleIndexQueryParserTests75.getqueryParser();
        simpleIndexQueryParserTests75.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests59, (java.lang.Object) simpleIndexQueryParserTests75);
        org.apache.lucene.index.IndexReader indexReader81 = null;
        org.apache.lucene.index.Terms terms82 = null;
        org.apache.lucene.index.Terms terms83 = null;
        simpleIndexQueryParserTests59.assertTermsEquals("europarl.lines.txt.gz", indexReader81, terms82, terms83, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests59);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.nightly", indexReader5, terms6, terms7, false);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        int[] intArray5 = new int[] { (byte) 100, (byte) 100, 5, (byte) -1 };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray5, intArray6);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
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
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.maxfailures");
        java.lang.String[] strArray56 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "");
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "node_s_0");
        org.junit.Assert.assertNotNull((java.lang.Object) fields62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields51, fields62);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests29.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain34;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService39);
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader42, (int) '#', postingsEnum44, postingsEnum45);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        double[] doubleArray55 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray60 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray55, doubleArray60, (double) (short) 10);
        double[] doubleArray68 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray73 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray68, doubleArray73, (double) (short) 10);
        double[] doubleArray81 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray86 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray81, doubleArray86, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray81, 0.0d);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", doubleArray60, doubleArray68, (double) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) ruleChain48, (java.lang.Object) doubleArray68);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
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
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = null;
        simpleIndexQueryParserTests24.queryParser = indexQueryParserService26;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests30.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests30.queryParser;
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("europarl.lines.txt.gz", indexReader35, terms36, terms37, true);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "enwiki.random.lines.txt");
        java.lang.String[] strArray52 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests30.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields47, fields54);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef58 = simpleIndexQueryParserTests56.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests59.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain61 = simpleIndexQueryParserTests59.failureAndSuccessEvents;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain61;
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain61;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain61;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain61;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService66 = simpleIndexQueryParserTests24.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests67.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = null;
        simpleIndexQueryParserTests67.queryParser = indexQueryParserService69;
        org.apache.lucene.index.IndexReader indexReader72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        org.apache.lucene.index.Terms terms74 = null;
        simpleIndexQueryParserTests67.assertTermsEquals("", indexReader72, terms73, terms74, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService77 = simpleIndexQueryParserTests67.queryParser();
        simpleIndexQueryParserTests67.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests67.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain80 = simpleIndexQueryParserTests67.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain80;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain80;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader85, 0, postingsEnum87, postingsEnum88, false);
        org.apache.lucene.index.NumericDocValues numericDocValues93 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("random", 0, numericDocValues93, numericDocValues94);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) str4);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setUp();
        java.lang.Object obj53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, obj53);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
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
        org.junit.rules.TestRule testRule33 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService34;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader37, (int) '4', postingsEnum39, postingsEnum40, false);
        org.apache.lucene.index.IndexReader indexReader44 = null;
        java.lang.String[] strArray49 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.failfast");
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.weekly");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader44, fields53, fields58, false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", (java.lang.Object) indexQueryParserService4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray4 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray4);
        short[] shortArray9 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray11, shortArray14);
        short[] shortArray20 = new short[] { (short) 100 };
        short[] shortArray22 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray20, shortArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray14, shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray14);
        short[] shortArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray26);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0.0d, (double) (byte) 100);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        org.junit.Assert.assertArrayEquals(objArray4, objArray9);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        org.junit.Assert.assertArrayEquals(objArray21, objArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray16, objArray21);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        org.junit.Assert.assertArrayEquals(objArray39, objArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray34, objArray39);
        org.junit.Assert.assertEquals(objArray21, objArray34);
        org.junit.Assert.assertEquals(objArray4, objArray21);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray21, (java.lang.Object[]) strArray54);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (long) 2, (long) (-1));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests6.queryParser();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        int[] intArray4 = new int[] { (byte) -1, 0, '4', (short) 100 };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
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
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.weekly");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "random");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.nightly");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "");
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader19, fields26, fields31, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests34.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests34.queryParser;
        simpleIndexQueryParserTests34.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests34.indexedValueForSearch(100L);
        simpleIndexQueryParserTests34.ensureCheckIndexPassed();
        simpleIndexQueryParserTests34.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) true, (java.lang.Object) simpleIndexQueryParserTests34);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray2 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1 };
        org.apache.lucene.search.QueryCachingPolicy[][] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[][] { queryCachingPolicyArray2 };
        java.util.Set<org.apache.lucene.search.QueryCachingPolicy[]> queryCachingPolicyArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(queryCachingPolicyArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "<unknown>");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) queryCachingPolicyArray3, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        int[] intArray1 = null;
        int[] intArray3 = new int[] { (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", intArray1, intArray3);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 100L);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
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
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader3, (int) (byte) 100, postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader10, 1, postingsEnum12, postingsEnum13, false);
        java.lang.String str16 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain51 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain51;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) 1L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests18, (java.lang.Object) floatArray57);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("random", indexReader62, 6, postingsEnum64, postingsEnum65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum64);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1), (double) 0, (double) (byte) -1);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader7, fields15, fields24, false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 1, 0L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        int[] intArray4 = new int[] { 'a', (short) -1, 100, (short) 1 };
        int[] intArray10 = new int[] { (short) -1, (byte) 100, 5, 3, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0.0f, (double) 100);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.weekly");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray19, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray16, (java.lang.Object[]) executorServiceArray19);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) executorServiceArray16);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
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
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 10, 0);
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        int[] intArray6 = new int[] { '4', (byte) 10, (byte) 0, (byte) 0, 2 };
        int[] intArray10 = new int[] { '#', 1, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray6, intArray10);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService14;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "node_s_0");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.weekly");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.failfast");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader17, fields32, fields41, true);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        int[] intArray3 = new int[] { 3, '4' };
        int[] intArray8 = new int[] { 10, ' ', (byte) -1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray3, intArray8);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests8.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests8.assertPositionsSkippingEquals("tests.monster", indexReader14, 10, postingsEnum16, postingsEnum17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests8.queryParser();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "<unknown>");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "");
        java.lang.String[] strArray33 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.weekly");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.weekly", indexReader21, fields32, fields37, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader6, fields7, fields32, true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.RuleChain ruleChain46 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain46;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum49, postingsEnum50);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
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
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = null;
        simpleIndexQueryParserTests9.queryParser = indexQueryParserService48;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "tests.failfast", (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        short[] shortArray3 = new short[] { (short) 100 };
        short[] shortArray5 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray10 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray5, shortArray8);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray14, shortArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray8, shortArray16);
        short[] shortArray25 = new short[] { (short) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray8, shortArray25);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) '#', (double) 100, (double) 6);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 5);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
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
        java.lang.String[] strArray87 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields91 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "hi!");
        org.apache.lucene.index.Fields fields93 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", objArray66, (java.lang.Object[]) strArray87);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray4, charArray12);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray16, charArray24);
        org.junit.Assert.assertArrayEquals("", charArray12, charArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", charArray1, charArray16);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0.0d, 0.0d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService23;
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) -1);
        java.lang.String str27 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule28);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests16.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain21;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests16.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) indexQueryParserService14, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef56 = simpleIndexQueryParserTests54.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests54.queryParser;
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests54.assertTermsEquals("europarl.lines.txt.gz", indexReader59, terms60, terms61, true);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "enwiki.random.lines.txt");
        java.lang.String[] strArray76 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests54.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields71, fields78);
        org.apache.lucene.util.BytesRef bytesRef82 = simpleIndexQueryParserTests54.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef84 = simpleIndexQueryParserTests54.indexedValueForSearch((long) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService85 = simpleIndexQueryParserTests54.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService85);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 0, (double) 0.0f);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        long[] longArray2 = new long[] { 1 };
        long[] longArray4 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { 1 };
        long[] longArray9 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        long[] longArray12 = new long[] { 1 };
        long[] longArray14 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray12, longArray14);
        org.junit.Assert.assertArrayEquals(longArray9, longArray12);
        org.junit.Assert.assertArrayEquals(longArray4, longArray9);
        long[] longArray20 = new long[] { 100L, 3 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray9, longArray20);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 1, (long) (byte) 100);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1L, 100.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet4 = org.apache.lucene.util.LuceneTestCase.asSet(objArray3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet9 = org.apache.lucene.util.LuceneTestCase.asSet(objArray8);
        java.util.Set[] setArray11 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[] objSetArray12 = (java.util.Set<java.lang.Object>[]) setArray11;
        objSetArray12[0] = objSet4;
        objSetArray12[1] = objSet9;
        java.util.Set<java.util.Set<java.lang.Object>> objSetSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objSetArray12);
        org.junit.Assert.assertNotNull((java.lang.Object) objSetArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str21 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str22 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str23 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str24 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str25 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str26 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str27 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str28 = mockMoreLikeThisFetchService20.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str30 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str31 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str32 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str33 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str34 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str35 = mockMoreLikeThisFetchService29.nodeName();
        java.lang.String str36 = mockMoreLikeThisFetchService29.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str38 = mockMoreLikeThisFetchService37.nodeName();
        java.lang.String str39 = mockMoreLikeThisFetchService37.nodeName();
        java.lang.String str40 = mockMoreLikeThisFetchService37.nodeName();
        java.lang.String str41 = mockMoreLikeThisFetchService37.nodeName();
        java.lang.String str42 = mockMoreLikeThisFetchService37.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str44 = mockMoreLikeThisFetchService43.nodeName();
        java.lang.String str45 = mockMoreLikeThisFetchService43.nodeName();
        java.lang.String str46 = mockMoreLikeThisFetchService43.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str48 = mockMoreLikeThisFetchService47.nodeName();
        java.lang.String str49 = mockMoreLikeThisFetchService47.nodeName();
        java.lang.String str50 = mockMoreLikeThisFetchService47.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] mockMoreLikeThisFetchServiceArray51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService[] { mockMoreLikeThisFetchService20, mockMoreLikeThisFetchService29, mockMoreLikeThisFetchService37, mockMoreLikeThisFetchService43, mockMoreLikeThisFetchService47 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService> mockMoreLikeThisFetchServiceList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, mockMoreLikeThisFetchServiceArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) objSetArray12, (java.lang.Object[]) mockMoreLikeThisFetchServiceArray51);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.Object[] objArray6 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet(objArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet12 = org.apache.lucene.util.LuceneTestCase.asSet(objArray11);
        java.util.Set[] setArray14 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[] objSetArray15 = (java.util.Set<java.lang.Object>[]) setArray14;
        objSetArray15[0] = objSet7;
        objSetArray15[1] = objSet12;
        java.util.Set[][] setArray21 = new java.util.Set[1][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[][] objSetArray22 = (java.util.Set<java.lang.Object>[][]) setArray21;
        objSetArray22[0] = objSetArray15;
        java.util.Set<java.util.Set<java.lang.Object>[]> objSetArraySet25 = org.apache.lucene.util.LuceneTestCase.asSet(objSetArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) objSetArray22);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
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
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray22, charArray33);
        org.junit.Assert.assertArrayEquals(charArray1, charArray22);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray41, charArray45);
        org.junit.Assert.assertArrayEquals(charArray38, charArray45);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals(charArray38, charArray58);
        org.junit.Assert.assertArrayEquals(charArray1, charArray58);
        java.lang.Object obj63 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray1, obj63);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        int[] intArray4 = new int[] { 5, (byte) 0, (short) 1, (short) 0 };
        int[] intArray10 = new int[] { (byte) -1, (short) 1, 2, (byte) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) 2);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "node_s_0");
        org.junit.Assert.assertNotNull((java.lang.Object) fields11);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray17 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray17);
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray23 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        short[] shortArray26 = new short[] { (short) 100 };
        short[] shortArray28 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray26, shortArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray26);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray17, shortArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) fields11, (java.lang.Object) shortArray26);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader4, 100, postingsEnum6, postingsEnum7);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader10, (int) '#', postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum17, postingsEnum18, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests21.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests21.queryParser;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.slow", indexReader26, (int) '4', postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests31.queryParser;
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests31.assertTermsEquals("europarl.lines.txt.gz", indexReader36, terms37, terms38, true);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "enwiki.random.lines.txt");
        java.lang.String[] strArray53 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests31.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields48, fields55);
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests31.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef61 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum29, (java.lang.Object) bytesRef61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) bytesRef61);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        long[] longArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray13);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1.0f, (double) 6);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
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
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray12, charArray19);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray32, charArray40);
        org.junit.Assert.assertArrayEquals("hi!", charArray29, charArray40);
        org.junit.Assert.assertArrayEquals(charArray12, charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) charArray40);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, 0L);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService23;
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.awaitsfix");
        org.junit.Assert.assertNotNull("", (java.lang.Object) fields30);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.nightly", fields30, fields42);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 100, (long) '#');
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests26.queryParser();
        simpleIndexQueryParserTests26.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests26.queryParser = indexQueryParserService29;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests26.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray3);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 0L, (long) ' ');
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        double[][][] doubleArray3 = new double[][][] {};
        double[][][] doubleArray4 = new double[][][] {};
        double[][][] doubleArray5 = new double[][][] {};
        double[][][][] doubleArray6 = new double[][][][] { doubleArray3, doubleArray4, doubleArray5 };
        java.util.Set<double[][][]> doubleArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray6);
        java.util.List<java.lang.Object[][]> objArrayList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Object[][][]) doubleArray6);
        java.util.List<double[][][]> doubleArrayList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, doubleArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.lang.String[] strArray14 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.weekly");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) strArray14);
        org.junit.Assert.assertEquals(objArray11, (java.lang.Object[]) executorServiceArray12);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.weekly");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "random");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray11, (java.lang.Object[]) strArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) doubleArray6, (java.lang.Object[]) strArray21);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus15 = simpleIndexQueryParserTests0.ensureGreen(strArray8);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "tests.awaitsfix");
        java.lang.String[] strArray9 = new java.lang.String[] { "node_s_0", "tests.weekly", "node_s_0", "" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "random");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) strArray2, (java.lang.Object[]) strArray9);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) (short) 100, (long) (short) 1);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
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
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.weekly");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray17, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray14, (java.lang.Object[]) executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) elasticsearchSingleNodeTestArray12, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        int[] intArray1 = null;
        int[] intArray6 = new int[] { ' ', 4, 2, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray1, intArray6);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0.0d, (double) '#');
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.slow", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests31.longToPrefixCoded((long) 'a', (int) (short) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests31.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = null;
        simpleIndexQueryParserTests31.setqueryParser(indexQueryParserService37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests39.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain44;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = simpleIndexQueryParserTests39.queryParser;
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests39.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader48, (-1), postingsEnum50, postingsEnum51, false);
        simpleIndexQueryParserTests39.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests55.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests55.getqueryParser();
        simpleIndexQueryParserTests55.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests39, (java.lang.Object) simpleIndexQueryParserTests55);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests39.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader61, (int) 'a', postingsEnum63, postingsEnum64, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = null;
        simpleIndexQueryParserTests39.setqueryParser(indexQueryParserService67);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests31, (java.lang.Object) simpleIndexQueryParserTests39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests39);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermQueryBuilder();
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryQueryBuilder();
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) ' ', (double) (short) 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        int[] intArray4 = new int[] { (short) -1, 2, (short) 100, '#' };
        int[] intArray6 = new int[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray4, intArray6);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        int[] intArray2 = new int[] { (short) -1, (byte) -1 };
        int[] intArray7 = new int[] { (short) 1, (short) -1, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 100.0f, (double) (short) 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        int[] intArray5 = new int[] { (-1), ' ', (short) 1, (short) 1 };
        int[] intArray8 = new int[] { (byte) -1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray5, intArray8);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService10);
        org.junit.rules.TestRule testRule12 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.slow", indexReader19, (int) '4', postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests25.queryParser;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests25.assertPositionsSkippingEquals("tests.slow", indexReader30, 100, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests37.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = simpleIndexQueryParserTests37.queryParser;
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        simpleIndexQueryParserTests37.assertTermsEquals("europarl.lines.txt.gz", indexReader42, terms43, terms44, true);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "enwiki.random.lines.txt");
        java.lang.String[] strArray59 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests37.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields54, fields61);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests63 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef65 = simpleIndexQueryParserTests63.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests66 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests66.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain68 = simpleIndexQueryParserTests66.failureAndSuccessEvents;
        simpleIndexQueryParserTests63.failureAndSuccessEvents = ruleChain68;
        simpleIndexQueryParserTests37.failureAndSuccessEvents = ruleChain68;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain68;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain68;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain68;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService74 = null;
        simpleIndexQueryParserTests14.setqueryParser(indexQueryParserService74);
        org.apache.lucene.index.IndexReader indexReader77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("tests.weekly", indexReader77, (int) ' ', postingsEnum79, postingsEnum80, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ' ');
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService10;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) '4');
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        double[][][] doubleArray1 = new double[][][] {};
        double[][][] doubleArray2 = new double[][][] {};
        double[][][] doubleArray3 = new double[][][] {};
        double[][][][] doubleArray4 = new double[][][][] { doubleArray1, doubleArray2, doubleArray3 };
        java.util.Set<double[][][]> doubleArraySet5 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray4);
        java.lang.String[] strArray12 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) doubleArray4, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, 0.0d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader18, 3, postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests27.assertDocsSkippingEquals("tests.weekly", indexReader29, (int) (byte) 100, postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests27.assertDocsSkippingEquals("tests.weekly", indexReader36, 6, postingsEnum38, postingsEnum39, false);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("tests.maxfailures", postingsEnum43, postingsEnum44, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests27.queryParser = indexQueryParserService47;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("hi!", postingsEnum50, postingsEnum51, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray1 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray2 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray3 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray4 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray5 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray1, elasticsearchTestCaseArray2, elasticsearchTestCaseArray3, elasticsearchTestCaseArray4 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) elasticsearchTestCaseArray5);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray2, "");
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray2, (java.lang.Object[]) executorServiceArray6);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.weekly");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
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
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray13, (java.lang.Object[]) executorServiceArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray13);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        java.lang.Object[] objArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray3, objArray8);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
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
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        double[][][] doubleArray0 = new double[][][] {};
        double[][][] doubleArray1 = new double[][][] {};
        double[][][] doubleArray2 = new double[][][] {};
        double[][][][] doubleArray3 = new double[][][][] { doubleArray0, doubleArray1, doubleArray2 };
        java.util.Set<double[][][]> doubleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray3);
        double[] doubleArray11 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray18 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray25 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray32 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray39 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray46 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray47 = new double[][] { doubleArray11, doubleArray18, doubleArray25, doubleArray32, doubleArray39, doubleArray46 };
        double[][][] doubleArray48 = new double[][][] { doubleArray47 };
        java.util.Set<double[][]> doubleArraySet49 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray48);
        double[] doubleArray56 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray63 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray70 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray77 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray84 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray91 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray92 = new double[][] { doubleArray56, doubleArray63, doubleArray70, doubleArray77, doubleArray84, doubleArray91 };
        double[][][] doubleArray93 = new double[][][] { doubleArray92 };
        java.util.Set<double[][]> doubleArraySet94 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray93);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray48, (java.lang.Object[]) doubleArray93);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray3, (java.lang.Object[]) doubleArray48);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryQueryBuilder();
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        long[] longArray2 = new long[] { 1 };
        long[] longArray4 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray2, longArray4);
        long[] longArray7 = new long[] { 1 };
        long[] longArray9 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray7, longArray9);
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
        long[] longArray17 = new long[] { (byte) 0, 4, (byte) 10, (short) 10, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray4, longArray17);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
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
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests19.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef59 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (short) 1);
        simpleIndexQueryParserTests19.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.weekly");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray3);
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "node_s_0");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.weekly");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "node_s_0");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.weekly");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        org.junit.Assert.assertNotNull((java.lang.Object) strArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) strArray3, (java.lang.Object[]) strArray19);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 10.0d, (double) (-1), (double) 1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(10);
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule4;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule4);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 4);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("<unknown>", indexReader7, (int) (byte) 10, postingsEnum9, postingsEnum10, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService13;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain20;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests15.getqueryParser();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) indexQueryParserService13, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain46;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain46;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef51 = simpleIndexQueryParserTests49.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests49.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = null;
        simpleIndexQueryParserTests49.queryParser = indexQueryParserService57;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests49);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("", (int) (byte) 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "node_s_0");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.weekly");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.failfast");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain2, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        java.lang.String[] strArray7 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "<unknown>");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.badapples");
        java.util.Set<java.lang.CharSequence> charSequenceSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.CharSequence[]) strArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) strArray7);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) throttlingArray26);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        java.lang.Object obj1 = null;
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray4, charArray12);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray17, charArray18);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals(charArray17, charArray21);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray17, charArray25);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals(charArray28, charArray32);
        org.junit.Assert.assertArrayEquals(charArray25, charArray28);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray25, charArray36);
        org.junit.Assert.assertArrayEquals(charArray4, charArray25);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray46, charArray54);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray58, charArray62);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        org.junit.Assert.assertArrayEquals("node_s_0", charArray58, charArray66);
        org.junit.Assert.assertArrayEquals("", charArray54, charArray58);
        org.junit.Assert.assertArrayEquals(charArray41, charArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", obj1, (java.lang.Object) charArray4);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 0.0d, (double) 1.0f);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests2.getqueryParser();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testSpanNearQueryBuilder();
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum2, postingsEnum3, true);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum7, postingsEnum8, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        double[] doubleArray5 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray10 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray10, (double) (short) 10);
        double[] doubleArray18 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray23 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray18, doubleArray23, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray18, 0.0d);
        double[] doubleArray28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray28, (double) 1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        int[] intArray5 = new int[] { (short) 0, (short) -1, 4, (short) 10, '#' };
        int[] intArray6 = new int[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        byte[] byteArray1 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray7, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray7);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray17, byteArray20);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", byteArray20, byteArray23);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray1, byteArray2);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 1.0f, (double) 100L);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) 5);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests42.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService45 = simpleIndexQueryParserTests42.queryParser;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.slow", indexReader47, 100, postingsEnum49, postingsEnum50);
        simpleIndexQueryParserTests42.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests42);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
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
        java.lang.String str24 = simpleIndexQueryParserTests2.getTestName();
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str24, (java.lang.Object) fields49);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader3, terms4, terms5, true);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", 0, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
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
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "hi!");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray30);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) -1);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        long[] longArray1 = new long[] { 1 };
        long[] longArray3 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray1, longArray3);
        long[] longArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray5);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) ' ', (double) (-1));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet6 = org.apache.lucene.util.LuceneTestCase.asSet(objArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) 0.0d, (java.lang.Object) objArray5);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService11;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 100L, 0.0d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("tests.nightly");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 0, (double) 1L);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray6);
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.weekly");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray6, (java.lang.Object[]) strArray8);
        org.junit.Assert.assertEquals(objArray5, (java.lang.Object[]) executorServiceArray6);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.weekly");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "random");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray5, (java.lang.Object[]) strArray15);
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "random");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus25 = simpleIndexQueryParserTests0.ensureGreen(strArray15);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
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
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests11.longToPrefixCoded((long) 10, (int) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef41 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum9, (java.lang.Object) bytesRef41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain46 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests44, (java.lang.Object) 10.0f);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = null;
        simpleIndexQueryParserTests44.queryParser = indexQueryParserService50;
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        simpleIndexQueryParserTests44.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) postingsEnum9, (java.lang.Object) simpleIndexQueryParserTests44);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (-1), (double) '#', (double) 10);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (short) 1, (double) 0L);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("tests.monster", postingsEnum17, postingsEnum18, true);
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) elasticsearchSingleNodeTestArray13, (java.lang.Object) simpleIndexQueryParserTests15);
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) elasticsearchSingleNodeTestArray13, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain6;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain14;
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) ruleChain6, (java.lang.Object) simpleIndexQueryParserTests9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests9.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "<unknown>");
        double[][][] doubleArray9 = new double[][][] {};
        double[][][] doubleArray10 = new double[][][] {};
        double[][][] doubleArray11 = new double[][][] {};
        double[][][][] doubleArray12 = new double[][][][] { doubleArray9, doubleArray10, doubleArray11 };
        java.util.Set<double[][][]> doubleArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) doubleArray12);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        double[] doubleArray5 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray10 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray5, doubleArray10, (double) (short) 10);
        double[] doubleArray18 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray23 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray18, doubleArray23, (double) (short) 10);
        double[] doubleArray31 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray36 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray31, doubleArray36, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray31, 0.0d);
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray18, (double) 100.0f);
        double[] doubleArray49 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray54 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray49, doubleArray54, (double) (short) 10);
        double[] doubleArray62 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray67 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray62, doubleArray67, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray49, doubleArray67, (double) '#');
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray67, 0.0d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 100, (long) 10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
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
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray40 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray40);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.weekly");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray40, (java.lang.Object[]) strArray42);
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "node_s_0");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.weekly");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.awaitsfix");
        java.lang.String[] strArray58 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "hi!");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.failfast");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.nightly");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader39, fields53, fields68, true);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, (int) '4', postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests11.queryParser;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests11.assertPositionsSkippingEquals("tests.slow", indexReader16, 100, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests23.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests23.queryParser;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests23.assertTermsEquals("europarl.lines.txt.gz", indexReader28, terms29, terms30, true);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "enwiki.random.lines.txt");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests23.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields40, fields47);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef51 = simpleIndexQueryParserTests49.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain54;
        org.junit.rules.RuleChain ruleChain60 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, 0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.queryParser;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("europarl.lines.txt.gz", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("tests.failfast", indexReader21, 4, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("hi!", indexReader27, terms28, terms29, false);
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests10.longToPrefixCoded((long) (short) 10, 2);
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests10.assertDocsSkippingEquals("hi!", indexReader39, (int) (byte) 0, postingsEnum41, postingsEnum42, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0, (java.lang.Object) true);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.monster", false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.nightly", (int) (short) -1, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 0);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule21);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
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
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum43, postingsEnum44, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests47.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        simpleIndexQueryParserTests47.failureAndSuccessEvents = ruleChain52;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests47.queryParser;
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests47.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader56, (-1), postingsEnum58, postingsEnum59, false);
        simpleIndexQueryParserTests47.ensureCleanedUp();
        org.apache.lucene.util.BytesRef bytesRef65 = simpleIndexQueryParserTests47.longToPrefixCoded(0L, 10);
        org.junit.rules.TestRule testRule66 = simpleIndexQueryParserTests47.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) testRule66);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) ' ', (long) 0);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests4.setqueryParser(indexQueryParserService12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) executorServiceArray1, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain6;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService9;
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) 10);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests1.longToPrefixCoded(1L, (int) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setIndexWriterMaxDocs(10);
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests16.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests23.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests23.queryParser;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests23.assertTermsEquals("europarl.lines.txt.gz", indexReader28, terms29, terms30, true);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "enwiki.random.lines.txt");
        java.lang.String[] strArray45 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests23.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields40, fields47);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef51 = simpleIndexQueryParserTests49.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests52.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests52.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = null;
        simpleIndexQueryParserTests21.setqueryParser(indexQueryParserService59);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.maxfailures", indexReader62, (int) '#', postingsEnum64, postingsEnum65);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = null;
        simpleIndexQueryParserTests21.queryParser = indexQueryParserService67;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests21.getqueryParser();
        org.elasticsearch.test.ElasticsearchSingleNodeTest[] elasticsearchSingleNodeTestArray70 = new org.elasticsearch.test.ElasticsearchSingleNodeTest[] { simpleIndexQueryParserTests16, simpleIndexQueryParserTests21 };
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet71 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchSingleNodeTestArray70);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet72 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) elasticsearchSingleNodeTestArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) 1L, (java.lang.Object) elasticsearchTestCaseSet72);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        float[] floatArray6 = new float[] { (short) 0, 6, (-1L), (-1.0f), (byte) 10, (byte) 0 };
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray8, (float) 1L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) '#');
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray15, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        org.junit.Assert.assertArrayEquals(charArray26, charArray30);
        org.junit.Assert.assertArrayEquals(charArray23, charArray26);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray23, charArray34);
        org.junit.Assert.assertArrayEquals(charArray2, charArray23);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray39, charArray40);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray44, charArray52);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray56, charArray64);
        org.junit.Assert.assertArrayEquals("", charArray52, charArray56);
        org.junit.Assert.assertArrayEquals(charArray39, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray39);
        char[] charArray70 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray70);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues78 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", 6, numericDocValues78, numericDocValues79);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', 0.0d, (double) 10.0f);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray4);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.weekly");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "random");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray4, (java.lang.Object[]) strArray6);
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader3, fields13, fields24, false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) 100);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
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
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray35, (double) (short) 10);
        double[] doubleArray50 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray55 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray50, doubleArray55, (double) (short) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", doubleArray35, doubleArray55, 0.0d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
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
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "node_s_0");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.weekly");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader17, fields18, fields31, false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService3;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("random", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) postingsEnum14);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray3 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray3);
        short[] shortArray6 = new short[] { (short) 100 };
        short[] shortArray8 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray8);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.slow", indexReader5, 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.weekly");
        java.lang.String[] strArray25 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "");
        simpleIndexQueryParserTests13.assertFieldsEquals("tests.weekly", indexReader17, fields20, fields29, true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "node_s_0");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "<unknown>");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "random");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields20, fields44);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
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
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader16, (int) (short) 100, postingsEnum18, postingsEnum19);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("random", (int) (short) 0, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues5 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", (int) (byte) 1, numericDocValues5, numericDocValues6);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        int[] intArray2 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("random", intArray4, intArray7);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray2, intArray4);
        int[] intArray15 = new int[] { 6, 1, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray4, intArray15);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded(100L, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
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
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray22, charArray33);
        org.junit.Assert.assertArrayEquals(charArray1, charArray22);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals(charArray41, charArray45);
        org.junit.Assert.assertArrayEquals(charArray38, charArray45);
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
        org.junit.Assert.assertArrayEquals("node_s_0", charArray50, charArray58);
        org.junit.Assert.assertArrayEquals(charArray38, charArray58);
        org.junit.Assert.assertArrayEquals(charArray1, charArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray1);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, (double) (byte) 0, (double) 1.0f);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("random", intArray3, intArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", intArray1, intArray3);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
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
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
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
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
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
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "random");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.nightly");
        org.junit.Assert.assertEquals("tests.weekly", objArray2, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "random");
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests27.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests27.queryParser;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests27.assertTermsEquals("europarl.lines.txt.gz", indexReader32, terms33, terms34, true);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "enwiki.random.lines.txt");
        java.lang.String[] strArray49 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "enwiki.random.lines.txt");
        simpleIndexQueryParserTests27.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields44, fields51);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests53.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain58 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain58;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain58;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = simpleIndexQueryParserTests27.getqueryParser();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) serializableSet26, (java.lang.Object) simpleIndexQueryParserTests27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService64 = simpleIndexQueryParserTests27.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) strArray12, (java.lang.Object) indexQueryParserService64);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 0.0f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 10);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests2.queryParser();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.weekly");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "");
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray46);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.badapples");
        java.lang.String[] strArray56 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.weekly", indexReader38, fields51, fields60, true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
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
        java.lang.Object[] objArray54 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet55 = org.apache.lucene.util.LuceneTestCase.asSet(objArray54);
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray58 = (java.lang.Iterable<java.lang.Object>[]) iterableArray57;
        objIterableArray58[0] = objSet30;
        objIterableArray58[1] = objSet35;
        objIterableArray58[2] = objSet40;
        objIterableArray58[3] = objSet45;
        objIterableArray58[4] = objSet50;
        objIterableArray58[5] = objSet55;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet71 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray58);
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet72 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray17, (java.lang.Object[]) objIterableArray58);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
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
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests53.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain58 = simpleIndexQueryParserTests56.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain58;
        simpleIndexQueryParserTests53.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = null;
        simpleIndexQueryParserTests53.queryParser = indexQueryParserService61;
        org.apache.lucene.util.BytesRef bytesRef64 = simpleIndexQueryParserTests53.indexedValueForSearch((long) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) ruleChain52, (java.lang.Object) (byte) 10);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) (short) 10);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        long[] longArray3 = new long[] { 1 };
        long[] longArray5 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
        long[] longArray8 = new long[] { 1 };
        long[] longArray10 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray8, longArray10);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray5, longArray8);
        long[] longArray13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray5, longArray13);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
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
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 0, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100.0f, (double) 1L);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
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
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray23 = new short[] { (short) 100 };
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray23);
        short[] shortArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray17, shortArray26);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests1.longToPrefixCoded(10L, 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet15 = org.apache.lucene.util.LuceneTestCase.asSet(objArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet20 = org.apache.lucene.util.LuceneTestCase.asSet(objArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet25 = org.apache.lucene.util.LuceneTestCase.asSet(objArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet30 = org.apache.lucene.util.LuceneTestCase.asSet(objArray29);
        java.lang.Iterable[] iterableArray32 = new java.lang.Iterable[6];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray33 = (java.lang.Iterable<java.lang.Object>[]) iterableArray32;
        objIterableArray33[0] = objSet5;
        objIterableArray33[1] = objSet10;
        objIterableArray33[2] = objSet15;
        objIterableArray33[3] = objSet20;
        objIterableArray33[4] = objSet25;
        objIterableArray33[5] = objSet30;
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray33);
        java.util.Set<java.lang.Iterable<java.lang.Object>> objIterableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(objIterableArray33);
        java.util.List<java.lang.Iterable<java.lang.Object>> objIterableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(5, objIterableArray33);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) objIterableArray33, (java.lang.Object[]) strArray53);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
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
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray13 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray8, doubleArray13, (double) (short) 10);
        double[] doubleArray21 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray26 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray21, doubleArray26, (double) (short) 10);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray8, doubleArray26, (double) '#');
        double[] doubleArray36 = new double[] { (short) 1, 5, (short) 10, 0.0f };
        double[] doubleArray41 = new double[] { (-1L), 4, 10, 10.0f };
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray36, doubleArray41, (double) (short) 10);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray36, (double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray1, doubleArray36, (double) (byte) -1);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests10.queryParser = indexQueryParserService12;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("", indexReader15, terms16, terms17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("random", indexReader21, (int) (byte) 100, postingsEnum23, postingsEnum24);
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests10.assertDocsSkippingEquals("", indexReader27, (int) (short) 0, postingsEnum29, postingsEnum30, false);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests36.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = simpleIndexQueryParserTests36.queryParser;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("tests.slow", indexReader41, (int) '4', postingsEnum43, postingsEnum44);
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests36, (java.lang.Object) "<unknown>");
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests36.setIndexWriterMaxDocs(2);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.weekly");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.weekly");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.monster", indexReader53, fields58, fields63, true);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests75.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests75.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService78 = simpleIndexQueryParserTests75.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService79 = simpleIndexQueryParserTests75.queryParser;
        simpleIndexQueryParserTests75.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef83 = simpleIndexQueryParserTests75.longToPrefixCoded(1L, 4);
        org.junit.Assert.assertNotSame((java.lang.Object) fields74, (java.lang.Object) bytesRef83);
        simpleIndexQueryParserTests10.assertFieldsEquals("<unknown>", indexReader34, fields63, fields74, false);
        java.lang.String[] strArray88 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields92 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "");
        org.apache.lucene.index.Fields fields94 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray88, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields63, fields94);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.slow", indexReader7, (int) '4', postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) "<unknown>");
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests2.indexedValueForSearch((long) 3);
        java.lang.String str18 = simpleIndexQueryParserTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) indexQueryParserService23);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
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
        java.lang.Object[] objArray45 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet46 = org.apache.lucene.util.LuceneTestCase.asSet(objArray45);
        java.lang.Class<?> wildcardClass47 = objArray45.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) wildcardClass47);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) 10);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.Object obj7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) testRule6, obj7);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 1, 10.0d, (double) 1L);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
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
        org.junit.rules.TestRule testRule76 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef79 = simpleIndexQueryParserTests77.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests77);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        java.util.Set[] setArray12 = new java.util.Set[2];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.Object>[] objSetArray13 = (java.util.Set<java.lang.Object>[]) setArray12;
        objSetArray13[0] = objSet5;
        objSetArray13[1] = objSet10;
        java.util.Set<java.util.Set<java.lang.Object>> objSetSet18 = org.apache.lucene.util.LuceneTestCase.asSet(objSetArray13);
        java.util.Set<java.util.Collection<java.lang.Object>> objCollectionSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.lang.Object>[]) objSetArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) objCollectionSet19);
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) objCollectionSet19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests22.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests22.queryParser;
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("europarl.lines.txt.gz", indexReader27, terms28, terms29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.failfast", indexReader33, 4, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("tests.monster", indexReader39, 1, postingsEnum41, postingsEnum42);
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests22.indexedValueForSearch((long) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.failfast", (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
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
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray21 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray20, throttlingArray21, throttlingArray22, throttlingArray23 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArrayList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, throttlingArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 4);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.slow", indexReader6, (int) '4', postingsEnum8, postingsEnum9);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader13, terms14, terms15, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
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
        org.junit.rules.TestRule testRule33 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader36, terms37, terms38, true);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum42, postingsEnum43, true);
        org.apache.lucene.index.IndexReader indexReader47 = null;
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "node_s_0");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.maxfailures");
        java.lang.String[] strArray63 = new java.lang.String[] { "node_s_0", "tests.weekly", "node_s_0", "" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("", indexReader47, fields58, fields65, false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 0L);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
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
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader17, (int) 'a', postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader24, (int) (short) 1, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) indexQueryParserService29, (java.lang.Object) mockMoreLikeThisFetchService30);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader35, 100, postingsEnum37, postingsEnum38);
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 1, 4);
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
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
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) '#', numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        java.lang.String[] strArray6 = new java.lang.String[] { "europarl.lines.txt.gz", "hi!", "node_s_0", "tests.failfast", "europarl.lines.txt.gz", "tests.failfast" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "<unknown>");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "");
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) executorServiceArray12);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
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
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests1.queryParser();
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
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests22.assertPositionsSkippingEquals("hi!", indexReader49, 10, postingsEnum51, postingsEnum52);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests22.getqueryParser();
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) (short) 10, (java.lang.Object) simpleIndexQueryParserTests22);
        simpleIndexQueryParserTests22.setUp();
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("random", intArray2, intArray5);
        int[] intArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray5, intArray9);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService32);
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
        simpleIndexQueryParserTests34.ensureCleanedUp();
        simpleIndexQueryParserTests34.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain50 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain50;
        org.apache.lucene.index.IndexReader indexReader53 = null;
        java.lang.String[] strArray59 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = simpleIndexQueryParserTests64.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService68 = simpleIndexQueryParserTests64.queryParser;
        simpleIndexQueryParserTests64.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef72 = simpleIndexQueryParserTests64.longToPrefixCoded(1L, 4);
        org.junit.Assert.assertNotSame((java.lang.Object) fields63, (java.lang.Object) bytesRef72);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) fields63);
        org.apache.lucene.index.Fields fields75 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader53, fields63, fields75, true);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        double[] doubleArray4 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray8 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray12 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray13 = new double[][] { doubleArray4, doubleArray8, doubleArray12 };
        double[] doubleArray17 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray21 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray25 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray26 = new double[][] { doubleArray17, doubleArray21, doubleArray25 };
        double[][][] doubleArray27 = new double[][][] { doubleArray13, doubleArray26 };
        double[] doubleArray31 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray35 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray39 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray40 = new double[][] { doubleArray31, doubleArray35, doubleArray39 };
        double[] doubleArray44 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray48 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray52 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray53 = new double[][] { doubleArray44, doubleArray48, doubleArray52 };
        double[][][] doubleArray54 = new double[][][] { doubleArray40, doubleArray53 };
        double[] doubleArray58 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray62 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray66 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray67 = new double[][] { doubleArray58, doubleArray62, doubleArray66 };
        double[] doubleArray71 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray75 = new double[] { ' ', (-1.0d), 100.0d };
        double[] doubleArray79 = new double[] { ' ', (-1.0d), 100.0d };
        double[][] doubleArray80 = new double[][] { doubleArray71, doubleArray75, doubleArray79 };
        double[][][] doubleArray81 = new double[][][] { doubleArray67, doubleArray80 };
        double[][][][] doubleArray82 = new double[][][][] { doubleArray27, doubleArray54, doubleArray81 };
        java.util.Set<double[][][]> doubleArraySet83 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray82);
        java.lang.String[] strArray86 = new java.lang.String[] { "tests.weekly", "enwiki.random.lines.txt" };
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "");
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "");
        org.apache.lucene.index.Fields fields92 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) doubleArray82, (java.lang.Object[]) strArray86);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
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
        java.lang.Object[] objArray60 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet61 = org.apache.lucene.util.LuceneTestCase.asSet(objArray60);
        org.junit.Assert.assertEquals(objArray28, objArray60);
        double[][][] doubleArray64 = new double[][][] {};
        double[][][] doubleArray65 = new double[][][] {};
        double[][][] doubleArray66 = new double[][][] {};
        double[][][][] doubleArray67 = new double[][][][] { doubleArray64, doubleArray65, doubleArray66 };
        java.util.Set<double[][][]> doubleArraySet68 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray67);
        java.util.List<java.lang.Object[][]> objArrayList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Object[][][]) doubleArray67);
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) objArray60, (java.lang.Object) doubleArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) doubleArray67);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "node_s_0");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.maxfailures");
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray11, (java.lang.Object[]) executorServiceArray14);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
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
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "");
        java.util.Set<java.lang.Comparable<java.lang.String>> strComparableSet9 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Comparable<java.lang.String>[]) strArray4);
        java.lang.Object[] objArray10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, objArray10);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "hi!");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.nightly");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "random");
        double[] doubleArray21 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray28 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray35 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray42 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray49 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[] doubleArray56 = new double[] { (byte) 0, (byte) 1, 10.0f, ' ', (short) -1, 100.0d };
        double[][] doubleArray57 = new double[][] { doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49, doubleArray56 };
        double[][][] doubleArray58 = new double[][][] { doubleArray57 };
        java.util.Set<double[][]> doubleArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) doubleArray58);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        long[] longArray1 = null;
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
        long[] longArray33 = new long[] { 1 };
        long[] longArray35 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray33, longArray35);
        long[] longArray38 = new long[] { 1 };
        long[] longArray40 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray38, longArray40);
        long[] longArray43 = new long[] { 1 };
        long[] longArray45 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray43, longArray45);
        org.junit.Assert.assertArrayEquals(longArray40, longArray43);
        org.junit.Assert.assertArrayEquals(longArray35, longArray40);
        long[] longArray50 = new long[] { 1 };
        long[] longArray52 = new long[] { (byte) 1 };
        org.junit.Assert.assertArrayEquals(longArray50, longArray52);
        org.junit.Assert.assertArrayEquals("hi!", longArray40, longArray52);
        org.junit.Assert.assertArrayEquals(longArray14, longArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray1, longArray40);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
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
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (byte) 0, (double) (short) 1, (double) 0L);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (short) -1);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) charArray25);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 1, (long) 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
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
        org.junit.Assert.assertSame("tests.awaitsfix", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet5 = org.apache.lucene.util.LuceneTestCase.asSet(objArray4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet10 = org.apache.lucene.util.LuceneTestCase.asSet(objArray9);
        org.junit.Assert.assertArrayEquals(objArray4, objArray9);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet17 = org.apache.lucene.util.LuceneTestCase.asSet(objArray16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet22 = org.apache.lucene.util.LuceneTestCase.asSet(objArray21);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet27 = org.apache.lucene.util.LuceneTestCase.asSet(objArray26);
        org.junit.Assert.assertArrayEquals(objArray21, objArray26);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray16, objArray21);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet35 = org.apache.lucene.util.LuceneTestCase.asSet(objArray34);
        java.lang.Object[] objArray39 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet40 = org.apache.lucene.util.LuceneTestCase.asSet(objArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { (short) 0, "", (byte) 1 };
        java.util.Set<java.lang.Object> objSet45 = org.apache.lucene.util.LuceneTestCase.asSet(objArray44);
        org.junit.Assert.assertArrayEquals(objArray39, objArray44);
        org.junit.Assert.assertArrayEquals("tests.monster", objArray34, objArray39);
        org.junit.Assert.assertEquals(objArray21, objArray34);
        org.junit.Assert.assertEquals(objArray4, objArray21);
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", objArray4, objArray50);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        java.lang.String[] strArray1 = new java.lang.String[] { "tests.badapples" };
        org.apache.lucene.index.Fields fields3 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray1, "tests.awaitsfix");
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray1);
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
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("hi!", indexReader32, 10, postingsEnum34, postingsEnum35);
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("tests.maxfailures", indexReader39, 100, postingsEnum41, postingsEnum42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) serializableSet4, (java.lang.Object) 100);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded(100L, (int) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader6, terms7, terms8, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService11;
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.slow", indexReader19, (int) '4', postingsEnum21, postingsEnum22);
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("random", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain32);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.weekly");
        org.apache.lucene.index.Fields fields4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.monster");
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.weekly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray0, (java.lang.Object[]) strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "node_s_0");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "<unknown>");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "random");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "enwiki.random.lines.txt");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "hi!");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.failfast");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.weekly");
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "node_s_0");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.weekly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader52, fields65, fields74, true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray5);
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "");
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray13 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray14 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray15 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[] elasticsearchTestCaseArray16 = new org.elasticsearch.test.ElasticsearchTestCase[] {};
        org.elasticsearch.test.ElasticsearchTestCase[][] elasticsearchTestCaseArray17 = new org.elasticsearch.test.ElasticsearchTestCase[][] { elasticsearchTestCaseArray13, elasticsearchTestCaseArray14, elasticsearchTestCaseArray15, elasticsearchTestCaseArray16 };
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase[]> elasticsearchTestCaseArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(elasticsearchTestCaseArray17);
        java.util.Set<java.lang.Cloneable> cloneableSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) elasticsearchTestCaseArray17);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray5, (java.lang.Object[]) elasticsearchTestCaseArray17);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) (short) 100, (long) (-1));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "enwiki.random.lines.txt", "", "tests.monster" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "enwiki.random.lines.txt");
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[]) strArray5);
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "tests.weekly", "", "europarl.lines.txt.gz" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "node_s_0");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.weekly");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.failfast");
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray17);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService73 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues76 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues77 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", 100, numericDocValues76, numericDocValues77);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests17.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests17.getqueryParser();
        simpleIndexQueryParserTests17.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests17);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests24.queryParser();
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule27 = simpleIndexQueryParserTests24.ruleChain;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests24.queryParser;
        simpleIndexQueryParserTests24.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests24);
    }
}

