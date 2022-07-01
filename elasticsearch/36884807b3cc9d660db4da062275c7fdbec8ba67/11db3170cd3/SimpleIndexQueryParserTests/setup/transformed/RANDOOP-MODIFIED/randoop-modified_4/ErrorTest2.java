import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testSpanOrQueryBuilder();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "<unknown>");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray41, (java.lang.Object[]) strArray49);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "europarl.lines.txt.gz");
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray64);
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray49, (java.lang.Object[]) strArray64);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) strArray26, (java.lang.Object[]) strArray49);
        org.junit.Assert.assertNotSame("DummyQuery", (java.lang.Object) strArray4, (java.lang.Object) strArray49);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService75 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str76 = mockMoreLikeThisFetchService75.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService77 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str78 = mockMoreLikeThisFetchService77.nodeName();
        java.lang.String str79 = mockMoreLikeThisFetchService77.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService81 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray82 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService75, mockMoreLikeThisFetchService77, mockMoreLikeThisFetchService80, mockMoreLikeThisFetchService81 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList83 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray82);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray82);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) abstractComponentArray82);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (-1.0d), (double) 100L, (double) 4);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        char[] charArray3 = new char[] { '4', 'a' };
        char[] charArray9 = new char[] { '#', '4', '4', '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray9);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("hi!", byteArray3, byteArray6);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
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
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        char[] charArray1 = null;
        char[] charArray5 = new char[] { ' ', ' ', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray1, charArray5);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        char[] charArray1 = new char[] { 'a' };
        char[] charArray4 = new char[] { '#', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray1, charArray4);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
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
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests32);
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests32.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef38 = simpleIndexQueryParserTests32.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService39 = simpleIndexQueryParserTests32.getqueryParser();
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain40;
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) ruleChain40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) (-1L), 0.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 0, 4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) bytesRef14);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        char[] charArray0 = new char[] {};
        char[] charArray3 = new char[] { '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        float[] floatArray1 = null;
        float[] floatArray8 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray14 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray14, (float) 100L);
        float[] floatArray22 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray28 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray28, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray8, floatArray22, (float) 0L);
        float[] floatArray38 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray44 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray44, (float) 100L);
        float[] floatArray52 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray58 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray58, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray38, floatArray58, (float) (byte) 100);
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray38, (float) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray1, floatArray22, (float) (short) 10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        char[] charArray1 = new char[] {};
        char[] charArray8 = new char[] { 'a', '4', ' ', ' ', '#', '4' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray1, charArray8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) '4', (-1L));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) (short) 10, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (short) 100, (long) 2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        char[] charArray2 = new char[] { 'a' };
        char[] charArray4 = new char[] { '#' };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray2, charArray4);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling1 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling2 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling1, throttling2 };
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet4 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str7 = dummyQueryBuilder6.toString();
        java.lang.String str8 = dummyQueryBuilder6.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str10 = dummyQueryBuilder9.toString();
        java.lang.String str11 = dummyQueryBuilder9.toString();
        java.lang.String str12 = dummyQueryBuilder9.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str14 = dummyQueryBuilder13.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray15 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder5, dummyQueryBuilder6, dummyQueryBuilder9, dummyQueryBuilder13 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet16 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) throttlingArray3, (java.lang.Object[]) baseQueryBuilderArray15);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        long[] longArray1 = new long[] {};
        long[] longArray6 = new long[] { 4, 2, (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", longArray1, longArray6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        long[] longArray1 = null;
        long[] longArray4 = new long[] { (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", longArray1, longArray4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("{\n  \"dummy\" : { }\n}", true);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        long[] longArray3 = new long[] { (byte) 100, 0 };
        long[] longArray5 = new long[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray3, longArray5);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray0, intArray2);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
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
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray48, shortArray49);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray48, shortArray52);
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray58, shortArray59);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray62, shortArray63);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray58, shortArray62);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray48, shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray48);
        short[] shortArray69 = new short[] {};
        short[] shortArray70 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray69, shortArray70);
        short[] shortArray72 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray69, shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray72);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) shortArray48);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        long[] longArray6 = new long[] { (short) 10, 0L, 3, 3, (short) 1, 10L };
        long[] longArray11 = new long[] { (short) 0, '4', (short) 1, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests1.queryParser;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader7, 1, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.slow", postingsEnum13, postingsEnum14, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) postingsEnum14);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 100.0f, (double) 5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (double) (short) 0, (double) (short) 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum30, postingsEnum31, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        dummyQuery0.setisFilter(true);
        dummyQuery0.isFilter = false;
        java.lang.String str11 = dummyQuery0.toString("");
        boolean boolean12 = dummyQuery0.isFilter;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.search.Query query14 = dummyQuery0.rewrite(indexReader13);
        boolean boolean15 = dummyQuery0.isFilter;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("DummyQuery", postingsEnum18, postingsEnum19, false);
        simpleIndexQueryParserTests16.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) dummyQuery0, (java.lang.Object) simpleIndexQueryParserTests16);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        char[] charArray6 = new char[] { 'a', 'a', ' ', ' ', ' ' };
        char[] charArray11 = new char[] { '#', '4', '4', ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", charArray6, charArray11);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str9 = dummyQueryBuilder8.toString();
        java.lang.String str10 = dummyQueryBuilder8.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str12 = dummyQueryBuilder11.toString();
        java.lang.String str13 = dummyQueryBuilder11.toString();
        java.lang.String str14 = dummyQueryBuilder11.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str16 = dummyQueryBuilder15.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray17 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder7, dummyQueryBuilder8, dummyQueryBuilder11, dummyQueryBuilder15 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet18 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray17);
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet19 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) strArray4, (java.lang.Object[]) baseQueryBuilderArray17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        org.junit.rules.TestRule testRule47 = simpleIndexQueryParserTests24.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests24);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        char[] charArray7 = new char[] { ' ', ' ', 'a', '4', '#', 'a' };
        char[] charArray8 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", charArray7, charArray8);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
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
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        org.junit.Assert.assertArrayEquals("hi!", doubleArray13, doubleArray22, (double) (short) 100);
        double[] doubleArray73 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray79 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray73, doubleArray79, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray79, (double) ' ');
        double[] doubleArray90 = new double[] { 4, '4', 2, (byte) 10, 10L, 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray13, doubleArray90, (double) '#');
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        long[] longArray3 = new long[] { '4', 0, 100L };
        long[] longArray6 = new long[] { (short) 1, 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 2);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.util.BytesRef bytesRef19 = simpleIndexQueryParserTests16.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests16.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests16.overrideTestDefaultQueryCache();
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.maxfailures");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.awaitsfix");
        simpleIndexQueryParserTests16.assertFieldStatisticsEquals("tests.monster", fields30, fields40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.nightly", indexReader14, fields15, fields40, true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        org.apache.lucene.search.Query query6 = query5.clone();
        float float7 = query5.getBoost();
        float[] floatArray13 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray19 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray19, (float) 100L);
        boolean boolean22 = query5.equals((java.lang.Object) floatArray13);
        float[] floatArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray13, floatArray23, (float) 2);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) (byte) 0, (double) '4');
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader7, (int) (short) 100, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum13, postingsEnum14);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "europarl.lines.txt.gz");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray11, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray19);
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "DummyQuery");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) fields25);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 10, (double) (short) 10);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        char[] charArray4 = new char[] { 'a', ' ', '4' };
        char[] charArray5 = new char[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray4, charArray5);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (-1L));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("node_s_0");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.maxfailures");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests2.assertFieldStatisticsEquals("", fields33, fields41);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService43 = simpleIndexQueryParserTests2.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService44);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "node_s_0", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", intArray1, intArray4);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        long[] longArray3 = new long[] { (short) 100, 3, 1L };
        long[] longArray10 = new long[] { 3, 0, (byte) 100, 3, 10L, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.maxfailures");
        simpleIndexQueryParserTests4.assertFieldStatisticsEquals("random", fields12, fields20);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService22 = null;
        simpleIndexQueryParserTests4.setqueryParser(indexQueryParserService22);
        org.apache.lucene.util.BytesRef bytesRef26 = simpleIndexQueryParserTests4.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests27.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain32 = simpleIndexQueryParserTests31.failureAndSuccessEvents;
        simpleIndexQueryParserTests27.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("tests.weekly", postingsEnum37, postingsEnum38, false);
        org.junit.rules.TestRule testRule41 = simpleIndexQueryParserTests4.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) executorServiceArray0, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
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
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", 100.0d, (double) (byte) 10, (double) 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
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
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        java.lang.Object obj0 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull(obj0);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str8 = dummyQueryBuilder7.toString();
        java.lang.String str9 = dummyQueryBuilder7.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder2, dummyQueryBuilder3, dummyQueryBuilder4, dummyQueryBuilder5, dummyQueryBuilder6, dummyQueryBuilder7 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, dummyQueryBuilderArray10);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderSet12 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryBuilderArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.maxfailures");
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) dummyQueryBuilderArray10, (java.lang.Object[]) strArray16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("{\n  \"dummy\" : { }\n}", false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        char[] charArray4 = new char[] { 'a', ' ', '#' };
        char[] charArray6 = new char[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", charArray4, charArray6);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (-1), numericDocValues14, numericDocValues15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("DummyQuery", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
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
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum3, postingsEnum4, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) (byte) -1);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        long[] longArray5 = new long[] { 5, 1L, 10L, 2, (byte) 1 };
        long[] longArray10 = new long[] { (short) 0, 100, (-1L), (byte) -1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        long[] longArray3 = new long[] { 3, 0L, (short) 100 };
        long[] longArray7 = new long[] { (short) -1, (short) 1, 4 };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray7);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
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
        simpleIndexQueryParserTests3.testConstantScoreParsesFilter();
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        byte[] byteArray1 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", byteArray1, byteArray3);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray26, (float) (byte) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean32 = dummyQuery31.isFilter;
        org.apache.lucene.search.Query query33 = dummyQuery31.clone();
        boolean boolean34 = dummyQuery31.isFilter;
        org.apache.lucene.search.Query query35 = dummyQuery31.clone();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.search.Query query37 = query35.rewrite(indexReader36);
        org.junit.Assert.assertNotSame((java.lang.Object) floatArray26, (java.lang.Object) indexReader36);
        float[] floatArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray26, floatArray39, (float) (byte) 0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        long[] longArray4 = new long[] { 0, ' ', 'a' };
        long[] longArray6 = new long[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray4, longArray6);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 0L, (double) 100L);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        long[] longArray1 = new long[] { 0L };
        long[] longArray2 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        long[] longArray1 = new long[] { 4 };
        long[] longArray2 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray1, longArray2);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        org.apache.lucene.index.IndexReader indexReader1 = null;
        org.apache.lucene.search.Query query2 = dummyQuery0.rewrite(indexReader1);
        java.lang.String str3 = dummyQuery0.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("DummyQuery", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests4.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) dummyQuery0, (java.lang.Object) indexQueryParserService13);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        simpleIndexQueryParserTests3.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", objArray1, (java.lang.Object[]) strArray5);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str4 = dummyQuery1.toString("tests.slow");
        java.lang.String str6 = dummyQuery1.toString("random");
        boolean boolean7 = dummyQuery1.getisFilter();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) dummyQuery1, (java.lang.Object) "tests.maxfailures");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests10);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.maxfailures");
        simpleIndexQueryParserTests10.assertFieldStatisticsEquals("random", fields18, fields26);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService28 = null;
        simpleIndexQueryParserTests10.setqueryParser(indexQueryParserService28);
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests10.longToPrefixCoded((long) (byte) 1, 1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests33.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests37 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests37.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain38;
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests10.getqueryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests43);
        org.apache.lucene.util.BytesRef bytesRef46 = simpleIndexQueryParserTests43.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef49 = simpleIndexQueryParserTests43.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService50 = simpleIndexQueryParserTests43.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService51 = simpleIndexQueryParserTests43.getqueryParser();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain52;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests10.queryParser;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests10.assertDocsEnumEquals("<unknown>", postingsEnum56, postingsEnum57, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.maxfailures", (java.lang.Object) postingsEnum56);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
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
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray15);
        byte[] byteArray23 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray23);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) 1.0f, (double) (byte) 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        byte[] byteArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", byteArray1, byteArray17);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests40);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.maxfailures");
        simpleIndexQueryParserTests40.assertFieldStatisticsEquals("random", fields48, fields56);
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests40.assertDocsEnumEquals("hi!", postingsEnum59, postingsEnum60, true);
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.maxfailures");
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests40.assertFieldStatisticsEquals("", fields71, fields79);
        simpleIndexQueryParserTests40.setUp();
        simpleIndexQueryParserTests40.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests40.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray35, (java.lang.Object) simpleIndexQueryParserTests40);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (byte) 0, (long) '4');
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        long[] longArray2 = new long[] { 3 };
        long[] longArray7 = new long[] { (byte) 1, 1L, 0L, 2 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", longArray2, longArray7);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray20);
        java.lang.Object[] objArray25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, objArray25);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        short[] shortArray5 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray10 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray15 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray20 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray25 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray30 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[][] shortArray31 = new short[][] { shortArray5, shortArray10, shortArray15, shortArray20, shortArray25, shortArray30 };
        java.util.Set<short[]> shortArraySet32 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray31);
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
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests33.assertPositionsSkippingEquals("tests.weekly", indexReader56, 0, postingsEnum58, postingsEnum59);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService61 = simpleIndexQueryParserTests33.getqueryParser();
        simpleIndexQueryParserTests33.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) shortArraySet32, (java.lang.Object) simpleIndexQueryParserTests33);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        char[] charArray4 = new char[] { '#', '4', '#', 'a' };
        char[] charArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, 0.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (short) 0, (long) 10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
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
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference4.equals(null)", !bytesReference4.equals(null));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) '4', (double) 1.0f);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.maxfailures");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "europarl.lines.txt.gz");
        java.lang.String[] strArray68 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray60, (java.lang.Object[]) strArray68);
        java.lang.String[] strArray75 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields77 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "tests.monster");
        org.apache.lucene.index.Fields fields79 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray75, "europarl.lines.txt.gz");
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray75, (java.lang.Object[]) strArray83);
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray68, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray36, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray36);
        java.lang.Object[] objArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray36, objArray94);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (long) '4', 0L);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        java.util.concurrent.ExecutorService executorService23 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray24 = new java.util.concurrent.ExecutorService[] { executorService23 };
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) executorServiceArray24);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        float[] floatArray0 = null;
        float[] floatArray3 = new float[] { 0, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray0, floatArray3, (float) 5);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        float float45 = dummyQuery0.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        long[] longArray9 = new long[] { (-1), 1L, 10L, (short) -1, (short) 10, ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        long[] longArray2 = new long[] { (short) -1, (short) 0 };
        long[] longArray8 = new long[] { (short) 0, 4, (-1), (short) 10, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray8);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        java.util.Locale[] localeArray0 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet1 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray20);
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
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray50);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) localeArray0, (java.lang.Object[]) strArray20);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        char[] charArray3 = new char[] { ' ', 'a' };
        char[] charArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray4);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1), (double) (byte) 1);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "<unknown>");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.badapples");
        java.lang.Object[] objArray24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) strArray4, objArray24);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("random");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        char[] charArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", charArray3, charArray5);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray7, charArray8);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray4, charArray7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray4);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("DummyQuery", postingsEnum3, postingsEnum4, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.failfast", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = simpleIndexQueryParserTests1.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) indexQueryParserService17);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean8 = dummyQuery7.getisFilter();
        java.lang.String str10 = dummyQuery7.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.ensureCheckIndexPassed();
        simpleIndexQueryParserTests11.setUp();
        org.junit.rules.RuleChain ruleChain15 = null;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain15;
        boolean boolean17 = dummyQuery7.equals((java.lang.Object) simpleIndexQueryParserTests11);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests11.setqueryParser(indexQueryParserService19);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests11.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) 0, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        long[] longArray1 = new long[] {};
        long[] longArray7 = new long[] { 0, 5, (byte) -1, (-1), ' ' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", longArray1, longArray7);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        java.lang.String str12 = dummyQuery0.toString("europarl.lines.txt.gz");
        boolean boolean13 = dummyQuery0.getisFilter();
        org.apache.lucene.search.Query query14 = dummyQuery0.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query14);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testQueryStringFields2Builder();
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        boolean boolean2 = dummyQuery0.getisFilter();
        float float3 = dummyQuery0.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery4 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean4 = dummyQuery3.isFilter;
        org.apache.lucene.search.Query query5 = dummyQuery3.clone();
        boolean boolean6 = dummyQuery3.isFilter;
        java.lang.String str7 = dummyQuery3.toString();
        boolean boolean8 = dummyQuery1.equals((java.lang.Object) str7);
        boolean boolean9 = dummyQuery1.isFilter;
        boolean boolean10 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.isFilter;
        org.apache.lucene.search.Query query13 = dummyQuery11.clone();
        boolean boolean14 = dummyQuery11.isFilter;
        java.lang.String str15 = dummyQuery11.toString();
        org.apache.lucene.search.Query query16 = dummyQuery11.clone();
        dummyQuery11.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) dummyQuery1, (java.lang.Object) false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (double) (byte) 100, (double) 35.0f);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        java.lang.String str2 = dummyQuery0.toString("tests.slow");
        dummyQuery0.setisFilter(true);
        dummyQuery0.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests7.assertDocsEnumEquals("DummyQuery", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests7.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests7.ensureCheckIndexPassed();
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests7.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) true, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
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
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        int[] intArray4 = new int[] { '4', (short) 100, (byte) 0 };
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray7, intArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray4, intArray7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        java.util.Locale[] localeArray1 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet2 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        java.util.Set<java.util.Locale> localeSet3 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests4.queryParser();
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests7);
        org.apache.lucene.util.BytesRef bytesRef10 = simpleIndexQueryParserTests7.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests7.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService14 = simpleIndexQueryParserTests7.getqueryParser();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests4, (java.lang.Object) simpleIndexQueryParserTests7);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests4.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) localeArray1, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 10 };
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexQueryParserService23, (java.lang.Object) strArray36);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests44);
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.maxfailures");
        simpleIndexQueryParserTests44.assertFieldStatisticsEquals("random", fields52, fields60);
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        simpleIndexQueryParserTests44.assertDocsEnumEquals("hi!", postingsEnum63, postingsEnum64, true);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.apache.lucene.index.Fields fields75 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.maxfailures");
        java.lang.String[] strArray79 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "tests.monster");
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray79, "europarl.lines.txt.gz");
        simpleIndexQueryParserTests44.assertFieldStatisticsEquals("", fields75, fields83);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService85 = simpleIndexQueryParserTests44.queryParser();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests44);
        org.junit.rules.TestRule testRule88 = simpleIndexQueryParserTests44.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) testRule88);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, 1L);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService5);
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) indexQueryParserService5, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
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
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "europarl.lines.txt.gz");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray53, (java.lang.Object[]) strArray61);
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.failfast");
        java.lang.String[] strArray72 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "tests.monster");
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray72, "europarl.lines.txt.gz");
        java.lang.String[] strArray80 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray80, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray72, (java.lang.Object[]) strArray80);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray53, (java.lang.Object[]) strArray72);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "enwiki.random.lines.txt");
        java.lang.String[] strArray89 = new java.lang.String[] { "tests.monster" };
        org.apache.lucene.index.Fields fields91 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray89, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader32, fields87, fields91, true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) intArray1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.weekly", indexReader24, 0, postingsEnum26, postingsEnum27);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = simpleIndexQueryParserTests1.getqueryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.maxfailures");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "<unknown>");
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray23, shortArray24);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray27, shortArray28);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray23, shortArray27);
        short[] shortArray33 = new short[] {};
        short[] shortArray34 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray33, shortArray34);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray37, shortArray38);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray33, shortArray37);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray23, shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray23);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray45, shortArray49);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray54, shortArray55);
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray49, shortArray54);
        org.junit.Assert.assertArrayEquals("tests.failfast", shortArray23, shortArray54);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) strArray3, (java.lang.Object) shortArray54);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (double) (short) 1, (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 0, (double) (short) 100, 10.0d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) 3);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        simpleIndexQueryParserTests4.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray27);
        java.lang.String[] strArray34 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields36 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "tests.monster");
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "europarl.lines.txt.gz");
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "europarl.lines.txt.gz");
        java.lang.String[] strArray50 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray50, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray42, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray34, (java.lang.Object[]) strArray50);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray34);
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray34, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.maxfailures");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("DummyQuery", fields57, fields69);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 100, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFilteredQueryBuilder();
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
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
        double[] doubleArray68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", doubleArray14, doubleArray68, 100.0d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        long[] longArray4 = new long[] { (short) 100, '4', 100 };
        long[] longArray5 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", longArray4, longArray5);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        boolean boolean5 = dummyQuery0.getisFilter();
        java.lang.String str6 = dummyQuery0.toString();
        dummyQuery0.setisFilter(false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        long[] longArray6 = new long[] { (short) 0, 0, 3, 0L, ' ', (-1) };
        long[] longArray8 = new long[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray8);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        java.lang.String str4 = dummyQueryBuilder0.toString();
        java.lang.String str5 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference6.equals(null)", !bytesReference6.equals(null));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("", obj1);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (short) 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testTermsFilterQueryBuilder();
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        byte[] byteArray0 = null;
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray4, byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray1);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray5 = new int[] {};
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray5, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals("hi!", intArray5, intArray8);
        org.junit.Assert.assertArrayEquals("random", intArray1, intArray5);
        int[] intArray15 = new int[] { (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray1, intArray15);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        float[] floatArray6 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray12 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray12, (float) 100L);
        float[] floatArray20 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray26 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray20, floatArray26, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray26, (float) (byte) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests31);
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests31.indexedValueForSearch((long) (short) -1);
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) floatArray6, (java.lang.Object) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests36);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.apache.lucene.index.Fields fields52 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.maxfailures");
        simpleIndexQueryParserTests36.assertFieldStatisticsEquals("random", fields44, fields52);
        simpleIndexQueryParserTests36.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService55 = simpleIndexQueryParserTests36.queryParser();
        simpleIndexQueryParserTests36.setIndexWriterMaxDocs(0);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService58 = simpleIndexQueryParserTests36.queryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.nightly", (java.lang.Object) simpleIndexQueryParserTests36);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        byte[] byteArray6 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (byte) 100, (double) 35.0f);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", 100L, (long) 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray4);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        int[] intArray5 = new int[] { (byte) -1, (short) 10, '4', (short) 1, '4' };
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        org.junit.Assert.assertArrayEquals("hi!", intArray11, intArray14);
        org.junit.Assert.assertArrayEquals("random", intArray7, intArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray5, intArray7);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 35.0f, 100.0d, (double) (short) -1);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (double) 5, 0.0d, 0.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("hi!", false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
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
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.weekly", postingsEnum33, postingsEnum34, false);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields45 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.monster");
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.maxfailures");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray43, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.slow", indexReader38, fields39, fields51, false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (-1));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
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
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) 10);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        long[] longArray6 = new long[] { '4', (byte) 10, (short) -1, (byte) 10, (byte) -1, '#' };
        long[] longArray13 = new long[] { 2, (byte) 1, 0L, 4, (byte) 0, 100L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean14 = dummyQuery13.isFilter;
        org.apache.lucene.search.Query query15 = dummyQuery13.clone();
        boolean boolean16 = dummyQuery13.isFilter;
        java.lang.String str17 = dummyQuery13.toString();
        org.apache.lucene.search.Query query18 = dummyQuery13.clone();
        boolean boolean19 = dummyQuery13.getisFilter();
        boolean boolean20 = dummyQuery13.getisFilter();
        float float21 = dummyQuery13.getBoost();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.search.Query query23 = dummyQuery13.rewrite(indexReader22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain11, (java.lang.Object) query23);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", 0L, 10L);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        byte[] byteArray1 = null;
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
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray10);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray21, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray18);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray29);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray29, byteArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray1, byteArray35);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", 0.0d, (double) (byte) -1);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBuilder();
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) 4);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray11);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray15);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray23);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray34);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray7, byteArray34);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) ' ', (double) (short) 100);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
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
        java.util.concurrent.ExecutorService executorService18 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] { executorService18 };
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) dummyQueryArray16, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) 100);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 0, 4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", (int) (byte) 10, numericDocValues19, numericDocValues20);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean63 = dummyQuery62.isFilter;
        boolean boolean64 = dummyQuery62.getisFilter();
        float float65 = dummyQuery62.getBoost();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) shortArray42, (java.lang.Object) dummyQuery62);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        boolean boolean6 = dummyQuery0.getisFilter();
        float float7 = dummyQuery0.getBoost();
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query10 = dummyQuery0.clone();
        float float11 = query10.getBoost();
        query10.setBoost((float) 10L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery(query10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues6 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", (-1), numericDocValues6, numericDocValues7);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str8 = dummyQueryBuilder7.toString();
        java.lang.String str9 = dummyQueryBuilder7.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] dummyQueryBuilderArray10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder[] { dummyQueryBuilder2, dummyQueryBuilder3, dummyQueryBuilder4, dummyQueryBuilder5, dummyQueryBuilder6, dummyQueryBuilder7 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, dummyQueryBuilderArray10);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderSet12 = org.apache.lucene.util.LuceneTestCase.asSet(dummyQueryBuilderArray10);
        java.lang.String[] strArray16 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "tests.monster");
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray16, "europarl.lines.txt.gz");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "europarl.lines.txt.gz");
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray24, (java.lang.Object[]) strArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray16, (java.lang.Object[]) strArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) dummyQueryBuilderArray10, (java.lang.Object[]) strArray32);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        long[] longArray6 = new long[] { 5, (short) 0, 1L, (short) -1, 5, 0 };
        long[] longArray12 = new long[] { (byte) 100, 100L, (byte) 10, 0L, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray12);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "europarl.lines.txt.gz");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "europarl.lines.txt.gz");
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray15, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray23);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "europarl.lines.txt.gz");
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray41);
        java.lang.String[] strArray48 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray48, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray33, (java.lang.Object[]) strArray48);
        java.lang.String[] strArray56 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "tests.monster");
        org.apache.lucene.index.Fields fields60 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray56, "europarl.lines.txt.gz");
        java.lang.String[] strArray64 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray64, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray64);
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray56, (java.lang.Object[]) strArray71);
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.apache.lucene.index.Fields fields82 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "europarl.lines.txt.gz");
        java.lang.String[] strArray86 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray86, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray78, (java.lang.Object[]) strArray86);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) strArray56, (java.lang.Object[]) strArray86);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) strArray48, (java.lang.Object[]) strArray86);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray7, (java.lang.Object[]) strArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean3, (java.lang.Object) strArray7);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 10, (double) 100.0f, (double) 2);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader6, 0, postingsEnum8, postingsEnum9, false);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        java.lang.Object obj14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, obj14);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
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
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.nightly");
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
        simpleIndexQueryParserTests55.overrideTestDefaultQueryCache();
        java.lang.String str79 = simpleIndexQueryParserTests55.getTestName();
        org.junit.rules.TestRule testRule80 = simpleIndexQueryParserTests55.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", (java.lang.Object) "tests.nightly", (java.lang.Object) testRule80);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader9, (int) (byte) 10, postingsEnum11, postingsEnum12);
        org.apache.lucene.util.BytesRef bytesRef16 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (-1), 5);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "<unknown>");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests1.queryParser();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        java.lang.String[] strArray10 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields12 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "tests.monster");
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray10, "europarl.lines.txt.gz");
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray18);
        java.lang.String[] strArray25 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "tests.monster");
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray25, "europarl.lines.txt.gz");
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "europarl.lines.txt.gz");
        java.lang.String[] strArray41 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray41, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray33, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray10, (java.lang.Object[]) strArray25);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray59);
        java.lang.String[] strArray66 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray66, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray66);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray25, (java.lang.Object[]) strArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus71 = simpleIndexQueryParserTests0.ensureGreen(strArray51);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) (short) 10);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
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
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
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
        simpleIndexQueryParserTests12.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = dummyQueryBuilder0.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference3.equals(null)", !bytesReference3.equals(null));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str18 = dummyQueryBuilder17.toString();
        java.lang.String str19 = dummyQueryBuilder17.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str21 = dummyQueryBuilder20.toString();
        java.lang.String str22 = dummyQueryBuilder20.toString();
        java.lang.String str23 = dummyQueryBuilder20.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str25 = dummyQueryBuilder24.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray26 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder16, dummyQueryBuilder17, dummyQueryBuilder20, dummyQueryBuilder24 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet27 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray4, (java.lang.Object[]) baseQueryBuilderArray26);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreQueryBuilder();
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        dummyQuery0.isFilter = false;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean7 = dummyQuery6.getisFilter();
        java.lang.String str8 = dummyQuery6.toString();
        boolean boolean10 = dummyQuery6.equals((java.lang.Object) 0.0f);
        boolean boolean11 = dummyQuery6.getisFilter();
        java.lang.Class<?> wildcardClass12 = dummyQuery6.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) dummyQuery6);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService27 = simpleIndexQueryParserTests1.queryParser();
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray30, shortArray34);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray40);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService27, (java.lang.Object) shortArray40);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray47, shortArray48);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray47, shortArray51);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray61, shortArray62);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray57, shortArray61);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray47, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray40, shortArray47);
        double[] doubleArray73 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray79 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray73, doubleArray79, (double) 100L);
        double[] doubleArray88 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray94 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray88, doubleArray94, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray73, doubleArray88, (double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray40, (java.lang.Object) 1.0f);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
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
        simpleIndexQueryParserTests3.testConstantScoreParsesFilter();
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query5 = dummyQuery1.clone();
        dummyQuery1.setisFilter(true);
        dummyQuery1.isFilter = false;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean13 = dummyQuery12.isFilter;
        org.apache.lucene.search.Query query14 = dummyQuery12.clone();
        boolean boolean15 = dummyQuery12.isFilter;
        java.lang.String str16 = dummyQuery12.toString();
        boolean boolean17 = dummyQuery10.equals((java.lang.Object) str16);
        java.lang.String str19 = dummyQuery10.toString("europarl.lines.txt.gz");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("DummyQuery", (java.lang.Object) false, (java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
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
        char[] charArray18 = new char[] { '4', 'a', 'a' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray2, charArray18);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
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
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) (short) 0, (double) 10);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        long[] longArray3 = new long[] { (byte) 100, 10 };
        long[] longArray9 = new long[] { 2, 1, (short) 1, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray3, longArray9);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 100, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
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
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.failfast");
        java.util.concurrent.ExecutorService[] executorServiceArray19 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray19);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        java.lang.Object obj1 = null;
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests2.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests2.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("random", obj1, (java.lang.Object) indexQueryParserService26);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        long[] longArray1 = new long[] {};
        long[] longArray5 = new long[] { (byte) 10, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", longArray1, longArray5);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "europarl.lines.txt.gz");
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray13, (java.lang.Object[]) strArray21);
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("{\n  \"dummy\" : { }\n}", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray13);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 0, (long) 4);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        java.lang.Object[] objArray1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray6, (java.lang.Object[]) strArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", objArray1, (java.lang.Object[]) strArray21);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
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
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("random", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        char[] charArray1 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", charArray1, charArray24);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("europarl.lines.txt.gz", false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests27);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = null;
        simpleIndexQueryParserTests27.queryParser = indexQueryParserService30;
        simpleIndexQueryParserTests27.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests27.queryParser = indexQueryParserService33;
        org.apache.lucene.util.BytesRef bytesRef37 = simpleIndexQueryParserTests27.longToPrefixCoded(1L, 1);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests27.assertDocsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader39, 5, postingsEnum41, postingsEnum42, true);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests27.assertDocsSkippingEquals("tests.awaitsfix", indexReader46, 0, postingsEnum48, postingsEnum49, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService26, (java.lang.Object) 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
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
        boolean boolean18 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests19);
        simpleIndexQueryParserTests19.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests19.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests19.setqueryParser(indexQueryParserService23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) dummyQuery1, (java.lang.Object) simpleIndexQueryParserTests19);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "node_s_0");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.maxfailures", postingsEnum5, postingsEnum6, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.maxfailures");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) 3);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
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
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests51 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain52 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        simpleIndexQueryParserTests51.assertDocsEnumEquals("random", postingsEnum54, postingsEnum55, true);
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.maxfailures");
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "europarl.lines.txt.gz");
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) strArray78);
        org.apache.lucene.index.Fields fields83 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.failfast");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "<unknown>");
        simpleIndexQueryParserTests51.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields66, fields87);
        org.junit.rules.RuleChain ruleChain89 = simpleIndexQueryParserTests51.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests51);
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests51.assertDocsAndPositionsEnumEquals("DummyQuery", postingsEnum92, postingsEnum93);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
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
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
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
        simpleIndexQueryParserTests12.testTermQueryBuilder();
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str2 = mockMoreLikeThisFetchService1.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str4 = mockMoreLikeThisFetchService3.nodeName();
        java.lang.String str5 = mockMoreLikeThisFetchService3.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray8 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService1, mockMoreLikeThisFetchService3, mockMoreLikeThisFetchService6, mockMoreLikeThisFetchService7 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray8);
        short[] shortArray14 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray19 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray24 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray29 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray34 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[] shortArray39 = new short[] { (byte) 10, (short) 10, (short) 0, (byte) 1 };
        short[][] shortArray40 = new short[][] { shortArray14, shortArray19, shortArray24, shortArray29, shortArray34, shortArray39 };
        java.util.Set<short[]> shortArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(shortArray40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) abstractComponentArray8, (java.lang.Object[]) shortArray40);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
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
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) 1L);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray3, charArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray13);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) charArray6, (java.lang.Object) byteArray17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (long) 2, (long) (-1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("europarl.lines.txt.gz");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        boolean boolean5 = dummyQuery1.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass6 = dummyQuery1.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean8 = dummyQuery7.isFilter;
        org.apache.lucene.search.Query query9 = dummyQuery7.clone();
        dummyQuery7.isFilter = false;
        dummyQuery7.isFilter = false;
        dummyQuery7.setBoost((float) 1L);
        dummyQuery7.isFilter = false;
        dummyQuery7.isFilter = false;
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) wildcardClass6, (java.lang.Object) dummyQuery7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests21);
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests21.queryParser;
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests21.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader30, (int) (byte) 10, postingsEnum32, postingsEnum33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests21.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "node_s_0", (java.lang.Object) indexQueryParserService35);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        double[] doubleArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray23, (double) 0L);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        long[] longArray2 = new long[] { 0 };
        long[] longArray7 = new long[] { (-1), 4, '#', '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("DummyQuery", longArray2, longArray7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str2 = dummyQueryBuilder1.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests3);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.monster");
        java.lang.String[] strArray15 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.monster");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray15, "tests.maxfailures");
        simpleIndexQueryParserTests3.assertFieldStatisticsEquals("random", fields11, fields19);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader23, 0, postingsEnum25, postingsEnum26);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("hi!", indexReader29, (int) (short) -1, postingsEnum31, postingsEnum32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) str2, (java.lang.Object) (short) -1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        java.lang.String str3 = dummyQuery1.toString();
        boolean boolean5 = dummyQuery1.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query6 = dummyQuery1.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame(obj0, (java.lang.Object) query6);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray7 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray7, "tests.monster");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.maxfailures");
        simpleIndexQueryParserTests1.assertFieldStatisticsEquals("random", fields9, fields17);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean22 = dummyQuery21.getisFilter();
        java.lang.String str24 = dummyQuery21.toString("tests.slow");
        java.lang.String str26 = dummyQuery21.toString("random");
        dummyQuery21.setisFilter(false);
        org.apache.lucene.search.Query query29 = dummyQuery21.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) query29);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.weekly", false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.lang.String[] strArray9 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.monster");
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.maxfailures");
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray9, "<unknown>");
        java.lang.String[] strArray22 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "tests.monster");
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray22, "europarl.lines.txt.gz");
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray22, (java.lang.Object[]) strArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray37);
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "europarl.lines.txt.gz");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray54, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray46);
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "");
        org.apache.lucene.index.Fields fields71 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray9, (java.lang.Object[]) strArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strArray46);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (byte) 100, (long) 10);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
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
        java.lang.String[] strArray52 = new java.lang.String[] { "tests.monster" };
        org.apache.lucene.index.Fields fields54 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "tests.monster");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) simpleIndexQueryParserTestsArray48, (java.lang.Object[]) strArray52);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) -1, (double) 4, (double) (byte) 1);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
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
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray45, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray45);
        java.lang.Object[] objArray65 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray45, objArray65);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("DummyQuery", postingsEnum5, postingsEnum6, false);
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        java.lang.String str12 = simpleIndexQueryParserTests3.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = simpleIndexQueryParserTests3.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean15 = dummyQuery14.isFilter;
        org.apache.lucene.search.Query query16 = dummyQuery14.clone();
        dummyQuery14.isFilter = false;
        dummyQuery14.isFilter = false;
        dummyQuery14.setBoost((float) 1L);
        dummyQuery14.isFilter = false;
        float float25 = dummyQuery14.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        boolean boolean33 = dummyQuery14.equals((java.lang.Object) ruleChain29);
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain29;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) dummyQuery1, (java.lang.Object) ruleChain29);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str4 = dummyQueryBuilder3.toString();
        java.lang.String str5 = dummyQueryBuilder3.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str7 = dummyQueryBuilder6.toString();
        java.lang.String str8 = dummyQueryBuilder6.toString();
        java.lang.String str9 = dummyQueryBuilder6.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str11 = dummyQueryBuilder10.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray12 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder2, dummyQueryBuilder3, dummyQueryBuilder6, dummyQueryBuilder10 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet13 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean15 = dummyQuery14.getisFilter();
        java.lang.String str17 = dummyQuery14.toString("tests.slow");
        java.lang.String str19 = dummyQuery14.toString("random");
        boolean boolean20 = dummyQuery14.getisFilter();
        float float21 = dummyQuery14.getBoost();
        org.apache.lucene.search.Query query22 = dummyQuery14.clone();
        org.junit.Assert.assertNotSame("DummyQuery", (java.lang.Object) baseQueryBuilderArray12, (java.lang.Object) dummyQuery14);
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "europarl.lines.txt.gz");
        java.lang.String[] strArray36 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields38 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray36, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray28, (java.lang.Object[]) strArray36);
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.failfast");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray55);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray28, (java.lang.Object[]) strArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) baseQueryBuilderArray12, (java.lang.Object[]) strArray47);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 0, (double) 100L, (double) 10L);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("<unknown>");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        long[] longArray3 = new long[] { 10, 10 };
        long[] longArray9 = new long[] { 0, (byte) 10, (byte) 1, (byte) -1, 4 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray3, longArray9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
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
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService30 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService30);
        java.lang.String str32 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean36 = dummyQuery35.getisFilter();
        java.lang.String str38 = dummyQuery35.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests39);
        simpleIndexQueryParserTests39.ensureCheckIndexPassed();
        simpleIndexQueryParserTests39.setUp();
        org.junit.rules.RuleChain ruleChain43 = null;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain43;
        boolean boolean45 = dummyQuery35.equals((java.lang.Object) simpleIndexQueryParserTests39);
        simpleIndexQueryParserTests39.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests39.setIndexWriterMaxDocs((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object) bytesRef34, (java.lang.Object) simpleIndexQueryParserTests39);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
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
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        long[] longArray3 = new long[] { 1, (short) -1, 1L };
        long[] longArray9 = new long[] { (short) 100, ' ', '#', 10, '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray9);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        java.lang.String str5 = dummyQuery0.toString("random");
        dummyQuery0.setisFilter(false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.search.Query query9 = dummyQuery0.rewrite(indexReader8);
        dummyQuery0.setisFilter(false);
        boolean boolean12 = dummyQuery0.getisFilter();
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
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) boolean12, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", 10L, (long) 'a');
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
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
        double[] doubleArray72 = new double[] { 1.0d, 100L, 35.0f, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray23, doubleArray72, (double) (short) -1);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
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
        java.lang.String[] strArray68 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields70 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "tests.monster");
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray68, "europarl.lines.txt.gz");
        java.lang.String[] strArray76 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray76, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray68, (java.lang.Object[]) strArray76);
        java.lang.String[] strArray83 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields85 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "tests.monster");
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray83, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray76, (java.lang.Object[]) strArray83);
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) strArray40, (java.lang.Object[]) strArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) strArray40);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("DummyQuery", indexReader5, 10, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (short) 1, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "europarl.lines.txt.gz");
        java.lang.String[] strArray28 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields30 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray28, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray28);
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.failfast");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "europarl.lines.txt.gz");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray39, (java.lang.Object[]) strArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray39);
        org.junit.Assert.assertArrayEquals("<unknown>", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str56 = mockMoreLikeThisFetchService55.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService57 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str58 = mockMoreLikeThisFetchService57.nodeName();
        java.lang.String str59 = mockMoreLikeThisFetchService57.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService60 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService61 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray62 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService55, mockMoreLikeThisFetchService57, mockMoreLikeThisFetchService60, mockMoreLikeThisFetchService61 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray62);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray62);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) abstractComponentArray62);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 100, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        org.apache.lucene.search.Query query3 = dummyQuery0.clone();
        dummyQuery0.setBoost((float) (-1L));
        float float6 = dummyQuery0.getBoost();
        boolean boolean7 = dummyQuery0.getisFilter();
        boolean boolean8 = dummyQuery0.getisFilter();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (long) 1, (long) (short) 100);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (-1L), (long) 5);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService29);
        java.lang.String str31 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("{\n  \"dummy\" : { }\n}", postingsEnum35, postingsEnum36);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.fail("");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 0, (long) (byte) 100);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        org.apache.lucene.search.Query query11 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests12.indexedValueForSearch(10L);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) 0);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader20, 3, postingsEnum22, postingsEnum23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) query11, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) (-1.0d));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("", false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("<unknown>", true);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.failfast");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray27, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray19, (java.lang.Object[]) strArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.slow", (java.lang.Object) strArray46);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests12);
        java.lang.String[] strArray18 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray18, "tests.monster");
        java.lang.String[] strArray24 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields26 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.monster");
        org.apache.lucene.index.Fields fields28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray24, "tests.maxfailures");
        simpleIndexQueryParserTests12.assertFieldStatisticsEquals("random", fields20, fields28);
        java.lang.String[] strArray33 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields35 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray33, "tests.monster");
        java.lang.String[] strArray39 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray39, "tests.monster");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        org.apache.lucene.index.Fields fields58 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.nightly");
        java.lang.String[] strArray62 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields64 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "tests.monster");
        org.apache.lucene.index.Fields fields66 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray62, "europarl.lines.txt.gz");
        java.lang.Iterable[] iterableArray68 = new java.lang.Iterable[5];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray69 = (java.lang.Iterable<java.lang.String>[]) iterableArray68;
        strIterableArray69[0] = fields20;
        strIterableArray69[1] = fields35;
        strIterableArray69[2] = fields41;
        strIterableArray69[3] = fields58;
        strIterableArray69[4] = fields66;
        java.util.Set<java.lang.Iterable<java.lang.String>> strIterableSet80 = org.apache.lucene.util.LuceneTestCase.asSet(strIterableArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) strIterableArray69);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10L, (double) 0);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        long[] longArray5 = new long[] { 0L, (-1), (short) 1, 2 };
        long[] longArray11 = new long[] { (short) 10, ' ', (byte) 0, 100L, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray11);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
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
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 0L, (long) 'a');
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
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
        simpleIndexQueryParserTests4.testFilteredQueryBuilder();
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
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
        simpleIndexQueryParserTests14.assertDocsEnumEquals("hi!", postingsEnum33, postingsEnum34, true);
        org.apache.lucene.util.BytesRef bytesRef39 = simpleIndexQueryParserTests14.longToPrefixCoded((long) 10, 1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService40 = simpleIndexQueryParserTests14.queryParser();
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray43, shortArray44);
        short[] shortArray47 = new short[] {};
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray47, shortArray48);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray43, shortArray47);
        short[] shortArray52 = new short[] {};
        short[] shortArray53 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray52, shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray43, shortArray53);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) indexQueryParserService40, (java.lang.Object) shortArray53);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) abstractComponentList12, (java.lang.Object) shortArray53);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray60, shortArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.monster", (java.lang.Object) shortArray60);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) (short) 100, (double) 0, (double) 35.0f);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        org.junit.Assert.assertArrayEquals("hi!", intArray1, intArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests8);
        simpleIndexQueryParserTests8.ensureCheckIndexPassed();
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService12 = simpleIndexQueryParserTests8.queryParser;
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests8.longToPrefixCoded((long) 10, (int) ' ');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService16 = simpleIndexQueryParserTests8.queryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService17 = null;
        simpleIndexQueryParserTests8.queryParser = indexQueryParserService17;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray4, (java.lang.Object) indexQueryParserService17);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
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
        float[] floatArray53 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray59 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray59, (float) 100L);
        float[] floatArray67 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray73 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray73, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray53, floatArray67, (float) 0L);
        float[] floatArray83 = new float[] { (-1), 2, '#', 4, (short) -1 };
        float[] floatArray89 = new float[] { (byte) 10, '4', 100.0f, (short) 100, (-1.0f) };
        org.junit.Assert.assertArrayEquals(floatArray83, floatArray89, (float) 100L);
        org.junit.Assert.assertArrayEquals("tests.nightly", floatArray67, floatArray89, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray67, 10.0f);
        float[] floatArray96 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(floatArray67, floatArray96, (float) (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 0L, (double) (byte) 1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        long[] longArray3 = new long[] { (short) 1, 'a' };
        long[] longArray5 = new long[] { (-1L) };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
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
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum18, postingsEnum19, true);
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields44 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "tests.monster");
        org.apache.lucene.index.Fields fields46 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray42, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray35, (java.lang.Object[]) strArray42);
        java.lang.String[] strArray51 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "tests.monster");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "europarl.lines.txt.gz");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "europarl.lines.txt.gz");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray59, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray35, (java.lang.Object[]) strArray51);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean74 = dummyQuery73.isFilter;
        org.apache.lucene.search.Query query75 = dummyQuery73.clone();
        boolean boolean76 = dummyQuery73.isFilter;
        float float77 = dummyQuery73.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray51, (java.lang.Object) float77);
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray51, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray84 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields86 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray84, "tests.monster");
        org.apache.lucene.index.Fields fields88 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray84, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray51, (java.lang.Object[]) strArray84);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArray84);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests1.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean12 = dummyQuery11.getisFilter();
        java.lang.String str14 = dummyQuery11.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        simpleIndexQueryParserTests15.ensureCheckIndexPassed();
        simpleIndexQueryParserTests15.setUp();
        org.junit.rules.RuleChain ruleChain19 = null;
        simpleIndexQueryParserTests15.failureAndSuccessEvents = ruleChain19;
        boolean boolean21 = dummyQuery11.equals((java.lang.Object) simpleIndexQueryParserTests15);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = null;
        simpleIndexQueryParserTests15.setqueryParser(indexQueryParserService23);
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) ruleChain9, (java.lang.Object) simpleIndexQueryParserTests15);
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
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray52, "europarl.lines.txt.gz");
        java.lang.String[] strArray60 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields62 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray60, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray60);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray44);
        java.lang.String[] strArray70 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "tests.monster");
        org.apache.lucene.index.Fields fields74 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray70, "europarl.lines.txt.gz");
        java.lang.String[] strArray78 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray78, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray70, (java.lang.Object[]) strArray78);
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray70, (java.lang.Object[]) strArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.weekly", (java.lang.Object) strArray70);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
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
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        long[] longArray3 = new long[] { (byte) 0, (byte) 0, 100L };
        long[] longArray5 = new long[] { 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray5);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        long[] longArray3 = new long[] { (short) 10, (byte) -1 };
        long[] longArray10 = new long[] { 100L, (byte) 100, (short) 10, 10L, 3, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", longArray3, longArray10);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        long[] longArray6 = new long[] { (byte) 0, 5, (byte) 1, (byte) 10, (short) 10, (short) -1 };
        long[] longArray13 = new long[] { 1L, 2, 4, 100, 1, 10L };
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals(longArray6, longArray13);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 0);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '4', (int) ' ');
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "europarl.lines.txt.gz");
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
        org.apache.lucene.index.Fields fields68 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("europarl.lines.txt.gz", fields16, fields68);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        char[] charArray0 = null;
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray2, charArray3);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray3);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService29 = null;
        simpleIndexQueryParserTests13.setqueryParser(indexQueryParserService29);
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests13.assertDocValuesEquals("DummyQuery", (int) ' ', numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        long[] longArray2 = new long[] { 2, 2 };
        long[] longArray9 = new long[] { 'a', (short) 100, 1, (short) 0, 0L, 5 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray2, longArray9);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 'a');
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.maxfailures");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray10);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("enwiki.random.lines.txt", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str3 = mockMoreLikeThisFetchService2.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        java.lang.String str5 = mockMoreLikeThisFetchService4.nodeName();
        java.lang.String str6 = mockMoreLikeThisFetchService4.nodeName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService mockMoreLikeThisFetchService8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.MockMoreLikeThisFetchService();
        org.elasticsearch.common.component.AbstractComponent[] abstractComponentArray9 = new org.elasticsearch.common.component.AbstractComponent[] { mockMoreLikeThisFetchService2, mockMoreLikeThisFetchService4, mockMoreLikeThisFetchService7, mockMoreLikeThisFetchService8 };
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, abstractComponentArray9);
        java.util.List<org.elasticsearch.common.component.AbstractComponent> abstractComponentList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, abstractComponentArray9);
        java.util.Set<org.elasticsearch.common.component.AbstractComponent> abstractComponentSet12 = org.apache.lucene.util.LuceneTestCase.asSet(abstractComponentArray9);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures13 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures13);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures16 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures15);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray17 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures14, testRuleIgnoreAfterMaxFailures16 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet18 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) abstractComponentArray9, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray17);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        java.lang.Object[] objArray0 = null;
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
        org.apache.lucene.index.Fields fields43 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "");
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "europarl.lines.txt.gz");
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "europarl.lines.txt.gz");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray55, (java.lang.Object[]) strArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray47, (java.lang.Object[]) strArray63);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests68);
        org.apache.lucene.util.BytesRef bytesRef71 = simpleIndexQueryParserTests68.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef74 = simpleIndexQueryParserTests68.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService75 = simpleIndexQueryParserTests68.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService76 = simpleIndexQueryParserTests68.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService77 = null;
        simpleIndexQueryParserTests68.queryParser = indexQueryParserService77;
        java.lang.String str79 = simpleIndexQueryParserTests68.getTestName();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray63, (java.lang.Object) str79);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray63);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) strArray63);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("tests.awaitsfix", false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        long[] longArray5 = new long[] { (short) 10, (short) -1, 2, (short) 10 };
        long[] longArray8 = new long[] { ' ', (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", longArray5, longArray8);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        long[] longArray7 = new long[] { ' ', 1L, 1, (short) 0, (byte) -1, (byte) 10 };
        long[] longArray8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", longArray7, longArray8);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray4, intArray7);
        int[] intArray10 = new int[] {};
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray10, intArray11);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray4, intArray10);
        int[] intArray16 = new int[] {};
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray16, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray17, intArray20);
        int[] intArray23 = new int[] {};
        int[] intArray24 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray23, intArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray17, intArray23);
        org.junit.Assert.assertArrayEquals("DummyQuery", intArray10, intArray17);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray33);
        int[] intArray39 = new int[] {};
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray39, intArray40);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("hi!", intArray43, intArray46);
        org.junit.Assert.assertArrayEquals("random", intArray39, intArray43);
        int[] intArray52 = new int[] {};
        int[] intArray53 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray52, intArray53);
        int[] intArray55 = new int[] {};
        int[] intArray56 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray55, intArray56);
        org.junit.Assert.assertArrayEquals("hi!", intArray52, intArray55);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray39, intArray52);
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray10, (java.lang.Object) "hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
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
        simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, true);
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", 2, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
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
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests42);
        org.apache.lucene.util.BytesRef bytesRef45 = simpleIndexQueryParserTests42.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef48 = simpleIndexQueryParserTests42.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService49 = null;
        simpleIndexQueryParserTests42.setqueryParser(indexQueryParserService49);
        java.lang.String str51 = simpleIndexQueryParserTests42.getTestName();
        org.apache.lucene.util.BytesRef bytesRef53 = simpleIndexQueryParserTests42.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef56 = simpleIndexQueryParserTests42.longToPrefixCoded((long) (short) 10, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) indexQueryParserService41, (java.lang.Object) (short) 10);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", byteArray2, byteArray6);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray7, intArray8);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray5, intArray8);
        int[] intArray11 = new int[] {};
        int[] intArray12 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray11, intArray12);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray5, intArray11);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray18, intArray21);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray18, intArray24);
        org.junit.Assert.assertArrayEquals("DummyQuery", intArray11, intArray18);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        org.junit.Assert.assertArrayEquals("hi!", intArray30, intArray33);
        int[] intArray38 = new int[] {};
        int[] intArray39 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray38, intArray39);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        org.junit.Assert.assertArrayEquals("node_s_0", intArray39, intArray42);
        org.junit.Assert.assertArrayEquals(intArray33, intArray42);
        org.junit.Assert.assertArrayEquals("tests.weekly", intArray11, intArray42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests47 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests47);
        org.apache.lucene.util.BytesRef bytesRef50 = simpleIndexQueryParserTests47.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef53 = simpleIndexQueryParserTests47.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService54 = simpleIndexQueryParserTests47.getqueryParser();
        simpleIndexQueryParserTests47.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        simpleIndexQueryParserTests47.assertTermsEquals("europarl.lines.txt.gz", indexReader57, terms58, terms59, false);
        org.junit.rules.RuleChain ruleChain62 = simpleIndexQueryParserTests47.failureAndSuccessEvents;
        simpleIndexQueryParserTests47.resetCheckIndexStatus();
        org.apache.lucene.util.BytesRef bytesRef66 = simpleIndexQueryParserTests47.longToPrefixCoded((long) (byte) 100, (int) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) intArray42, (java.lang.Object) '4');
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("", true);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests2.testTermsQueryBuilder();
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.search.Query query6 = query4.rewrite(indexReader5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests7);
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.monster");
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray19, "tests.maxfailures");
        simpleIndexQueryParserTests7.assertFieldStatisticsEquals("random", fields15, fields23);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests7.assertDocsEnumEquals("random", postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("hi!", indexReader31, terms32, terms33, true);
        simpleIndexQueryParserTests7.ensureCleanedUp();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) indexReader5, (java.lang.Object) simpleIndexQueryParserTests7);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        char[] charArray0 = null;
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        org.apache.lucene.index.Fields fields17 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields19 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.failfast");
        java.lang.String[] strArray23 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "tests.monster");
        org.apache.lucene.index.Fields fields27 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray23, "europarl.lines.txt.gz");
        java.lang.String[] strArray31 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray31, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray23, (java.lang.Object[]) strArray31);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) strArray23, (java.lang.Object) "random");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        boolean boolean6 = dummyQuery0.getisFilter();
        boolean boolean7 = dummyQuery0.getisFilter();
        float float8 = dummyQuery0.getBoost();
        dummyQuery0.setBoost((float) '4');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery11 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) 5, (double) 1);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
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
        boolean boolean18 = dummyQuery1.getisFilter();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean20 = dummyQuery19.getisFilter();
        java.lang.String str21 = dummyQuery19.toString();
        boolean boolean23 = dummyQuery19.equals((java.lang.Object) 0.0f);
        dummyQuery19.setisFilter(true);
        java.lang.String str27 = dummyQuery19.toString("tests.failfast");
        boolean boolean28 = dummyQuery1.equals((java.lang.Object) dummyQuery19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery1);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule3 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("DummyQuery", indexReader25, 1, postingsEnum27, postingsEnum28);
        org.junit.rules.TestRule testRule30 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (byte) 100, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
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
        simpleIndexQueryParserTests3.testQueryStringFields3Builder();
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
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
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermQueryBuilder();
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.isFilter;
        java.lang.String str5 = dummyQuery1.toString();
        org.apache.lucene.search.Query query6 = dummyQuery1.clone();
        dummyQuery1.setisFilter(false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests9.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef15 = simpleIndexQueryParserTests9.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        org.apache.lucene.util.BytesRef bytesRef20 = simpleIndexQueryParserTests9.indexedValueForSearch((long) 5);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests9.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) dummyQuery1, (java.lang.Object) simpleIndexQueryParserTests9);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder0 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str1 = dummyQueryBuilder0.toString();
        java.lang.String str2 = dummyQueryBuilder0.toString();
        java.lang.String str3 = dummyQueryBuilder0.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str5 = dummyQueryBuilder4.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray6 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder0, dummyQueryBuilder4 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str8 = dummyQueryBuilder7.toString();
        java.lang.String str9 = dummyQueryBuilder7.toString();
        java.lang.String str10 = dummyQueryBuilder7.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str12 = dummyQueryBuilder11.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray13 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder7, dummyQueryBuilder11 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str15 = dummyQueryBuilder14.toString();
        java.lang.String str16 = dummyQueryBuilder14.toString();
        java.lang.String str17 = dummyQueryBuilder14.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str19 = dummyQueryBuilder18.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray20 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder14, dummyQueryBuilder18 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder21 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str22 = dummyQueryBuilder21.toString();
        java.lang.String str23 = dummyQueryBuilder21.toString();
        java.lang.String str24 = dummyQueryBuilder21.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str26 = dummyQueryBuilder25.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray27 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder21, dummyQueryBuilder25 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder28 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.dummyQuery();
        java.lang.String str29 = dummyQueryBuilder28.toString();
        java.lang.String str30 = dummyQueryBuilder28.toString();
        java.lang.String str31 = dummyQueryBuilder28.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str33 = dummyQueryBuilder32.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray34 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder28, dummyQueryBuilder32 };
        org.elasticsearch.index.query.BaseQueryBuilder[][] baseQueryBuilderArray35 = new org.elasticsearch.index.query.BaseQueryBuilder[][] { baseQueryBuilderArray6, baseQueryBuilderArray13, baseQueryBuilderArray20, baseQueryBuilderArray27, baseQueryBuilderArray34 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder[]> baseQueryBuilderArraySet36 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray35);
        java.util.concurrent.ExecutorService executorService37 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray38 = new java.util.concurrent.ExecutorService[] { executorService37 };
        boolean boolean39 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean40 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean41 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean42 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean43 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean44 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean45 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean46 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean47 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean48 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        boolean boolean49 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) baseQueryBuilderArray35, (java.lang.Object[]) executorServiceArray38);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, (double) (byte) 10, (double) (short) -1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
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
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        org.apache.lucene.index.Fields fields10 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "europarl.lines.txt.gz");
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray14, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray6, (java.lang.Object[]) strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        org.apache.lucene.index.Fields fields25 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("DummyQuery", (java.lang.Object[]) strArray14, (java.lang.Object[]) strArray21);
        java.lang.String[] strArray30 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields32 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "tests.monster");
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "europarl.lines.txt.gz");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "europarl.lines.txt.gz");
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray38, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray30, (java.lang.Object[]) strArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray14, (java.lang.Object[]) strArray30);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery52 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean53 = dummyQuery52.isFilter;
        org.apache.lucene.search.Query query54 = dummyQuery52.clone();
        boolean boolean55 = dummyQuery52.isFilter;
        float float56 = dummyQuery52.getBoost();
        org.junit.Assert.assertNotSame((java.lang.Object) strArray30, (java.lang.Object) float56);
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray30, "{\n  \"dummy\" : { }\n}");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object[]) strArray30, (java.lang.Object[]) strArray63);
        int[] intArray71 = new int[] { 2, (byte) -1 };
        int[] intArray74 = new int[] { 2, (byte) -1 };
        int[] intArray77 = new int[] { 2, (byte) -1 };
        int[] intArray80 = new int[] { 2, (byte) -1 };
        int[][] intArray81 = new int[][] { intArray71, intArray74, intArray77, intArray80 };
        java.util.Set<int[]> intArraySet82 = org.apache.lucene.util.LuceneTestCase.asSet(intArray81);
        java.util.Set<java.lang.Cloneable> cloneableSet83 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[]) intArray81);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) strArray30, (java.lang.Object[]) intArray81);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, 0.0d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
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
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (int) (byte) 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str3 = dummyQueryBuilder2.toString();
        java.lang.String str4 = dummyQueryBuilder2.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str6 = dummyQueryBuilder5.toString();
        java.lang.String str7 = dummyQueryBuilder5.toString();
        java.lang.String str8 = dummyQueryBuilder5.toString();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder();
        java.lang.String str10 = dummyQueryBuilder9.toString();
        org.elasticsearch.index.query.BaseQueryBuilder[] baseQueryBuilderArray11 = new org.elasticsearch.index.query.BaseQueryBuilder[] { dummyQueryBuilder1, dummyQueryBuilder2, dummyQueryBuilder5, dummyQueryBuilder9 };
        java.util.Set<org.elasticsearch.index.query.BaseQueryBuilder> baseQueryBuilderSet12 = org.apache.lucene.util.LuceneTestCase.asSet(baseQueryBuilderArray11);
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray14);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) baseQueryBuilderArray11, (java.lang.Object[]) executorServiceArray14);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) (-1), 0L);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain3;
        org.apache.lucene.util.BytesRef[] bytesRefArray5 = new org.apache.lucene.util.BytesRef[] {};
        java.util.Set<org.apache.lucene.util.BytesRef> bytesRefSet6 = org.apache.lucene.util.LuceneTestCase.asSet(bytesRefArray5);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("hi!", (java.lang.Object) ruleChain3, (java.lang.Object) bytesRefSet6);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        char[] charArray6 = new char[] { ' ', ' ', ' ', ' ', '#', 'a' };
        char[] charArray9 = new char[] {};
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray12, charArray13);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray16);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray9, charArray13);
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
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray38, charArray39);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray42, charArray43);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray39, charArray42);
        org.junit.Assert.assertArrayEquals(charArray31, charArray42);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray49, charArray50);
        char[] charArray53 = new char[] {};
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray56, charArray57);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray60, charArray61);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray57, charArray60);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray53, charArray57);
        org.junit.Assert.assertArrayEquals("DummyQuery", charArray49, charArray53);
        org.junit.Assert.assertArrayEquals(charArray31, charArray49);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray6, charArray13);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
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
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        long[] longArray3 = new long[] { 3, 'a', (byte) 0 };
        long[] longArray6 = new long[] { (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray6);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.isFilter;
        org.apache.lucene.search.Query query3 = dummyQuery1.clone();
        boolean boolean4 = dummyQuery1.isFilter;
        java.lang.String str5 = dummyQuery1.toString();
        org.apache.lucene.search.Query query6 = dummyQuery1.clone();
        float float7 = query6.getBoost();
        float float8 = query6.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean11 = dummyQuery10.getisFilter();
        java.lang.String str12 = dummyQuery10.toString();
        org.apache.lucene.search.Query query13 = dummyQuery10.clone();
        dummyQuery10.setBoost((float) (-1L));
        dummyQuery10.setisFilter(true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean19 = dummyQuery18.getisFilter();
        java.lang.String str20 = dummyQuery18.toString();
        boolean boolean22 = dummyQuery18.equals((java.lang.Object) 0.0f);
        org.apache.lucene.search.Query query23 = dummyQuery18.clone();
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) dummyQuery10, (java.lang.Object) dummyQuery18);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.search.Query query26 = dummyQuery10.rewrite(indexReader25);
        boolean boolean27 = dummyQuery10.getisFilter();
        java.lang.String str29 = dummyQuery10.toString("");
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.search.Query query31 = dummyQuery10.rewrite(indexReader30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object) query6, (java.lang.Object) query31);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.maxfailures");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.awaitsfix");
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray11 = new java.util.concurrent.ExecutorService[] { executorService10 };
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) executorServiceArray11);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        java.lang.Object obj0 = null;
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
        org.junit.Assert.assertSame(obj0, (java.lang.Object) shortArray4);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("DummyQuery", (long) 5, (long) 0);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        long[] longArray4 = new long[] { (-1), 0, (short) 10 };
        long[] longArray6 = new long[] { '#' };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray4, longArray6);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertTrue("<unknown>", false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        long[] longArray5 = new long[] { 0, (short) 100, (short) 100, 1, '#' };
        long[] longArray8 = new long[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray5, longArray8);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests12.testMoreLikeThisBuilder();
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef9 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 100, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0L, (long) (short) 10);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray4, (java.lang.Object[]) strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields22 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.monster");
        org.apache.lucene.index.Fields fields24 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray20, "tests.maxfailures");
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
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray44, (java.lang.Object[]) strArray52);
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "europarl.lines.txt.gz");
        java.lang.String[] strArray67 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields69 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray59, (java.lang.Object[]) strArray67);
        org.apache.lucene.index.Fields fields72 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray67, "tests.nightly");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray52, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray37, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray20, (java.lang.Object[]) strArray67);
        org.junit.Assert.assertArrayEquals("tests.weekly", (java.lang.Object[]) strArray12, (java.lang.Object[]) strArray20);
        java.util.concurrent.ExecutorService[] executorServiceArray77 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        boolean boolean80 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray77);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) executorServiceArray77);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.lucene.search.TermQuery termQuery20 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.unwrapTermQuery((org.apache.lucene.search.Query) dummyQuery0);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
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
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader19, terms20, terms21, true);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService25 = simpleIndexQueryParserTests0.getqueryParser();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
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
        simpleIndexQueryParserTests0.testRangeQueryBuilder();
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) '4', (double) (byte) 0);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray2, shortArray6);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray12);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        java.lang.String[] strArray21 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields23 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray21, "tests.monster");
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.maxfailures");
        simpleIndexQueryParserTests15.assertFieldStatisticsEquals("random", fields23, fields31);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService33 = null;
        simpleIndexQueryParserTests15.setqueryParser(indexQueryParserService33);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService35 = simpleIndexQueryParserTests15.queryParser();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests15.assertDocsSkippingEquals("tests.monster", indexReader38, 100, postingsEnum40, postingsEnum41, true);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests15.queryParser;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) shortArray12, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query4 = dummyQuery0.clone();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.search.Query query6 = query4.rewrite(indexReader5);
        query4.setBoost(35.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) query4);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule5 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
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
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.maxfailures");
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
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object[]) strArray21, (java.lang.Object[]) strArray51);
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray4, (java.lang.Object[]) strArray51);
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray63, (java.lang.Object[]) strArray71);
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.failfast");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray51, (java.lang.Object[]) strArray63);
        org.apache.lucene.index.Fields fields81 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.maxfailures");
        java.lang.String[] strArray85 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields87 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "tests.monster");
        org.apache.lucene.index.Fields fields89 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "europarl.lines.txt.gz");
        java.lang.String[] strArray93 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields95 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray93, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray85, (java.lang.Object[]) strArray93);
        org.apache.lucene.index.Fields fields98 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray85, "enwiki.random.lines.txt");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) fields81, (java.lang.Object) strArray85);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean2 = dummyQuery1.getisFilter();
        dummyQuery1.isFilter = true;
        java.lang.String str5 = dummyQuery1.toString();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.search.Query query7 = dummyQuery1.rewrite(indexReader6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) indexReader6);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.weekly", indexReader7, 0, postingsEnum9, postingsEnum10, false);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService13 = null;
        simpleIndexQueryParserTests1.setqueryParser(indexQueryParserService13);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        java.lang.String str7 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
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
        java.util.Set<org.apache.lucene.search.Query> querySet19 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.search.Query[]) dummyQueryArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean21 = dummyQuery20.isFilter;
        org.apache.lucene.search.Query query22 = dummyQuery20.clone();
        boolean boolean23 = dummyQuery20.isFilter;
        float float24 = dummyQuery20.getBoost();
        java.lang.String str25 = dummyQuery20.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (java.lang.Object) querySet19, (java.lang.Object) str25);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        long[] longArray5 = new long[] { '4', (short) 1, (byte) -1, (byte) 100 };
        long[] longArray6 = new long[] {};
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", longArray5, longArray6);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, 10.0d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        java.lang.Object[] objArray1 = null;
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
        java.lang.String[] strArray46 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields48 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "tests.monster");
        org.apache.lucene.index.Fields fields50 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray46, "europarl.lines.txt.gz");
        java.lang.String[] strArray54 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields56 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray54, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray46, (java.lang.Object[]) strArray54);
        java.lang.String[] strArray61 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray61, "tests.monster");
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) strArray46, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray20, (java.lang.Object[]) strArray46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.failfast", objArray1, (java.lang.Object[]) strArray46);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
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
        org.apache.lucene.util.BytesRef bytesRef22 = simpleIndexQueryParserTests0.indexedValueForSearch((-1L));
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", 2, numericDocValues25, numericDocValues26);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
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
        simpleIndexQueryParserTests0.testRegexpQueryBuilder();
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 1, (double) 100L, 10.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
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
        double[] doubleArray72 = new double[] { 100.0f, 100L, 10.0d, (byte) 10, 1L };
        double[] doubleArray78 = new double[] { 10.0f, 100, 100L, (short) 100, (short) -1 };
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray72, doubleArray78, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray72, (double) 10.0f);
        org.junit.Assert.assertArrayEquals(doubleArray14, doubleArray23, (double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", doubleArray1, doubleArray23, (double) (byte) 10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 4, (double) 0.0f);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray3, shortArray7);
        short[] shortArray13 = new short[] {};
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray13, shortArray14);
        short[] shortArray17 = new short[] {};
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray17, shortArray18);
        org.junit.Assert.assertArrayEquals("{\n  \"dummy\" : { }\n}", shortArray13, shortArray17);
        org.junit.Assert.assertArrayEquals("DummyQuery", shortArray3, shortArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean23 = dummyQuery22.isFilter;
        org.apache.lucene.search.Query query24 = dummyQuery22.clone();
        dummyQuery22.isFilter = false;
        dummyQuery22.isFilter = false;
        dummyQuery22.setBoost((float) 1L);
        dummyQuery22.isFilter = false;
        org.apache.lucene.search.Query query33 = dummyQuery22.clone();
        org.apache.lucene.search.Query query34 = dummyQuery22.clone();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray3, (java.lang.Object) dummyQuery22);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", 1L, (long) (byte) 0);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) 10);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService5 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) (byte) 1, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str2 = dummyQuery0.toString();
        boolean boolean4 = dummyQuery0.equals((java.lang.Object) 0.0f);
        boolean boolean5 = dummyQuery0.getisFilter();
        dummyQuery0.isFilter = true;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean9 = dummyQuery8.getisFilter();
        java.lang.String str10 = dummyQuery8.toString();
        org.apache.lucene.search.Query query11 = dummyQuery8.clone();
        dummyQuery8.setBoost((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) true, (java.lang.Object) (-1L));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        org.apache.lucene.index.NumericDocValues numericDocValues7 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", 4, numericDocValues7, numericDocValues8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }
}

