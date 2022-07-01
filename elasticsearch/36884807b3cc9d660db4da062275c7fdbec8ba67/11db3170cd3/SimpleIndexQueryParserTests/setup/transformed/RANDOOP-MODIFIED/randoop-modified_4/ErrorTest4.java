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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        dummyQuery0.isFilter = false;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.search.Query query11 = dummyQuery0.rewrite(indexReader10);
        org.apache.lucene.search.Query query12 = dummyQuery0.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests26);
        simpleIndexQueryParserTests26.ensureCheckIndexPassed();
        simpleIndexQueryParserTests26.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests26.queryParser;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests26.assertPositionsSkippingEquals("tests.awaitsfix", indexReader32, 1, postingsEnum34, postingsEnum35);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests26.assertDocsEnumEquals("tests.weekly", postingsEnum38, postingsEnum39, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests26.setqueryParser(indexQueryParserService42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests44);
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.maxfailures");
        simpleIndexQueryParserTests44.assertFieldStatisticsEquals("random", fields52, fields60);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService62 = null;
        simpleIndexQueryParserTests44.setqueryParser(indexQueryParserService62);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService64 = simpleIndexQueryParserTests44.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests65.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef68 = simpleIndexQueryParserTests65.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain70 = simpleIndexQueryParserTests69.failureAndSuccessEvents;
        simpleIndexQueryParserTests65.failureAndSuccessEvents = ruleChain70;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain70;
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        java.lang.String str74 = simpleIndexQueryParserTests44.getTestName();
        org.apache.lucene.util.BytesRef bytesRef76 = simpleIndexQueryParserTests44.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests77);
        org.junit.rules.RuleChain ruleChain79 = simpleIndexQueryParserTests77.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService80 = null;
        simpleIndexQueryParserTests77.queryParser = indexQueryParserService80;
        simpleIndexQueryParserTests77.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService83 = null;
        simpleIndexQueryParserTests77.queryParser = indexQueryParserService83;
        org.junit.rules.RuleChain ruleChain85 = simpleIndexQueryParserTests77.failureAndSuccessEvents;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain85;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain85;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.getisFilter();
        dummyQuery1.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) dummyQuery1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService24;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean27 = dummyQuery26.isFilter;
        org.apache.lucene.search.Query query28 = dummyQuery26.clone();
        dummyQuery26.isFilter = false;
        dummyQuery26.isFilter = false;
        dummyQuery26.setBoost((float) 1L);
        dummyQuery26.isFilter = false;
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.search.Query query38 = dummyQuery26.rewrite(indexReader37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService24, (java.lang.Object) dummyQuery26);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 0L, (double) (short) 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader4, terms5, terms6, false);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum10, postingsEnum11);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain5;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("random", postingsEnum11, postingsEnum12, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests8.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain5, (java.lang.Object) simpleIndexQueryParserTests8);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader7, terms8, terms9, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        org.elasticsearch.index.query.BaseQueryBuilder[][] baseQueryBuilderArray0 = new org.elasticsearch.index.query.BaseQueryBuilder[][] {};
        org.elasticsearch.index.query.BaseQueryBuilder[][][] baseQueryBuilderArray1 = new org.elasticsearch.index.query.BaseQueryBuilder[][][] { baseQueryBuilderArray0 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder[][]> baseQueryBuilderArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.nightly");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseQueryBuilderArray1, (java.lang.Object[]) strArray14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray15 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray9, doubleArray15, (double) 100L);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray30 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray24, doubleArray30, (double) 100L);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray45 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray39, doubleArray45, (double) 100L);
        double[] doubleArray54 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray60 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray54, doubleArray60, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray54, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray39, 100.0d);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray15, doubleArray24, (double) (short) 100);
        double[] doubleArray75 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray81 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray75, doubleArray81, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray75, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", doubleArray1, doubleArray75, (double) 100.0f);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        long[] longArray2 = new long[] { 10, 10 };
        long[] longArray6 = new long[] { 10L, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        short[][] shortArray2 = new short[][] {};
        java.util.List<short[]> shortArrayList3 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, shortArray2);
        java.util.Set<java.lang.Cloneable> cloneableSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests5);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.maxfailures");
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("random", fields13, fields21);
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = null;
        simpleIndexQueryParserTests5.queryParser = indexQueryParserService25;
        java.lang.Class<?> wildcardClass27 = simpleIndexQueryParserTests5.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean29 = dummyQuery28.getisFilter();
        java.lang.String str31 = dummyQuery28.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        simpleIndexQueryParserTests32.ensureCheckIndexPassed();
        simpleIndexQueryParserTests32.setUp();
        org.junit.rules.RuleChain ruleChain36 = null;
        simpleIndexQueryParserTests32.failureAndSuccessEvents = ruleChain36;
        boolean boolean38 = dummyQuery28.equals((java.lang.Object) simpleIndexQueryParserTests32);
        simpleIndexQueryParserTests32.overrideTestDefaultQueryCache();
        java.lang.Class<?> wildcardClass40 = simpleIndexQueryParserTests32.getClass();
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "europarl.lines.txt.gz");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        java.lang.Class<?> wildcardClass56 = strArray52.getClass();
        java.lang.Class[] classArray58 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        wildcardClassArray59[0] = wildcardClass27;
        wildcardClassArray59[1] = wildcardClass40;
        wildcardClassArray59[2] = wildcardClass56;
        java.util.Set<java.lang.Class<?>> wildcardClassSet66 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray59);
        java.util.Set<java.lang.reflect.AnnotatedElement> annotatedElementSet67 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.AnnotatedElement[]) wildcardClassArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) shortArray2, (java.lang.Object[]) wildcardClassArray59);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        float[] floatArray5 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray11 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        float[] floatArray19 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray25 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray25, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray25, (float) (byte) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean31 = dummyQuery30.isFilter;
        org.apache.lucene.search.Query query32 = dummyQuery30.clone();
        boolean boolean33 = dummyQuery30.isFilter;
        org.apache.lucene.search.Query query34 = dummyQuery30.clone();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.search.Query query36 = query34.rewrite(indexReader35);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray25, (java.lang.Object) indexReader35);
        float[] floatArray43 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray49 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray49, (float) 100L);
        float[] floatArray57 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray63 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray57, floatArray63, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray43, floatArray63, (float) (byte) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray43, 0.0f);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) 100.0f);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (byte) -1, 0L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        long[] longArray6 = new long[] { (-1L), (short) 1, 5, 3, (byte) -1, (byte) 0 };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService20);
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests2.longToPrefixCoded((long) (byte) 1, 1);
        java.lang.String str25 = simpleIndexQueryParserTests2.getTestName();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests28);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.maxfailures");
        simpleIndexQueryParserTests28.assertFieldStatisticsEquals("random", fields36, fields44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests28.setqueryParser(indexQueryParserService46);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests28.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests49.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests53.failureAndSuccessEvents;
        simpleIndexQueryParserTests49.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain54;
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        java.lang.String str58 = simpleIndexQueryParserTests28.getTestName();
        org.apache.lucene.util.BytesRef bytesRef60 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        long[] longArray4 = new long[] { 10, '4', 1 };
        long[] longArray10 = new long[] { 0, (short) -1, 1, (short) 100, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray4, longArray10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields31, fields39);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 2);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "europarl.lines.txt.gz");
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray60);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray67);
        java.lang.String[] strArray74 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "tests.monster");
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray74, "europarl.lines.txt.gz");
        java.lang.String[] strArray82 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray74, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) strArray44, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) strArray82);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        short[][] shortArray1 = new short[][] {};
        java.util.List<short[]> shortArrayList2 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, shortArray1);
        java.util.Set<java.lang.Cloneable> cloneableSet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray1);
        short[] shortArray8 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray13 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray18 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray23 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray28 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray33 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[][] shortArray34 = new short[][] { shortArray8, shortArray13, shortArray18, shortArray23, shortArray28, shortArray33 };
        java.util.Set<short[]> shortArraySet35 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray1, (java.lang.Object[]) shortArray34);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', (long) 2);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, true);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests1.longToPrefixCoded((long) ' ', 0);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService16;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "europarl.lines.txt.gz");
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray43, (java.lang.Object[]) strArray51);
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus59 = simpleIndexQueryParserTests0.ensureGreen(strArray13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 5, (double) '4', (double) 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests3.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, (int) (short) 0);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testEmptyBooleanQuery();
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch(0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests12.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests12.getqueryParser();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.nightly", indexReader29, (int) (short) 10, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests35);
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests35.indexedValueForSearch((long) (short) 0);
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests35.longToPrefixCoded((long) '4', (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = simpleIndexQueryParserTests35.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) indexQueryParserService34, (java.lang.Object) simpleIndexQueryParserTests35);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str28 = dummyQuery26.toString("tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) ruleChain25, (java.lang.Object) dummyQuery26);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (short) -1, (long) 3);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.failfast");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "europarl.lines.txt.gz");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray40);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests54 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests54);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.monster");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.maxfailures");
        simpleIndexQueryParserTests54.assertFieldStatisticsEquals("random", fields62, fields70);
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        simpleIndexQueryParserTests54.assertDocsEnumEquals("hi!", postingsEnum73, postingsEnum74, true);
        simpleIndexQueryParserTests54.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader79 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        simpleIndexQueryParserTests54.assertPositionsSkippingEquals("tests.maxfailures", indexReader79, (-1), postingsEnum81, postingsEnum82);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests54.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray21, (java.lang.Object) simpleIndexQueryParserTests54);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        java.lang.String str13 = dummyQuery1.toString("europarl.lines.txt.gz");
        boolean boolean14 = dummyQuery1.getisFilter();
        dummyQuery1.setisFilter(false);
        dummyQuery1.isFilter = true;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) dummyQuery1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        long[] longArray5 = new long[] { 1L, 100, 5, 0L };
        long[] longArray9 = new long[] { (byte) 0, 4, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray9);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0.0d, (double) (byte) -1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10L, (double) (short) -1, (double) 5.0f);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray13 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray13, (double) 100L);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray28 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 100L);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray43 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray37, doubleArray43, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray37, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray22, 100.0d);
        double[] doubleArray56 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray62 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray56, doubleArray62, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray56, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray7, (double) (short) 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling51 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling51, throttling52 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray13, (java.lang.Object[]) throttlingArray53);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService5;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum8, postingsEnum9);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader4, (int) 'a', postingsEnum6, postingsEnum7);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str13 = dummyQuery10.toString("tests.slow");
        java.lang.String str15 = dummyQuery10.toString("random");
        boolean boolean16 = dummyQuery10.getisFilter();
        float float17 = dummyQuery10.getBoost();
        dummyQuery10.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) dummyQuery10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray10);
        org.junit.Assert.assertArrayEquals("random", intArray3, intArray7);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray3, intArray16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests25.assertDocsEnumEquals("DummyQuery", postingsEnum27, postingsEnum28, false);
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain33 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain33;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain33;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests36);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.maxfailures");
        simpleIndexQueryParserTests36.assertFieldStatisticsEquals("random", fields44, fields52);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests36.assertDocsEnumEquals("hi!", postingsEnum55, postingsEnum56, true);
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests25, (java.lang.Object) simpleIndexQueryParserTests36);
        java.lang.String str61 = simpleIndexQueryParserTests25.getTestName();
        org.apache.lucene.util.BytesRef bytesRef64 = simpleIndexQueryParserTests25.longToPrefixCoded((long) (short) 1, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) intArray3, (java.lang.Object) bytesRef64);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean52 = dummyQuery51.isFilter;
        org.apache.lucene.search.Query query53 = dummyQuery51.clone();
        boolean boolean54 = dummyQuery51.isFilter;
        float float55 = dummyQuery51.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray29, (java.lang.Object) float55);
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray62);
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        boolean boolean5 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = true;
        java.lang.String str8 = dummyQuery0.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        java.lang.String str11 = dummyQuery9.toString();
        boolean boolean13 = dummyQuery9.equals((java.lang.Object) 0.0f);
        boolean boolean14 = dummyQuery9.getisFilter();
        dummyQuery9.isFilter = true;
        java.lang.String str17 = dummyQuery9.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str8, (java.lang.Object) dummyQuery9);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        long[] longArray6 = new long[] { 'a', 0L, '4', 100L, ' ' };
        long[] longArray9 = new long[] { 0, (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray6, longArray9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        float float12 = dummyQuery1.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        boolean boolean20 = dummyQuery1.equals((java.lang.Object) ruleChain16);
        java.lang.String str22 = dummyQuery1.toString("");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests23.assertDocsEnumEquals("DummyQuery", postingsEnum25, postingsEnum26, false);
        simpleIndexQueryParserTests23.setUp();
        simpleIndexQueryParserTests23.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests23.assertPositionsSkippingEquals("tests.failfast", indexReader33, (int) (short) 1, postingsEnum35, postingsEnum36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests23.assertDocsEnumEquals("random", postingsEnum39, postingsEnum40, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) "", (java.lang.Object) false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray11, charArray12);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray12, charArray15);
        org.junit.Assert.assertArrayEquals(charArray7, charArray15);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray22, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray26);
        org.junit.Assert.assertArrayEquals(charArray15, charArray26);
        org.junit.Assert.assertArrayEquals(charArray2, charArray15);
        char[] charArray33 = new char[] {};
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray36, charArray37);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray40, charArray41);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray37, charArray40);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray33, charArray37);
        org.junit.Assert.assertArrayEquals(charArray2, charArray37);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray48, charArray49);
        char[] charArray52 = new char[] {};
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray55, charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray56, charArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray52, charArray56);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals(charArray37, charArray52);
        char[] charArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray37, charArray66);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        boolean boolean5 = dummyQuery0.isFilter;
        dummyQuery0.isFilter = true;
        dummyQuery0.setBoost((-1.0f));
        dummyQuery0.isFilter = true;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 0.0d, (double) (byte) 1);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService8);
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService11);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests2.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService13);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        long[] longArray4 = new long[] { (short) 1, 0L, (short) 0, 100 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery2.clone();
        boolean boolean5 = dummyQuery2.isFilter;
        java.lang.String str6 = dummyQuery2.toString();
        boolean boolean7 = dummyQuery0.equals((java.lang.Object) str6);
        boolean boolean8 = dummyQuery0.isFilter;
        boolean boolean9 = dummyQuery0.getisFilter();
        dummyQuery0.setBoost((float) '#');
        float float12 = dummyQuery0.getBoost();
        boolean boolean13 = dummyQuery0.getisFilter();
        org.apache.lucene.search.Query query14 = dummyQuery0.clone();
        org.apache.lucene.search.Query query15 = dummyQuery0.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query15);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.maxfailures");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.awaitsfix");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields14, fields24);
        java.lang.String str26 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader23, 0, postingsEnum25, postingsEnum26);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 100, (int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum5, postingsEnum6, true);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.failfast");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "<unknown>");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields17, fields38);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) "<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests2.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean44 = dummyQuery43.getisFilter();
        java.lang.String str45 = dummyQuery43.toString();
        boolean boolean47 = dummyQuery43.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query48 = dummyQuery43.clone();
        org.apache.lucene.search.Query query49 = query48.clone();
        java.lang.String str50 = query48.toString();
        query48.setBoost(100.0f);
        org.apache.lucene.search.Query query53 = query48.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) query53);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        long[] longArray4 = new long[] { (byte) 10, (short) 1, (byte) 0 };
        long[] longArray8 = new long[] { (short) 100, 3, (byte) 1 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray4, longArray8);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray21, (float) 0L);
        float[] floatArray37 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray43 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray21, floatArray43, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        long[] longArray4 = new long[] { 0L, 1L, (short) 1, 1 };
        long[] longArray8 = new long[] { (byte) 0, 1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray8);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests14.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests17.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.maxfailures");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.awaitsfix");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("tests.monster", fields31, fields41);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.failfast");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "<unknown>");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("tests.awaitsfix", fields41, fields63);
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.maxfailures", fields13, fields63);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef68 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (-1), (double) 35.0f);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 5, 0.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests7.assertDocsEnumEquals("DummyQuery", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests7.setUp();
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests7.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests7.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) str6, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 35.0f, 100.0d, 1.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        long[] longArray1 = new long[] { 0 };
        long[] longArray6 = new long[] { 5, (byte) 100, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader25, (-1), postingsEnum27, postingsEnum28);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService32);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(5);
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) ' ', numericDocValues38, numericDocValues39);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean7 = dummyQuery6.isFilter;
        org.apache.lucene.search.Query query8 = dummyQuery6.clone();
        dummyQuery6.isFilter = false;
        dummyQuery6.isFilter = false;
        dummyQuery6.setBoost((float) 1L);
        dummyQuery6.isFilter = false;
        float float17 = dummyQuery6.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) bytesRef5, (java.lang.Object) float17);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 100L, (long) ' ');
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) postingsEnum13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        double[] doubleArray6 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray12 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray6, doubleArray12, (double) 100L);
        double[] doubleArray21 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray27 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray21, doubleArray27, (double) 100L);
        double[] doubleArray36 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray42 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray36, doubleArray42, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray36, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray21, 100.0d);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray61 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray55, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray55, (double) 10.0f);
        double[] doubleArray72 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray78 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray72, doubleArray78, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray78, (double) ' ');
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray28);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean51 = dummyQuery50.isFilter;
        org.apache.lucene.search.Query query52 = dummyQuery50.clone();
        boolean boolean53 = dummyQuery50.isFilter;
        float float54 = dummyQuery50.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray28, (java.lang.Object) float54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) float54);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("hi!", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests2.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests2.queryParser();
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray31, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray41);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService28, (java.lang.Object) shortArray41);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray47, shortArray51);
        short[] shortArray56 = new short[] {};
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray56, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray47, shortArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray41, shortArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) shortArray41);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        long[] longArray4 = new long[] { 'a', (short) 10, 1L };
        long[] longArray9 = new long[] { 4, (-1), (short) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray4, longArray9);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, (int) (short) 0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 5, (double) 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) strArray4);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (-1.0d), (-1.0d));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        long[] longArray4 = new long[] { (short) 0, 100L, '#' };
        long[] longArray9 = new long[] { 100L, (short) 0, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", longArray4, longArray9);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader23, 5, postingsEnum25, postingsEnum26, true);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService33;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100, (double) 0.0f, (double) 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (long) (byte) 100);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1.0f, (double) 4);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.search.Query query3 = dummyQuery1.rewrite(indexReader2);
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.search.Query query5 = dummyQuery1.rewrite(indexReader4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("DummyQuery", postingsEnum8, postingsEnum9, false);
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests6.ruleChain;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.slow", indexReader17, terms18, terms19, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests6.setqueryParser(indexQueryParserService22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) dummyQuery1, (java.lang.Object) simpleIndexQueryParserTests6);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str2 = dummyQueryBuilder1.toString();
        java.lang.String str3 = dummyQueryBuilder1.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.maxfailures");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("random", fields12, fields20);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests4.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader24, 0, postingsEnum26, postingsEnum27);
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests4.indexedValueForSearch(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) str3, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        short[] shortArray1 = new short[] {};
        short[] shortArray2 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray2);
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray1, shortArray4);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray9, shortArray10);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray9, shortArray13);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray19, shortArray23);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray9, shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray9);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray31, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean41 = dummyQuery40.isFilter;
        org.apache.lucene.search.Query query42 = dummyQuery40.clone();
        boolean boolean43 = dummyQuery40.isFilter;
        float float44 = dummyQuery40.getBoost();
        java.lang.String str45 = dummyQuery40.toString();
        dummyQuery40.setBoost(100.0f);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.search.Query query49 = dummyQuery40.rewrite(indexReader48);
        java.lang.String str50 = dummyQuery40.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray35, (java.lang.Object) dummyQuery40);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        float float4 = dummyQuery0.getBoost();
        java.lang.String str5 = dummyQuery0.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (byte) 0, (double) 100.0f);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (short) 100);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        long[] longArray6 = new long[] { (short) 100, 3, 10L, 'a', 100L, 100L };
        long[] longArray7 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests25.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests28);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests28.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests28.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests28.overrideTestDefaultQueryCache();
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.maxfailures");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.awaitsfix");
        simpleIndexQueryParserTests28.assertFieldStatisticsEquals("tests.monster", fields42, fields52);
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "europarl.lines.txt.gz");
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray65);
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.failfast");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "<unknown>");
        simpleIndexQueryParserTests25.assertFieldStatisticsEquals("tests.awaitsfix", fields52, fields74);
        java.lang.String[] strArray79 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix", "random" };
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "{\n  \"dummy\" : { }\n}");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.weekly", fields74, fields81);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray28);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "");
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean56 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) executorServiceArray52);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "europarl.lines.txt.gz");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray22);
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "europarl.lines.txt.gz");
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray58);
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.failfast");
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "europarl.lines.txt.gz");
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray77);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray50, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray22);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 100.0f);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray6, intArray9);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray6, intArray12);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray21, intArray22);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray19, intArray22);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray19, intArray25);
        org.junit.Assert.assertArrayEquals("DummyQuery", intArray12, intArray19);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray31, intArray32);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        org.junit.Assert.assertArrayEquals("hi!", intArray31, intArray34);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray40, intArray43);
        org.junit.Assert.assertArrayEquals(intArray34, intArray43);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray12, intArray43);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        org.junit.Assert.assertArrayEquals("hi!", intArray49, intArray52);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray58, intArray61);
        org.junit.Assert.assertArrayEquals(intArray52, intArray61);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray43, intArray61);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests66 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService67 = simpleIndexQueryParserTests66.queryParser;
        java.lang.String str68 = simpleIndexQueryParserTests66.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService69 = simpleIndexQueryParserTests66.getqueryParser();
        java.lang.String str70 = simpleIndexQueryParserTests66.getTestName();
        simpleIndexQueryParserTests66.ensureCheckIndexPassed();
        simpleIndexQueryParserTests66.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) "tests.slow", (java.lang.Object) simpleIndexQueryParserTests66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests66.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
        float[] floatArray1 = null;
        float[] floatArray8 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray14 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 100L);
        float[] floatArray23 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray29 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray29, (float) 100L);
        float[] floatArray37 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray43 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray23, floatArray37, (float) 0L);
        org.junit.Assert.assertArrayEquals("random", floatArray8, floatArray37, (float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", floatArray1, floatArray8, (float) ' ');
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("hi!", postingsEnum21, postingsEnum22, true);
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests2.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests2.queryParser();
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray31, shortArray32);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray35, shortArray36);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray31, shortArray35);
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray31, shortArray41);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService28, (java.lang.Object) shortArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.awaitsfix");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("tests.monster", fields17, fields27);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "europarl.lines.txt.gz");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray40);
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.failfast");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "<unknown>");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields27, fields49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests21);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.maxfailures");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("random", fields29, fields37);
        simpleIndexQueryParserTests21.setUp();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = simpleIndexQueryParserTests21.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexQueryParserService43);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 4);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, 1, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests18);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.maxfailures");
        simpleIndexQueryParserTests18.assertFieldStatisticsEquals("random", fields26, fields34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests18.setqueryParser(indexQueryParserService36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests18.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests39.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        java.lang.String str48 = simpleIndexQueryParserTests18.getTestName();
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests18.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests51);
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = null;
        simpleIndexQueryParserTests51.queryParser = indexQueryParserService54;
        simpleIndexQueryParserTests51.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = null;
        simpleIndexQueryParserTests51.queryParser = indexQueryParserService57;
        org.junit.rules.RuleChain ruleChain59 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain59;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.NumericDocValues numericDocValues66 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 5, numericDocValues66, numericDocValues67);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray4, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray8, charArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray5, charArray8);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray14, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray19, charArray20);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray20, charArray23);
        org.junit.Assert.assertArrayEquals(charArray15, charArray23);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray29, charArray30);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray34, charArray35);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray39, charArray40);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray43, charArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray40, charArray43);
        org.junit.Assert.assertArrayEquals(charArray35, charArray43);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray49, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray54, charArray55);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray55, charArray58);
        org.junit.Assert.assertArrayEquals(charArray50, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray35, charArray50);
        org.junit.Assert.assertArrayEquals(charArray30, charArray35);
        org.junit.Assert.assertArrayEquals(charArray23, charArray35);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray67, charArray68);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray72, charArray73);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray76, charArray77);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray73, charArray76);
        org.junit.Assert.assertArrayEquals(charArray68, charArray76);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray82, charArray83);
        org.junit.Assert.assertArrayEquals(charArray76, charArray82);
        org.junit.Assert.assertArrayEquals("tests.monster", charArray23, charArray76);
        org.junit.Assert.assertArrayEquals("hi!", charArray5, charArray76);
        char[] charArray90 = new char[] {};
        char[] charArray91 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray90, charArray91);
        char[] charArray94 = new char[] {};
        char[] charArray95 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray94, charArray95);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray91, charArray94);
        org.junit.Assert.assertArrayEquals(charArray76, charArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) charArray91);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery2.clone();
        boolean boolean5 = dummyQuery2.isFilter;
        java.lang.String str6 = dummyQuery2.toString();
        boolean boolean7 = dummyQuery0.equals((java.lang.Object) str6);
        java.lang.String str9 = dummyQuery0.toString("europarl.lines.txt.gz");
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.search.Query query11 = dummyQuery0.rewrite(indexReader10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests12.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests12.setqueryParser(indexQueryParserService19);
        java.lang.String str21 = simpleIndexQueryParserTests12.getTestName();
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests12.longToPrefixCoded((long) (short) 10, (int) ' ');
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader10, (java.lang.Object) ruleChain29);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) ' ', (double) (short) 10, 10.0d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        long[] longArray2 = new long[] { 3, 5 };
        long[] longArray6 = new long[] { (short) 1, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader9, 2, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", obj1, (java.lang.Object) testRule14);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests24.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.search.Query query36 = dummyQuery34.rewrite(indexReader35);
        boolean boolean37 = dummyQuery34.isFilter;
        float float38 = dummyQuery34.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) dummyQuery34);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray29);
        java.lang.Object[] objArray51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) strArray13, objArray51);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        float float7 = dummyQuery0.getBoost();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query10 = dummyQuery0.clone();
        boolean boolean11 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch(10L);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) 0);
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests12.queryParser;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests12.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, 0);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.monster");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "<unknown>");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.failfast", fields15, fields32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        dummyQuery0.setisFilter(false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.search.Query query9 = dummyQuery0.rewrite(indexReader8);
        dummyQuery0.setBoost((float) 0L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, true);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.maxfailures");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("", fields43, fields51);
        simpleIndexQueryParserTests12.setUp();
        org.apache.lucene.index.IndexReader indexReader55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.slow", indexReader55, (int) (short) 0, postingsEnum57, postingsEnum58, false);
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.failfast", indexReader62, (int) '#', postingsEnum64, postingsEnum65, false);
        org.apache.lucene.util.BytesRef bytesRef69 = simpleIndexQueryParserTests12.indexedValueForSearch(0L);
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("DummyQuery", indexReader71, terms72, terms73, false);
        org.apache.lucene.util.BytesRef bytesRef78 = simpleIndexQueryParserTests12.longToPrefixCoded((long) 2, (int) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService79 = simpleIndexQueryParserTests12.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) dummyQuery0, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum4, postingsEnum5, true);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("DummyQuery", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("random", indexReader20, 4, postingsEnum22, postingsEnum23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum22);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray27, (float) (byte) 100);
        float[] floatArray38 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray44 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray44, (float) 100L);
        float[] floatArray52 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray58 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray58, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray38, floatArray52, (float) 0L);
        org.junit.Assert.assertArrayEquals("DummyQuery", floatArray7, floatArray38, (float) (short) 100);
        float[] floatArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", floatArray7, floatArray65, (float) (short) 10);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        float[] floatArray5 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray11 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        float[] floatArray19 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray25 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray25, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray25, (float) (byte) 100);
        float[] floatArray35 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray41 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray41, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray35, (float) 100);
        float[] floatArray52 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray58 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray58, (float) 100L);
        float[] floatArray66 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray72 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray72, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray52, floatArray66, (float) 0L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray52, (float) 4);
        float[] floatArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray79, (float) ' ');
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, (long) 1);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
        double[] doubleArray1 = new double[] {};
        double[][] doubleArray2 = new double[][] { doubleArray1 };
        java.util.List<double[]> doubleArrayList3 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, doubleArray2);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "europarl.lines.txt.gz");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray25);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "europarl.lines.txt.gz");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray34);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean57 = dummyQuery56.isFilter;
        org.apache.lucene.search.Query query58 = dummyQuery56.clone();
        boolean boolean59 = dummyQuery56.isFilter;
        float float60 = dummyQuery56.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray34, (java.lang.Object) float60);
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray34, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertNotNull("", (java.lang.Object) strArray34);
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray2, (java.lang.Object[]) strArray34);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, 1, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum12, postingsEnum13, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests18);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.maxfailures");
        simpleIndexQueryParserTests18.assertFieldStatisticsEquals("random", fields26, fields34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = null;
        simpleIndexQueryParserTests18.setqueryParser(indexQueryParserService36);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests18.queryParser();
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("", indexReader40, 5, postingsEnum42, postingsEnum43);
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests18.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests18.setqueryParser(indexQueryParserService47);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests18.assertDocsSkippingEquals("tests.nightly", indexReader50, (int) ' ', postingsEnum52, postingsEnum53, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) postingsEnum52);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService23);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader28, 5, postingsEnum30, postingsEnum31, false);
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 5, numericDocValues36, numericDocValues37);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 35.0f, (double) 1);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.getisFilter();
        java.lang.String str4 = dummyQuery2.toString();
        boolean boolean6 = dummyQuery2.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query7 = dummyQuery2.clone();
        org.apache.lucene.search.Query query8 = query7.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("DummyQuery", postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.ensureCheckIndexPassed();
        java.lang.String str18 = simpleIndexQueryParserTests9.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests9.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests20);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests20.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests20.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests20.getqueryParser();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain28;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) query7, (java.lang.Object) simpleIndexQueryParserTests9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean32 = dummyQuery31.getisFilter();
        java.lang.String str33 = dummyQuery31.toString();
        org.apache.lucene.search.Query query34 = dummyQuery31.clone();
        dummyQuery31.setBoost((float) (-1L));
        float float37 = dummyQuery31.getBoost();
        boolean boolean38 = dummyQuery31.getisFilter();
        boolean boolean39 = dummyQuery31.getisFilter();
        dummyQuery31.setisFilter(true);
        boolean boolean42 = query7.equals((java.lang.Object) dummyQuery31);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.search.Query query44 = dummyQuery31.rewrite(indexReader43);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests45);
        simpleIndexQueryParserTests45.ensureCheckIndexPassed();
        simpleIndexQueryParserTests45.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = simpleIndexQueryParserTests45.queryParser;
        org.apache.lucene.util.BytesRef bytesRef52 = simpleIndexQueryParserTests45.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader54, (int) (byte) 10, postingsEnum56, postingsEnum57);
        java.lang.String str59 = simpleIndexQueryParserTests45.getTestName();
        simpleIndexQueryParserTests45.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests45.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests45.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) query44, (java.lang.Object) simpleIndexQueryParserTests45);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests33);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.maxfailures");
        simpleIndexQueryParserTests33.assertFieldStatisticsEquals("random", fields41, fields49);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = null;
        simpleIndexQueryParserTests33.setqueryParser(indexQueryParserService51);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService53 = simpleIndexQueryParserTests33.queryParser();
        simpleIndexQueryParserTests33.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests55);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.maxfailures");
        simpleIndexQueryParserTests55.assertFieldStatisticsEquals("random", fields63, fields71);
        org.apache.lucene.index.PostingsEnum postingsEnum74 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        simpleIndexQueryParserTests55.assertDocsEnumEquals("random", postingsEnum74, postingsEnum75, false);
        simpleIndexQueryParserTests55.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests33, simpleIndexQueryParserTests55 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet80 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray79);
        java.util.Set<org.junit.Assert> assertSet81 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTestsArray79);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) 5, (double) (-1L));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        boolean boolean2 = dummyQuery0.getisFilter();
        java.lang.String str4 = dummyQuery0.toString("<unknown>");
        java.lang.String str6 = dummyQuery0.toString("node_s_0");
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet8 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        java.util.Set<java.util.Locale> localeSet9 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray7);
        org.junit.Assert.assertNotSame((java.lang.Object) dummyQuery0, (java.lang.Object) localeArray7);
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.maxfailures");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) throttling14, (java.lang.Object) locale16);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale12, locale16, locale19 };
        java.util.Locale[][] localeArray21 = new java.util.Locale[][] { localeArray20 };
        java.util.Set<java.util.Locale[]> localeArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray7, (java.lang.Object[]) localeArray21);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str21 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str22 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str23 = mockMoreLikeThisFetchService20.nodeName();
        java.lang.String str24 = mockMoreLikeThisFetchService20.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str26 = mockMoreLikeThisFetchService25.nodeName();
        java.lang.String str27 = mockMoreLikeThisFetchService25.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str29 = mockMoreLikeThisFetchService28.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str31 = mockMoreLikeThisFetchService30.nodeName();
        java.lang.String str32 = mockMoreLikeThisFetchService30.nodeName();
        java.lang.String str33 = mockMoreLikeThisFetchService30.nodeName();
        java.lang.String str34 = mockMoreLikeThisFetchService30.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str36 = mockMoreLikeThisFetchService35.nodeName();
        java.lang.String str37 = mockMoreLikeThisFetchService35.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray39 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService20, mockMoreLikeThisFetchService25, mockMoreLikeThisFetchService28, mockMoreLikeThisFetchService30, mockMoreLikeThisFetchService35, mockMoreLikeThisFetchService38 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray40 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray39 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.failfast");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests19.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (short) 10);
        org.junit.Assert.assertNotSame((java.lang.Object) strArray3, (java.lang.Object) simpleIndexQueryParserTests19);
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests19.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests19.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str2 = dummyQuery0.toString("tests.slow");
        java.lang.Object obj3 = null;
        boolean boolean4 = dummyQuery0.equals(obj3);
        dummyQuery0.isFilter = false;
        java.lang.String str7 = dummyQuery0.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray8);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray16);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray31);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray35);
        byte[] byteArray43 = new byte[] {};
        byte[] byteArray44 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray44);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray43);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray54);
        org.junit.Assert.assertArrayEquals("hi!", byteArray26, byteArray35);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray16, byteArray26);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray68);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray73);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray72);
        byte[] byteArray80 = new byte[] {};
        byte[] byteArray81 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray80, byteArray81);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray83, byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray80, byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray80);
        byte[] byteArray88 = new byte[] {};
        byte[] byteArray89 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray88, byteArray89);
        byte[] byteArray91 = new byte[] {};
        byte[] byteArray92 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray91, byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray88, byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray91);
        org.junit.Assert.assertArrayEquals("hi!", byteArray63, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray63);
        byte[] byteArray98 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray98);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermQueryBuilder();
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 35.0f, 0.0d, (double) 1L);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests3.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, (int) (short) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests3.getqueryParser();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testQueryStringFields3Builder();
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (short) 100, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        float float7 = dummyQuery0.getBoost();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query10 = dummyQuery0.clone();
        boolean boolean11 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch(10L);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) 0);
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests12);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests12.queryParser;
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests12.testQueryStringBuilder();
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, 0.0d, 10.0d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.isFilter;
        org.apache.lucene.search.Query query13 = dummyQuery11.clone();
        dummyQuery11.isFilter = false;
        dummyQuery11.isFilter = false;
        dummyQuery11.setBoost((float) 1L);
        dummyQuery11.isFilter = false;
        float float22 = dummyQuery11.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        boolean boolean30 = dummyQuery11.equals((java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "enwiki.random.lines.txt");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "europarl.lines.txt.gz");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.nightly");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields50, fields67);
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum71 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum70, postingsEnum71);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testRangeQueryBuilder();
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        dummyQuery0.setBoost((float) (-1L));
        dummyQuery0.setisFilter(true);
        boolean boolean8 = dummyQuery0.getisFilter();
        boolean boolean9 = dummyQuery0.getisFilter();
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "{\n  \"dummy\" : { }\n}");
        boolean boolean27 = dummyQuery0.equals((java.lang.Object) strArray13);
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "random");
        java.util.concurrent.ExecutorService executorService30 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray31 = new java.util.concurrent.ExecutorService[] { executorService30 };
        boolean boolean32 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) executorServiceArray31);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 4, (double) (-1L));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "europarl.lines.txt.gz");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray26);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus51 = simpleIndexQueryParserTests0.ensureGreen(strArray26);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray13 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray13, (double) 100L);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray28 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 100L);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray43 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray37, doubleArray43, (double) 100L);
        double[] doubleArray52 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray58 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray52, doubleArray58, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray52, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray37, 100.0d);
        double[] doubleArray71 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray77 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray71, doubleArray77, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray71, (double) 10.0f);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray22, (double) 100.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests84 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain85 = simpleIndexQueryParserTests84.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum88 = null;
        simpleIndexQueryParserTests84.assertDocsEnumEquals("random", postingsEnum87, postingsEnum88, true);
        org.junit.rules.RuleChain ruleChain91 = simpleIndexQueryParserTests84.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) doubleArray22, (java.lang.Object) ruleChain91);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) '#', (double) 0.0f);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str3 = dummyQuery1.toString("tests.slow");
        dummyQuery1.setisFilter(true);
        dummyQuery1.setisFilter(true);
        dummyQuery1.isFilter = true;
        float float10 = dummyQuery1.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests11.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests11.getqueryParser();
        boolean boolean15 = dummyQuery1.equals((java.lang.Object) simpleIndexQueryParserTests11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests16);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.maxfailures");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("random", fields24, fields32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests16.setqueryParser(indexQueryParserService34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests16.queryParser();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("tests.awaitsfix", indexReader38, 5, postingsEnum40, postingsEnum41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.search.Query query46 = dummyQuery44.rewrite(indexReader45);
        boolean boolean47 = dummyQuery44.isFilter;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) dummyQuery44);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum40, (java.lang.Object) dummyQuery44);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.search.Query query51 = dummyQuery44.rewrite(indexReader50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) boolean15, (java.lang.Object) dummyQuery44);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1L, (double) (byte) 10, (double) (byte) 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.nightly");
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray57 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray58 = (java.lang.Iterable<java.lang.String>[]) iterableArray57;
        strIterableArray58[0] = fields9;
        strIterableArray58[1] = fields24;
        strIterableArray58[2] = fields30;
        strIterableArray58[3] = fields47;
        strIterableArray58[4] = fields55;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet69 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray58);
        java.util.List<java.lang.Iterable<java.lang.String>> strIterableList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, strIterableArray58);
        java.util.concurrent.ExecutorService[] executorServiceArray71 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        boolean boolean73 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        boolean boolean74 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strIterableArray58, (java.lang.Object[]) executorServiceArray71);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (double) (-1L), (double) 100.0f);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 1L);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        long[] longArray1 = new long[] { '4' };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        boolean boolean5 = dummyQuery1.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query6 = dummyQuery1.clone();
        org.apache.lucene.search.Query query7 = query6.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("DummyQuery", postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        java.lang.String str17 = simpleIndexQueryParserTests8.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests8.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests19.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests19.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests19.getqueryParser();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain27;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) query6, (java.lang.Object) simpleIndexQueryParserTests8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean31 = dummyQuery30.getisFilter();
        java.lang.String str32 = dummyQuery30.toString();
        org.apache.lucene.search.Query query33 = dummyQuery30.clone();
        dummyQuery30.setBoost((float) (-1L));
        float float36 = dummyQuery30.getBoost();
        boolean boolean37 = dummyQuery30.getisFilter();
        boolean boolean38 = dummyQuery30.getisFilter();
        dummyQuery30.setisFilter(true);
        boolean boolean41 = query6.equals((java.lang.Object) dummyQuery30);
        dummyQuery30.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery30);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) '4');
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        boolean boolean2 = dummyQuery0.getisFilter();
        java.lang.String str4 = dummyQuery0.toString("<unknown>");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray27);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.failfast");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields51, fields70);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests72);
        org.junit.rules.RuleChain ruleChain74 = simpleIndexQueryParserTests72.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService75 = null;
        simpleIndexQueryParserTests72.queryParser = indexQueryParserService75;
        simpleIndexQueryParserTests72.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests72.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests72);
        org.apache.lucene.index.NumericDocValues numericDocValues82 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues83 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (short) 100, numericDocValues82, numericDocValues83);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) 2, (double) 0.0f);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.failfast");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "<unknown>");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.badapples", fields26, fields49);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryFilter();
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader24, terms25, terms26, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
        long[] longArray3 = new long[] { '#', (-1), (byte) 1 };
        long[] longArray9 = new long[] { 0, 10, 10, 0L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        long[] longArray6 = new long[] { '4', (byte) -1, 5, 10L, 3 };
        long[] longArray13 = new long[] { (short) -1, '4', (byte) 100, 100, (-1L), (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray6, longArray13);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (byte) 100);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 0, (double) 1, (double) 0.0f);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        short[] shortArray2 = new short[] { (short) 10, (short) 10 };
        short[] shortArray3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray3);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        org.apache.lucene.search.Query query7 = dummyQuery0.clone();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.search.Query query9 = dummyQuery0.rewrite(indexReader8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query9);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
        long[] longArray1 = new long[] { 4 };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain2;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain2);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
        long[] longArray0 = null;
        long[] longArray3 = new long[] { '4', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray3);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
        long[] longArray1 = new long[] {};
        long[] longArray4 = new long[] { 100, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray4);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("hi!", intArray7, intArray10);
        org.junit.Assert.assertArrayEquals("random", intArray3, intArray7);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray3, intArray16);
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray26, intArray27);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray29);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals("hi!", intArray39, intArray42);
        org.junit.Assert.assertArrayEquals("random", intArray35, intArray39);
        int[] intArray48 = new int[] {};
        int[] intArray49 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray48, intArray49);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("hi!", intArray48, intArray51);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray35, intArray48);
        org.junit.Assert.assertArrayEquals("hi!", intArray26, intArray48);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        int[] intArray66 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray65, intArray66);
        org.junit.Assert.assertArrayEquals("hi!", intArray62, intArray65);
        org.junit.Assert.assertArrayEquals("random", intArray58, intArray62);
        org.junit.Assert.assertArrayEquals(intArray26, intArray62);
        org.junit.Assert.assertArrayEquals(intArray16, intArray26);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        int[] intArray76 = new int[] {};
        int[] intArray77 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray76, intArray77);
        org.junit.Assert.assertArrayEquals("hi!", intArray73, intArray76);
        int[] intArray80 = new int[] {};
        int[] intArray81 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray80, intArray81);
        int[] intArray84 = new int[] {};
        int[] intArray85 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray84, intArray85);
        int[] intArray87 = new int[] {};
        int[] intArray88 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray87, intArray88);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray85, intArray88);
        org.junit.Assert.assertArrayEquals(intArray81, intArray85);
        org.junit.Assert.assertArrayEquals(intArray76, intArray81);
        org.junit.Assert.assertArrayEquals(intArray16, intArray76);
        int[] intArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray76, intArray94);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray14 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray14, (double) 100L);
        double[] doubleArray23 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray29 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray23, doubleArray29, (double) 100L);
        double[] doubleArray38 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray44 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray38, doubleArray44, (double) 100L);
        double[] doubleArray53 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray59 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray53, doubleArray59, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray53, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray38, 100.0d);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray23, (double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", doubleArray1, doubleArray8, (-1.0d));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "europarl.lines.txt.gz");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "europarl.lines.txt.gz");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray48);
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.nightly");
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray48);
        org.elasticsearch.index.query.BaseQueryBuilder[][] baseQueryBuilderArray55 = new org.elasticsearch.index.query.BaseQueryBuilder[][] {};
        org.elasticsearch.index.query.BaseQueryBuilder[][][] baseQueryBuilderArray56 = new org.elasticsearch.index.query.BaseQueryBuilder[][][] { baseQueryBuilderArray55 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder[][]> baseQueryBuilderArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) baseQueryBuilderArray56);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
        char[] charArray1 = null;
        char[] charArray3 = new char[] {};
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray7, charArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray1, charArray7);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (double) 10L, (double) '#');
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        long[] longArray1 = null;
        long[] longArray6 = new long[] { 5, 4, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray1, longArray6);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        java.lang.String str4 = dummyQueryBuilder0.toString();
        java.lang.String str5 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference6.equals(null)", !bytesReference6.equals(null));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray5);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("hi!", intArray15, intArray18);
        org.junit.Assert.assertArrayEquals("random", intArray11, intArray15);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray27);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray11, intArray24);
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray24);
        int[] intArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray33);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
        byte[] byteArray1 = null;
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray9);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray13);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray21);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray32);
        org.junit.Assert.assertArrayEquals("hi!", byteArray4, byteArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests38);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.maxfailures");
        simpleIndexQueryParserTests38.assertFieldStatisticsEquals("random", fields46, fields54);
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        simpleIndexQueryParserTests38.assertDocsEnumEquals("random", postingsEnum57, postingsEnum58, false);
        simpleIndexQueryParserTests38.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests38.assertPositionsSkippingEquals("DummyQuery", indexReader63, 1, postingsEnum65, postingsEnum66);
        byte[] byteArray68 = new byte[] {};
        byte[] byteArray69 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray69);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray68, byteArray71);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        byte[] byteArray78 = new byte[] {};
        byte[] byteArray79 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray78, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray75);
        byte[] byteArray83 = new byte[] {};
        byte[] byteArray84 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray83, byteArray84);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray86, byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray83, byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray83);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests38, (java.lang.Object) byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", byteArray1, byteArray4);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum4, postingsEnum5, true);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.failfast");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "<unknown>");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields16, fields37);
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain43 = simpleIndexQueryParserTests42.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain43;
        simpleIndexQueryParserTests40.setUp();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests40.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader47, 2, postingsEnum49, postingsEnum50);
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests40.assertDocsEnumEquals("tests.slow", postingsEnum53, postingsEnum54, false);
        simpleIndexQueryParserTests40.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests40.assertDocsEnumEquals("tests.awaitsfix", postingsEnum59, postingsEnum60, false);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum60);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef67 = simpleIndexQueryParserTests64.indexedValueForSearch(10L);
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests64, (java.lang.Object) 0);
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        simpleIndexQueryParserTests64.assertDocsEnumEquals("", postingsEnum72, postingsEnum73, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum72);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (double) (-1.0f));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "europarl.lines.txt.gz");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "europarl.lines.txt.gz");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "hi!");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "europarl.lines.txt.gz");
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) strArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray62, (java.lang.Object[]) strArray78);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray47);
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "hi!");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields86);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        double[] doubleArray8 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray14 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray14, (double) 100L);
        double[] doubleArray23 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray29 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray23, doubleArray29, (double) 100L);
        double[] doubleArray38 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray44 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray38, doubleArray44, (double) 100L);
        double[] doubleArray53 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray59 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray53, doubleArray59, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray53, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray38, 100.0d);
        org.junit.Assert.assertArrayEquals("hi!", doubleArray14, doubleArray23, (double) (short) 100);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray80 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray74, doubleArray80, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray74, (double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) doubleArray74);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) 5, (double) 5);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.isFilter;
        org.apache.lucene.search.Query query13 = dummyQuery11.clone();
        dummyQuery11.isFilter = false;
        dummyQuery11.isFilter = false;
        dummyQuery11.setBoost((float) 1L);
        dummyQuery11.isFilter = false;
        float float22 = dummyQuery11.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        boolean boolean30 = dummyQuery11.equals((java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (byte) 1, 1);
        java.lang.String str24 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests1.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService26);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests4.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader16, terms17, terms18, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests22.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain27;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests22);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests30.assertDocsEnumEquals("DummyQuery", postingsEnum32, postingsEnum33, false);
        simpleIndexQueryParserTests30.setUp();
        simpleIndexQueryParserTests30.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule39 = simpleIndexQueryParserTests30.ruleChain;
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Terms terms42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        simpleIndexQueryParserTests30.assertTermsEquals("tests.slow", indexReader41, terms42, terms43, true);
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests30.assertDocsEnumEquals("node_s_0", postingsEnum47, postingsEnum48, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean54 = dummyQuery53.getisFilter();
        java.lang.String str55 = dummyQuery53.toString();
        boolean boolean57 = dummyQuery53.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query58 = dummyQuery53.clone();
        org.apache.lucene.search.Query query59 = query58.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests60.assertDocsEnumEquals("DummyQuery", postingsEnum62, postingsEnum63, false);
        simpleIndexQueryParserTests60.setUp();
        simpleIndexQueryParserTests60.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests60.ensureCheckIndexPassed();
        java.lang.String str69 = simpleIndexQueryParserTests60.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService70 = simpleIndexQueryParserTests60.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests71);
        org.apache.lucene.util.BytesRef bytesRef74 = simpleIndexQueryParserTests71.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef77 = simpleIndexQueryParserTests71.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService78 = simpleIndexQueryParserTests71.getqueryParser();
        org.junit.rules.RuleChain ruleChain79 = simpleIndexQueryParserTests71.failureAndSuccessEvents;
        simpleIndexQueryParserTests60.failureAndSuccessEvents = ruleChain79;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) query58, (java.lang.Object) simpleIndexQueryParserTests60);
        simpleIndexQueryParserTests60.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests83 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests83);
        org.apache.lucene.util.BytesRef bytesRef86 = simpleIndexQueryParserTests83.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef89 = simpleIndexQueryParserTests83.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService90 = simpleIndexQueryParserTests83.getqueryParser();
        org.junit.rules.RuleChain ruleChain91 = simpleIndexQueryParserTests83.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain91;
        simpleIndexQueryParserTests60.failureAndSuccessEvents = ruleChain91;
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain91);
        simpleIndexQueryParserTests30.failureAndSuccessEvents = ruleChain91;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain91;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain91);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str11 = dummyQueryBuilder10.toString();
        java.lang.String str12 = dummyQueryBuilder10.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder5, dummyQueryBuilder6, dummyQueryBuilder7, dummyQueryBuilder8, dummyQueryBuilder9, dummyQueryBuilder10 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, dummyQueryBuilderArray13);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 0);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader17, terms18, terms19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests22);
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests22.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests22.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests22.getqueryParser();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum4, postingsEnum5);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "europarl.lines.txt.gz");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean68 = dummyQuery67.isFilter;
        org.apache.lucene.search.Query query69 = dummyQuery67.clone();
        boolean boolean70 = dummyQuery67.isFilter;
        float float71 = dummyQuery67.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray45, (java.lang.Object) float71);
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray78);
        org.junit.Assert.assertNotNull("", (java.lang.Object) strArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray45);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
        long[] longArray7 = new long[] { 4, 1L, 2, (short) 100, 10, (short) 100 };
        long[] longArray12 = new long[] { (byte) 1, ' ', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray7, longArray12);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        java.lang.String str7 = dummyQuery0.toString();
        java.lang.String str9 = dummyQuery0.toString("hi!");
        java.lang.String str11 = dummyQuery0.toString("tests.awaitsfix");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.getisFilter();
        java.lang.String str14 = dummyQuery12.toString();
        org.apache.lucene.search.Query query15 = dummyQuery12.clone();
        dummyQuery12.setBoost((float) (-1L));
        float float18 = dummyQuery12.getBoost();
        java.lang.String str20 = dummyQuery12.toString("hi!");
        // during test generation this statement threw an exception of type org.junit.ComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object) str11, (java.lang.Object) "hi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (short) 100);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str2 = dummyQueryBuilder1.toString();
        java.lang.String str3 = dummyQueryBuilder1.toString();
        java.lang.String str4 = dummyQueryBuilder1.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests5.getqueryParser();
        simpleIndexQueryParserTests5.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests5.queryParser;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests5.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader12, (int) (short) -1, postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("", indexReader18, terms19, terms20, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) str4, (java.lang.Object) simpleIndexQueryParserTests5);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.getisFilter();
        java.lang.String str13 = dummyQuery11.toString();
        org.apache.lucene.search.Query query14 = dummyQuery11.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests15.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests15.getqueryParser();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        boolean boolean24 = dummyQuery11.equals((java.lang.Object) simpleIndexQueryParserTests15);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests15.assertDocsEnumEquals("tests.badapples", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray12);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray20);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray31);
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray12);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray44);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray51);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray44, byteArray51);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray59);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray67);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray72);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray67, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray67);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray44, byteArray56);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray82);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray56, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray37);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery87 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean88 = dummyQuery87.isFilter;
        org.apache.lucene.search.Query query89 = dummyQuery87.clone();
        boolean boolean90 = dummyQuery87.isFilter;
        java.lang.String str91 = dummyQuery87.toString();
        org.apache.lucene.search.Query query92 = dummyQuery87.clone();
        dummyQuery87.setisFilter(true);
        dummyQuery87.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) byteArray37, (java.lang.Object) false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.isFilter;
        dummyQuery1.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        dummyQuery0.setBoost((float) (-1L));
        float float6 = dummyQuery0.getBoost();
        java.lang.String str8 = dummyQuery0.toString("hi!");
        dummyQuery0.isFilter = true;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query11 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        dummyQuery0.setBoost((float) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 5);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
        long[] longArray4 = new long[] { (byte) 100, ' ', (-1L), 'a' };
        long[] longArray7 = new long[] { 1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray7);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.isFilter;
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery2.clone();
        boolean boolean5 = dummyQuery2.isFilter;
        java.lang.String str6 = dummyQuery2.toString();
        boolean boolean7 = dummyQuery0.equals((java.lang.Object) str6);
        java.lang.String str9 = dummyQuery0.toString("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (long) (short) 100, (long) (short) 1);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals(intArray2, intArray6);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals("hi!", intArray14, intArray17);
        org.junit.Assert.assertArrayEquals("<unknown>", intArray2, intArray14);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray27, intArray28);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray27);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals("hi!", intArray37, intArray40);
        org.junit.Assert.assertArrayEquals("random", intArray33, intArray37);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        int[] intArray49 = new int[] {};
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray49, intArray50);
        org.junit.Assert.assertArrayEquals("hi!", intArray46, intArray49);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray33, intArray46);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray46);
        int[] intArray56 = new int[] {};
        int[] intArray57 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray56, intArray57);
        int[] intArray60 = new int[] {};
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray60, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals("hi!", intArray60, intArray63);
        org.junit.Assert.assertArrayEquals("random", intArray56, intArray60);
        org.junit.Assert.assertArrayEquals(intArray24, intArray60);
        org.junit.Assert.assertArrayEquals(intArray14, intArray24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests70);
        org.apache.lucene.util.BytesRef bytesRef73 = simpleIndexQueryParserTests70.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests74 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain75 = simpleIndexQueryParserTests74.failureAndSuccessEvents;
        simpleIndexQueryParserTests70.failureAndSuccessEvents = ruleChain75;
        org.apache.lucene.index.IndexReader indexReader78 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum80 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum81 = null;
        simpleIndexQueryParserTests70.assertPositionsSkippingEquals("europarl.lines.txt.gz", indexReader78, (int) (byte) 1, postingsEnum80, postingsEnum81);
        org.apache.lucene.util.BytesRef bytesRef85 = simpleIndexQueryParserTests70.longToPrefixCoded((long) 100, 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray14, (java.lang.Object) 5);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
        org.elasticsearch.common.xcontent.ToXContent.Params[] paramsArray1 = new org.elasticsearch.common.xcontent.ToXContent.Params[] {};
        java.util.Set<org.elasticsearch.common.xcontent.ToXContent.Params> paramsSet2 = org.apache.lucene.util.LuceneTestCase.asSet(paramsArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str5 = mockMoreLikeThisFetchService4.nodeName();
        java.lang.String str6 = mockMoreLikeThisFetchService4.nodeName();
        java.lang.String str7 = mockMoreLikeThisFetchService4.nodeName();
        java.lang.String str8 = mockMoreLikeThisFetchService4.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str10 = mockMoreLikeThisFetchService9.nodeName();
        java.lang.String str11 = mockMoreLikeThisFetchService9.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str13 = mockMoreLikeThisFetchService12.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str15 = mockMoreLikeThisFetchService14.nodeName();
        java.lang.String str16 = mockMoreLikeThisFetchService14.nodeName();
        java.lang.String str17 = mockMoreLikeThisFetchService14.nodeName();
        java.lang.String str18 = mockMoreLikeThisFetchService14.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str20 = mockMoreLikeThisFetchService19.nodeName();
        java.lang.String str21 = mockMoreLikeThisFetchService19.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray23 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService9, mockMoreLikeThisFetchService12, mockMoreLikeThisFetchService14, mockMoreLikeThisFetchService19, mockMoreLikeThisFetchService22 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray24 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray23 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests26);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.maxfailures");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("random", fields34, fields42);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests26.assertDocsEnumEquals("hi!", postingsEnum45, postingsEnum46, true);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.maxfailures");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("", fields57, fields65);
        simpleIndexQueryParserTests26.setUp();
        simpleIndexQueryParserTests26.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests26.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService70 = simpleIndexQueryParserTests26.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService71 = simpleIndexQueryParserTests26.getqueryParser();
        simpleIndexQueryParserTests26.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) abstractComponentArray24, (java.lang.Object) simpleIndexQueryParserTests26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", (java.lang.Object[]) paramsArray1, (java.lang.Object[]) abstractComponentArray24);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        boolean boolean2 = dummyQuery0.getisFilter();
        java.lang.String str4 = dummyQuery0.toString("<unknown>");
        java.lang.String str6 = dummyQuery0.toString("node_s_0");
        boolean boolean7 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests8.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests8.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain16;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) '4', (long) (byte) 1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "<unknown>");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "europarl.lines.txt.gz");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "europarl.lines.txt.gz");
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray65);
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertNotSame("DummyQuery", (java.lang.Object) strArray5, (java.lang.Object) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) strArray50);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        long[] longArray2 = new long[] { 3, (short) 0 };
        long[] longArray5 = new long[] { ' ', (byte) 10 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray5);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.search.Query query4 = dummyQuery2.rewrite(indexReader3);
        boolean boolean5 = dummyQuery2.isFilter;
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) dummyQuery2);
        java.lang.String str8 = dummyQuery2.toString("node_s_0");
        boolean boolean9 = dummyQuery2.isFilter;
        dummyQuery2.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) true);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
        double[] doubleArray1 = null;
        double[] doubleArray9 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray15 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray9, doubleArray15, (double) 100L);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray30 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray24, doubleArray30, (double) 100L);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray45 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray39, doubleArray45, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray39, (double) 1.0f);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray24, 100.0d);
        double[] doubleArray58 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray64 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray58, doubleArray64, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray58, (double) 10.0f);
        double[] doubleArray75 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray81 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray75, doubleArray81, (double) 100L);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray58, doubleArray75, (double) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray58, 1.0d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        dummyQuery0.isFilter = false;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.search.Query query11 = dummyQuery0.rewrite(indexReader10);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.search.Query query13 = dummyQuery0.rewrite(indexReader12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query13);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.failfast");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "<unknown>");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray13);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        float float6 = query5.getBoost();
        float float7 = query5.getBoost();
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray27);
        boolean boolean32 = query5.equals((java.lang.Object) strArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.monster" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray34);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray27);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.failfast");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields51, fields70);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests21.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain26;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService31);
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 1, numericDocValues35, numericDocValues36);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        java.lang.String str12 = dummyQuery0.toString("europarl.lines.txt.gz");
        boolean boolean13 = dummyQuery0.getisFilter();
        dummyQuery0.setisFilter(false);
        java.lang.String str16 = dummyQuery0.toString();
        dummyQuery0.setisFilter(false);
        java.lang.String str19 = dummyQuery0.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests16);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.maxfailures");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("random", fields24, fields32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = null;
        simpleIndexQueryParserTests16.setqueryParser(indexQueryParserService34);
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests16.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef42 = simpleIndexQueryParserTests39.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("tests.weekly", postingsEnum49, postingsEnum50, false);
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests16.longToPrefixCoded((long) 4, 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) strArray4, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService19);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests1.queryParser();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader23, 5, postingsEnum25, postingsEnum26);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests30);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.maxfailures");
        simpleIndexQueryParserTests30.assertFieldStatisticsEquals("random", fields38, fields46);
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests30.assertDocsEnumEquals("hi!", postingsEnum49, postingsEnum50, true);
        org.apache.lucene.util.BytesRef bytesRef55 = simpleIndexQueryParserTests30.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests30.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService57 = simpleIndexQueryParserTests30.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) (short) -1, (java.lang.Object) indexQueryParserService57);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService10;
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain13;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests15.queryParser;
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests15.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) ruleChain13, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "europarl.lines.txt.gz");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "europarl.lines.txt.gz");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray48);
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray48);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str58 = mockMoreLikeThisFetchService57.nodeName();
        java.lang.String str59 = mockMoreLikeThisFetchService57.nodeName();
        java.lang.String str60 = mockMoreLikeThisFetchService57.nodeName();
        java.lang.String str61 = mockMoreLikeThisFetchService57.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str63 = mockMoreLikeThisFetchService62.nodeName();
        java.lang.String str64 = mockMoreLikeThisFetchService62.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService65 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str66 = mockMoreLikeThisFetchService65.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService67 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str68 = mockMoreLikeThisFetchService67.nodeName();
        java.lang.String str69 = mockMoreLikeThisFetchService67.nodeName();
        java.lang.String str70 = mockMoreLikeThisFetchService67.nodeName();
        java.lang.String str71 = mockMoreLikeThisFetchService67.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str73 = mockMoreLikeThisFetchService72.nodeName();
        java.lang.String str74 = mockMoreLikeThisFetchService72.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray76 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService57, mockMoreLikeThisFetchService62, mockMoreLikeThisFetchService65, mockMoreLikeThisFetchService67, mockMoreLikeThisFetchService72, mockMoreLikeThisFetchService75 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray77 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray76 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray77);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArraySet79 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) abstractComponentArray77);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests14.queryParser;
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests14.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader23, (int) (byte) 10, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests14.assertPositionsSkippingEquals("tests.failfast", indexReader29, (int) (short) 1, postingsEnum31, postingsEnum32);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService34 = simpleIndexQueryParserTests14.queryParser();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("tests.weekly", indexReader36, terms37, terms38, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) indexReader36);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        long[] longArray2 = new long[] { 3, '#' };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
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
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray22);
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.failfast");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "europarl.lines.txt.gz");
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray14);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests12.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests12.getqueryParser();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain20;
        org.junit.Assert.assertNotSame((java.lang.Object) 10.0d, (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests23.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests23.indexedValueForSearch((long) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) bytesRef31);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests5.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.getisFilter();
        java.lang.String str4 = dummyQuery2.toString();
        boolean boolean6 = dummyQuery2.equals((java.lang.Object) 0.0f);
        java.lang.String str8 = dummyQuery2.toString("tests.failfast");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        dummyQuery9.isFilter = false;
        org.apache.lucene.search.Query query13 = dummyQuery9.clone();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) "tests.failfast", (java.lang.Object) query13);
        query13.setBoost((float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) query13);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        org.apache.lucene.search.Query query4 = dummyQuery1.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests5.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests5.getqueryParser();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        boolean boolean14 = dummyQuery1.equals((java.lang.Object) simpleIndexQueryParserTests5);
        dummyQuery1.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests17.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = null;
        simpleIndexQueryParserTests17.setqueryParser(indexQueryParserService24);
        java.lang.String str26 = simpleIndexQueryParserTests17.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) true, (java.lang.Object) str26);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule19 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean17 = dummyQuery16.getisFilter();
        java.lang.String str19 = dummyQuery16.toString("tests.slow");
        java.lang.String str21 = dummyQuery16.toString("random");
        boolean boolean22 = dummyQuery16.getisFilter();
        float float23 = dummyQuery16.getBoost();
        dummyQuery16.isFilter = false;
        org.apache.lucene.search.Query query26 = dummyQuery16.clone();
        dummyQuery16.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) strArray12, (java.lang.Object) true);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testInQuery();
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.maxfailures");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.awaitsfix");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields14, fields24);
        java.lang.String str26 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("DummyQuery", indexReader28, terms29, terms30, false);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        float[] floatArray5 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray11 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("tests.weekly", indexReader20, 0, postingsEnum22, postingsEnum23, false);
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) floatArray11, (java.lang.Object) ruleChain26);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        boolean boolean5 = dummyQuery0.isFilter;
        java.lang.String str7 = dummyQuery0.toString("random");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("DummyQuery", postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests20);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.maxfailures");
        simpleIndexQueryParserTests20.assertFieldStatisticsEquals("random", fields28, fields36);
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests20.assertDocsEnumEquals("hi!", postingsEnum39, postingsEnum40, true);
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests9, (java.lang.Object) simpleIndexQueryParserTests20);
        org.apache.lucene.util.BytesRef bytesRef47 = simpleIndexQueryParserTests9.longToPrefixCoded((long) ' ', 0);
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) dummyQuery0, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests3.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, (int) (short) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests3.getqueryParser();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testBooleanParsesFilter();
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testPrefixQueryBuilder();
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100, (double) 10.0f);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 10, 100.0d, (double) '4');
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
        short[] shortArray4 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray9 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray14 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray24 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[][] shortArray30 = new short[][] { shortArray4, shortArray9, shortArray14, shortArray19, shortArray24, shortArray29 };
        java.util.Set<short[]> shortArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray30);
        java.util.Set<short[]> shortArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) shortArray30, (java.lang.Object[]) strArray52);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
        long[] longArray6 = new long[] { '4', 4, 1, 10L, (byte) 0, (byte) 0 };
        long[] longArray12 = new long[] { (-1), 100L, 3, (short) 1, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        int[] intArray3 = new int[] { 2, (byte) -1 };
        int[] intArray6 = new int[] { 2, (byte) -1 };
        int[] intArray9 = new int[] { 2, (byte) -1 };
        int[] intArray12 = new int[] { 2, (byte) -1 };
        int[][] intArray13 = new int[][] { intArray3, intArray6, intArray9, intArray12 };
        java.util.Set<int[]> intArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(intArray13);
        java.util.Set<java.lang.Cloneable> cloneableSet15 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) intArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "europarl.lines.txt.gz");
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "europarl.lines.txt.gz");
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray64);
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) intArray13, (java.lang.Object[]) strArray34);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests4.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests4.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests4.getqueryParser();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        boolean boolean13 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("tests.badapples", postingsEnum15, postingsEnum16, false);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests4.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) ' ', (double) 100);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str3 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str4 = mockMoreLikeThisFetchService1.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str7 = mockMoreLikeThisFetchService6.nodeName();
        java.lang.String str8 = mockMoreLikeThisFetchService6.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str10 = mockMoreLikeThisFetchService9.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str12 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str13 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str14 = mockMoreLikeThisFetchService11.nodeName();
        java.lang.String str15 = mockMoreLikeThisFetchService11.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str17 = mockMoreLikeThisFetchService16.nodeName();
        java.lang.String str18 = mockMoreLikeThisFetchService16.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray20 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService9, mockMoreLikeThisFetchService11, mockMoreLikeThisFetchService16, mockMoreLikeThisFetchService19 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray21 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray20 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray43);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "europarl.lines.txt.gz");
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "europarl.lines.txt.gz");
        java.lang.String[] strArray68 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray60, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray52);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery74 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean75 = dummyQuery74.isFilter;
        org.apache.lucene.search.Query query76 = dummyQuery74.clone();
        boolean boolean77 = dummyQuery74.isFilter;
        float float78 = dummyQuery74.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray52, (java.lang.Object) float78);
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray52, (java.lang.Object[]) strArray85);
        org.apache.lucene.index.Fields fields92 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) abstractComponentArray21, (java.lang.Object[]) strArray85);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.maxfailures");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "europarl.lines.txt.gz");
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray23, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "europarl.lines.txt.gz");
        java.lang.String[] strArray73 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray73, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray65, (java.lang.Object[]) strArray73);
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.failfast");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray65);
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) strArray65);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray43);
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.nightly");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray58 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray59 = (java.lang.Iterable<java.lang.String>[]) iterableArray58;
        strIterableArray59[0] = fields10;
        strIterableArray59[1] = fields25;
        strIterableArray59[2] = fields31;
        strIterableArray59[3] = fields48;
        strIterableArray59[4] = fields56;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet70 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray59);
        java.util.Collection[] collectionArray72 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Iterable<java.lang.String>>[] strIterableCollectionArray73 = (java.util.Collection<java.lang.Iterable<java.lang.String>>[]) collectionArray72;
        strIterableCollectionArray73[0] = strIterableSet70;
        java.util.Set<java.util.Collection<java.lang.Iterable<java.lang.String>>> strIterableCollectionSet76 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableCollectionArray73);
        org.junit.Assert.assertNotNull((java.lang.Object) strIterableCollectionArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", objArray1, (java.lang.Object[]) strIterableCollectionArray73);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { '#', ' ', (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray6);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray13);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray6, byteArray13);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray29);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray36, byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray36);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray29, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray29);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray6, byteArray18);
        byte[] byteArray43 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", byteArray6, byteArray43);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        float float11 = dummyQuery0.getBoost();
        dummyQuery0.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) dummyQuery0);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests3.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testRangeQueryBuilder();
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean8 = dummyQuery7.getisFilter();
        java.lang.String str10 = dummyQuery7.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.getisFilter();
        java.lang.String str13 = dummyQuery11.toString();
        boolean boolean15 = dummyQuery11.equals((java.lang.Object) 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] dummyQueryArray16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] { dummyQuery0, dummyQuery7, dummyQuery11 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery> dummyQuerySet17 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryArray16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean19 = dummyQuery18.getisFilter();
        java.lang.String str20 = dummyQuery18.toString();
        org.apache.lucene.search.Query query21 = dummyQuery18.clone();
        dummyQuery18.setBoost((float) (-1L));
        dummyQuery18.setisFilter(true);
        boolean boolean26 = dummyQuery18.getisFilter();
        boolean boolean27 = dummyQuery18.getisFilter();
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "europarl.lines.txt.gz");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray39);
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "{\n  \"dummy\" : { }\n}");
        boolean boolean45 = dummyQuery18.equals((java.lang.Object) strArray31);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "random");
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) dummyQueryArray16, (java.lang.Object[]) strArray31);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        float float11 = dummyQuery0.getBoost();
        float float12 = dummyQuery0.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.maxfailures");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("random", fields21, fields29);
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests13.assertDocsEnumEquals("random", postingsEnum32, postingsEnum33, false);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("hi!", indexReader37, terms38, terms39, true);
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests13.indexedValueForSearch((long) 3);
        boolean boolean44 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) (short) 100);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.maxfailures");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.awaitsfix");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.monster", fields14, fields24);
        java.lang.String str26 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray8, "tests.monster");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.maxfailures");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("random", fields10, fields18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum21, postingsEnum22, false);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("hi!", indexReader26, terms27, terms28, true);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 35.0f, (java.lang.Object) ruleChain35);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.failfast");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "<unknown>");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.badapples", fields26, fields49);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testAndFilteredQueryBuilder();
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        dummyQuery0.isFilter = true;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray43);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray27);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.failfast");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields51, fields70);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        java.lang.String str4 = dummyQueryBuilder0.toString();
        java.lang.String str5 = dummyQueryBuilder0.toString();
        java.lang.String str6 = dummyQueryBuilder0.toString();
        java.lang.String str7 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference8.equals(null)", !bytesReference8.equals(null));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder1 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder3 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder5 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder7 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder9 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder11 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[][] dummyQueryBuilderArray13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[][] { dummyQueryBuilderArray2, dummyQueryBuilderArray4, dummyQueryBuilderArray6, dummyQueryBuilderArray8, dummyQueryBuilderArray10, dummyQueryBuilderArray12 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[]> dummyQueryBuilderArrayList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, dummyQueryBuilderArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str17 = mockMoreLikeThisFetchService16.nodeName();
        java.lang.String str18 = mockMoreLikeThisFetchService16.nodeName();
        java.lang.String str19 = mockMoreLikeThisFetchService16.nodeName();
        java.lang.String str20 = mockMoreLikeThisFetchService16.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str22 = mockMoreLikeThisFetchService21.nodeName();
        java.lang.String str23 = mockMoreLikeThisFetchService21.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str25 = mockMoreLikeThisFetchService24.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str27 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str28 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str29 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str30 = mockMoreLikeThisFetchService26.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str32 = mockMoreLikeThisFetchService31.nodeName();
        java.lang.String str33 = mockMoreLikeThisFetchService31.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray35 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService16, mockMoreLikeThisFetchService21, mockMoreLikeThisFetchService24, mockMoreLikeThisFetchService26, mockMoreLikeThisFetchService31, mockMoreLikeThisFetchService34 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray36 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray35 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) dummyQueryBuilderArray13, (java.lang.Object[]) abstractComponentArray36);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str2 = dummyQuery0.toString("tests.slow");
        dummyQuery0.setisFilter(true);
        dummyQuery0.setisFilter(true);
        dummyQuery0.isFilter = true;
        float float9 = dummyQuery0.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests10.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.getqueryParser();
        boolean boolean14 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests10.testWildcardQueryBuilder();
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 2, (long) (byte) 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) 4, (long) 2);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "europarl.lines.txt.gz");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "europarl.lines.txt.gz");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.failfast");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray18, (java.lang.Object[]) strArray26);
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray26);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.slow", indexReader12, terms13, terms14, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.Object obj18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests1, obj18);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str2 = dummyQuery0.toString("tests.slow");
        dummyQuery0.setisFilter(true);
        dummyQuery0.setisFilter(true);
        dummyQuery0.isFilter = true;
        float float9 = dummyQuery0.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests10.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests10.getqueryParser();
        boolean boolean14 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests10.testPrefixQueryBuilder();
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray1, charArray2);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray10, charArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray7, charArray10);
        org.junit.Assert.assertArrayEquals(charArray2, charArray10);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray18, charArray21);
        org.junit.Assert.assertArrayEquals(charArray10, charArray21);
        char[] charArray26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray21, charArray26);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests3.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, (int) (short) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests3.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader17, terms18, terms19, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests22.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests24.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain25;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain25;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain25;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader30, (int) (byte) 1, postingsEnum32, postingsEnum33);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 10, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 10);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        float float7 = dummyQuery0.getBoost();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query10 = dummyQuery0.clone();
        boolean boolean11 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch(10L);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) 0);
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests12.testEmptyBooleanQuery();
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures3 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray4 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1, testRuleIgnoreAfterMaxFailures3 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet5 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray4);
        java.lang.Object[] objArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray4, objArray6);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService8;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean19 = dummyQuery18.getisFilter();
        java.lang.String str21 = dummyQuery18.toString("tests.slow");
        java.lang.String str23 = dummyQuery18.toString("random");
        dummyQuery18.setisFilter(false);
        org.apache.lucene.search.Query query26 = dummyQuery18.clone();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) dummyQuery18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests28);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.maxfailures");
        simpleIndexQueryParserTests28.assertFieldStatisticsEquals("random", fields36, fields44);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests28.setqueryParser(indexQueryParserService46);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService48 = simpleIndexQueryParserTests28.queryParser();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.weekly", indexReader51, 0, postingsEnum53, postingsEnum54);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService56 = simpleIndexQueryParserTests28.queryParser;
        java.lang.Class<?> wildcardClass57 = simpleIndexQueryParserTests28.getClass();
        boolean boolean58 = dummyQuery18.equals((java.lang.Object) simpleIndexQueryParserTests28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery18);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
        float[] floatArray1 = null;
        float[] floatArray8 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray14 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 100L);
        float[] floatArray23 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray29 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray29, (float) 100L);
        float[] floatArray37 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray43 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray43, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray23, floatArray37, (float) 0L);
        org.junit.Assert.assertArrayEquals("random", floatArray8, floatArray37, (float) (short) 10);
        float[] floatArray55 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray61 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray61, (float) 100L);
        float[] floatArray69 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray75 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray55, floatArray75, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray55, (float) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray1, floatArray37, 100.0f);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str5 = mockMoreLikeThisFetchService4.nodeName();
        java.lang.String str6 = mockMoreLikeThisFetchService4.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray9 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService8 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray9);
        short[][] shortArray12 = new short[][] {};
        java.util.List<short[]> shortArrayList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, shortArray12);
        java.util.Set<java.lang.Cloneable> cloneableSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray12);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) abstractComponentArray9, (java.lang.Object[]) shortArray12);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        boolean boolean2 = dummyQuery0.getisFilter();
        java.lang.String str4 = dummyQuery0.toString("<unknown>");
        java.lang.String str6 = dummyQuery0.toString("node_s_0");
        boolean boolean7 = dummyQuery0.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests8.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests8.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain16;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests8.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
        long[] longArray4 = new long[] { 'a', (byte) 1, 100L };
        long[] longArray10 = new long[] { 10L, 5, (short) 10, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray4, longArray10);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 0, (byte) 0, 1, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray6);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests5);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests5.indexedValueForSearch((long) (short) 0);
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests5.longToPrefixCoded((long) '4', (int) ' ');
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests5);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        float float12 = dummyQuery1.getBoost();
        dummyQuery1.setisFilter(false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        simpleIndexQueryParserTests15.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests15.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) false, (java.lang.Object) bytesRef19);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray8);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray16);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray23);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray16, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray16);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray33);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray16, byteArray30);
        org.junit.Assert.assertArrayEquals("random", byteArray1, byteArray16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean39 = dummyQuery38.getisFilter();
        java.lang.String str40 = dummyQuery38.toString();
        org.apache.lucene.search.Query query41 = dummyQuery38.clone();
        dummyQuery38.setBoost((float) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) byteArray16, (java.lang.Object) dummyQuery38);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
        long[] longArray5 = new long[] { (short) 1, 0L, (short) 100, (short) 1 };
        long[] longArray8 = new long[] { 0L, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray5, longArray8);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str2 = dummyQueryBuilder1.toString();
        java.lang.String str3 = dummyQueryBuilder1.toString();
        java.lang.String str4 = dummyQueryBuilder1.toString();
        java.lang.String str5 = dummyQueryBuilder1.toString();
        java.lang.String str6 = dummyQueryBuilder1.toString();
        java.lang.String str7 = dummyQueryBuilder1.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.weekly", (java.lang.Object) str7);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.weekly");
        boolean boolean5 = dummyQuery1.isFilter;
        boolean boolean6 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests7);
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests7.queryParser;
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests7.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader16, (int) (byte) 10, postingsEnum18, postingsEnum19);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests7.assertPositionsSkippingEquals("tests.failfast", indexReader22, (int) (short) 1, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests7.queryParser();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("tests.weekly", indexReader29, terms30, terms31, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) dummyQuery1, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests3.getqueryParser();
        org.apache.lucene.util.BytesRef bytesRef18 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testNotFilteredQueryBuilder();
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.longToPrefixCoded((long) ' ', 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests14.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests17.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.maxfailures");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.awaitsfix");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("tests.monster", fields31, fields41);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.failfast");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "<unknown>");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("tests.awaitsfix", fields41, fields63);
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.maxfailures", fields13, fields63);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef68 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10L, (-1.0d));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray4, shortArray8);
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray14, shortArray15);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray18, shortArray19);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray14, shortArray18);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray4, shortArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) shortArray4);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        java.lang.String str13 = dummyQuery1.toString("europarl.lines.txt.gz");
        boolean boolean14 = dummyQuery1.getisFilter();
        boolean boolean15 = dummyQuery1.getisFilter();
        boolean boolean16 = dummyQuery1.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        simpleIndexQueryParserTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests17.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) dummyQuery1, (java.lang.Object) (short) 10);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 0);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean32 = dummyQuery31.isFilter;
        org.apache.lucene.search.Query query33 = dummyQuery31.clone();
        dummyQuery31.isFilter = false;
        boolean boolean36 = dummyQuery31.getisFilter();
        dummyQuery31.setisFilter(false);
        boolean boolean39 = dummyQuery31.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests40);
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests40.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests40.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = simpleIndexQueryParserTests40.getqueryParser();
        boolean boolean48 = dummyQuery31.equals((java.lang.Object) indexQueryParserService47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexReader25, (java.lang.Object) dummyQuery31);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("hi!", postingsEnum31, postingsEnum32, true);
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests1.longToPrefixCoded((long) ' ', 0);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocsAndPositionsEnumEquals("", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 'a', (int) (short) 0);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) bytesRef26);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
        long[] longArray5 = new long[] { (short) 10, (short) -1, (short) 0, (byte) 100 };
        long[] longArray12 = new long[] { 10L, '#', 'a', 4, 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray12);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (byte) -1, (long) ' ');
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.maxfailures");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("enwiki.random.lines.txt");
        org.junit.Assert.assertNotSame("", (java.lang.Object) throttling4, (java.lang.Object) locale6);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale2, locale6, locale9 };
        java.util.Locale[][] localeArray11 = new java.util.Locale[][] { localeArray10 };
        java.util.Set<java.util.Locale[]> localeArraySet12 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) localeArray11, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) 5);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
        long[] longArray3 = new long[] { 3, 5 };
        long[] longArray6 = new long[] { 2, 'a' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("DummyQuery", longArray3, longArray6);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean9 = dummyQuery8.getisFilter();
        java.lang.String str10 = dummyQuery8.toString();
        boolean boolean12 = dummyQuery8.equals((java.lang.Object) 0.0f);
        java.lang.String str14 = dummyQuery8.toString("tests.failfast");
        boolean boolean15 = dummyQuery8.isFilter;
        float float16 = dummyQuery8.getBoost();
        org.apache.lucene.search.Query query17 = dummyQuery8.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests18.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests18.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum23, postingsEnum24, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests18.queryParser;
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) query17, (java.lang.Object) simpleIndexQueryParserTests18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) byteArray2, (java.lang.Object) query17);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.failfast");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "<unknown>");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.badapples", fields26, fields49);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermQueryBuilder();
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("<unknown>", indexReader7, terms8, terms9, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) '4', numericDocValues15, numericDocValues16);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("<unknown>", postingsEnum23, postingsEnum24);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("hi!", postingsEnum20, postingsEnum21, true);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.maxfailures");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("", fields32, fields40);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService45 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService46 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService46;
        java.lang.Object obj48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, obj48);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", 0.0d, 0.0d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray8, charArray11);
        org.junit.Assert.assertArrayEquals(charArray3, charArray11);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray18);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray22, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray26);
        org.junit.Assert.assertArrayEquals(charArray18, charArray26);
        org.junit.Assert.assertArrayEquals("", charArray3, charArray18);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray34, charArray35);
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray39, charArray40);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray43, charArray44);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray40, charArray43);
        org.junit.Assert.assertArrayEquals(charArray35, charArray43);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray49, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray54, charArray55);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray55, charArray58);
        org.junit.Assert.assertArrayEquals(charArray50, charArray58);
        org.junit.Assert.assertArrayEquals("", charArray35, charArray50);
        org.junit.Assert.assertArrayEquals(charArray3, charArray35);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray67, charArray68);
        char[] charArray71 = new char[] {};
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray74, charArray75);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray78, charArray79);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray75, charArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray71, charArray75);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray67, charArray71);
        org.junit.Assert.assertArrayEquals(charArray3, charArray71);
        java.lang.Object obj85 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray3, obj85);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        double[] doubleArray17 = new double[] {};
        double[][] doubleArray18 = new double[][] { doubleArray17 };
        java.util.List<double[]> doubleArrayList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, doubleArray18);
        java.util.Set<double[]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray4, (java.lang.Object[]) doubleArray18);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray9, charArray10);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray13, charArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray10, charArray13);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray10);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray2, charArray6);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray21, charArray22);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray26, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray30, charArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray27, charArray30);
        org.junit.Assert.assertArrayEquals(charArray22, charArray30);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray36, charArray37);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray41, charArray42);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray42, charArray45);
        org.junit.Assert.assertArrayEquals(charArray37, charArray45);
        org.junit.Assert.assertArrayEquals("", charArray22, charArray37);
        org.junit.Assert.assertArrayEquals(charArray2, charArray22);
        char[] charArray52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray22, charArray52);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean9 = dummyQuery8.getisFilter();
        java.lang.String str11 = dummyQuery8.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.getisFilter();
        java.lang.String str14 = dummyQuery12.toString();
        boolean boolean16 = dummyQuery12.equals((java.lang.Object) 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] dummyQueryArray17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery[] { dummyQuery1, dummyQuery8, dummyQuery12 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery> dummyQuerySet18 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean20 = dummyQuery19.isFilter;
        org.apache.lucene.search.Query query21 = dummyQuery19.clone();
        boolean boolean22 = dummyQuery19.isFilter;
        dummyQuery19.setBoost(0.0f);
        dummyQuery19.isFilter = false;
        org.junit.Assert.assertNotSame((java.lang.Object) dummyQuerySet18, (java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 'a', 100L);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 0L, (long) 1);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) ' ', 100L);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService6;
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 1);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader12, 5, postingsEnum14, postingsEnum15, true);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader19, 0, postingsEnum21, postingsEnum22, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "europarl.lines.txt.gz");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray31, (java.lang.Object[]) strArray39);
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "europarl.lines.txt.gz");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray56);
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.nightly");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.failfast", fields44, fields63);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (long) '#', (long) (byte) 0);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "<unknown>");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "europarl.lines.txt.gz");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "europarl.lines.txt.gz");
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray65);
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertNotSame("DummyQuery", (java.lang.Object) strArray5, (java.lang.Object) strArray50);
        java.lang.Object[] objArray74 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) strArray5, objArray74);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 2, (double) 3);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.search.Query query4 = query2.rewrite(indexReader3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query2);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
        short[] shortArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.monster");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.maxfailures");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("random", fields11, fields19);
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("hi!", postingsEnum22, postingsEnum23, true);
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests3.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests3.queryParser();
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray32, shortArray33);
        short[] shortArray36 = new short[] {};
        short[] shortArray37 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray36, shortArray37);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray32, shortArray36);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray32, shortArray42);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService29, (java.lang.Object) shortArray42);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray49, shortArray53);
        short[] shortArray59 = new short[] {};
        short[] shortArray60 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray59, shortArray60);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray59, shortArray63);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray49, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray49);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray71, shortArray72);
        short[] shortArray76 = new short[] {};
        short[] shortArray77 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray76, shortArray77);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray80, shortArray81);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray76, shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray71, shortArray76);
        short[] shortArray86 = new short[] {};
        short[] shortArray87 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray86, shortArray87);
        short[] shortArray89 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray86, shortArray89);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray76, shortArray86);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray1, shortArray42);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum17, postingsEnum18, false);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("enwiki.random.lines.txt", indexReader22, (-1), postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "europarl.lines.txt.gz");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray56);
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.failfast");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "europarl.lines.txt.gz");
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray67, (java.lang.Object[]) strArray75);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray48);
        java.lang.Object[] objArray81 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) strArray20, objArray81);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.maxfailures");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("random", fields12, fields20);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("hi!", postingsEnum23, postingsEnum24, true);
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests4.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = simpleIndexQueryParserTests4.queryParser();
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray33, shortArray37);
        short[] shortArray42 = new short[] {};
        short[] shortArray43 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray42, shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray43);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService30, (java.lang.Object) shortArray43);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray49, shortArray50);
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray53, shortArray54);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray49, shortArray53);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray43, shortArray49);
        short[] shortArray65 = new short[] {};
        short[] shortArray66 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray65, shortArray66);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray69, shortArray70);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray65, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", obj1, (java.lang.Object) shortArray43);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
        char[] charArray5 = new char[] { '4', 'a', '#', '4', '#' };
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray8, charArray9);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray13, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray18);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray14, charArray17);
        org.junit.Assert.assertArrayEquals(charArray9, charArray17);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray24, charArray25);
        char[] charArray28 = new char[] {};
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray31, charArray32);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray32, charArray35);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray28, charArray32);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray24, charArray28);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray17, charArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray5, charArray28);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService31;
        org.apache.lucene.index.NumericDocValues numericDocValues35 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) (byte) -1, numericDocValues35, numericDocValues36);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testMatchAllBuilder();
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.isFilter;
        org.apache.lucene.search.Query query13 = dummyQuery11.clone();
        dummyQuery11.isFilter = false;
        dummyQuery11.isFilter = false;
        dummyQuery11.setBoost((float) 1L);
        dummyQuery11.isFilter = false;
        float float22 = dummyQuery11.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain26;
        boolean boolean30 = dummyQuery11.equals((java.lang.Object) ruleChain26);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testSpanNearQueryBuilder();
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "europarl.lines.txt.gz");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray38);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray57);
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "europarl.lines.txt.gz");
        java.lang.String[] strArray79 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "tests.monster");
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "europarl.lines.txt.gz");
        java.lang.String[] strArray87 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray87, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray79, (java.lang.Object[]) strArray87);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray71, (java.lang.Object[]) strArray87);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray71);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray7, (java.lang.Object[]) strArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) localeArray1, (java.lang.Object[]) strArray49);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.search.Query query5 = query3.rewrite(indexReader4);
        query3.setBoost((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) query3);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        org.apache.lucene.search.Query query4 = dummyQuery1.clone();
        dummyQuery1.setBoost((float) (-1L));
        dummyQuery1.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        java.lang.String str11 = dummyQuery9.toString();
        boolean boolean13 = dummyQuery9.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query14 = dummyQuery9.clone();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) dummyQuery1, (java.lang.Object) dummyQuery9);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.search.Query query17 = dummyQuery1.rewrite(indexReader16);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.search.Query query19 = dummyQuery1.rewrite(indexReader18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query19);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) boolean6);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum19, postingsEnum20, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("", fields31, fields39);
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean43 = dummyQuery42.isFilter;
        org.apache.lucene.search.Query query44 = dummyQuery42.clone();
        boolean boolean45 = dummyQuery42.isFilter;
        java.lang.String str46 = dummyQuery42.toString();
        org.apache.lucene.search.Query query47 = dummyQuery42.clone();
        java.lang.Class<?> wildcardClass48 = dummyQuery42.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain41, (java.lang.Object) wildcardClass48);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray13 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray7, doubleArray13, (double) 100L);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray28 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray22, doubleArray28, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray22, (double) 1.0f);
        double[] doubleArray36 = new double[] { (short) 0, 2, 1.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray22, doubleArray36, (double) 100.0f);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService12);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader15, terms16, terms17, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader22, (int) (short) 100, postingsEnum24, postingsEnum25, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum24);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.weekly");
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        float float6 = query5.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests8.indexedValueForSearch(10L);
        simpleIndexQueryParserTests8.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests8.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests8);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.nightly");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.failfast");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "<unknown>");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.badapples");
        simpleIndexQueryParserTests8.assertFieldStatisticsEquals("tests.badapples", fields33, fields56);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService58 = simpleIndexQueryParserTests8.getqueryParser();
        boolean boolean59 = query5.equals((java.lang.Object) indexQueryParserService58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService58);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        char[] charArray1 = null;
        char[] charArray4 = new char[] {};
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray11, charArray12);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray8, charArray11);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray8);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray18);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray22, charArray23);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray26, charArray27);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray23, charArray26);
        org.junit.Assert.assertArrayEquals(charArray18, charArray26);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray33, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray26, charArray37);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray44, charArray45);
        char[] charArray48 = new char[] {};
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray51, charArray52);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray55, charArray56);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray52, charArray55);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray48, charArray52);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals(charArray26, charArray44);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray1, charArray44);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        long[] longArray5 = new long[] { 4, (byte) 1, (byte) 1, 0L, 3 };
        long[] longArray9 = new long[] { (byte) 1, (short) 0, 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 5, (double) 1);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 2);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 5, (long) 3);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str4 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService2.nodeName();
        java.lang.String str6 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str8 = mockMoreLikeThisFetchService7.nodeName();
        java.lang.String str9 = mockMoreLikeThisFetchService7.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str11 = mockMoreLikeThisFetchService10.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str13 = mockMoreLikeThisFetchService12.nodeName();
        java.lang.String str14 = mockMoreLikeThisFetchService12.nodeName();
        java.lang.String str15 = mockMoreLikeThisFetchService12.nodeName();
        java.lang.String str16 = mockMoreLikeThisFetchService12.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str18 = mockMoreLikeThisFetchService17.nodeName();
        java.lang.String str19 = mockMoreLikeThisFetchService17.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray21 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService10, mockMoreLikeThisFetchService12, mockMoreLikeThisFetchService17, mockMoreLikeThisFetchService20 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray22 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray21 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray22);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArraySet24 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) abstractComponentArray22);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        float float12 = dummyQuery1.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        boolean boolean20 = dummyQuery1.equals((java.lang.Object) ruleChain16);
        java.lang.String str22 = dummyQuery1.toString("");
        float float23 = dummyQuery1.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) float23);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests5.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain10;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests13.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        java.lang.String str19 = simpleIndexQueryParserTests13.getTestName();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests13.indexedValueForSearch((long) 5);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain10, (java.lang.Object) simpleIndexQueryParserTests13);
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests13.testSpanNearQueryBuilder();
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests3.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests3.testSpanContainingQueryBuilder();
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
        long[] longArray5 = new long[] { (byte) 10, 5, (short) 1, (-1L), (-1) };
        long[] longArray9 = new long[] { 5, (byte) 100, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray9);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) 100.0f);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
        long[] longArray6 = new long[] { (byte) 0, (-1L), 0, (short) 10, 100, '#' };
        long[] longArray11 = new long[] { 4, (byte) -1, (byte) -1, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { 1, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray1, longArray4);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", objArray1, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser;
        java.lang.String str3 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.getqueryParser();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.slow");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.failfast", fields33, fields41);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests43);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.maxfailures");
        simpleIndexQueryParserTests43.assertFieldStatisticsEquals("random", fields51, fields59);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = null;
        simpleIndexQueryParserTests43.setqueryParser(indexQueryParserService61);
        org.apache.lucene.util.BytesRef bytesRef65 = simpleIndexQueryParserTests43.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests66 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests66.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef69 = simpleIndexQueryParserTests66.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain71 = simpleIndexQueryParserTests70.failureAndSuccessEvents;
        simpleIndexQueryParserTests66.failureAndSuccessEvents = ruleChain71;
        simpleIndexQueryParserTests43.failureAndSuccessEvents = ruleChain71;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain71;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain71;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("<unknown>", (java.lang.Object) "tests.failfast", (java.lang.Object) ruleChain71);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 1, 0);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str19 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str25 = mockMoreLikeThisFetchService24.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str27 = mockMoreLikeThisFetchService26.nodeName();
        java.lang.String str28 = mockMoreLikeThisFetchService26.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray31 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService24, mockMoreLikeThisFetchService26, mockMoreLikeThisFetchService29, mockMoreLikeThisFetchService30 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray31);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray31);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet34 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) abstractComponentArray31);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch(1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray4, charArray5);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray9, charArray10);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray13, charArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray10, charArray13);
        org.junit.Assert.assertArrayEquals(charArray5, charArray13);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray20, charArray21);
        char[] charArray24 = new char[] {};
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray27, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray28, charArray31);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray24, charArray28);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray20, charArray24);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray13, charArray24);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray40, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray41, charArray44);
        org.junit.Assert.assertArrayEquals(charArray24, charArray44);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray51, charArray52);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray56, charArray57);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray57, charArray60);
        org.junit.Assert.assertArrayEquals(charArray52, charArray60);
        char[] charArray67 = new char[] {};
        char[] charArray68 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray67, charArray68);
        char[] charArray71 = new char[] {};
        char[] charArray74 = new char[] {};
        char[] charArray75 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray74, charArray75);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray78, charArray79);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray75, charArray78);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray71, charArray75);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray67, charArray71);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray60, charArray71);
        char[] charArray87 = new char[] {};
        char[] charArray88 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray87, charArray88);
        char[] charArray91 = new char[] {};
        char[] charArray92 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray91, charArray92);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray88, charArray91);
        org.junit.Assert.assertArrayEquals(charArray71, charArray91);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray44, charArray91);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) charArray91);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests3.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests3.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests3.getqueryParser();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.nightly");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray38);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.failfast");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "<unknown>");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.badapples");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.badapples", fields26, fields49);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests1.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWildcardQueryBuilder();
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests1.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum6, postingsEnum7, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.getisFilter();
        java.lang.String str15 = dummyQuery12.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests16);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        simpleIndexQueryParserTests16.setUp();
        org.junit.rules.RuleChain ruleChain20 = null;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain20;
        boolean boolean22 = dummyQuery12.equals((java.lang.Object) simpleIndexQueryParserTests16);
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests25.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef31 = simpleIndexQueryParserTests25.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests25.overrideTestDefaultQueryCache();
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.maxfailures");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.awaitsfix");
        simpleIndexQueryParserTests25.assertFieldStatisticsEquals("tests.monster", fields39, fields49);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.maxfailures");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "<unknown>");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("<unknown>", fields49, fields62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) fields62);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService18);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests0.queryParser();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader22, 5, postingsEnum24, postingsEnum25);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService28;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean31 = dummyQuery30.isFilter;
        org.apache.lucene.search.Query query32 = dummyQuery30.clone();
        boolean boolean33 = dummyQuery30.isFilter;
        java.lang.String str34 = dummyQuery30.toString();
        org.apache.lucene.search.Query query35 = dummyQuery30.clone();
        dummyQuery30.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService28, (java.lang.Object) true);
    }
}

