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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        boolean boolean3 = dummyQuery1.getisFilter();
        java.lang.String str5 = dummyQuery1.toString("<unknown>");
        java.lang.String str7 = dummyQuery1.toString("node_s_0");
        java.util.Locale[] localeArray8 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet9 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray8);
        java.util.Set<java.util.Locale> localeSet10 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray8);
        org.junit.Assert.assertNotSame((java.lang.Object) dummyQuery1, (java.lang.Object) localeArray8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.maxfailures");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("random", fields21, fields29);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests13.setqueryParser(indexQueryParserService31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests13.queryParser();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests35);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.maxfailures");
        simpleIndexQueryParserTests35.assertFieldStatisticsEquals("random", fields43, fields51);
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests35.assertDocsEnumEquals("random", postingsEnum54, postingsEnum55, false);
        simpleIndexQueryParserTests35.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray59 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests13, simpleIndexQueryParserTests35 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet60 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray59);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray59);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet62 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray59);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) localeArray8, (java.lang.Object[]) simpleIndexQueryParserTestsArray59);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray8, charArray16);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray22, charArray23);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray27, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray28, charArray31);
        org.junit.Assert.assertArrayEquals(charArray23, charArray31);
        org.junit.Assert.assertArrayEquals("", charArray8, charArray23);
        org.junit.Assert.assertArrayEquals(charArray3, charArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.badapples", (java.lang.Object) charArray8, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
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
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray36, shortArray41);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) shortArray41);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.maxfailures");
        simpleIndexQueryParserTests9.assertFieldStatisticsEquals("random", fields17, fields25);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = null;
        simpleIndexQueryParserTests9.setqueryParser(indexQueryParserService27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests9.queryParser();
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests9.assertPositionsSkippingEquals("tests.weekly", indexReader32, 0, postingsEnum34, postingsEnum35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) postingsEnum34);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 5, 100.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 1.0f, 0.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray1, doubleArray24, (double) 3);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
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
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader35, 2, postingsEnum37, postingsEnum38, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean42 = dummyQuery41.isFilter;
        org.apache.lucene.search.Query query43 = dummyQuery41.clone();
        dummyQuery41.isFilter = false;
        dummyQuery41.isFilter = false;
        dummyQuery41.setBoost((float) 1L);
        dummyQuery41.isFilter = false;
        java.lang.String str53 = dummyQuery41.toString("europarl.lines.txt.gz");
        boolean boolean54 = dummyQuery41.getisFilter();
        boolean boolean55 = dummyQuery41.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) postingsEnum38, (java.lang.Object) boolean55);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) (-1.0f));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        java.lang.String str4 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference5.equals(null)", !bytesReference5.equals(null));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
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
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.search.Query query43 = dummyQuery30.rewrite(indexReader42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean45 = dummyQuery44.getisFilter();
        java.lang.String str47 = dummyQuery44.toString("tests.slow");
        java.lang.String str49 = dummyQuery44.toString("random");
        boolean boolean50 = dummyQuery44.getisFilter();
        org.apache.lucene.search.Query query51 = dummyQuery44.clone();
        boolean boolean52 = dummyQuery30.equals((java.lang.Object) dummyQuery44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery30);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray2);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
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
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.failfast");
        int[] intArray78 = new int[] { 2, (byte) -1 };
        int[] intArray81 = new int[] { 2, (byte) -1 };
        int[] intArray84 = new int[] { 2, (byte) -1 };
        int[] intArray87 = new int[] { 2, (byte) -1 };
        int[][] intArray88 = new int[][] { intArray78, intArray81, intArray84, intArray87 };
        java.util.Set<int[]> intArraySet89 = org.apache.lucene.util.LuceneTestCase.asSet(intArray88);
        java.util.Set<java.lang.Cloneable> cloneableSet90 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) intArray88);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray5, (java.lang.Object[]) intArray88);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.setUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain7;
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests3.queryParser = indexQueryParserService10;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("tests.maxfailures", postingsEnum13, postingsEnum14, false);
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean21 = dummyQuery20.getisFilter();
        java.lang.String str23 = dummyQuery20.toString("tests.slow");
        java.lang.String str25 = dummyQuery20.toString("random");
        dummyQuery20.setisFilter(false);
        org.apache.lucene.search.Query query28 = dummyQuery20.clone();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests3, (java.lang.Object) dummyQuery20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("DummyQuery", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests2.queryParser = indexQueryParserService11;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("tests.weekly", indexReader14, terms15, terms16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.maxfailures");
        simpleIndexQueryParserTests19.assertFieldStatisticsEquals("random", fields27, fields35);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("random", postingsEnum38, postingsEnum39, false);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) terms16, (java.lang.Object) simpleIndexQueryParserTests19);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str47 = dummyQuery45.toString("tests.slow");
        dummyQuery45.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) ruleChain44, (java.lang.Object) dummyQuery45);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.failfast");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "europarl.lines.txt.gz");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray32, (java.lang.Object[]) strArray40);
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "europarl.lines.txt.gz");
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "europarl.lines.txt.gz");
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray64, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray56);
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields27, fields79);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
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
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum33, postingsEnum34);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        byte[] byteArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray8);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        long[] longArray1 = new long[] { (short) 10 };
        long[] longArray6 = new long[] { (byte) 0, 4, 'a', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str4 = mockMoreLikeThisFetchService3.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService3.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray8 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService3, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService7 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) abstractComponentArray8, (java.lang.Object[]) strArray28);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        boolean boolean5 = dummyQuery1.equals((java.lang.Object) 0.0f);
        boolean boolean6 = dummyQuery1.getisFilter();
        java.lang.String str7 = dummyQuery1.toString();
        boolean boolean8 = dummyQuery1.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        java.lang.String str12 = dummyQuery9.toString("tests.slow");
        java.lang.String str14 = dummyQuery9.toString("random");
        dummyQuery9.setisFilter(false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.search.Query query18 = dummyQuery9.rewrite(indexReader17);
        query18.setBoost((float) (byte) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests21);
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.setUp();
        org.junit.rules.RuleChain ruleChain25 = null;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain25;
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        boolean boolean28 = query18.equals((java.lang.Object) simpleIndexQueryParserTests21);
        org.junit.rules.RuleChain ruleChain29 = null;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests21.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) boolean8, (java.lang.Object) indexQueryParserService31);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests4.testMoreLikeThisIds();
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
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
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 100, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 1, (double) 10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
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
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        java.lang.String str4 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference5.equals(null)", !bytesReference5.equals(null));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
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
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("random", indexReader10, 4, postingsEnum12, postingsEnum13);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (-1), numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 0L);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        float[] floatArray34 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray40 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray40, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray40, (float) (byte) 100);
        float[] floatArray50 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray56 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray56, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray50, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray50, (float) (byte) 100);
        float[] floatArray68 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray74 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray74, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray12, floatArray74, (float) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) floatArray74);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum12, postingsEnum13);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (long) (byte) 0, (long) (short) -1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.maxfailures", false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
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
        simpleIndexQueryParserTests3.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum15, postingsEnum16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 3, (double) 1L);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        int[] intArray1 = new int[] { 1 };
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("hi!", intArray8, intArray11);
        org.junit.Assert.assertArrayEquals("random", intArray4, intArray8);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("hi!", intArray17, intArray20);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray4, intArray17);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray17, intArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray25);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        short[] shortArray0 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray3, shortArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str15 = mockMoreLikeThisFetchService14.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str17 = mockMoreLikeThisFetchService16.nodeName();
        java.lang.String str18 = mockMoreLikeThisFetchService16.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray21 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService14, mockMoreLikeThisFetchService16, mockMoreLikeThisFetchService19, mockMoreLikeThisFetchService20 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray21);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray21);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.maxfailures");
        simpleIndexQueryParserTests25.assertFieldStatisticsEquals("random", fields33, fields41);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests25.assertDocsEnumEquals("hi!", postingsEnum44, postingsEnum45, true);
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests25.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests25.queryParser();
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray54, shortArray58);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray64);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService51, (java.lang.Object) shortArray64);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) abstractComponentList23, (java.lang.Object) shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray64);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
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
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader18, terms19, terms20, true);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.maxfailures");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields11);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
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
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 'a', (int) (short) 0);
        org.apache.lucene.util.BytesRef bytesRef25 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests26);
        org.apache.lucene.util.BytesRef bytesRef29 = simpleIndexQueryParserTests26.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain31;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) bytesRef25, (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests5);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.maxfailures");
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("random", fields13, fields21);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests5.setqueryParser(indexQueryParserService23);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests5.queryParser();
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests5.queryParser();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        boolean boolean29 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests5);
        java.lang.String str30 = simpleIndexQueryParserTests5.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests5.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum32, postingsEnum33);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        long[] longArray6 = new long[] { 5, 'a', 1, 3, (short) 100 };
        long[] longArray10 = new long[] { (short) 1, (-1L), (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray6, longArray10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.isFilter;
        float float5 = dummyQuery1.getBoost();
        java.lang.String str6 = dummyQuery1.toString();
        dummyQuery1.setBoost(100.0f);
        dummyQuery1.isFilter = true;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str13 = mockMoreLikeThisFetchService12.nodeName();
        java.lang.String str14 = mockMoreLikeThisFetchService12.nodeName();
        java.lang.String str15 = mockMoreLikeThisFetchService12.nodeName();
        java.lang.String str16 = mockMoreLikeThisFetchService12.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str18 = mockMoreLikeThisFetchService17.nodeName();
        java.lang.String str19 = mockMoreLikeThisFetchService17.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str21 = mockMoreLikeThisFetchService20.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str23 = mockMoreLikeThisFetchService22.nodeName();
        java.lang.String str24 = mockMoreLikeThisFetchService22.nodeName();
        java.lang.String str25 = mockMoreLikeThisFetchService22.nodeName();
        java.lang.String str26 = mockMoreLikeThisFetchService22.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str28 = mockMoreLikeThisFetchService27.nodeName();
        java.lang.String str29 = mockMoreLikeThisFetchService27.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray31 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService12, mockMoreLikeThisFetchService17, mockMoreLikeThisFetchService20, mockMoreLikeThisFetchService22, mockMoreLikeThisFetchService27, mockMoreLikeThisFetchService30 };
        org.elasticsearch.common.component.AbstractComponent[][] abstractComponentArray32 = new org.elasticsearch.common.component.AbstractComponent[][] { abstractComponentArray31 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent[]> abstractComponentArrayList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, abstractComponentArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) dummyQuery1, (java.lang.Object) abstractComponentArrayList33);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "europarl.lines.txt.gz");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "europarl.lines.txt.gz");
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray64);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests69 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests69);
        org.apache.lucene.util.BytesRef bytesRef72 = simpleIndexQueryParserTests69.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef75 = simpleIndexQueryParserTests69.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService76 = simpleIndexQueryParserTests69.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService77 = simpleIndexQueryParserTests69.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService78 = null;
        simpleIndexQueryParserTests69.queryParser = indexQueryParserService78;
        java.lang.String str80 = simpleIndexQueryParserTests69.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray64, (java.lang.Object) str80);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", objArray1, (java.lang.Object[]) strArray64);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        long[] longArray3 = new long[] { 10, 1, 10 };
        long[] longArray10 = new long[] { (short) 0, (-1), (short) 100, (byte) -1, 1L, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests18.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain23;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
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
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests12.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean28 = dummyQuery27.getisFilter();
        java.lang.String str29 = dummyQuery27.toString();
        org.apache.lucene.search.Query query30 = dummyQuery27.clone();
        dummyQuery27.setBoost((float) (-1L));
        float float33 = dummyQuery27.getBoost();
        boolean boolean34 = dummyQuery27.getisFilter();
        dummyQuery27.isFilter = true;
        dummyQuery27.setisFilter(false);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.search.Query query40 = dummyQuery27.rewrite(indexReader39);
        float float41 = dummyQuery27.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) terms24, (java.lang.Object) dummyQuery27);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
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
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.maxfailures");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("", fields35, fields43);
        boolean boolean45 = dummyQuery0.equals((java.lang.Object) "");
        java.lang.String str46 = dummyQuery0.toString();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.search.Query query48 = dummyQuery0.rewrite(indexReader47);
        dummyQuery0.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) dummyQuery0, (java.lang.Object) (byte) 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests3.assertDocsSkippingEquals("tests.weekly", indexReader9, 0, postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests3.setqueryParser(indexQueryParserService15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) query2, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        long[] longArray1 = new long[] {};
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray1, longArray2);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray8, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray12, charArray13);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray18, charArray21);
        org.junit.Assert.assertArrayEquals(charArray13, charArray21);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray28, charArray29);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray29, charArray32);
        org.junit.Assert.assertArrayEquals(charArray21, charArray32);
        org.junit.Assert.assertArrayEquals(charArray8, charArray21);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray40, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray47, charArray48);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray51, charArray52);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray48, charArray51);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray44, charArray48);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray40, charArray44);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray21, charArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) boolean5, (java.lang.Object) charArray40);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray11);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray19);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray30);
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray11);
        byte[] byteArray36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray36);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', 0.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests5);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.maxfailures");
        simpleIndexQueryParserTests5.assertFieldStatisticsEquals("random", fields13, fields21);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests5.assertDocsEnumEquals("random", postingsEnum24, postingsEnum25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("hi!", indexReader29, terms30, terms31, true);
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        simpleIndexQueryParserTests5.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests5.longToPrefixCoded((long) '#', 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) bytesRef4, (java.lang.Object) '#');
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        java.lang.String str4 = dummyQueryBuilder0.toString();
        java.lang.String str5 = dummyQueryBuilder0.toString();
        java.lang.String str6 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference7.equals(null)", !bytesReference7.equals(null));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("enwiki.random.lines.txt", false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 10.0f);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 0, numericDocValues8, numericDocValues9);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) (short) 10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        long[] longArray5 = new long[] { 10, (short) 0, (short) 0, (byte) 1 };
        long[] longArray11 = new long[] { 2, (-1), 1, 100L, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray5, longArray11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "europarl.lines.txt.gz");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray56);
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "europarl.lines.txt.gz");
        java.lang.String[] strArray79 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray71, (java.lang.Object[]) strArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray63, (java.lang.Object[]) strArray79);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray63);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray89 = new java.lang.String[] { "tests.monster", "tests.awaitsfix", "node_s_0" };
        org.apache.lucene.index.Fields fields91 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray89, "tests.nightly");
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray89);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        dummyQuery0.setisFilter(false);
        dummyQuery0.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean10 = dummyQuery9.getisFilter();
        java.lang.String str11 = dummyQuery9.toString();
        boolean boolean13 = dummyQuery9.equals((java.lang.Object) 0.0f);
        dummyQuery9.setisFilter(true);
        org.apache.lucene.search.Query query16 = dummyQuery9.clone();
        boolean boolean17 = dummyQuery9.isFilter;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "europarl.lines.txt.gz", (java.lang.Object) dummyQuery9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum45, postingsEnum46);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        long[] longArray2 = new long[] { 10, 3 };
        long[] longArray9 = new long[] { '#', (byte) 100, (byte) -1, 5, 10L, 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
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
        double[] doubleArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray66, (double) (short) 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray5);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray8, shortArray9);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray4, shortArray8);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray4, shortArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean18 = dummyQuery17.getisFilter();
        java.lang.String str20 = dummyQuery17.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests21);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.maxfailures");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("random", fields29, fields37);
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("hi!", postingsEnum40, postingsEnum41, true);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.maxfailures");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests21.assertFieldStatisticsEquals("", fields52, fields60);
        boolean boolean62 = dummyQuery17.equals((java.lang.Object) "");
        java.lang.String str63 = dummyQuery17.toString();
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.search.Query query65 = dummyQuery17.rewrite(indexReader64);
        dummyQuery17.isFilter = false;
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) shortArray4, (java.lang.Object) false);
        short[] shortArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray4, shortArray69);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
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
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 4, (double) 3);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        boolean boolean5 = dummyQuery1.equals((java.lang.Object) 0.0f);
        dummyQuery1.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean9 = dummyQuery8.getisFilter();
        java.lang.String str10 = dummyQuery8.toString();
        org.apache.lucene.search.Query query11 = dummyQuery8.clone();
        dummyQuery8.setBoost((float) (-1L));
        float float14 = dummyQuery8.getBoost();
        boolean boolean15 = dummyQuery8.getisFilter();
        boolean boolean16 = dummyQuery8.getisFilter();
        dummyQuery8.setisFilter(true);
        org.apache.lucene.search.Query query19 = dummyQuery8.clone();
        dummyQuery8.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object) dummyQuery1, (java.lang.Object) dummyQuery8);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        long[] longArray3 = new long[] { 10, (byte) 10 };
        long[] longArray4 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray3, longArray4);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
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
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 'a', (int) (short) 0);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("hi!", indexReader26, 0, postingsEnum28, postingsEnum29, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
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
        simpleIndexQueryParserTests3.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        long[] longArray1 = new long[] {};
        long[] longArray8 = new long[] { (byte) -1, 4, 100L, (short) 100, 100L, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray1, longArray8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        org.junit.Assert.assertArrayEquals("hi!", intArray2, intArray5);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray11, intArray14);
        org.junit.Assert.assertArrayEquals(intArray5, intArray14);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean19 = dummyQuery18.isFilter;
        org.apache.lucene.search.Query query20 = dummyQuery18.clone();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.search.Query query22 = query20.rewrite(indexReader21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) intArray14, (java.lang.Object) query20);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) (-1), (long) (byte) 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
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
        dummyQuery0.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) boolean20);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        long[] longArray6 = new long[] { 5, 1L, 100L, 4, (byte) 10, 4 };
        long[] longArray9 = new long[] { (-1), (-1) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray9);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 100L, (double) (-1L), (double) 5.0f);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum3, postingsEnum4, true);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.maxfailures");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.failfast");
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "<unknown>");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields15, fields36);
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str39 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum41, postingsEnum42);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray11);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray20);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray19, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray19);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray30);
        org.junit.Assert.assertArrayEquals("hi!", byteArray2, byteArray11);
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
        simpleIndexQueryParserTests36.assertDocsEnumEquals("random", postingsEnum55, postingsEnum56, false);
        simpleIndexQueryParserTests36.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests36.assertPositionsSkippingEquals("DummyQuery", indexReader61, 1, postingsEnum63, postingsEnum64);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray67);
        byte[] byteArray69 = new byte[] {};
        byte[] byteArray70 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray69);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray69, byteArray73);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray82);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray81);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests36, (java.lang.Object) byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray81);
        byte[] byteArray91 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray91);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) 1, 10.0d, 0.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.getisFilter();
        float float8 = dummyQuery1.getBoost();
        dummyQuery1.isFilter = false;
        org.apache.lucene.search.Query query11 = dummyQuery1.clone();
        float float12 = query11.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) query11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexQueryParserService15);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean4 = dummyQuery3.getisFilter();
        java.lang.String str5 = dummyQuery3.toString();
        boolean boolean7 = dummyQuery3.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query8 = dummyQuery3.clone();
        org.apache.lucene.search.Query query9 = query8.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("DummyQuery", postingsEnum12, postingsEnum13, false);
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        java.lang.String str19 = simpleIndexQueryParserTests10.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests10.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests21);
        org.apache.lucene.util.BytesRef bytesRef24 = simpleIndexQueryParserTests21.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef27 = simpleIndexQueryParserTests21.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = simpleIndexQueryParserTests21.getqueryParser();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain29;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) query8, (java.lang.Object) simpleIndexQueryParserTests10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) (short) 10, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.nightly", true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) -1, (long) (short) 1);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests24);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("random", fields32, fields40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("random", postingsEnum43, postingsEnum44, false);
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests24 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet49 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray48);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray70);
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "europarl.lines.txt.gz");
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray77, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray55, (java.lang.Object[]) strArray85);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) simpleIndexQueryParserTestsArray48, (java.lang.Object[]) strArray85);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        long[] longArray7 = new long[] { 0, (byte) 100, (byte) 10, 0, 100, '4' };
        long[] longArray13 = new long[] { 100, (short) 0, (byte) 0, 'a', 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray7, longArray13);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
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
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain12);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        long[] longArray6 = new long[] { 5, 3, (short) -1, ' ', 5 };
        long[] longArray12 = new long[] { 10, (-1), 4, 4, 0 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray12);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        long[] longArray2 = new long[] { 2 };
        long[] longArray5 = new long[] { '#', 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
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
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
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
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests12.assertDocValuesEquals("tests.weekly", (-1), numericDocValues23, numericDocValues24);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        byte[] byteArray12 = new byte[] {};
        byte[] byteArray13 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray9);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray17);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray28);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray33, byteArray34);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray28, byteArray34);
        byte[] byteArray39 = new byte[] {};
        byte[] byteArray40 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray40);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray39, byteArray42);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray46);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray54);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray65);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray65, byteArray71);
        byte[] byteArray74 = new byte[] {};
        byte[] byteArray75 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray75);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray74, byteArray77);
        byte[] byteArray81 = new byte[] {};
        byte[] byteArray82 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray82);
        byte[] byteArray84 = new byte[] {};
        byte[] byteArray85 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray84, byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray81);
        byte[] byteArray89 = new byte[] {};
        byte[] byteArray90 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray89, byteArray90);
        byte[] byteArray92 = new byte[] {};
        byte[] byteArray93 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray92, byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray89, byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray81, byteArray89);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray65, byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray28);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray8, charArray16);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray23, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray24, charArray27);
        org.junit.Assert.assertArrayEquals(charArray16, charArray27);
        org.junit.Assert.assertArrayEquals(charArray3, charArray16);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray35, charArray36);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray40, charArray41);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray41, charArray44);
        org.junit.Assert.assertArrayEquals(charArray36, charArray44);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray50, charArray51);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray55, charArray56);
        char[] charArray59 = new char[] {};
        char[] charArray60 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray59, charArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray56, charArray59);
        org.junit.Assert.assertArrayEquals(charArray51, charArray59);
        org.junit.Assert.assertArrayEquals("", charArray36, charArray51);
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
        char[] charArray87 = new char[] {};
        char[] charArray88 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray87, charArray88);
        char[] charArray91 = new char[] {};
        char[] charArray92 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray91, charArray92);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray88, charArray91);
        org.junit.Assert.assertArrayEquals(charArray83, charArray91);
        org.junit.Assert.assertArrayEquals("", charArray68, charArray83);
        org.junit.Assert.assertArrayEquals(charArray36, charArray68);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray3, charArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) charArray36);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) 4);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 35.0f, (double) (short) -1, 0.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
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
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 35.0f, (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 0, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
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
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests23);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.maxfailures");
        simpleIndexQueryParserTests23.assertFieldStatisticsEquals("random", fields31, fields39);
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests23.assertDocsEnumEquals("random", postingsEnum42, postingsEnum43, false);
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests23 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet48 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray47);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray47);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet50 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "europarl.lines.txt.gz");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.failfast");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "<unknown>");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray47, (java.lang.Object[]) strArray54);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
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
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues46 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) '4', numericDocValues46, numericDocValues47);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.maxfailures");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "europarl.lines.txt.gz");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "europarl.lines.txt.gz");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray22, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("europarl.lines.txt.gz", (java.lang.Object) strArray5);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 10L, (long) (byte) 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService6;
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests0.longToPrefixCoded(1L, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", 10, numericDocValues15, numericDocValues16);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray6);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("hi!", intArray16, intArray19);
        org.junit.Assert.assertArrayEquals("random", intArray12, intArray16);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals("hi!", intArray25, intArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray12, intArray25);
        org.junit.Assert.assertArrayEquals("hi!", intArray3, intArray25);
        int[] intArray38 = new int[] { (short) -1, 0, '4', (short) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", intArray25, intArray38);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray11, shortArray15);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray22);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray21, shortArray25);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray11, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray1, shortArray37);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
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
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (short) -1);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str9 = mockMoreLikeThisFetchService8.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str11 = mockMoreLikeThisFetchService10.nodeName();
        java.lang.String str12 = mockMoreLikeThisFetchService10.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray15 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService8, mockMoreLikeThisFetchService10, mockMoreLikeThisFetchService13, mockMoreLikeThisFetchService14 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray15);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray15);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet18 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) abstractComponentArray15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
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
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray22);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) 100, (double) 'a');
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        dummyQuery0.setBoost((float) (-1L));
        float float6 = dummyQuery0.getBoost();
        boolean boolean7 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = true;
        dummyQuery0.setisFilter(false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.search.Query query13 = dummyQuery0.rewrite(indexReader12);
        float float14 = dummyQuery0.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) float14);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 100.0f);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray8);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray16);
        org.junit.Assert.assertArrayEquals(charArray8, charArray16);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray23, charArray24);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray27, charArray28);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray24, charArray27);
        org.junit.Assert.assertArrayEquals(charArray16, charArray27);
        org.junit.Assert.assertArrayEquals(charArray3, charArray16);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray35, charArray36);
        char[] charArray39 = new char[] {};
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray42, charArray43);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray46, charArray47);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray43, charArray46);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray39, charArray43);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray35, charArray39);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray16, charArray35);
        java.lang.Object obj53 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) charArray16, obj53);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        char[] charArray2 = new char[] {};
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray5, charArray6);
        char[] charArray9 = new char[] {};
        char[] charArray10 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray9, charArray10);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray6, charArray9);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray2, charArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) charArray2);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
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
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.maxfailures");
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray37);
        java.util.Locale[] localeArray43 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet44 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        java.util.Set<java.util.Locale> localeSet45 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) localeArray43);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (-1), (double) (-1L));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
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
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.monster");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "europarl.lines.txt.gz");
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "europarl.lines.txt.gz");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray33);
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.failfast");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "europarl.lines.txt.gz");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray25, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) strArray25);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.getisFilter();
        float float8 = dummyQuery1.getBoost();
        dummyQuery1.isFilter = false;
        org.apache.lucene.search.Query query11 = dummyQuery1.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = null;
        simpleIndexQueryParserTests12.setqueryParser(indexQueryParserService30);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests12.queryParser();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("", indexReader34, 5, postingsEnum36, postingsEnum37);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = null;
        simpleIndexQueryParserTests12.queryParser = indexQueryParserService40;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests12.queryParser = indexQueryParserService42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) query11, (java.lang.Object) indexQueryParserService42);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (short) 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        long[] longArray1 = new long[] { (short) 0 };
        long[] longArray8 = new long[] { (short) 0, 100L, (-1), 100L, (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
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
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "europarl.lines.txt.gz");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "europarl.lines.txt.gz");
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray26, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "europarl.lines.txt.gz");
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray67, (java.lang.Object[]) strArray75);
        java.lang.String[] strArray82 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray67, (java.lang.Object[]) strArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) abstractComponentArray21, (java.lang.Object[]) strArray41);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("DummyQuery", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum25, postingsEnum26, false);
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.maxfailures");
        simpleIndexQueryParserTests32.assertFieldStatisticsEquals("random", fields40, fields48);
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests32.assertDocsEnumEquals("hi!", postingsEnum51, postingsEnum52, true);
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.maxfailures");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests32.assertFieldStatisticsEquals("", fields63, fields71);
        simpleIndexQueryParserTests32.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests75);
        org.apache.lucene.util.BytesRef bytesRef78 = simpleIndexQueryParserTests75.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef81 = simpleIndexQueryParserTests75.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService82 = null;
        simpleIndexQueryParserTests75.setqueryParser(indexQueryParserService82);
        java.lang.String str84 = simpleIndexQueryParserTests75.getTestName();
        org.apache.lucene.util.BytesRef bytesRef86 = simpleIndexQueryParserTests75.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef89 = simpleIndexQueryParserTests75.longToPrefixCoded((long) 0, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests90 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests90.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef93 = simpleIndexQueryParserTests90.indexedValueForSearch(10L);
        simpleIndexQueryParserTests90.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef96 = simpleIndexQueryParserTests90.indexedValueForSearch(100L);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) bytesRef89, (java.lang.Object) 100L);
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests32, (java.lang.Object) "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) bytesRef30, (java.lang.Object) "node_s_0");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
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
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray6, byteArray47);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        long[] longArray4 = new long[] { 2, (byte) 10, (-1L), ' ' };
        long[] longArray10 = new long[] { 'a', 100, '#', (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
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
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader44, (int) (short) 0, postingsEnum46, postingsEnum47, false);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.util.concurrent.ExecutorService[] executorServiceArray51 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean52 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        boolean boolean55 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray51);
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) boolean55);
        org.apache.lucene.index.NumericDocValues numericDocValues59 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues60 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.slow", (int) (byte) 10, numericDocValues59, numericDocValues60);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
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
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests5.assertDocsEnumEquals("tests.badapples", postingsEnum16, postingsEnum17, false);
        simpleIndexQueryParserTests5.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef23 = simpleIndexQueryParserTests5.indexedValueForSearch((long) 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests25);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.maxfailures");
        simpleIndexQueryParserTests25.assertFieldStatisticsEquals("random", fields33, fields41);
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests25.assertDocsEnumEquals("hi!", postingsEnum44, postingsEnum45, true);
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests25.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests25.queryParser();
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray54, shortArray55);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray54, shortArray58);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray63, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray64);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService51, (java.lang.Object) shortArray64);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray71, shortArray72);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray75, shortArray76);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray71, shortArray75);
        short[] shortArray81 = new short[] {};
        short[] shortArray82 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray81, shortArray82);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray85, shortArray86);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray81, shortArray85);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray71, shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray71);
        java.lang.Class<?> wildcardClass91 = shortArray71.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) 1, (java.lang.Object) wildcardClass91);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, 0.0d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        java.lang.Object[] objArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) strArray12);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 1.0f, (double) (-1.0f), (double) (short) 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 4, 0L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
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
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService45 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService47 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService47);
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum50, postingsEnum51);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        long[] longArray4 = new long[] { (byte) 1, (short) 100, (byte) 10 };
        long[] longArray6 = new long[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray4, longArray6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) '4', (long) (short) 1);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.isFilter;
        org.apache.lucene.search.Query query14 = dummyQuery12.clone();
        dummyQuery12.isFilter = false;
        dummyQuery12.isFilter = false;
        dummyQuery12.setBoost((float) 1L);
        dummyQuery12.isFilter = false;
        float float23 = dummyQuery12.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests24.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain27 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        simpleIndexQueryParserTests24.failureAndSuccessEvents = ruleChain27;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain27;
        boolean boolean31 = dummyQuery12.equals((java.lang.Object) ruleChain27);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain27;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "europarl.lines.txt.gz");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray46);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "enwiki.random.lines.txt");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.nightly");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("tests.monster", fields51, fields68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) fields68);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 10);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
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
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.maxfailures");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "<unknown>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus32 = simpleIndexQueryParserTests0.ensureGreen(strArray23);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        long[] longArray3 = new long[] { 2, 10L, 1L };
        long[] longArray6 = new long[] { (-1), 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 1, (double) (-1));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.maxfailures");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "<unknown>");
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) strArray4);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (long) 10, (long) 2);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests13.testFuzzyQueryBuilder();
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        long[] longArray2 = new long[] { (byte) 0, 10 };
        long[] longArray3 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        float[] floatArray34 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray40 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray40, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray40, (float) (byte) 100);
        float[] floatArray50 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray56 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray56, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray50, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray50, (float) (byte) 100);
        float[] floatArray68 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray74 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray74, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray12, floatArray74, (float) 'a');
        java.lang.String[] strArray82 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix", "random" };
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "{\n  \"dummy\" : { }\n}");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) floatArray74, (java.lang.Object) "{\n  \"dummy\" : { }\n}");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        long[] longArray1 = new long[] { (short) 0 };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        double[] doubleArray8 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray14 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray14, (double) 100L);
        double[] doubleArray23 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray29 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray23, doubleArray29, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray23, (double) 1.0f);
        double[] doubleArray40 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray46 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray40, doubleArray46, (double) 100L);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray61 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray55, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray55, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray23, doubleArray55, (double) 10L);
        double[] doubleArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", doubleArray55, doubleArray68, (double) (byte) 10);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService8);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean17 = dummyQuery16.getisFilter();
        java.lang.String str18 = dummyQuery16.toString();
        boolean boolean20 = dummyQuery16.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query21 = dummyQuery16.clone();
        org.apache.lucene.search.Query query22 = query21.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests23.assertDocsEnumEquals("DummyQuery", postingsEnum25, postingsEnum26, false);
        simpleIndexQueryParserTests23.setUp();
        simpleIndexQueryParserTests23.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests23.ensureCheckIndexPassed();
        java.lang.String str32 = simpleIndexQueryParserTests23.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = simpleIndexQueryParserTests23.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests34);
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests34.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef40 = simpleIndexQueryParserTests34.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = simpleIndexQueryParserTests34.getqueryParser();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain42;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) query21, (java.lang.Object) simpleIndexQueryParserTests23);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests23.assertDocsSkippingEquals("", indexReader46, (int) (short) 0, postingsEnum48, postingsEnum49, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
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
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "europarl.lines.txt.gz");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "europarl.lines.txt.gz");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "europarl.lines.txt.gz");
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray77);
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray62, (java.lang.Object[]) strArray77);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray47, (java.lang.Object[]) strArray77);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray47);
        java.util.concurrent.ExecutorService executorService86 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray87 = new java.util.concurrent.ExecutorService[] { executorService86 };
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray87);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray47, (java.lang.Object[]) executorServiceArray87);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (byte) -1, (double) (byte) 1, (double) (short) 0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = true;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.search.Query query6 = dummyQuery0.rewrite(indexReader5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query6);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        long[] longArray1 = new long[] { 5 };
        long[] longArray4 = new long[] { (short) 1, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray4);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "europarl.lines.txt.gz");
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray58);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray58);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "{\n  \"dummy\" : { }\n}");
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray58, (java.lang.Object[]) strArray67);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", (int) (byte) 10, numericDocValues26, numericDocValues27);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 0, (long) (short) 1);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.maxfailures");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("random", fields25, fields33);
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "europarl.lines.txt.gz");
        java.lang.String[] strArray58 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray50, (java.lang.Object[]) strArray58);
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray58, "tests.nightly");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray73 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray74 = (java.lang.Iterable<java.lang.String>[]) iterableArray73;
        strIterableArray74[0] = fields25;
        strIterableArray74[1] = fields40;
        strIterableArray74[2] = fields46;
        strIterableArray74[3] = fields63;
        strIterableArray74[4] = fields71;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet85 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray74);
        java.util.List<java.lang.Iterable<java.lang.String>> strIterableList86 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, strIterableArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray12, (java.lang.Object[]) strIterableArray74);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
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
        java.util.concurrent.ExecutorService[] executorServiceArray68 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean69 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        boolean boolean70 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        boolean boolean71 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        boolean boolean72 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) executorServiceArray68);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("DummyQuery", postingsEnum4, postingsEnum5, false);
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests9.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain10;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain10;
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "europarl.lines.txt.gz");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "europarl.lines.txt.gz");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) strArray32);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling38 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling38, throttling39 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet41 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray32, (java.lang.Object[]) throttlingArray40);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
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
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
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
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests31);
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests31.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests31.getqueryParser();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain39;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain39;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocsAndPositionsEnumEquals("tests.monster", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, (long) (byte) -1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        float float4 = dummyQuery0.getBoost();
        java.lang.String str5 = dummyQuery0.toString();
        dummyQuery0.setBoost(100.0f);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.search.Query query9 = dummyQuery0.rewrite(indexReader8);
        java.lang.String str10 = query9.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query9);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
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
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 'a', (long) 4);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests14.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests14.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests14.getqueryParser();
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
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
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 10, 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) 10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (-1), 10.0d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) indexQueryParserService32);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
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
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "DummyQuery");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus75 = simpleIndexQueryParserTests0.ensureGreen(strArray34);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10.0f, (double) (short) 10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 100, (double) (short) -1, (double) 5);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) 1);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) -1, (long) (short) 10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 3);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader8, 2, postingsEnum10, postingsEnum11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests13.indexedValueForSearch(10L);
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef21 = simpleIndexQueryParserTests18.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain23;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain23;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = null;
        simpleIndexQueryParserTests13.queryParser = indexQueryParserService26;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) indexReader8, (java.lang.Object) simpleIndexQueryParserTests13);
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests13.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum30, postingsEnum31);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { 5, 1L, 1.0f, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray1, doubleArray6, (double) 35.0f);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService42;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        long[] longArray0 = null;
        long[] longArray7 = new long[] { 1, 5, (byte) 0, 0, (byte) 0, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray7);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("DummyQuery", indexReader5, 10, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str13 = dummyQuery11.toString("tests.badapples");
        float float14 = dummyQuery11.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) dummyQuery11);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        long[] longArray1 = new long[] { (short) -1 };
        long[] longArray6 = new long[] { 3, '4', 4, (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray6);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray6, floatArray20, (float) 0L);
        float[] floatArray38 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray44 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray44, (float) 100L);
        float[] floatArray52 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray58 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray58, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray38, floatArray52, (float) 0L);
        float[] floatArray68 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray74 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray68, floatArray74, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray52, floatArray74, (float) (short) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray74, (float) 5);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
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
        byte[] byteArray64 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray64);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        long[] longArray2 = new long[] { 1L };
        long[] longArray9 = new long[] { 3, 0L, (short) 100, 'a', 'a', (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray2, longArray9);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        long[] longArray3 = new long[] { 4, (-1), '4' };
        long[] longArray10 = new long[] { 100, 2, 5, (short) 1, (byte) -1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray19);
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.maxfailures");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "europarl.lines.txt.gz");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray56);
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray56);
        int[] intArray72 = new int[] { 2, (byte) -1 };
        int[] intArray75 = new int[] { 2, (byte) -1 };
        int[] intArray78 = new int[] { 2, (byte) -1 };
        int[] intArray81 = new int[] { 2, (byte) -1 };
        int[][] intArray82 = new int[][] { intArray72, intArray75, intArray78, intArray81 };
        java.util.Set<int[]> intArraySet83 = org.apache.lucene.util.LuceneTestCase.asSet(intArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) intArray82);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues27 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", (int) (byte) -1, numericDocValues27, numericDocValues28);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) 10);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 1, (long) (byte) 0);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        float float4 = dummyQuery0.getBoost();
        java.lang.String str5 = dummyQuery0.toString();
        dummyQuery0.setBoost(100.0f);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.search.Query query9 = dummyQuery0.rewrite(indexReader8);
        java.lang.String str10 = dummyQuery0.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str30 = dummyQueryBuilder29.toString();
        java.lang.String str31 = dummyQueryBuilder29.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder24, dummyQueryBuilder25, dummyQueryBuilder26, dummyQueryBuilder27, dummyQueryBuilder28, dummyQueryBuilder29 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, dummyQueryBuilderArray32);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderSet34 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryBuilderArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) strArray19, (java.lang.Object[]) dummyQueryBuilderArray32);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService7;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = null;
        simpleIndexQueryParserTests11.setqueryParser(indexQueryParserService18);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("tests.nightly", postingsEnum21, postingsEnum22, false);
        java.lang.String str25 = simpleIndexQueryParserTests11.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests1.longToPrefixCoded((long) 'a', 0);
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) ruleChain23);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (double) 4, 0.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray21, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "europarl.lines.txt.gz");
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, (java.lang.Object[]) strArray44);
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray44);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray29);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray70);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) "<unknown>");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.monster");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "europarl.lines.txt.gz");
        java.lang.String[] strArray17 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray17, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray17, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "europarl.lines.txt.gz");
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "europarl.lines.txt.gz");
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray17, (java.lang.Object[]) strArray33);
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) strArray33);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        dummyQuery0.setisFilter(true);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray10, charArray11);
        char[] charArray14 = new char[] {};
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray17, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray18, charArray21);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray14, charArray18);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray10, charArray14);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray28, charArray29);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray33, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray34, charArray37);
        org.junit.Assert.assertArrayEquals(charArray29, charArray37);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray43, charArray44);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray48, charArray49);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray53, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray54, charArray57);
        org.junit.Assert.assertArrayEquals(charArray49, charArray57);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray63, charArray64);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray68, charArray69);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray72, charArray73);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray69, charArray72);
        org.junit.Assert.assertArrayEquals(charArray64, charArray72);
        org.junit.Assert.assertArrayEquals("", charArray49, charArray64);
        org.junit.Assert.assertArrayEquals(charArray44, charArray49);
        org.junit.Assert.assertArrayEquals(charArray37, charArray49);
        org.junit.Assert.assertArrayEquals(charArray14, charArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) dummyQuery0, (java.lang.Object) charArray14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 5, (double) 100.0f);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("DummyQuery", (java.lang.Object) (short) 10);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        long[] longArray6 = new long[] { 1, 100, '4', 100, (byte) 100 };
        long[] longArray10 = new long[] { 4, 0L, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray6, longArray10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        long[] longArray3 = new long[] { 5, 10L };
        long[] longArray7 = new long[] { (short) 100, 1, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray3, longArray7);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
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
        simpleIndexQueryParserTests1.testRangeQueryBuilder();
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("DummyQuery", (java.lang.Object) (byte) -1);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
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
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader31, terms32, terms33, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object) false, (java.lang.Object) 10.0f);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 1, (double) 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        boolean boolean5 = dummyQuery0.getisFilter();
        dummyQuery0.setisFilter(false);
        boolean boolean8 = dummyQuery0.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) dummyQuery0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) 'a');
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
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
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests23.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain28;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService31 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService31);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum34, postingsEnum35);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        long[] longArray7 = new long[] { 1, 3, '4', 100L, 'a', '4' };
        long[] longArray11 = new long[] { (byte) 100, 0, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", longArray7, longArray11);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
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
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("", 0, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) 5, 10L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
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
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 10, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) (byte) 1, (double) 'a', (double) 10);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (double) 2, (double) 0, (-1.0d));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 5, (double) 0.0f);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray2, shortArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str14 = mockMoreLikeThisFetchService13.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str16 = mockMoreLikeThisFetchService15.nodeName();
        java.lang.String str17 = mockMoreLikeThisFetchService15.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray20 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService13, mockMoreLikeThisFetchService15, mockMoreLikeThisFetchService18, mockMoreLikeThisFetchService19 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray20);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests24);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("random", fields32, fields40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("hi!", postingsEnum43, postingsEnum44, true);
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests24.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests24.queryParser();
        short[] shortArray53 = new short[] {};
        short[] shortArray54 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray53, shortArray54);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray53, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray53, shortArray63);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService50, (java.lang.Object) shortArray63);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) abstractComponentList22, (java.lang.Object) shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray63);
        short[] shortArray69 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray69);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
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
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader22, 5, postingsEnum24, postingsEnum25);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService28;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService30;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        long[] longArray5 = new long[] { 0L, 0, 100L, 0L, (-1L) };
        long[] longArray12 = new long[] { (byte) 0, 10L, (-1), (byte) 100, (short) 10, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray12);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        dummyQuery0.setisFilter(true);
        org.apache.lucene.search.Query query7 = dummyQuery0.clone();
        boolean boolean8 = dummyQuery0.isFilter;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        long[] longArray2 = new long[] { (byte) 0 };
        long[] longArray6 = new long[] { 0L, 0L, 0L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray2, longArray6);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
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
        java.lang.String str25 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule26 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) testRule26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("node_s_0", indexReader31, (int) 'a', postingsEnum33, postingsEnum34);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService36 = simpleIndexQueryParserTests28.queryParser();
        simpleIndexQueryParserTests28.overrideTestDefaultQueryCache();
        java.lang.String str38 = simpleIndexQueryParserTests28.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object) testRule26, (java.lang.Object) simpleIndexQueryParserTests28);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray44 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "tests.monster");
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray44, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "europarl.lines.txt.gz");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "europarl.lines.txt.gz");
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray61, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray53);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean76 = dummyQuery75.isFilter;
        org.apache.lucene.search.Query query77 = dummyQuery75.clone();
        boolean boolean78 = dummyQuery75.isFilter;
        float float79 = dummyQuery75.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray53, (java.lang.Object) float79);
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray86 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.monster");
        org.apache.lucene.index.Fields fields90 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray86);
        org.junit.Assert.assertNotNull("", (java.lang.Object) strArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean45 = dummyQuery44.getisFilter();
        java.lang.String str47 = dummyQuery44.toString("tests.slow");
        java.lang.String str49 = dummyQuery44.toString("random");
        boolean boolean50 = dummyQuery44.getisFilter();
        float float51 = dummyQuery44.getBoost();
        org.apache.lucene.search.Query query52 = dummyQuery44.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray18, (java.lang.Object) query52);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 2, (double) 35.0f, 10.0d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("europarl.lines.txt.gz", true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (byte) -1, (double) (byte) 100);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) 3, (long) 2);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("node_s_0", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.maxfailures");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.awaitsfix");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) strArray4);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.util.BytesRef bytesRef2 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
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
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule15;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean18 = dummyQuery17.isFilter;
        org.apache.lucene.search.Query query19 = dummyQuery17.clone();
        dummyQuery17.isFilter = false;
        dummyQuery17.isFilter = false;
        dummyQuery17.setBoost((float) 1L);
        dummyQuery17.isFilter = false;
        java.lang.String str29 = dummyQuery17.toString("europarl.lines.txt.gz");
        boolean boolean30 = dummyQuery17.getisFilter();
        boolean boolean31 = dummyQuery17.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object) testRule15, (java.lang.Object) dummyQuery17);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
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
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests8.assertDocsSkippingEquals("", indexReader31, (int) (short) 0, postingsEnum33, postingsEnum34, true);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum38, postingsEnum39);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (short) 1, (long) (short) 100);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, obj10);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 100L, (double) 10L, (double) 10L);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.maxfailures");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "<unknown>");
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "europarl.lines.txt.gz");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray24, (java.lang.Object[]) strArray31);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "europarl.lines.txt.gz");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "europarl.lines.txt.gz");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray48, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, (java.lang.Object[]) strArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray40);
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray40);
        java.lang.Object[] objArray67 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray40, objArray67);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
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
        simpleIndexQueryParserTests19.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
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
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        dummyQuery1.setisFilter(false);
        org.apache.lucene.search.Query query9 = dummyQuery1.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str13 = dummyQuery10.toString("tests.slow");
        java.lang.String str15 = dummyQuery10.toString("random");
        float float16 = dummyQuery10.getBoost();
        boolean boolean17 = dummyQuery10.isFilter;
        org.apache.lucene.search.Query query18 = dummyQuery10.clone();
        java.lang.String str19 = dummyQuery10.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object) dummyQuery1, (java.lang.Object) str19);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        float[] floatArray35 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray41 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray41, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray41, (float) (byte) 100);
        float[] floatArray51 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray57 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray57, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray51, (float) 100);
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray51, (float) (byte) 100);
        float[] floatArray69 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray75 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray13, floatArray75, (float) 'a');
        float[] floatArray85 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray91 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray85, floatArray91, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray91, (float) 10);
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", floatArray75, floatArray96, (float) (short) 0);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser;
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, obj10);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.maxfailures", obj1);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests1.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = null;
        simpleIndexQueryParserTests1.queryParser = indexQueryParserService10;
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str13 = simpleIndexQueryParserTests1.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
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
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray48, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray42, shortArray48);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray64, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray64, shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray64);
        short[] shortArray75 = new short[] {};
        short[] shortArray76 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray75, shortArray76);
        short[] shortArray80 = new short[] {};
        short[] shortArray81 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray80, shortArray81);
        short[] shortArray84 = new short[] {};
        short[] shortArray85 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray84, shortArray85);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray80, shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray75, shortArray80);
        short[] shortArray90 = new short[] {};
        short[] shortArray91 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray90, shortArray91);
        short[] shortArray93 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray90, shortArray93);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray80, shortArray90);
        org.junit.Assert.assertArrayEquals("tests.badapples", shortArray64, shortArray80);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.badapples");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        java.lang.Object[] objArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) strArray29);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 100, (double) (-1.0f));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) testRule32);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        float[] floatArray5 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray11 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray11, (float) 100L);
        float[] floatArray19 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray25 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray25, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray5, floatArray25, (float) (byte) 100);
        float[] floatArray36 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray42 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray36, floatArray42, (float) 100L);
        float[] floatArray51 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray57 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray57, (float) 100L);
        float[] floatArray65 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray71 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray71, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray51, floatArray65, (float) 0L);
        org.junit.Assert.assertArrayEquals("random", floatArray36, floatArray65, (float) (short) 10);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(floatArray25, floatArray65, 0.0f);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0L, (long) (short) 100);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
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
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "");
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "europarl.lines.txt.gz");
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray65);
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray65, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) strArray29, (java.lang.Object[]) strArray72);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder79 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str81 = dummyQueryBuilder80.toString();
        java.lang.String str82 = dummyQueryBuilder80.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder83 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str84 = dummyQueryBuilder83.toString();
        java.lang.String str85 = dummyQueryBuilder83.toString();
        java.lang.String str86 = dummyQueryBuilder83.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder87 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str88 = dummyQueryBuilder87.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray89 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder79, dummyQueryBuilder80, dummyQueryBuilder83, dummyQueryBuilder87 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet90 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray89);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray72, (java.lang.Object[]) baseQueryBuilderArray89);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        int[] intArray6 = new int[] { (short) 0, 4, ' ', (short) 100, 5, (short) 100 };
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        org.junit.Assert.assertArrayEquals("hi!", intArray13, intArray16);
        org.junit.Assert.assertArrayEquals("random", intArray9, intArray13);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals("hi!", intArray22, intArray25);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray9, intArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray6, intArray22);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests2.queryParser;
        java.lang.String str4 = simpleIndexQueryParserTests2.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests2.getqueryParser();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", obj1, (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { (short) 1, '#', 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", longArray1, longArray5);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
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
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        long[] longArray7 = new long[] { (short) -1, (byte) 0, (byte) -1, '#', (byte) 10, '4' };
        long[] longArray11 = new long[] { 'a', 2, 10L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray11);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader26, (-1), postingsEnum28, postingsEnum29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests31);
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests31.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService38 = simpleIndexQueryParserTests31.getqueryParser();
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray11);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray24);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray32);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray47);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray51);
        byte[] byteArray59 = new byte[] {};
        byte[] byteArray60 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray60);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray59);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray70);
        org.junit.Assert.assertArrayEquals("hi!", byteArray42, byteArray51);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray32, byteArray42);
        byte[] byteArray77 = new byte[] {};
        byte[] byteArray78 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray77, byteArray78);
        org.junit.Assert.assertArrayEquals("random", byteArray42, byteArray78);
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray8, byteArray42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray42);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 10.0d, (double) 5, (double) 1.0f);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        dummyQuery0.setBoost((float) (-1L));
        float float6 = dummyQuery0.getBoost();
        boolean boolean7 = dummyQuery0.getisFilter();
        boolean boolean8 = dummyQuery0.getisFilter();
        dummyQuery0.setisFilter(true);
        org.apache.lucene.search.Query query11 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray11, shortArray15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str23 = mockMoreLikeThisFetchService22.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str25 = mockMoreLikeThisFetchService24.nodeName();
        java.lang.String str26 = mockMoreLikeThisFetchService24.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray29 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService22, mockMoreLikeThisFetchService24, mockMoreLikeThisFetchService27, mockMoreLikeThisFetchService28 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray29);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests33);
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.maxfailures");
        simpleIndexQueryParserTests33.assertFieldStatisticsEquals("random", fields41, fields49);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests33.assertDocsEnumEquals("hi!", postingsEnum52, postingsEnum53, true);
        org.apache.lucene.util.BytesRef bytesRef58 = simpleIndexQueryParserTests33.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService59 = simpleIndexQueryParserTests33.queryParser();
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray66, shortArray67);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray62, shortArray66);
        short[] shortArray71 = new short[] {};
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray71, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray62, shortArray72);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService59, (java.lang.Object) shortArray72);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) abstractComponentList31, (java.lang.Object) shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) shortArray72);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) intArray16);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests5);
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        simpleIndexQueryParserTests5.setUp();
        org.junit.rules.RuleChain ruleChain9 = null;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain9;
        boolean boolean11 = dummyQuery1.equals((java.lang.Object) simpleIndexQueryParserTests5);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests5.setqueryParser(indexQueryParserService13);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests5.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests5);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query11 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.maxfailures");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("random", fields22, fields30);
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.nightly");
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray70 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray71 = (java.lang.Iterable<java.lang.String>[]) iterableArray70;
        strIterableArray71[0] = fields22;
        strIterableArray71[1] = fields37;
        strIterableArray71[2] = fields43;
        strIterableArray71[3] = fields60;
        strIterableArray71[4] = fields68;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet82 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray71);
        java.util.Collection[] collectionArray84 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Iterable<java.lang.String>>[] strIterableCollectionArray85 = (java.util.Collection<java.lang.Iterable<java.lang.String>>[]) collectionArray84;
        strIterableCollectionArray85[0] = strIterableSet82;
        java.util.Set<java.util.Collection<java.lang.Iterable<java.lang.String>>> strIterableCollectionSet88 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableCollectionArray85);
        org.junit.Assert.assertNotNull((java.lang.Object) strIterableCollectionSet88);
        boolean boolean90 = dummyQuery0.equals((java.lang.Object) strIterableCollectionSet88);
        dummyQuery0.isFilter = true;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) dummyQuery0);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        long[] longArray2 = new long[] { 100 };
        long[] longArray9 = new long[] { 100, 3, 5, ' ', 2, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray2, longArray9);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (byte) 10);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "europarl.lines.txt.gz");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "europarl.lines.txt.gz");
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray60);
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray13, (java.lang.Object[]) strArray60);
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "europarl.lines.txt.gz");
        java.lang.String[] strArray80 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray80, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray72, (java.lang.Object[]) strArray80);
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.failfast");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray60, (java.lang.Object[]) strArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) strArray72);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 1);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0L, (double) 2, (double) (short) -1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        long[] longArray2 = new long[] { 1, (byte) -1 };
        long[] longArray9 = new long[] { (short) -1, (short) 1, 0L, (byte) 100, (-1L), (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
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
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader25, terms26, terms27, true);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) testRule32, (java.lang.Object) "DummyQuery");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { (short) -1, (short) 0, '#', 1L, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", longArray1, longArray7);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.failfast");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "<unknown>");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.badapples");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus32 = simpleIndexQueryParserTests2.ensureGreen(strArray12);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("hi!", intArray6, intArray9);
        org.junit.Assert.assertArrayEquals("random", intArray2, intArray6);
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray15, intArray16);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray19);
        org.junit.Assert.assertArrayEquals("hi!", intArray15, intArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray15);
        int[] intArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray2, intArray23);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) 10, 1L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.search.Query query6 = query4.rewrite(indexReader5);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.search.Query query8 = query4.rewrite(indexReader7);
        float float9 = query8.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests10.assertPositionsSkippingEquals("", indexReader13, 1, postingsEnum15, postingsEnum16);
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) query8, (java.lang.Object) simpleIndexQueryParserTests10);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 100L);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        boolean boolean2 = dummyQuery0.getisFilter();
        java.lang.String str4 = dummyQuery0.toString("<unknown>");
        java.lang.String str6 = dummyQuery0.toString("node_s_0");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        boolean boolean5 = dummyQuery0.getisFilter();
        java.lang.String str6 = dummyQuery0.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", 0L, (long) (byte) -1);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests24);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("random", fields32, fields40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("random", postingsEnum43, postingsEnum44, false);
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests24 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet49 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray48);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray48);
        java.util.concurrent.ExecutorService executorService51 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray52 = new java.util.concurrent.ExecutorService[] { executorService51 };
        boolean boolean53 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        boolean boolean54 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) simpleIndexQueryParserTestsArray48, (java.lang.Object[]) executorServiceArray52);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.maxfailures");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.maxfailures");
        simpleIndexQueryParserTests13.assertFieldStatisticsEquals("random", fields21, fields29);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.nightly");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray69 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray70 = (java.lang.Iterable<java.lang.String>[]) iterableArray69;
        strIterableArray70[0] = fields21;
        strIterableArray70[1] = fields36;
        strIterableArray70[2] = fields42;
        strIterableArray70[3] = fields59;
        strIterableArray70[4] = fields67;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet81 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray70);
        java.util.Collection[] collectionArray83 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Iterable<java.lang.String>>[] strIterableCollectionArray84 = (java.util.Collection<java.lang.Iterable<java.lang.String>>[]) collectionArray83;
        strIterableCollectionArray84[0] = strIterableSet81;
        java.util.Set<java.util.Collection<java.lang.Iterable<java.lang.String>>> strIterableCollectionSet87 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableCollectionArray84);
        org.junit.Assert.assertNotNull((java.lang.Object) strIterableCollectionArray84);
        java.util.Set<java.util.Collection<java.lang.Iterable<java.lang.String>>> strIterableCollectionSet89 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableCollectionArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) strArray4, (java.lang.Object[]) strIterableCollectionArray84);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
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
        java.util.concurrent.ExecutorService executorService71 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray72 = new java.util.concurrent.ExecutorService[] { executorService71 };
        java.util.concurrent.ExecutorService executorService73 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray74 = new java.util.concurrent.ExecutorService[] { executorService73 };
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        java.util.concurrent.ExecutorService[][] executorServiceArray77 = new java.util.concurrent.ExecutorService[][] { executorServiceArray72, executorServiceArray74, executorServiceArray76 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet78 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray77);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strIterableArray58, (java.lang.Object[]) executorServiceArray77);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum14, postingsEnum15);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
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
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "");
        java.util.Locale[] localeArray53 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet54 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        java.util.Set<java.util.Locale> localeSet55 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray29, (java.lang.Object[]) localeArray53);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests19.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        java.lang.String str7 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
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
        simpleIndexQueryParserTests3.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        java.lang.Object[] objArray0 = null;
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests24);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("random", fields32, fields40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("random", postingsEnum43, postingsEnum44, false);
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests24 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet49 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray48);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(objArray0, (java.lang.Object[]) simpleIndexQueryParserTestsArray48);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        long[] longArray6 = new long[] { 1, 5, 100, (byte) 1, 5 };
        long[] longArray13 = new long[] { (short) -1, 'a', 100L, '#', 0L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray6, longArray13);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) (short) 100, (double) 4);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
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
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("node_s_0", false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService7;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService15 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.maxfailures");
        simpleIndexQueryParserTests17.assertFieldStatisticsEquals("random", fields25, fields33);
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests17.assertDocsEnumEquals("random", postingsEnum36, postingsEnum37, false);
        simpleIndexQueryParserTests17.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests17.assertPositionsSkippingEquals("DummyQuery", indexReader42, 1, postingsEnum44, postingsEnum45);
        byte[] byteArray47 = new byte[] {};
        byte[] byteArray48 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray48);
        byte[] byteArray50 = new byte[] {};
        byte[] byteArray51 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray47, byteArray50);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray55);
        byte[] byteArray57 = new byte[] {};
        byte[] byteArray58 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray50, byteArray54);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray63);
        byte[] byteArray65 = new byte[] {};
        byte[] byteArray66 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray65, byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray54, byteArray62);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests17, (java.lang.Object) byteArray62);
        byte[] byteArray72 = new byte[] {};
        byte[] byteArray73 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray73);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray75);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray80);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray82, byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray82);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray75, byteArray82);
        org.junit.Assert.assertArrayEquals("tests.weekly", byteArray62, byteArray75);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) byteArray62);
        byte[] byteArray95 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray62, byteArray95);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 4, (double) 10.0f);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 5);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) ' ', (double) 'a', (double) '4');
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        long[] longArray4 = new long[] { (-1L), (byte) 0, 0, (byte) 0 };
        long[] longArray10 = new long[] { (byte) 100, (-1L), (byte) -1, '#', (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray4, longArray10);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
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
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        short[] shortArray2 = new short[] { (short) 10, (short) 100 };
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray7);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray16);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray11, shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        short[] shortArray21 = new short[] {};
        short[] shortArray22 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray21, shortArray22);
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray21, shortArray24);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", shortArray11, shortArray21);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray29, shortArray30);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray33, shortArray34);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray29, shortArray33);
        short[] shortArray38 = new short[] {};
        short[] shortArray39 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray38, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray39);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray43, shortArray44);
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray46);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray11, shortArray46);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray55, shortArray56);
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray55, shortArray58);
        short[] shortArray63 = new short[] {};
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray63, shortArray64);
        short[] shortArray67 = new short[] {};
        short[] shortArray68 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray67, shortArray68);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray63, shortArray67);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray73, shortArray74);
        short[] shortArray77 = new short[] {};
        short[] shortArray78 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray77, shortArray78);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray73, shortArray77);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray63, shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray63);
        short[] shortArray85 = new short[] {};
        short[] shortArray86 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray85, shortArray86);
        short[] shortArray89 = new short[] {};
        short[] shortArray90 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray89, shortArray90);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray85, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray46, shortArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray63);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.getisFilter();
        dummyQuery1.setisFilter(true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) true);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests10.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain15;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) 'a');
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray8 = new short[] {};
        short[] shortArray9 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray8, shortArray9);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray12, shortArray13);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray8, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.maxfailures");
        simpleIndexQueryParserTests19.assertFieldStatisticsEquals("random", fields27, fields35);
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("hi!", postingsEnum38, postingsEnum39, true);
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests19.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService45 = simpleIndexQueryParserTests19.queryParser();
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray48, shortArray52);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray57, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray58);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService45, (java.lang.Object) shortArray58);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray64, shortArray65);
        short[] shortArray68 = new short[] {};
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray68, shortArray69);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray64, shortArray68);
        short[] shortArray73 = new short[] {};
        short[] shortArray74 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray73, shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray64, shortArray74);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray64);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray3, shortArray58);
        short[] shortArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray58, shortArray79);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        float[] floatArray7 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray13 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray7, floatArray13, (float) 100L);
        float[] floatArray21 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray27 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray21, floatArray27, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray7, floatArray21, (float) 0L);
        float[] floatArray39 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray45 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray45, (float) 100L);
        float[] floatArray53 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray59 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray59, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray39, floatArray53, (float) 0L);
        float[] floatArray69 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray75 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray53, floatArray75, (float) (short) 100);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.monster", floatArray21, floatArray75, (float) '4');
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", 0, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray42);
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray42);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray42);
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "europarl.lines.txt.gz");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        java.lang.String[] strArray69 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.monster");
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "europarl.lines.txt.gz");
        java.lang.String[] strArray77 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "tests.monster");
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray77, "europarl.lines.txt.gz");
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray77, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray69, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray69);
        org.junit.Assert.assertNotNull("{\n  \"dummy\" : { }\n}", (java.lang.Object) strArray69);
        org.apache.lucene.index.Fields fields93 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray69, "tests.maxfailures");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray69);
        java.lang.String[] strArray96 = new java.lang.String[] { "tests.monster" };
        org.apache.lucene.index.Fields fields98 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray96, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray96);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        long[] longArray5 = new long[] { 2, (byte) 100, (short) 0, 100L };
        long[] longArray11 = new long[] { 10, 100L, (short) 10, (short) 1, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray5, longArray11);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100L, (double) ' ', (double) 10L);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
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
        double[] doubleArray69 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray14, doubleArray69, (double) (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader1 = null;
        org.apache.lucene.search.Query query2 = dummyQuery0.rewrite(indexReader1);
        java.lang.String str3 = dummyQuery0.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean5 = dummyQuery4.isFilter;
        org.apache.lucene.search.Query query6 = dummyQuery4.clone();
        dummyQuery4.isFilter = false;
        dummyQuery4.isFilter = false;
        dummyQuery4.setBoost((float) 1L);
        dummyQuery4.setBoost((float) 5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) str3, (java.lang.Object) 5);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (byte) 100);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray18);
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray45);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str62 = dummyQueryBuilder61.toString();
        java.lang.String str63 = dummyQueryBuilder61.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str65 = dummyQueryBuilder64.toString();
        java.lang.String str66 = dummyQueryBuilder64.toString();
        java.lang.String str67 = dummyQueryBuilder64.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str69 = dummyQueryBuilder68.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray70 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder60, dummyQueryBuilder61, dummyQueryBuilder64, dummyQueryBuilder68 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet71 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray70);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery72 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean73 = dummyQuery72.getisFilter();
        java.lang.String str75 = dummyQuery72.toString("tests.slow");
        java.lang.String str77 = dummyQuery72.toString("random");
        boolean boolean78 = dummyQuery72.getisFilter();
        float float79 = dummyQuery72.getBoost();
        org.apache.lucene.search.Query query80 = dummyQuery72.clone();
        org.junit.Assert.assertNotSame("DummyQuery", (java.lang.Object) baseQueryBuilderArray70, (java.lang.Object) dummyQuery72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) baseQueryBuilderArray70);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray8);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests16);
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.maxfailures");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("random", fields24, fields32);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("random", postingsEnum35, postingsEnum36, false);
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("DummyQuery", indexReader41, 1, postingsEnum43, postingsEnum44);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray47);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray49);
        byte[] byteArray53 = new byte[] {};
        byte[] byteArray54 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray54);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray53);
        byte[] byteArray61 = new byte[] {};
        byte[] byteArray62 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray62);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray53, byteArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests16, (java.lang.Object) byteArray61);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        byte[] byteArray73 = new byte[] {};
        byte[] byteArray74 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray73, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray74);
        org.junit.Assert.assertArrayEquals("node_s_0", byteArray61, byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray61);
        byte[] byteArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray61, byteArray79);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        dummyQuery1.isFilter = false;
        dummyQuery1.isFilter = false;
        dummyQuery1.setBoost((float) 1L);
        dummyQuery1.isFilter = false;
        float float12 = dummyQuery1.getBoost();
        float float13 = dummyQuery1.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.maxfailures");
        simpleIndexQueryParserTests14.assertFieldStatisticsEquals("random", fields22, fields30);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("random", postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        simpleIndexQueryParserTests14.assertTermsEquals("hi!", indexReader38, terms39, terms40, true);
        org.apache.lucene.util.BytesRef bytesRef44 = simpleIndexQueryParserTests14.indexedValueForSearch((long) 3);
        boolean boolean45 = dummyQuery1.equals((java.lang.Object) simpleIndexQueryParserTests14);
        dummyQuery1.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) dummyQuery1);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests1.longToPrefixCoded(100L, (int) ' ');
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests16.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) ' ', (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
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
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", 5, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        int[] intArray2 = new int[] { 2, (byte) -1 };
        int[] intArray5 = new int[] { 2, (byte) -1 };
        int[] intArray8 = new int[] { 2, (byte) -1 };
        int[] intArray11 = new int[] { 2, (byte) -1 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        java.util.Set<int[]> intArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(intArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests14);
        simpleIndexQueryParserTests14.ensureCheckIndexPassed();
        simpleIndexQueryParserTests14.setUp();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain18;
        simpleIndexQueryParserTests14.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArraySet13, (java.lang.Object) simpleIndexQueryParserTests14);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (-1), (double) 1.0f);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 100, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
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
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues40 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests1.assertDocValuesEquals("tests.slow", 4, numericDocValues40, numericDocValues41);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests1.queryParser;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "europarl.lines.txt.gz");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray19, (java.lang.Object[]) strArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArray19);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "europarl.lines.txt.gz");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "europarl.lines.txt.gz");
        java.lang.String[] strArray26 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray18, (java.lang.Object[]) strArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray26);
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray26, "tests.slow");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.failfast", fields32, fields40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
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
        simpleIndexQueryParserTests3.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        double[] doubleArray8 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray14 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray8, doubleArray14, (double) 100L);
        double[] doubleArray23 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray29 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray23, doubleArray29, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray23, (double) 1.0f);
        double[] doubleArray40 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray46 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray40, doubleArray46, (double) 100L);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray61 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray55, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray55, (double) 1.0f);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray23, doubleArray55, (double) 10L);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray80 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray74, doubleArray80, (double) 100L);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", doubleArray55, doubleArray80, (double) (byte) 10);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
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
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
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
        float float30 = query6.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean32 = dummyQuery31.getisFilter();
        java.lang.String str33 = dummyQuery31.toString();
        boolean boolean35 = dummyQuery31.equals((java.lang.Object) 0.0f);
        dummyQuery31.setisFilter(true);
        java.lang.String str39 = dummyQuery31.toString("tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) float30, (java.lang.Object) dummyQuery31);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 3);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
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
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "europarl.lines.txt.gz");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "tests.monster");
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray40, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray40);
        java.lang.String[] strArray49 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "tests.monster");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "europarl.lines.txt.gz");
        java.lang.String[] strArray57 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "tests.monster");
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray57, "europarl.lines.txt.gz");
        java.lang.String[] strArray65 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray65, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray57, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray49);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery71 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean72 = dummyQuery71.isFilter;
        org.apache.lucene.search.Query query73 = dummyQuery71.clone();
        boolean boolean74 = dummyQuery71.isFilter;
        float float75 = dummyQuery71.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray49, (java.lang.Object) float75);
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray82 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields84 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "tests.monster");
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray82, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray49, (java.lang.Object[]) strArray82);
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray49, "DummyQuery");
        java.lang.String[] strArray93 = new java.lang.String[] { "tests.badapples", "tests.awaitsfix", "random" };
        org.apache.lucene.index.Fields fields95 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray93, "{\n  \"dummy\" : { }\n}");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader19, fields89, fields95, true);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.lang.String str9 = simpleIndexQueryParserTests2.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 0L, (double) (byte) 1);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '4', (int) ' ');
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) 1.0f, (double) 5);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '4', (int) ' ');
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 100.0d, (double) (short) -1);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
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
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests23.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain28;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests0.indexedValueForSearch((-1L));
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 0, numericDocValues37, numericDocValues38);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain4;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str4 = mockMoreLikeThisFetchService3.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str6 = mockMoreLikeThisFetchService5.nodeName();
        java.lang.String str7 = mockMoreLikeThisFetchService5.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray10 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService3, mockMoreLikeThisFetchService5, mockMoreLikeThisFetchService8, mockMoreLikeThisFetchService9 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray10);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray10);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet13 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray10);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str17 = dummyQueryBuilder16.toString();
        java.lang.String str18 = dummyQueryBuilder16.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str20 = dummyQueryBuilder19.toString();
        java.lang.String str21 = dummyQueryBuilder19.toString();
        java.lang.String str22 = dummyQueryBuilder19.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str24 = dummyQueryBuilder23.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray25 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder15, dummyQueryBuilder16, dummyQueryBuilder19, dummyQueryBuilder23 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet26 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean28 = dummyQuery27.getisFilter();
        java.lang.String str30 = dummyQuery27.toString("tests.slow");
        java.lang.String str32 = dummyQuery27.toString("random");
        boolean boolean33 = dummyQuery27.getisFilter();
        float float34 = dummyQuery27.getBoost();
        org.apache.lucene.search.Query query35 = dummyQuery27.clone();
        org.junit.Assert.assertNotSame("DummyQuery", (java.lang.Object) baseQueryBuilderArray25, (java.lang.Object) dummyQuery27);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) abstractComponentArray10, (java.lang.Object[]) baseQueryBuilderArray25);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
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
        simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = simpleIndexQueryParserTests2.queryParser();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests24);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        simpleIndexQueryParserTests24.assertFieldStatisticsEquals("random", fields32, fields40);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests24.assertDocsEnumEquals("random", postingsEnum43, postingsEnum44, false);
        simpleIndexQueryParserTests24.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray48 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests24 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet49 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray48);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray48);
        short[][] shortArray52 = new short[][] {};
        java.util.List<short[]> shortArrayList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, shortArray52);
        java.util.Set<java.lang.Cloneable> cloneableSet54 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) shortArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) simpleIndexQueryParserTestsArray48, (java.lang.Object[]) shortArray52);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy3 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.Assert.assertNotNull((java.lang.Object) queryCachingPolicy3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) locale2, (java.lang.Object) queryCachingPolicy3);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 0L, (long) 2);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
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
        simpleIndexQueryParserTests12.testBoostingQueryBuilder();
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum5, postingsEnum6);
    }
}

