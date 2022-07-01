import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.awaitsfix");
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
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
        org.apache.lucene.util.BytesRef bytesRef34 = simpleIndexQueryParserTests0.longToPrefixCoded((long) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef34);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain9;
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests1.indexedValueForSearch((long) 5);
        org.apache.lucene.document.Field.Store store13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field14 = org.apache.lucene.util.LuceneTestCase.newStringField("{\n  \"dummy\" : { }\n}", bytesRef12, store13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef4);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.indexedValueForSearch(100L);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.assertStoredFieldsEquals("node_s_0", indexReader12, indexReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilterParsingExceptions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon_exception_1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader7, 2, postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
        org.junit.Assert.assertNotNull(bytesRef24);
        org.junit.Assert.assertNotNull(ruleChain26);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
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
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader43, (int) (short) 0, postingsEnum45, postingsEnum46, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBooleanParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
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
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 3);
        org.apache.lucene.index.TermsEnum termsEnum32 = null;
        org.apache.lucene.index.TermsEnum termsEnum33 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("tests.maxfailures", termsEnum32, termsEnum33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef30);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.TermsEnum termsEnum10 = null;
        org.apache.lucene.index.TermsEnum termsEnum11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("tests.slow", termsEnum10, termsEnum11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService20);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(bytesRef9);
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(bytesRef16);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testSpanTermQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(query7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
        org.junit.Assert.assertNotNull(ruleChain27);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.TermsEnum termsEnum13 = null;
        org.apache.lucene.index.TermsEnum termsEnum14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.assertTermsEnumEquals("tests.slow", indexReader12, termsEnum13, termsEnum14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain1);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween((int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(query7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
        org.junit.Assert.assertNotNull(ruleChain27);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        float float11 = dummyQuery0.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) ruleChain15);
        java.lang.Class<?> wildcardClass20 = dummyQuery0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(query2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(ruleChain15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        java.lang.Exception exception1 = null;
        org.apache.lucene.util.LuceneTestCase.assumeNoException("random", exception1);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader10, (int) (short) 1, postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("node_s_0", "DummyQuery", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        org.junit.Assert.assertNotNull((java.lang.Object) (short) -1);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.weekly");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.weekly");
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService41);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement annotatedElement1 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom(annotatedElementArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementArray0);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(testRule8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.TermsEnum termsEnum10 = null;
        org.apache.lucene.index.TermsEnum termsEnum11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("{\n  \"dummy\" : { }\n}", termsEnum10, termsEnum11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(testRule8);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
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
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader43, (int) (short) 0, postingsEnum45, postingsEnum46, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLength(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader4, (int) 'a', postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests12.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(fields20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(fields26);
        org.junit.Assert.assertNotNull(fields28);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "<unknown>");
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
        org.junit.Assert.assertNull(indexQueryParserService32);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.awaitsfix", "node_s_0", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(query13);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.TermsEnum termsEnum8 = null;
        org.apache.lucene.index.TermsEnum termsEnum9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("tests.monster", indexReader7, termsEnum8, termsEnum9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.lang.Object obj1 = null;
        org.junit.Assert.assertNull("tests.badapples", obj1);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
        org.junit.Assert.assertNull(indexQueryParserService32);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
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
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader33, 10, postingsEnum35, postingsEnum36);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef31);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("<unknown>", indexReader10, indexReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
        org.junit.Assert.assertNull(indexQueryParserService44);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        java.lang.Class<?> wildcardClass11 = simpleIndexQueryParserTests0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef25);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path33 = simpleIndexQueryParserTests0.getDataPath("tests.failfast");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.failfast");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef31);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBooleanParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("europarl.lines.txt.gz", terms15, terms16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
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
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.maxfailures");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "<unknown>");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields55, fields63);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(testRule42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(fields49);
        org.junit.Assert.assertNotNull(fields51);
        org.junit.Assert.assertNotNull(fields53);
        org.junit.Assert.assertNotNull(fields55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(fields61);
        org.junit.Assert.assertNotNull(fields63);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
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
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.TermsEnum termsEnum33 = null;
        org.apache.lucene.index.TermsEnum termsEnum34 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("europarl.lines.txt.gz", indexReader32, termsEnum33, termsEnum34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService42);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService41);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBoolSubClausesIsMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-query-with-empty-clauses-for-parsing.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
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
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader43, (int) (short) 0, postingsEnum45, postingsEnum46, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(testRule8);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
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
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum17, postingsEnum18, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests1.indexedValueForSearch((long) (byte) 0);
        org.apache.lucene.document.Field.Store store6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field7 = org.apache.lucene.util.LuceneTestCase.newStringField("<unknown>", bytesRef5, store6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
        org.junit.Assert.assertNotNull(bytesRef5);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(fields20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(fields26);
        org.junit.Assert.assertNotNull(fields28);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService20);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
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
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader43, (int) (short) 0, postingsEnum45, postingsEnum46, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("tests.awaitsfix", "enwiki.random.lines.txt", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.IndexReader indexReader51 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("DummyQuery", indexReader50, indexReader51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testInQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
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
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.IndexReader indexReader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertNormsEquals("<unknown>", indexReader27, indexReader28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef25);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-with-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", indexReader7, indexReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("", "tests.weekly", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((-1), (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testSpanTermQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DummyQuery" + "'", str2, "DummyQuery");
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(bytesRef10);
        org.junit.Assert.assertNull(indexQueryParserService11);
        org.junit.Assert.assertNotNull(ruleChain12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests3.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(bytesRef9);
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        java.util.Random random0 = null;
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
        org.apache.lucene.util.BytesRef bytesRef32 = simpleIndexQueryParserTests2.indexedValueForSearch((long) 3);
        org.apache.lucene.document.Field.Store store33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field34 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "", bytesRef32, store33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(fields10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(fields18);
        org.junit.Assert.assertNotNull(bytesRef32);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(ruleChain11);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
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
        java.lang.Class<?> wildcardClass34 = simpleIndexQueryParserTests0.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("DummyQuery", postingsEnum8, postingsEnum9, false);
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        boolean boolean13 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests6);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(query2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DummyQuery" + "'", str4, "DummyQuery");
        org.junit.Assert.assertNotNull(query5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader7, 2, postingsEnum9, postingsEnum10);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum13, postingsEnum14, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testSpanFirstQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DummyQuery" + "'", str2, "DummyQuery");
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(bytesRef10);
        org.junit.Assert.assertNull(indexQueryParserService11);
        org.junit.Assert.assertNotNull(ruleChain12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DummyQuery" + "'", str2, "DummyQuery");
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(bytesRef10);
        org.junit.Assert.assertNull(indexQueryParserService11);
        org.junit.Assert.assertNotNull(ruleChain12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
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
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.IndexReader indexReader44 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("", indexReader43, indexReader44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(bytesRef11);
        org.junit.Assert.assertNotNull(bytesRef13);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService1;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
        org.junit.Assert.assertNotNull(bytesRef33);
        org.junit.Assert.assertNotNull(ruleChain34);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        org.junit.Assert.assertFalse("tests.maxfailures", false);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (byte) 0);
        org.apache.lucene.document.Field.Store store7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field8 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.nightly", bytesRef6, store7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain4);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService3);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("hi!", indexReader4, (int) 'a', postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("tests.badapples", "tests.maxfailures", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
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
        org.apache.lucene.search.IndexSearcher indexSearcher14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Weight weight16 = dummyQuery0.createWeight(indexSearcher14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Query DummyQuery does not implement createWeight");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DummyQuery" + "'", str2, "DummyQuery");
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(bytesRef10);
        org.junit.Assert.assertNull(indexQueryParserService11);
        org.junit.Assert.assertNotNull(ruleChain12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("hi!", indexReader33, indexReader34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        boolean boolean4 = dummyQuery0.getisFilter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(query2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQueryWithFieldsAsString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-fields-as-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService19);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.assumeTrue("tests.badapples", false);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.randomizedtesting.InternalAssumptionViolatedException; message: tests.badapples");
        } catch (org.junit.internal.AssumptionViolatedException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
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
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests26);
        java.lang.String[] strArray32 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields34 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray32, "tests.monster");
        java.lang.String[] strArray38 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields40 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.monster");
        org.apache.lucene.index.Fields fields42 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray38, "tests.maxfailures");
        simpleIndexQueryParserTests26.assertFieldStatisticsEquals("random", fields34, fields42);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        simpleIndexQueryParserTests44.assertDocsEnumEquals("random", postingsEnum47, postingsEnum48, true);
        java.lang.String[] strArray55 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields57 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.monster");
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray55, "tests.maxfailures");
        java.lang.String[] strArray63 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields65 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.monster");
        org.apache.lucene.index.Fields fields67 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "europarl.lines.txt.gz");
        java.lang.String[] strArray71 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields73 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray71, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray63, (java.lang.Object[]) strArray71);
        org.apache.lucene.index.Fields fields76 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.index.Fields fields78 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "tests.failfast");
        org.apache.lucene.index.Fields fields80 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray63, "<unknown>");
        simpleIndexQueryParserTests44.assertFieldStatisticsEquals("{\n  \"dummy\" : { }\n}", fields59, fields80);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader25, fields34, fields80, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(fields34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(fields40);
        org.junit.Assert.assertNotNull(fields42);
        org.junit.Assert.assertNotNull(ruleChain45);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(fields57);
        org.junit.Assert.assertNotNull(fields59);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(fields65);
        org.junit.Assert.assertNotNull(fields67);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(fields73);
        org.junit.Assert.assertNotNull(fields76);
        org.junit.Assert.assertNotNull(fields78);
        org.junit.Assert.assertNotNull(fields80);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween(5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "<unknown>", "random", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "<unknown>", "tests.maxfailures", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(fields20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(fields26);
        org.junit.Assert.assertNotNull(fields28);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path13 = simpleIndexQueryParserTests0.getDataPath("tests.monster");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.monster");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService20;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean23 = dummyQuery22.getisFilter();
        java.lang.String str24 = dummyQuery22.toString();
        boolean boolean26 = dummyQuery22.equals((java.lang.Object) 0.0f);
        boolean boolean27 = dummyQuery22.getisFilter();
        org.junit.Assert.assertNotSame((java.lang.Object) indexQueryParserService20, (java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DummyQuery" + "'", str24, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
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
        org.junit.rules.TestRule testRule38 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(fields13);
        org.junit.Assert.assertNotNull(fields15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(fields21);
        org.junit.Assert.assertNotNull(fields23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields32);
        org.junit.Assert.assertNotNull(fields34);
        org.junit.Assert.assertNotNull(fields36);
        org.junit.Assert.assertNotNull(testRule38);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path1 = org.apache.lucene.util.LuceneTestCase.createTempDir("{\n  \"dummy\" : { }\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.getisFilter();
        java.lang.String str5 = dummyQuery2.toString("tests.slow");
        java.lang.String str7 = dummyQuery2.toString("random");
        boolean boolean8 = dummyQuery2.isFilter;
        dummyQuery2.isFilter = false;
        org.apache.lucene.document.FieldType fieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field12 = org.apache.lucene.util.LuceneTestCase.newField(random0, "tests.weekly", (java.lang.Object) false, fieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DummyQuery" + "'", str5, "DummyQuery");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DummyQuery" + "'", str7, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService41);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 5);
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(bytesRef11);
        org.junit.Assert.assertNotNull(bytesRef13);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween(10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(testRule8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DummyQuery" + "'", str2, "DummyQuery");
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(bytesRef10);
        org.junit.Assert.assertNull(indexQueryParserService11);
        org.junit.Assert.assertNotNull(ruleChain12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.getqueryParser();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(bytesRef14);
        org.junit.Assert.assertNotNull(bytesRef17);
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("{\n  \"dummy\" : { }\n}", "tests.monster", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
        org.junit.Assert.assertNotNull(bytesRef4);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService3);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
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
        org.apache.lucene.util.BytesRef bytesRef30 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef30);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("tests.monster", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService24);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        java.util.Random random0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "tests.monster");
        org.apache.lucene.index.Fields fields9 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "europarl.lines.txt.gz");
        java.lang.String[] strArray13 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields15 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray13, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray5, (java.lang.Object[]) strArray13);
        org.apache.lucene.index.Fields fields18 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray5, "{\n  \"dummy\" : { }\n}");
        org.apache.lucene.document.FieldType fieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field20 = org.apache.lucene.util.LuceneTestCase.newField(random0, "tests.slow", (java.lang.Object) strArray5, fieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(fields7);
        org.junit.Assert.assertNotNull(fields9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(fields15);
        org.junit.Assert.assertNotNull(fields18);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("{\n  \"dummy\" : { }\n}", indexReader7, 2, postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService7;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonNamedFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
        org.junit.Assert.assertNotNull(bytesRef33);
        org.junit.Assert.assertNotNull(ruleChain34);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testConstantScoreParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DummyQuery" + "'", str2, "DummyQuery");
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(bytesRef10);
        org.junit.Assert.assertNull(indexQueryParserService11);
        org.junit.Assert.assertNotNull(ruleChain12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.getqueryParser();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(bytesRef14);
        org.junit.Assert.assertNotNull(bytesRef17);
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests30);
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests30.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests30.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests30.getqueryParser();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef33);
        org.junit.Assert.assertNotNull(bytesRef36);
        org.junit.Assert.assertNull(indexQueryParserService37);
        org.junit.Assert.assertNotNull(ruleChain38);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        org.junit.Assert.assertEquals("tests.weekly", (double) (short) -1, (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef8);
        org.junit.Assert.assertNotNull(ruleChain10);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
        org.junit.Assert.assertNotNull(bytesRef4);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNull(indexQueryParserService11);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-with-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
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
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(fields9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(fields15);
        org.junit.Assert.assertNotNull(fields17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(fields24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(fields30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(fields36);
        org.junit.Assert.assertNotNull(fields38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(fields44);
        org.junit.Assert.assertNotNull(fields47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(fields53);
        org.junit.Assert.assertNotNull(fields55);
        org.junit.Assert.assertNotNull(iterableArray57);
        org.junit.Assert.assertNotNull(strIterableArray58);
        org.junit.Assert.assertNotNull(strIterableSet69);
        org.junit.Assert.assertNotNull(strIterableList70);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        java.lang.Object obj0 = null;
        org.junit.Assert.assertNull(obj0);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        org.junit.Assert.assertFalse("enwiki.random.lines.txt", false);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
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
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader33, 10, postingsEnum35, postingsEnum36);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef31);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
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
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader23, 2, postingsEnum25, postingsEnum26);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain1);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests1.indexedValueForSearch(10L);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests1.indexedValueForSearch(100L);
        org.junit.Assert.assertNotNull("tests.awaitsfix", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.common.unit.TimeValue timeValue9 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.failfast", "random", "random", "enwiki.random.lines.txt" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus15 = simpleIndexQueryParserTests1.ensureGreen(timeValue9, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef4);
        org.junit.Assert.assertNotNull(bytesRef7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
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
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.slow", postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.getqueryParser();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(bytesRef14);
        org.junit.Assert.assertNotNull(bytesRef17);
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
        org.junit.Assert.assertNotNull(bytesRef24);
        org.junit.Assert.assertNotNull(ruleChain26);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
        org.junit.Assert.assertNull(indexQueryParserService32);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
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
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.IndexReader indexReader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("<unknown>", indexReader29, indexReader30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService41 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService41);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService44);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "{\n  \"dummy\" : { }\n}", "europarl.lines.txt.gz", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef31);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.monster");
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "tests.slow", "tests.failfast");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum45, postingsEnum46, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "hi!", "<unknown>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
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
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<unknown>" + "'", str23, "<unknown>");
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("tests.monster", "<unknown>", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        boolean boolean3 = dummyQuery0.isFilter;
        java.lang.String str4 = dummyQuery0.toString();
        org.apache.lucene.search.Query query5 = dummyQuery0.clone();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("DummyQuery", postingsEnum8, postingsEnum9, false);
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        boolean boolean13 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests6);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(query2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DummyQuery" + "'", str4, "DummyQuery");
        org.junit.Assert.assertNotNull(query5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
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
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(testRule42);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonNamedFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setUp();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService19 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService19;
        java.lang.String str21 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<unknown>" + "'", str21, "<unknown>");
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService2);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        org.junit.Assert.assertEquals((long) (short) 1, (long) (short) 1);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(query7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
        org.junit.Assert.assertNotNull(ruleChain27);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("DummyQuery", indexReader5, 10, postingsEnum7, postingsEnum8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService32 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService32;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
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
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", indexReader32, indexReader33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase.assertBusy(runnable0, (long) (byte) 0, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("random", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) (short) -1, 3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/matchAll.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
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
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.IndexReader indexReader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderEquals("", indexReader32, indexReader33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations(3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 3, 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
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
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService41);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(false, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNull(indexQueryParserService11);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef11);
        org.junit.Assert.assertNotNull(bytesRef14);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "random", "enwiki.random.lines.txt", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
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
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("hi!", indexReader31, (int) (byte) -1, postingsEnum33, postingsEnum34);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService6 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService6;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefiFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(fields20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(fields26);
        org.junit.Assert.assertNotNull(fields28);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between(5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum3, postingsEnum4, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain1);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(ruleChain30);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.Fields fields2 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray0, "tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService2);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("tests.monster", indexReader9, indexReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNull(indexQueryParserService7);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testGeoShapeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
        org.junit.Assert.assertNull(indexQueryParserService21);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(fields13);
        org.junit.Assert.assertNotNull(fields15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(fields21);
        org.junit.Assert.assertNotNull(fields23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields32);
        org.junit.Assert.assertNotNull(fields34);
        org.junit.Assert.assertNotNull(fields36);
        org.junit.Assert.assertNotNull(ruleChain38);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
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
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader23, 2, postingsEnum25, postingsEnum26);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 10, 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.getqueryParser();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(bytesRef14);
        org.junit.Assert.assertNotNull(bytesRef17);
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.getqueryParser();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(bytesRef14);
        org.junit.Assert.assertNotNull(bytesRef17);
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService42 = simpleIndexQueryParserTests0.getqueryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService42);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader16 = null;
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
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "europarl.lines.txt.gz");
        java.lang.String[] strArray53 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray53, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray45, (java.lang.Object[]) strArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray53);
        org.apache.lucene.index.Fields fields59 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "DummyQuery");
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader16, fields33, fields59, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(fields22);
        org.junit.Assert.assertNotNull(fields24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(fields30);
        org.junit.Assert.assertNotNull(fields33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(fields41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(fields47);
        org.junit.Assert.assertNotNull(fields49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(fields55);
        org.junit.Assert.assertNotNull(fields59);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.maxfailures", "node_s_0", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
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
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(fields9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(fields15);
        org.junit.Assert.assertNotNull(fields17);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
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
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService11;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
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
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader30, (int) (byte) 1, postingsEnum32, postingsEnum33);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder> dummyQueryBuilderList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQueryBuilder dummyQueryBuilder1 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom(dummyQueryBuilderList0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
        org.junit.Assert.assertNull(indexQueryParserService28);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.isFilter;
        org.apache.lucene.search.Query query2 = dummyQuery0.clone();
        dummyQuery0.isFilter = false;
        dummyQuery0.isFilter = false;
        dummyQuery0.setBoost((float) 1L);
        dummyQuery0.isFilter = false;
        float float11 = dummyQuery0.getBoost();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain15;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        boolean boolean19 = dummyQuery0.equals((java.lang.Object) ruleChain15);
        java.lang.String str21 = dummyQuery0.toString("");
        org.apache.lucene.search.IndexSearcher indexSearcher22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Weight weight24 = dummyQuery0.createWeight(indexSearcher22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Query DummyQuery does not implement createWeight");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(query2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(ruleChain15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DummyQuery" + "'", str21, "DummyQuery");
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
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
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("DummyQuery", indexReader21, indexReader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "DummyQuery", "node_s_0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", indexReader8, indexReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(ruleChain30);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "", "node_s_0", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
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
        org.apache.lucene.index.TermsEnum termsEnum24 = null;
        org.apache.lucene.index.TermsEnum termsEnum25 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("DummyQuery", indexReader23, termsEnum24, termsEnum25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.util.BytesRef bytesRef12 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef12);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService3;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService10 = simpleIndexQueryParserTests0.queryParser;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests11.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef17 = simpleIndexQueryParserTests11.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService18 = simpleIndexQueryParserTests11.getqueryParser();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService21 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment22 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(bytesRef14);
        org.junit.Assert.assertNotNull(bytesRef17);
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(ruleChain19);
        org.junit.Assert.assertNull(indexQueryParserService21);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
        org.junit.Assert.assertNull(indexQueryParserService44);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(ruleChain30);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService20 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService20);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService26 = simpleIndexQueryParserTests0.queryParser();
        java.lang.String str27 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.TermsEnum termsEnum30 = null;
        org.apache.lucene.index.TermsEnum termsEnum31 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("enwiki.random.lines.txt", indexReader29, termsEnum30, termsEnum31, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<unknown>" + "'", str27, "<unknown>");
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain3;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
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
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
        org.junit.Assert.assertNotNull(bytesRef24);
        org.junit.Assert.assertNotNull(ruleChain26);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum10, postingsEnum11, false);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.TermsEnum termsEnum16 = null;
        org.apache.lucene.index.TermsEnum termsEnum17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("tests.monster", indexReader15, termsEnum16, termsEnum17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray6 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray6, "tests.monster");
        java.lang.String[] strArray12 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields14 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.monster");
        org.apache.lucene.index.Fields fields16 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray12, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("random", fields8, fields16);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("", indexReader20, indexReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) (short) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests0.queryParser = indexQueryParserService9;
        java.lang.String str11 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests4.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef8 = simpleIndexQueryParserTests2.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService9 = null;
        simpleIndexQueryParserTests2.setqueryParser(indexQueryParserService9);
        java.lang.String str11 = simpleIndexQueryParserTests2.getTestName();
        org.apache.lucene.util.BytesRef bytesRef13 = simpleIndexQueryParserTests2.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.document.Field.Store store14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field15 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.slow", bytesRef13, store14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef5);
        org.junit.Assert.assertNotNull(bytesRef8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef13);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        java.util.Random random0 = null;
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests25.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef28 = simpleIndexQueryParserTests25.indexedValueForSearch(10L);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        simpleIndexQueryParserTests25.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.apache.lucene.util.BytesRef bytesRef35 = simpleIndexQueryParserTests2.indexedValueForSearch((-1L));
        org.apache.lucene.document.Field.Store store36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field37 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.maxfailures", bytesRef35, store36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(fields10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(fields18);
        org.junit.Assert.assertNotNull(bytesRef24);
        org.junit.Assert.assertNotNull(bytesRef28);
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertNotNull(bytesRef35);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        java.lang.String[] strArray3 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields5 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "tests.monster");
        org.apache.lucene.index.Fields fields7 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray3, "europarl.lines.txt.gz");
        java.lang.String[] strArray11 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields13 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray11, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray3, (java.lang.Object[]) strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable15 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom((java.io.Serializable[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(fields5);
        org.junit.Assert.assertNotNull(fields7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(fields13);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(bytesRef9);
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(bytesRef16);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations(2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 2, 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
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
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("DummyQuery", indexReader5, 10, postingsEnum7, postingsEnum8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef5 = simpleIndexQueryParserTests2.indexedValueForSearch(10L);
        org.apache.lucene.document.Field.Store store6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field7 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "enwiki.random.lines.txt", bytesRef5, store6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef5);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
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
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.util.BytesRef bytesRef4 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
        org.junit.Assert.assertNotNull(bytesRef4);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests13.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(query2);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(fields21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(fields27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(bytesRef43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService2 = simpleIndexQueryParserTests0.getqueryParser();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService2);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean1 = dummyQuery0.getisFilter();
        java.lang.String str3 = dummyQuery0.toString("tests.slow");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.ensureCheckIndexPassed();
        simpleIndexQueryParserTests4.setUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        boolean boolean10 = dummyQuery0.equals((java.lang.Object) simpleIndexQueryParserTests4);
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests4.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
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
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNull(indexQueryParserService41);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
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
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.monster", indexReader15, terms16, terms17, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNotNull(bytesRef9);
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef26);
        org.junit.Assert.assertNotNull(ruleChain28);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery dummyQuery2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests.DummyQuery();
        boolean boolean3 = dummyQuery2.getisFilter();
        dummyQuery2.isFilter = true;
        java.lang.String str6 = dummyQuery2.toString();
        org.apache.lucene.document.FieldType fieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field8 = org.apache.lucene.util.LuceneTestCase.newField(random0, "", (java.lang.Object) str6, fieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DummyQuery" + "'", str6, "DummyQuery");
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService1 = simpleIndexQueryParserTests0.queryParser;
        java.lang.String str2 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService3 = simpleIndexQueryParserTests0.getqueryParser();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService11 = simpleIndexQueryParserTests0.queryParser;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNull(indexQueryParserService11);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
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
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("tests.nightly", postingsEnum38, postingsEnum39, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests12.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(fields20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(fields26);
        org.junit.Assert.assertNotNull(fields28);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertNormsEquals("DummyQuery", indexReader4, indexReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = simpleIndexQueryParserTests0.getqueryParser();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService8 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertNull(indexQueryParserService7);
        org.junit.Assert.assertNull(indexQueryParserService8);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
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
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.badapples", indexReader31, indexReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("node_s_0", indexReader8, (int) (short) 10, postingsEnum10, postingsEnum11, true);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(ruleChain14);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
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
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.maxfailures");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "<unknown>");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields55, fields63);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(testRule42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(fields49);
        org.junit.Assert.assertNotNull(fields51);
        org.junit.Assert.assertNotNull(fields53);
        org.junit.Assert.assertNotNull(fields55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(fields61);
        org.junit.Assert.assertNotNull(fields63);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.lang.String[] strArray4 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields6 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "tests.monster");
        org.apache.lucene.index.Fields fields8 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray4, "europarl.lines.txt.gz");
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("node_s_0", (java.lang.Object[]) strArray4, printStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(fields6);
        org.junit.Assert.assertNotNull(fields8);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 1, 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService24 = simpleIndexQueryParserTests0.queryParser();
        org.elasticsearch.common.unit.TimeValue timeValue25 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "tests.monster");
        org.apache.lucene.index.Fields fields33 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "europarl.lines.txt.gz");
        java.lang.String[] strArray37 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields39 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "tests.monster");
        org.apache.lucene.index.Fields fields41 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray37, "europarl.lines.txt.gz");
        java.lang.String[] strArray45 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields47 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray45, "tests.monster");
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) strArray37, (java.lang.Object[]) strArray45);
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray29, (java.lang.Object[]) strArray45);
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray29, "DummyQuery");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus52 = simpleIndexQueryParserTests0.ensureGreen(timeValue25, strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(fields33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(fields41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(fields47);
        org.junit.Assert.assertNotNull(fields51);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.weekly", indexReader7, (int) (short) 10, postingsEnum9, postingsEnum10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader5, (int) (byte) 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef31);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
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
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService23 = simpleIndexQueryParserTests0.queryParser();
        java.lang.String[] strArray27 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields29 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "tests.monster");
        org.apache.lucene.index.Fields fields31 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray27, "europarl.lines.txt.gz");
        java.lang.String[] strArray35 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields37 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray35, "tests.monster");
        org.junit.Assert.assertEquals((java.lang.Object[]) strArray27, (java.lang.Object[]) strArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus39 = simpleIndexQueryParserTests0.ensureGreen(strArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(query7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
        org.junit.Assert.assertNotNull(ruleChain27);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.util.BytesRef bytesRef7 = simpleIndexQueryParserTests0.longToPrefixCoded((long) 10, (int) ' ');
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader9, (int) '4', postingsEnum11, postingsEnum12);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
        org.junit.Assert.assertNotNull(bytesRef7);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef22);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum3, postingsEnum4, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain1);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(query13);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(ruleChain26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef11);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNull(indexQueryParserService20);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch(10L);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
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
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests30);
        org.apache.lucene.util.BytesRef bytesRef33 = simpleIndexQueryParserTests30.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef36 = simpleIndexQueryParserTests30.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService37 = simpleIndexQueryParserTests30.getqueryParser();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain38;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(bytesRef33);
        org.junit.Assert.assertNotNull(bytesRef36);
        org.junit.Assert.assertNull(indexQueryParserService37);
        org.junit.Assert.assertNotNull(ruleChain38);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (long) (byte) 10, (long) 10);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.util.BytesRef bytesRef3 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (short) -1);
        org.apache.lucene.util.BytesRef bytesRef6 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, 4);
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService7 = null;
        simpleIndexQueryParserTests0.setqueryParser(indexQueryParserService7);
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.util.BytesRef bytesRef11 = simpleIndexQueryParserTests0.indexedValueForSearch((long) (byte) -1);
        org.apache.lucene.util.BytesRef bytesRef14 = simpleIndexQueryParserTests0.longToPrefixCoded((long) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(bytesRef3);
        org.junit.Assert.assertNotNull(bytesRef6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
        org.junit.Assert.assertNotNull(bytesRef11);
        org.junit.Assert.assertNotNull(bytesRef14);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
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
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DummyQuery" + "'", str3, "DummyQuery");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(query7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<unknown>" + "'", str17, "<unknown>");
        org.junit.Assert.assertNull(indexQueryParserService18);
        org.junit.Assert.assertNotNull(bytesRef22);
        org.junit.Assert.assertNotNull(bytesRef25);
        org.junit.Assert.assertNull(indexQueryParserService26);
        org.junit.Assert.assertNotNull(ruleChain27);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("{\n  \"dummy\" : { }\n}", (java.lang.Object) 0L, (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService4 = simpleIndexQueryParserTests0.queryParser;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader6, 1, postingsEnum8, postingsEnum9);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.slow", indexReader12, indexReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(indexQueryParserService4);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.PostingsEnum postingsEnum2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("DummyQuery", postingsEnum2, postingsEnum3, false);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule9);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
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
        org.junit.rules.TestRule testRule42 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String[] strArray47 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields49 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.monster");
        org.apache.lucene.index.Fields fields51 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.maxfailures");
        org.apache.lucene.index.Fields fields53 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "tests.awaitsfix");
        org.apache.lucene.index.Fields fields55 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray47, "<unknown>");
        java.lang.String[] strArray59 = new java.lang.String[] { "tests.maxfailures", "tests.maxfailures", "random" };
        org.apache.lucene.index.Fields fields61 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.monster");
        org.apache.lucene.index.Fields fields63 = org.elasticsearch.index.query.SimpleIndexQueryParserTests.generateFields(strArray59, "tests.maxfailures");
        simpleIndexQueryParserTests0.assertFieldStatisticsEquals("tests.awaitsfix", fields55, fields63);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(testRule42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(fields49);
        org.junit.Assert.assertNotNull(fields51);
        org.junit.Assert.assertNotNull(fields53);
        org.junit.Assert.assertNotNull(fields55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(fields61);
        org.junit.Assert.assertNotNull(fields63);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
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
        org.apache.lucene.util.BytesRef bytesRef43 = simpleIndexQueryParserTests0.indexedValueForSearch((long) '#');
        org.elasticsearch.index.query.IndexQueryParserService indexQueryParserService44 = simpleIndexQueryParserTests0.queryParser();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(fields8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(fields14);
        org.junit.Assert.assertNotNull(fields16);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(fields29);
        org.junit.Assert.assertNotNull(fields31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(fields37);
        org.junit.Assert.assertNotNull(fields39);
        org.junit.Assert.assertNotNull(bytesRef43);
        org.junit.Assert.assertNull(indexQueryParserService44);
    }
}
