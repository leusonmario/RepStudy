import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.store.MockDirectoryWrapper mockDirectoryWrapper0 = org.apache.lucene.util.LuceneTestCase.newMockDirectory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.elasticsearch.test.ElasticsearchTestCase.checkIndexFailed = false;
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithoutFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-without-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields1Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertNormsEquals("", indexReader8, indexReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy1 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBoolSubClausesIsMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-query-with-empty-clauses-for-parsing.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.monster", indexReader6, fields7, fields8, true);
        org.apache.lucene.document.FieldType fieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field12 = org.apache.lucene.util.LuceneTestCase.newField(random0, "", (java.lang.Object) fields7, fieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween((int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path7 = simpleIndexQueryParserTests1.getDataPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexableField indexableField10 = null;
        org.apache.lucene.index.IndexableField indexableField11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldEquals("europarl.lines.txt.gz", indexableField10, indexableField11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("enwiki.random.lines.txt", terms17, terms18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.apache.lucene.store.Directory directory0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.store.BaseDirectoryWrapper baseDirectoryWrapper1 = org.apache.lucene.util.LuceneTestCase.newDirectory(directory0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.assumeFalse("tests.slow", true);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.randomizedtesting.InternalAssumptionViolatedException; message: tests.slow");
        } catch (org.junit.internal.AssumptionViolatedException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("<unknown>", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("tests.awaitsfix", indexReader9, indexReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.io.PrintStream printStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("tests.maxfailures", (java.lang.Object[]) executorServiceArray2, printStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.junit.Assert.assertFalse("<unknown>", false);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.junit.Assert.assertNotNull("", (java.lang.Object) (short) 1);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.assertStoredFieldsEquals("europarl.lines.txt.gz", indexReader17, indexReader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = simpleIndexQueryParserTests0.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
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
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.TermsEnum termsEnum5 = null;
        org.apache.lucene.index.TermsEnum termsEnum6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("tests.slow", indexReader4, termsEnum5, termsEnum6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("europarl.lines.txt.gz", "tests.maxfailures", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.slow", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.IndexWriterConfig indexWriterConfig0 = org.apache.lucene.util.LuceneTestCase.newIndexWriterConfig();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path17 = simpleIndexQueryParserTests8.getDataPath("enwiki.random.lines.txt");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: enwiki.random.lines.txt");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase.assertBusy(runnable0, 10L, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testWildcardQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.elasticsearch.test.ElasticsearchTestCase.randomInt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        // The following exception was thrown during execution in test generation
        try {
            int int0 = org.elasticsearch.test.ElasticsearchTestCase.randomInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.elasticsearch.test.ElasticsearchTestCase.randomInt((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path1 = org.apache.lucene.util.LuceneTestCase.createTempDir("tests.weekly");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.TermsEnum termsEnum8 = null;
        org.apache.lucene.index.TermsEnum termsEnum9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("tests.monster", termsEnum8, termsEnum9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.maxfailures", "tests.nightly", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("", terms15, terms16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexableField indexableField11 = null;
        org.apache.lucene.index.IndexableField indexableField12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldEquals("europarl.lines.txt.gz", indexableField11, indexableField12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.apache.lucene.index.IndexReader indexReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.IndexSearcher indexSearcher3 = org.apache.lucene.util.LuceneTestCase.newSearcher(indexReader0, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.lang.String str0 = org.apache.lucene.util.LuceneTestCase.SYSPROP_BADAPPLES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tests.badapples" + "'", str0, "tests.badapples");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        java.util.Random random0 = null;
        org.apache.lucene.store.Directory directory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.store.BaseDirectoryWrapper baseDirectoryWrapper2 = org.apache.lucene.util.LuceneTestCase.newDirectory(random0, directory1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("tests.weekly", "tests.nightly", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        java.lang.String str0 = org.apache.lucene.util.LuceneTestCase.SYSPROP_FAILFAST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tests.failfast" + "'", str0, "tests.failfast");
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/matchAll.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("", "europarl.lines.txt.gz", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        boolean boolean0 = org.apache.lucene.util.LuceneTestCase.LEAVE_TEMPORARY;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path1 = org.apache.lucene.util.LuceneTestCase.createTempDir("enwiki.random.lines.txt");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path0 = org.apache.lucene.util.LuceneTestCase.createTempFile();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-with-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testStarColonStar();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/starColonStar.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanWithin.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.LuceneTestCase.classRules = testRuleIgnoreAfterMaxFailures0;
// flaky:         org.junit.Assert.assertNull(testRuleIgnoreAfterMaxFailures1);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy1 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        org.elasticsearch.common.unit.TimeValue timeValue12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "tests.slow", "enwiki.random.lines.txt", "hi!", "tests.badapples", "<unknown>", "<unknown>" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus20 = simpleIndexQueryParserTests1.ensureGreen(timeValue12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "<unknown>", "tests.nightly", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("", indexReader15, indexReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields2Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = simpleIndexQueryParserTests0.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader16, terms17, terms18, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilterParsingExceptions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon_exception_1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.io.PrintStream printStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("", (java.lang.Object[]) executorServiceArray2, printStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(executorServiceArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithoutFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-without-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        java.lang.Exception exception1 = null;
        org.apache.lucene.util.LuceneTestCase.assumeNoException("tests.slow", exception1);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "europarl.lines.txt.gz", "tests.nightly", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertStoredFieldsEquals("tests.weekly", indexReader8, indexReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = simpleIndexQueryParserTests0.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("europarl.lines.txt.gz", "<unknown>", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass7 = simpleIndexQueryParserTests0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "", "enwiki.random.lines.txt");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLength((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList4, obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Cloneable cloneable7 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom(cloneableList4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray3);
        org.junit.Assert.assertNotNull(cloneableList4);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("random", indexReader11, indexReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass11 = simpleIndexQueryParserTests10.getClass();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum7, (java.lang.Object) simpleIndexQueryParserTests10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests4, simpleIndexQueryParserTests10 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet15 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray14);
        java.io.PrintStream printStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("europarl.lines.txt.gz", (java.lang.Object[]) simpleIndexQueryParserTestsArray14, printStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray14);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsSet15);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("tests.awaitsfix", "hi!", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("tests.maxfailures", indexReader10, indexReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path11 = simpleIndexQueryParserTests0.getDataPath("tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.slow");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<unknown>" + "'", str9, "<unknown>");
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) 100);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("tests.monster", indexReader2, indexReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.awaitsfix", indexReader4, indexReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQueryWithFieldsAsString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-fields-as-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.junit.Assert.assertEquals("tests.nightly", (double) ' ', 100.0d, (double) (short) 100);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("tests.maxfailures", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, (-1), postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonNamedFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertFieldInfosEquals("tests.monster", indexReader8, indexReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = simpleIndexQueryParserTests0.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.TermsEnum termsEnum16 = null;
        org.apache.lucene.index.TermsEnum termsEnum17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("tests.weekly", termsEnum16, termsEnum17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanWithin.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.nightly", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.slow", "tests.badapples", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.monster", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("tests.failfast", "tests.weekly", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("", terms10, terms11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.TieredMergePolicy tieredMergePolicy1 = org.apache.lucene.util.LuceneTestCase.newTieredMergePolicy(random0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("hi!", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 1, -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (double) (byte) 100, (double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.lucene.util.LuceneTestCase.rarely(random0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("tests.slow", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray4);
        org.junit.Assert.assertNotNull(cloneableList5);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.apache.lucene.util.BytesRef bytesRef1 = null;
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("tests.slow", bytesRef1, store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBoolSubClausesIsMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-query-with-empty-clauses-for-parsing.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderEquals("random", indexReader15, indexReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        java.nio.file.Path path0 = null;
        org.apache.lucene.store.LockFactory lockFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.store.MockDirectoryWrapper mockDirectoryWrapper2 = org.apache.lucene.util.LuceneTestCase.newMockFSDirectory(path0, lockFactory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase.assertBusy(runnable0, (long) 100, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/matchAll.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.elasticsearch.test.ElasticsearchTestCase.randomInt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Object obj5 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList4, obj5);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("hi!", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests7.assertTermsEquals("tests.badapples", indexReader23, terms24, terms25, true);
        org.junit.Assert.assertEquals(obj5, (java.lang.Object) terms24);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray3);
        org.junit.Assert.assertNotNull(cloneableList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.TermsEnum termsEnum15 = null;
        org.apache.lucene.index.TermsEnum termsEnum16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("tests.monster", indexReader14, termsEnum15, termsEnum16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.lang.String str0 = org.elasticsearch.test.ElasticsearchSingleNodeTest.nodeName();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "node_s_0" + "'", str0, "node_s_0");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermNumericRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-numeric.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.badapples", indexReader16, terms17, terms18, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests2.setUp();
        java.lang.String str10 = simpleIndexQueryParserTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.badapples", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("tests.failfast", postingsEnum18, postingsEnum19, true);
        org.apache.lucene.document.FieldType fieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field23 = org.apache.lucene.util.LuceneTestCase.newField(random0, "tests.slow", (java.lang.Object) true, fieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.elasticsearch.threadpool.ThreadPool threadPool0 = null;
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(threadPool0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment13 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests1.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy1 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment5 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5, true);
        org.elasticsearch.common.settings.Settings settings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment9 = simpleIndexQueryParserTests0.newNodeEnvironment(settings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain9);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) (short) -1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(testRule2);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "", "tests.failfast", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testProperErrorMessagesForMisplacedWeightsAndFunctions();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.nightly", "tests.maxfailures", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path6 = simpleIndexQueryParserTests0.getDataPath("tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.slow");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment14 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBooleanParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLength((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.apache.lucene.util.LuceneTestCase.assumeFalse("node_s_0", false);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests10);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests17);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain22;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str26 = simpleIndexQueryParserTests25.getTestName();
        simpleIndexQueryParserTests25.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests25.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests25);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests25.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str33 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests32.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain37;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests39.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        simpleIndexQueryParserTests39.assertDocsEnumEquals("", postingsEnum43, postingsEnum44, true);
        simpleIndexQueryParserTests39.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests39.failureAndSuccessEvents;
        org.junit.rules.RuleChain[] ruleChainArray49 = new org.junit.rules.RuleChain[] { ruleChain7, ruleChain15, ruleChain22, ruleChain30, ruleChain37, ruleChain48 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.junit.rules.RuleChain> ruleChainList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) 'a', ruleChainArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't pick 97 random objects from a list of 6 objects");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<unknown>" + "'", str18, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<unknown>" + "'", str26, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<unknown>" + "'", str33, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain37);
        org.junit.Assert.assertNotNull(ruleChain48);
        org.junit.Assert.assertNotNull(ruleChainArray49);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path10 = simpleIndexQueryParserTests0.getDataPath("tests.monster");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.monster");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "tests.badapples", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.Fields fields3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader2, fields3, fields4, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.apache.lucene.util.LuceneTestCase.assumeFalse("tests.slow", false);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String[] strArray20 = new java.lang.String[] { "tests.badapples", "tests.maxfailures", "tests.monster", "tests.weekly" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus21 = simpleIndexQueryParserTests1.ensureGreen(strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", 10.0d, (double) 10L, (double) 100.0f);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, (-1), postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy1 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy2 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.apache.lucene.search.QueryCachingPolicy[] queryCachingPolicyArray3 = new org.apache.lucene.search.QueryCachingPolicy[] { queryCachingPolicy1, queryCachingPolicy2 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.lucene.search.QueryCachingPolicy> queryCachingPolicyList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) '#', queryCachingPolicyArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't pick 35 random objects from a list of 2 objects");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(queryCachingPolicy1);
        org.junit.Assert.assertNotNull(queryCachingPolicy2);
        org.junit.Assert.assertNotNull(queryCachingPolicyArray3);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.nightly", indexReader6, indexReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.lang.Exception exception1 = null;
        org.apache.lucene.util.LuceneTestCase.assumeNoException("tests.weekly", exception1);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.assumeTrue("tests.monster", false);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.randomizedtesting.InternalAssumptionViolatedException; message: tests.monster");
        } catch (org.junit.internal.AssumptionViolatedException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.common.unit.TimeValue timeValue7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus9 = simpleIndexQueryParserTests0.ensureGreen(timeValue7, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule13);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.slow");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.slow");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", indexReader6, indexReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = org.apache.lucene.util.LuceneTestCase.createTempFile("tests.nightly", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldStatisticsEquals("enwiki.random.lines.txt", fields16, fields17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermNumericRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-numeric.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("tests.failfast", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) (byte) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilterParsingExceptions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon_exception_1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment8 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        java.lang.Exception exception1 = null;
        org.apache.lucene.util.LuceneTestCase.assumeNoException("", exception1);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("tests.monster", indexReader17, indexReader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.IndexReader indexReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("tests.monster", indexReader3, indexReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDeletedDocsEquals("tests.nightly", indexReader8, indexReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.failfast", "hi!", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain6);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray10);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray21);
        java.io.PrintStream printStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("node_s_0", (java.lang.Object[]) cloneableArray21, printStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray5);
        org.junit.Assert.assertNotNull(cloneableList6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray10);
        org.junit.Assert.assertNotNull(cloneableList11);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray16);
        org.junit.Assert.assertNotNull(cloneableList17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray21);
        org.junit.Assert.assertNotNull(cloneableList22);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 0, postingsEnum6, postingsEnum7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) (short) 1, postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, true);
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain20;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain20);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 100, 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: min must be >= 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        org.elasticsearch.common.settings.Settings settings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment16 = simpleIndexQueryParserTests0.newNodeEnvironment(settings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexableField indexableField11 = null;
        org.apache.lucene.index.IndexableField indexableField12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldEquals("tests.failfast", indexableField11, indexableField12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("random", terms7, terms8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("europarl.lines.txt.gz", indexReader7, fields8, fields9, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain21;
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain21, obj23);
        org.junit.Assert.assertNull("tests.weekly", obj23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain21);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader10, (int) (short) -1, postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLength((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.maxfailures", "", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        java.util.Random random0 = null;
        org.apache.lucene.util.BytesRef bytesRef2 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "", bytesRef2, store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests3, simpleIndexQueryParserTests9 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet14 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase elasticsearchTestCase15 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray13);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsSet14);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.awaitsfix", indexReader4, fields5, fields6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader10, terms11, terms12, false);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("tests.failfast", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum4, postingsEnum5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        java.lang.String str15 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.badapples", "node_s_0" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom(strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader8, (int) '4', postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "random", "tests.nightly");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertNormsEquals("tests.badapples", indexReader10, indexReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
        org.junit.Assert.assertNull(ruleChain7);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests4, simpleIndexQueryParserTests10 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet15 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 10, (org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't pick 10 random objects from a list of 3 objects");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray14);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsSet15);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.lang.Object obj7 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList6, obj7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.maxfailures", indexReader11, fields12, fields13, false);
        org.junit.Assert.assertNotSame("tests.slow", obj7, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.Assert.assertNotSame((java.lang.Object) (short) -1, obj7);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "hi!");
        org.junit.Assert.assertNotNull(cloneableArray5);
        org.junit.Assert.assertNotNull(cloneableList6);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.IndexReader indexReader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertFieldInfosEquals("tests.monster", indexReader17, indexReader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<unknown>" + "'", str2, "<unknown>");
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-with-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<unknown>" + "'", str1, "<unknown>");
    }
}
