import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path1 = org.apache.lucene.util.LuceneTestCase.createTempDir("tests.nightly");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, (double) 'a', (double) 10L);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/matchAll.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests5.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests5, simpleIndexQueryParserTests14 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray18);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet20 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray18);
        java.util.Set<org.junit.Assert> assertSet21 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray18);
        double[] doubleArray23 = new double[] { (byte) 10 };
        double[] doubleArray25 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) ' ');
        double[] doubleArray29 = new double[] { (byte) 10 };
        double[] doubleArray31 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray31, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (-1));
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray18, (java.lang.Object) doubleArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray29);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
        org.junit.Assert.assertNotNull(ruleChain13);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray18);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsList19);
        org.junit.Assert.assertNotNull(luceneTestCaseSet20);
        org.junit.Assert.assertNotNull(assertSet21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader12, (int) (short) 0, postingsEnum14, postingsEnum15, false);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
        org.junit.Assert.assertNotNull(ruleChain29);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        java.util.Locale locale1 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.failfast");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "tests.failfast");
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.assumeTrue("tests.monster", false);
            org.junit.Assert.fail("Expected exception of type com.carrotsearch.randomizedtesting.InternalAssumptionViolatedException; message: tests.monster");
        } catch (org.junit.internal.AssumptionViolatedException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermWithBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilterParsingExceptions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon_exception_1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str22 = simpleIndexQueryParserTests1.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.setUp();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        simpleIndexQueryParserTests23.assertFieldsEquals("random", indexReader26, fields27, fields28, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests31.setUp();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests35.setUp();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests35);
        org.junit.rules.RuleChain ruleChain39 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain39;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain39;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain39;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain39);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase.assertBusy(runnable0, (long) (short) 10, timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexableField indexableField15 = null;
        org.apache.lucene.index.IndexableField indexableField16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertStoredFieldEquals("enwiki.random.lines.txt", indexableField15, indexableField16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str14 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<unknown>" + "'", str14, "<unknown>");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.between((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str22 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        org.junit.Assert.assertEquals("<unknown>", 10.0d, (-1.0d), (double) '4');
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum13, postingsEnum14, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 0);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader15, fields16, fields17, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader16, fields17, fields18, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling5 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling4, throttling5 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling10 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling9, throttling10 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray17 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling15, throttling16 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray17);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27, throttling28 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33, throttling34 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray6, (java.lang.Object[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling41 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray43 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling41, throttling42 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray43);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46, throttling47 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray48);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray43, (java.lang.Object[]) throttlingArray48);
        org.junit.Assert.assertEquals("tests.awaitsfix", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray48);
        java.io.PrintStream printStream52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("", (java.lang.Object[]) throttlingArray48, printStream52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + throttling4 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling4.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling5 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling5.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray6);
        org.junit.Assert.assertNotNull(throttlingEnumList7);
        org.junit.Assert.assertTrue("'" + throttling9 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling9.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling10 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling10.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray11);
        org.junit.Assert.assertNotNull(throttlingEnumList12);
        org.junit.Assert.assertTrue("'" + throttling15 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling15.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling16 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling16.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray17);
        org.junit.Assert.assertNotNull(throttlingEnumList18);
        org.junit.Assert.assertTrue("'" + throttling22 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling22.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling23 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling23.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray24);
        org.junit.Assert.assertNotNull(throttlingEnumList25);
        org.junit.Assert.assertTrue("'" + throttling27 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling27.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling28 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling28.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray29);
        org.junit.Assert.assertNotNull(throttlingEnumList30);
        org.junit.Assert.assertTrue("'" + throttling33 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling33.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling34 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling34.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray35);
        org.junit.Assert.assertNotNull(throttlingEnumList36);
        org.junit.Assert.assertTrue("'" + throttling41 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling41.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling42 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling42.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray43);
        org.junit.Assert.assertNotNull(throttlingEnumList44);
        org.junit.Assert.assertTrue("'" + throttling46 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling46.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling47 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling47.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray48);
        org.junit.Assert.assertNotNull(throttlingEnumList49);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.awaitsfix", indexReader15, (int) (short) -1, postingsEnum17, postingsEnum18);
        org.apache.lucene.index.TermsEnum termsEnum21 = null;
        org.apache.lucene.index.TermsEnum termsEnum22 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertTermStatsEquals("europarl.lines.txt.gz", termsEnum21, termsEnum22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.util.Random random0 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "tests.slow", "tests.slow", "tests.failfast", "tests.nightly", "node_s_0", "enwiki.random.lines.txt" };
        java.util.Set<java.lang.String> strSet9 = org.apache.lucene.util.LuceneTestCase.asSet(strArray8);
        org.apache.lucene.document.FieldType fieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field11 = org.apache.lucene.util.LuceneTestCase.newField(random0, "random", (java.lang.Object) strArray8, fieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.TermsEnum termsEnum21 = null;
        org.apache.lucene.index.TermsEnum termsEnum22 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermStatsEquals("europarl.lines.txt.gz", termsEnum21, termsEnum22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testCommonTermsQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum7, postingsEnum8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoPolygonFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader16, fields17, fields18, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("", indexReader16, 10, postingsEnum18, postingsEnum19, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.setUp();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setUp();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests27);
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain31;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQueryWithFieldsAsString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-fields-as-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule13);
        org.junit.Assert.assertNotNull(ruleChain31);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        org.junit.Assert.assertEquals("tests.slow", 0.0d, (double) 1L, 10.0d);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.IndexReader indexReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("hi!", indexReader11, indexReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.badapples", "europarl.lines.txt.gz", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain19;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween(2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testOrFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule13);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testBoolFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader6, terms7, terms8, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.slow", indexReader12, terms13, terms14, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.setUp();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests26);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain30;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String str35 = simpleIndexQueryParserTests14.getTestName();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain36;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<unknown>" + "'", str35, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain36);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQueryWithFieldsAsString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-fields-as-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("random", indexReader24, (int) '4', postingsEnum26, postingsEnum27, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader3, terms4, terms5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests14);
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests14.assertDocsEnumEquals("random", postingsEnum19, postingsEnum20, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests23.failureAndSuccessEvents;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain25;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain25;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) 'a', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain19;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain19;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader23, terms24, terms25, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
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
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests9.ruleChain;
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("", "", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str22 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.RuleChain ruleChain23 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain23);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        java.lang.String str13 = simpleIndexQueryParserTests6.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("<unknown>", indexReader15, (int) (byte) 10, postingsEnum17, postingsEnum18, false);
        simpleIndexQueryParserTests6.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanOrQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.common.unit.TimeValue timeValue11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "tests.slow", "tests.maxfailures" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus15 = simpleIndexQueryParserTests0.ensureGreen(timeValue11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str14 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<unknown>" + "'", str14, "<unknown>");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.monster", "", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefiFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.setUp();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests26);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain30;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String str35 = simpleIndexQueryParserTests14.getTestName();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain36;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<unknown>" + "'", str35, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain36);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader16, fields17, fields18, true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader4, 1, postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = simpleIndexQueryParserTests1.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = org.apache.lucene.util.LuceneTestCase.createTempFile("", "tests.nightly");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests12);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexableField indexableField22 = null;
        org.apache.lucene.index.IndexableField indexableField23 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldEquals("enwiki.random.lines.txt", indexableField22, indexableField23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, false);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader12, (int) (byte) 100, postingsEnum14, postingsEnum15, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRangeQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader17, terms18, terms19, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader12, (int) (short) 0, postingsEnum14, postingsEnum15, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = simpleIndexQueryParserTests1.tmpPaths();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader16, fields17, fields18, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchWithoutFuzzyTranspositions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-without-fuzzy-transpositions.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testNotFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader20, terms21, terms22, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.util.Random random0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.setUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests3.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests3.assertDocsEnumEquals("tests.failfast", postingsEnum10, postingsEnum11, true);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        org.apache.lucene.document.FieldType fieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field16 = org.apache.lucene.util.LuceneTestCase.newField(random0, "<unknown>", (java.lang.Object) ruleChain14, fieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain7);
        org.junit.Assert.assertNotNull(testRule8);
        org.junit.Assert.assertNotNull(ruleChain14);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanOrQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests1.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum5, postingsEnum6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        org.elasticsearch.common.settings.Settings settings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment18 = simpleIndexQueryParserTests0.newNodeEnvironment(settings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("<unknown>", indexReader12, (int) (short) 0, postingsEnum14, postingsEnum15, false);
        org.junit.rules.TestRule testRule18 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule18);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests11.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBoolQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsStatisticsEquals("", terms20, terms21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum13, postingsEnum14, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests9.ruleChain;
        simpleIndexQueryParserTests9.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests9.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThis();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/mlt.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("node_s_0", indexReader9, (int) (short) 0, postingsEnum11, postingsEnum12);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests15.assertDocsSkippingEquals("", indexReader17, 10, postingsEnum19, postingsEnum20, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) true);
        org.junit.Assert.assertNotNull("hi!", (java.lang.Object) true);
        org.junit.Assert.assertNotNull(testRule14);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader9, fields10, fields11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.nightly", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path14 = simpleIndexQueryParserTests1.getDataPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLengthBetween((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum12, postingsEnum13, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.randomIntBetween((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader12, terms13, terms14, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertNotNull(ruleChain13);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldsEquals("<unknown>", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader12, terms13, terms14, true);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path18 = simpleIndexQueryParserTests0.getDataPath("<unknown>");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: <unknown>");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader20, terms21, terms22, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween(2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLengthBetween((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests1.testWeight1fStillProducesWeighFunction();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
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
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader12, terms13, terms14, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path25 = simpleIndexQueryParserTests0.getDataPath("tests.nightly");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.nightly");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexableField indexableField10 = null;
        org.apache.lucene.index.IndexableField indexableField11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertStoredFieldEquals("tests.nightly", indexableField10, indexableField11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain7);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests9.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoShapeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geoShape-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule13);
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests1, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet7 = org.apache.lucene.util.LuceneTestCase.asSet(objArray6);
        org.junit.Assert.assertNotNull((java.lang.Object) objSet7);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objSet7);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.TermsEnum termsEnum24 = null;
        org.apache.lucene.index.TermsEnum termsEnum25 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.assertTermStatsEquals("node_s_0", termsEnum24, termsEnum25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields1Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
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
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("tests.badapples", postingsEnum14, postingsEnum15, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testDisMaxBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum8, postingsEnum9, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray9 = new double[] { (byte) 10 };
        double[] doubleArray11 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) ' ');
        double[] doubleArray15 = new double[] { (byte) 10 };
        double[] doubleArray17 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray17, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray11, doubleArray17, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray17, (double) 10);
        double[] doubleArray25 = new double[] { (byte) 10 };
        double[] doubleArray27 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray27, (double) ' ');
        double[] doubleArray32 = new double[] { (byte) 10 };
        double[] doubleArray34 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray34, (double) ' ');
        double[] doubleArray38 = new double[] { (byte) 10 };
        double[] doubleArray40 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray38, doubleArray40, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray34, doubleArray40, (double) 10);
        org.junit.Assert.assertArrayEquals(doubleArray27, doubleArray40, (double) 10);
        org.junit.Assert.assertArrayEquals("tests.monster", doubleArray17, doubleArray27, (double) 100L);
        double[] doubleArray51 = new double[] { (byte) 10 };
        double[] doubleArray53 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray53, (double) ' ');
        double[] doubleArray57 = new double[] { (byte) 10 };
        double[] doubleArray59 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray57, doubleArray59, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray53, doubleArray59, (double) 10);
        double[] doubleArray66 = new double[] { (byte) 10 };
        double[] doubleArray68 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray66, doubleArray68, (double) ' ');
        double[] doubleArray72 = new double[] { (byte) 10 };
        double[] doubleArray74 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray74, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray72, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests80.setUp();
        simpleIndexQueryParserTests80.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests80);
        org.junit.rules.RuleChain ruleChain84 = simpleIndexQueryParserTests80.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule85 = simpleIndexQueryParserTests80.ruleChain;
        org.junit.rules.RuleChain ruleChain86 = simpleIndexQueryParserTests80.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray72, (java.lang.Object) simpleIndexQueryParserTests80);
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray72, (double) (byte) 10);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray17, doubleArray72, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain84);
        org.junit.Assert.assertNotNull(testRule85);
        org.junit.Assert.assertNotNull(ruleChain86);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling4 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3, throttling4 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling8 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling9 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling8, throttling9 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling14 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling15 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling14, throttling15 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling26 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray28 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling26, throttling27 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray28);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray28);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray34 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling33 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray23, (java.lang.Object[]) throttlingArray34);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) throttlingArray23);
        java.io.PrintStream printStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("tests.awaitsfix", (java.lang.Object[]) throttlingArray5, printStream38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + throttling3 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling3.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling4 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling4.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray5);
        org.junit.Assert.assertNotNull(throttlingEnumList6);
        org.junit.Assert.assertTrue("'" + throttling8 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling8.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling9 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling9.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray10);
        org.junit.Assert.assertNotNull(throttlingEnumList11);
        org.junit.Assert.assertTrue("'" + throttling14 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling14.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling15 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling15.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray16);
        org.junit.Assert.assertNotNull(throttlingEnumList17);
        org.junit.Assert.assertTrue("'" + throttling21 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling21.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling22 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling22.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray23);
        org.junit.Assert.assertNotNull(throttlingEnumList24);
        org.junit.Assert.assertTrue("'" + throttling26 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling26.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling27 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling27.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray28);
        org.junit.Assert.assertNotNull(throttlingEnumList29);
        org.junit.Assert.assertTrue("'" + throttling32 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling32.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling33 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling33.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray34);
        org.junit.Assert.assertNotNull(throttlingEnumList35);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.Runnable runnable0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.test.ElasticsearchTestCase.assertBusy(runnable0, (long) (-1), timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.util.Random random0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.lucene.util.LuceneTestCase.atLeast(random0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("", indexReader8, (int) (byte) 0, postingsEnum10, postingsEnum11, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("", indexReader16, 0, postingsEnum18, postingsEnum19);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray25 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling23, throttling24 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray30 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling28, throttling29 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray25, (java.lang.Object[]) throttlingArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray25, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum19, (java.lang.Object) throttlingArray36);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        simpleIndexQueryParserTests40.resetCheckIndexStatus();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        simpleIndexQueryParserTests40.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests40.setIndexWriterMaxDocs((int) (byte) 0);
        org.junit.Assert.assertNotSame((java.lang.Object) throttlingArray36, (java.lang.Object) (byte) 0);
        java.io.PrintStream printStream50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.util.LuceneTestCase.dumpArray("<unknown>", (java.lang.Object[]) throttlingArray36, printStream50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain6);
        org.junit.Assert.assertTrue("'" + throttling23 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling23.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling24 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling24.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray25);
        org.junit.Assert.assertNotNull(throttlingEnumList26);
        org.junit.Assert.assertTrue("'" + throttling28 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling28.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling29 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling29.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray30);
        org.junit.Assert.assertNotNull(throttlingEnumList31);
        org.junit.Assert.assertTrue("'" + throttling34 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling34.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling35 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling35.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray36);
        org.junit.Assert.assertNotNull(throttlingEnumList37);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests9.ruleChain;
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests9.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
        org.junit.Assert.assertNotNull(testRule24);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertFieldStatisticsEquals("<unknown>", fields16, fields17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum8, postingsEnum9, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray(100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testCommonTermsQuery1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQueryWithFieldsAsString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-fields-as-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.lucene.util.LuceneTestCase.atLeast((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) "node_s_0");
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader8, (int) (short) 1, postingsEnum10, postingsEnum11, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBoolSubClausesIsMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-query-with-empty-clauses-for-parsing.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<unknown>" + "'", str6, "<unknown>");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        java.util.Random random0 = null;
        org.apache.lucene.util.BytesRef bytesRef2 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.badapples", bytesRef2, store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(testRule9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain12;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        java.lang.String str13 = simpleIndexQueryParserTests6.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBadTypeMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.IndexReader indexReader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertStoredFieldsEquals("tests.maxfailures", indexReader13, indexReader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testEmptyBooleanQuery();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule13);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader18, terms19, terms20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests1.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanMultiTermFuzzyRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.monster", indexReader19, terms20, terms21, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.elasticsearch.test.ElasticsearchTestCase.randomInt((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader9, (int) (byte) 100, postingsEnum11, postingsEnum12, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = org.apache.lucene.util.LuceneTestCase.createTempFile("tests.nightly", "tests.maxfailures");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum8, postingsEnum9, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRegexpQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanWithin.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilterParsingExceptions();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon_exception_1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.IndexReader indexReader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.assertTermVectorsEquals("tests.slow", indexReader25, indexReader26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule20);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assureMalformedThrowsException();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/faulty-function-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests14);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain18;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain18;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests2);
        simpleIndexQueryParserTests2.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testGeoPolygonNamedFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain12;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoostingQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/boosting-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testConstantScoreQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/constantScore-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testInQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("random", indexReader24, (int) '4', postingsEnum26, postingsEnum27, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertNotNull(ruleChain13);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests6.assertDocsEnumEquals("", postingsEnum24, postingsEnum25, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testMatchAllEmpty2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests9.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests9.assertDocsEnumEquals("tests.badapples", postingsEnum25, postingsEnum26, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.tearDown();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The rule is not currently executing.");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.IndexReader indexReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", indexReader2, indexReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.slow", "tests.failfast", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum8, postingsEnum9, false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy2 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy(true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        org.junit.Assert.assertEquals((double) 100, (double) (short) 10, 100.0d);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderEquals("", indexReader15, indexReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertNotNull(ruleChain13);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.assertReaderStatisticsEquals("enwiki.random.lines.txt", indexReader31, indexReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
        org.junit.Assert.assertNotNull(ruleChain29);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderEquals("tests.maxfailures", indexReader16, indexReader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum5, postingsEnum6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) -1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests8.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("random", indexReader16, fields17, fields18, false);
        org.junit.rules.RuleChain ruleChain21 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests13, simpleIndexQueryParserTests22 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray26);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet28 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray26);
        java.util.Set<org.junit.Assert> assertSet29 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray26);
        double[] doubleArray31 = new double[] { (byte) 10 };
        double[] doubleArray33 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray31, doubleArray33, (double) ' ');
        double[] doubleArray37 = new double[] { (byte) 10 };
        double[] doubleArray39 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray37, doubleArray39, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray33, doubleArray37, (double) (-1));
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray26, (java.lang.Object) doubleArray37);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests8, (java.lang.Object) doubleArray37);
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) (short) -1, (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.IndexReader indexReader49 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests8.assertNormsEquals("<unknown>", indexReader48, indexReader49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(ruleChain21);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray26);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsList27);
        org.junit.Assert.assertNotNull(luceneTestCaseSet28);
        org.junit.Assert.assertNotNull(assertSet29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0]");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests12);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.IndexReader indexReader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertFieldInfosEquals("europarl.lines.txt.gz", indexReader22, indexReader23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("random", indexReader25, 1, postingsEnum27, postingsEnum28);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests5.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests5, simpleIndexQueryParserTests14 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray18);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet20 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray18);
        java.util.Set<org.junit.Assert> assertSet21 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray18);
        double[] doubleArray23 = new double[] { (byte) 10 };
        double[] doubleArray25 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) ' ');
        double[] doubleArray29 = new double[] { (byte) 10 };
        double[] doubleArray31 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray31, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (-1));
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray18, (java.lang.Object) doubleArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray29);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
        org.junit.Assert.assertNotNull(ruleChain13);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray18);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsList19);
        org.junit.Assert.assertNotNull(luceneTestCaseSet20);
        org.junit.Assert.assertNotNull(assertSet21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        org.junit.Assert.assertEquals("tests.weekly", (long) (byte) 1, (long) (byte) 1);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertDocValuesEquals("", indexReader15, indexReader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests8);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("random", postingsEnum13, postingsEnum14, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests17.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain19;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain19;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) (byte) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str5 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader18, terms19, terms20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter11();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance11.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.monster", indexReader17, (int) (byte) -1, postingsEnum19, postingsEnum20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanOrQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests1.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween(1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain12;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests1.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoBoundingBoxFilter5();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox5.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "<unknown>", "europarl.lines.txt.gz", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, false);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("random", indexReader25, 1, postingsEnum27, postingsEnum28);
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.assertNormsEquals("tests.monster", indexReader31, indexReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests11 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray15);
        java.util.List<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = org.elasticsearch.test.ElasticsearchTestCase.randomFrom(simpleIndexQueryParserTestsArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray15);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsList16);
        org.junit.Assert.assertNotNull(elasticsearchSingleNodeTestList17);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.junit.rules.TestRule testRule23 = simpleIndexQueryParserTests9.ruleChain;
        org.junit.rules.TestRule testRule24 = simpleIndexQueryParserTests9.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests9.testQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(testRule23);
        org.junit.Assert.assertNotNull(testRule24);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs(100);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanMultiTermWildcardQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-wildcard.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        java.lang.String str13 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testOrFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests11.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testGeoBoundingBoxFilterNamed();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum12, postingsEnum13, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBoolSubClausesIsMatchAll();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/bool-query-with-empty-clauses-for-parsing.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("", indexReader15, 0, postingsEnum17, postingsEnum18);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanMultiTermFuzzyTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-fuzzy-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader2, (int) (short) 0, postingsEnum4, postingsEnum5);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("<unknown>", indexReader21, (int) (byte) 1, postingsEnum23, postingsEnum24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setUp();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        java.lang.String str30 = simpleIndexQueryParserTests27.getTestName();
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests27, (java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        java.lang.String str37 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.setUp();
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum24, (java.lang.Object) simpleIndexQueryParserTests32);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests32.testSpanNearQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<unknown>" + "'", str30, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<unknown>" + "'", str37, "<unknown>");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.slow", "<unknown>", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
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
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assureMalformedThrowsException();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/faulty-function-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assureMalformedThrowsException();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/faulty-function-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
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
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests2.assertDocsEnumEquals("random", postingsEnum7, postingsEnum8, true);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("tests.awaitsfix", indexReader13, fields14, fields15, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        simpleIndexQueryParserTests18.resetCheckIndexStatus();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("node_s_0", indexReader26, (int) (short) 0, postingsEnum28, postingsEnum29);
        org.junit.rules.TestRule testRule31 = simpleIndexQueryParserTests18.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("tests.failfast", postingsEnum33, postingsEnum34, false);
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray39 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests18 };
        org.apache.lucene.util.LuceneTestCase[][] luceneTestCaseArray40 = new org.apache.lucene.util.LuceneTestCase[][] { luceneTestCaseArray39 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArrayList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) '#', luceneTestCaseArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't pick 35 random objects from a list of 1 objects");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule31);
        org.junit.Assert.assertNotNull(luceneTestCaseArray39);
        org.junit.Assert.assertNotNull(luceneTestCaseArray40);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader20, terms21, terms22, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testProperErrorMessageWhenTwoFunctionsDefinedInQueryBody();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-score-query-causing-NPE.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.overrideTestDefaultQueryCache();
        java.lang.String str13 = simpleIndexQueryParserTests6.getTestName();
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling17 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16, throttling17 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling21 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray23 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling21, throttling22 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray23);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray23);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27, throttling28 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling35 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling34, throttling35 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling39 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray41 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling39, throttling40 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray41);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray36, (java.lang.Object[]) throttlingArray41);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray41);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling47 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling47, throttling48 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling52 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling52, throttling53 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray49, (java.lang.Object[]) throttlingArray54);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling58 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling59 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray60 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling58, throttling59 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray60);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray49, (java.lang.Object[]) throttlingArray60);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling65 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling66 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray67 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling65, throttling66 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling70 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling71 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray72 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling70, throttling71 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList73 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray72);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray67, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray49, (java.lang.Object[]) throttlingArray72);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray49);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling78 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling79 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray80 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling78, throttling79 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray18, (java.lang.Object[]) throttlingArray80);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) throttlingArray18);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<unknown>" + "'", str13, "<unknown>");
        org.junit.Assert.assertTrue("'" + throttling16 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling16.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling17 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling17.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray18);
        org.junit.Assert.assertNotNull(throttlingEnumList19);
        org.junit.Assert.assertTrue("'" + throttling21 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling21.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling22 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling22.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray23);
        org.junit.Assert.assertNotNull(throttlingEnumList24);
        org.junit.Assert.assertTrue("'" + throttling27 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling27.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling28 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling28.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray29);
        org.junit.Assert.assertNotNull(throttlingEnumList30);
        org.junit.Assert.assertTrue("'" + throttling34 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling34.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling35 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling35.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray36);
        org.junit.Assert.assertNotNull(throttlingEnumList37);
        org.junit.Assert.assertTrue("'" + throttling39 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling39.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling40 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling40.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray41);
        org.junit.Assert.assertNotNull(throttlingEnumList42);
        org.junit.Assert.assertTrue("'" + throttling47 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling47.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling48 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling48.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray49);
        org.junit.Assert.assertNotNull(throttlingEnumList50);
        org.junit.Assert.assertTrue("'" + throttling52 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling52.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling53 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling53.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray54);
        org.junit.Assert.assertNotNull(throttlingEnumList55);
        org.junit.Assert.assertTrue("'" + throttling58 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling58.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling59 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling59.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray60);
        org.junit.Assert.assertNotNull(throttlingEnumList61);
        org.junit.Assert.assertTrue("'" + throttling65 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling65.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling66 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling66.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray67);
        org.junit.Assert.assertNotNull(throttlingEnumList68);
        org.junit.Assert.assertTrue("'" + throttling70 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling70.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling71 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling71.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray72);
        org.junit.Assert.assertNotNull(throttlingEnumList73);
        org.junit.Assert.assertTrue("'" + throttling78 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling78.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling79 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling79.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray80);
        org.junit.Assert.assertNotNull(throttlingEnumList81);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.IndexReader indexReader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("tests.awaitsfix", indexReader9, indexReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermsWithNameFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests12);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.IndexReader indexReader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertReaderStatisticsEquals("random", indexReader21, indexReader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader20, terms21, terms22, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setUp();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        java.lang.String str30 = simpleIndexQueryParserTests27.getTestName();
        simpleIndexQueryParserTests27.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests27, (java.lang.Object) simpleIndexQueryParserTests32);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.setUp();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("random", indexReader39, fields40, fields41, false);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests36.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests36);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Fields fields50 = null;
        org.apache.lucene.index.Fields fields51 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.failfast", indexReader49, fields50, fields51, true);
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain54;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<unknown>" + "'", str30, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain44);
        org.junit.Assert.assertNotNull(ruleChain54);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum26, postingsEnum27, false);
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.assertTermsStatisticsEquals("", terms31, terms32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.IndexReader indexReader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.assertReaderStatisticsEquals("random", indexReader14, indexReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexp();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment17 = simpleIndexQueryParserTests1.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader18, terms19, terms20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray3 = org.elasticsearch.test.ElasticsearchTestCase.generateRandomStringArray((int) '4', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests3.testAndFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermVectorsEquals("", indexReader5, indexReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader2 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("", indexReader2, 10, postingsEnum4, postingsEnum5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests3);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testTermFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.badapples", indexReader12, fields13, fields14, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoolFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testBadTypeMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match-query-bad-type.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        java.util.Random random0 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("<unknown>");
        org.apache.lucene.document.FieldType fieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field5 = org.apache.lucene.util.LuceneTestCase.newField(random0, "enwiki.random.lines.txt", (java.lang.Object) locale3, fieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "<unknown>");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader14, (int) (byte) 10, postingsEnum16, postingsEnum17, true);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("enwiki.random.lines.txt", indexReader22, fields23, fields24, false);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNotQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testEmptyBooleanQueryInsideFQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fquery-with-empty-bool-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilterParsing();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/function-filter-score-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule11 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/terms-query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule11);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests8.setUp();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setUp();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests12);
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain16;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader5, terms6, terms7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum12, postingsEnum13, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests5.assertFieldsEquals("random", indexReader8, fields9, fields10, false);
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests5, simpleIndexQueryParserTests14 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, simpleIndexQueryParserTestsArray18);
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet20 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray18);
        java.util.Set<org.junit.Assert> assertSet21 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray18);
        double[] doubleArray23 = new double[] { (byte) 10 };
        double[] doubleArray25 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray23, doubleArray25, (double) ' ');
        double[] doubleArray29 = new double[] { (byte) 10 };
        double[] doubleArray31 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray29, doubleArray31, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray29, (double) (-1));
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTestsArray18, (java.lang.Object) doubleArray29);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) doubleArray29);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain3);
        org.junit.Assert.assertNotNull(ruleChain13);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsArray18);
        org.junit.Assert.assertNotNull(simpleIndexQueryParserTestsList19);
        org.junit.Assert.assertNotNull(luceneTestCaseSet20);
        org.junit.Assert.assertNotNull(assertSet21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0]");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermNumericRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-numeric.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("random", indexReader24, (int) '4', postingsEnum26, postingsEnum27, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testTermsQueryFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests5.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.weekly", indexReader11, (int) '4', postingsEnum13, postingsEnum14);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanWithin.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        java.lang.String str8 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests5, (java.lang.Object) simpleIndexQueryParserTests10);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        java.lang.String str15 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain29;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain29);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain29;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRange2Query();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain29);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefixQueryBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix-with-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.assertDocValuesEquals("<unknown>", indexReader30, indexReader31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.weekly", indexReader6, terms7, terms8, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testNotFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter12();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance12.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("random", indexReader25, 1, postingsEnum27, postingsEnum28);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path32 = simpleIndexQueryParserTests16.getDataPath("tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: tests.slow");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path22 = simpleIndexQueryParserTests0.getDataPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: resource not found: hi!");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests11.testTermsFilterWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter7();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance7.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setUp();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        java.lang.String str24 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.setUp();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests21, (java.lang.Object) simpleIndexQueryParserTests26);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests30.setUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        simpleIndexQueryParserTests30.assertFieldsEquals("random", indexReader33, fields34, fields35, false);
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests30.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests30.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests30);
        org.apache.lucene.index.IndexReader indexReader43 = null;
        org.apache.lucene.index.Fields fields44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        simpleIndexQueryParserTests30.assertFieldsEquals("tests.failfast", indexReader43, fields44, fields45, true);
        org.junit.rules.RuleChain ruleChain48 = simpleIndexQueryParserTests30.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain48;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests50.setUp();
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        simpleIndexQueryParserTests50.assertFieldsEquals("random", indexReader53, fields54, fields55, false);
        org.junit.rules.RuleChain ruleChain58 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        simpleIndexQueryParserTests50.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests50.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests50.assertDocsEnumEquals("node_s_0", postingsEnum62, postingsEnum63, false);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        simpleIndexQueryParserTests50.assertTermsEquals("tests.nightly", indexReader67, terms68, terms69, false);
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.Fields fields74 = null;
        org.apache.lucene.index.Fields fields75 = null;
        simpleIndexQueryParserTests50.assertFieldsEquals("tests.weekly", indexReader73, fields74, fields75, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests78 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests78.resetCheckIndexStatus();
        simpleIndexQueryParserTests78.resetCheckIndexStatus();
        simpleIndexQueryParserTests78.ensureCleanedUp();
        simpleIndexQueryParserTests78.ensureCleanedUp();
        simpleIndexQueryParserTests78.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests78.ensureCheckIndexPassed();
        simpleIndexQueryParserTests78.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain87 = simpleIndexQueryParserTests78.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests88.ensureAllSearchContextsReleased();
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray90 = new org.apache.lucene.util.LuceneTestCase[] { simpleIndexQueryParserTests9, simpleIndexQueryParserTests50, simpleIndexQueryParserTests78, simpleIndexQueryParserTests88 };
        java.util.Set<org.apache.lucene.util.LuceneTestCase> luceneTestCaseSet91 = org.apache.lucene.util.LuceneTestCase.asSet(luceneTestCaseArray90);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) luceneTestCaseSet91);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoDistanceFilter8();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance8.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<unknown>" + "'", str24, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain38);
        org.junit.Assert.assertNotNull(ruleChain48);
        org.junit.Assert.assertNotNull(ruleChain58);
        org.junit.Assert.assertNotNull(ruleChain87);
        org.junit.Assert.assertNotNull(luceneTestCaseArray90);
        org.junit.Assert.assertNotNull(luceneTestCaseSet91);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        java.util.Random random0 = null;
        org.apache.lucene.util.BytesRef bytesRef2 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newStringField(random0, "tests.nightly", bytesRef2, store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfLengthBetween((int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLength(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoPolygonFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain7);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testOrFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/or-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("random", "tests.failfast", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSimpleQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/simple-query-string.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testPrefixQueryBoostQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.Path path2 = org.apache.lucene.util.LuceneTestCase.createTempFile("tests.monster", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertNormsEquals("tests.weekly", indexReader12, indexReader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        java.util.Random random0 = null;
        org.apache.lucene.document.Field.Store store3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newTextField(random0, "enwiki.random.lines.txt", "europarl.lines.txt.gz", store3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/range-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain2);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str12 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testAndFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<unknown>" + "'", str12, "<unknown>");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQueryWithFields2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween((int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests14.assertFieldsEquals("random", indexReader17, fields18, fields19, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests26.setUp();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests26);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests26.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain30;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests14);
        java.lang.String str35 = simpleIndexQueryParserTests14.getTestName();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain36;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFuzzyNumeric();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
        org.junit.Assert.assertNotNull(ruleChain11);
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<unknown>" + "'", str35, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain36);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.text.Collator collator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.lucene.util.LuceneTestCase.collate(collator0, "tests.failfast", "tests.slow");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoBoundingBoxFilter4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<unknown>" + "'", str10, "<unknown>");
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("<unknown>", "tests.badapples", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader5, terms6, terms7, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testAndNamedFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/and-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        double[] doubleArray3 = new double[] { (byte) 10 };
        double[] doubleArray5 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray3, doubleArray5, (double) ' ');
        double[] doubleArray9 = new double[] { (byte) 10 };
        double[] doubleArray11 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray9, doubleArray11, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray5, doubleArray11, (double) 10);
        double[] doubleArray18 = new double[] { (byte) 10 };
        double[] doubleArray20 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray18, doubleArray20, (double) ' ');
        double[] doubleArray24 = new double[] { (byte) 10 };
        double[] doubleArray26 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray26, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray20, doubleArray24, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setUp();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule37 = simpleIndexQueryParserTests32.ruleChain;
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray24, (java.lang.Object) simpleIndexQueryParserTests32);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray24, (double) (byte) 10);
        double[] doubleArray44 = new double[] { (byte) 10 };
        double[] doubleArray46 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray44, doubleArray46, (double) ' ');
        double[] doubleArray50 = new double[] { (byte) 10 };
        double[] doubleArray52 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray52, (double) ' ');
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray46, doubleArray52, (double) 10);
        double[] doubleArray59 = new double[] { (byte) 10 };
        double[] doubleArray61 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray61, (double) ' ');
        double[] doubleArray65 = new double[] { (byte) 10 };
        double[] doubleArray67 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray65, doubleArray67, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray65, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests73.setUp();
        simpleIndexQueryParserTests73.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests73);
        org.junit.rules.RuleChain ruleChain77 = simpleIndexQueryParserTests73.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule78 = simpleIndexQueryParserTests73.ruleChain;
        org.junit.rules.RuleChain ruleChain79 = simpleIndexQueryParserTests73.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray65, (java.lang.Object) simpleIndexQueryParserTests73);
        org.junit.Assert.assertArrayEquals(doubleArray52, doubleArray65, (double) (byte) 10);
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray11, doubleArray65, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain36);
        org.junit.Assert.assertNotNull(testRule37);
        org.junit.Assert.assertNotNull(ruleChain38);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain77);
        org.junit.Assert.assertNotNull(testRule78);
        org.junit.Assert.assertNotNull(ruleChain79);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testAndFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.nightly", indexReader8, fields9, fields10, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter9();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance9.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfCodepointLength((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.weekly", indexReader9, terms10, terms11, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermsFilterQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryString();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.monster", indexReader6, (int) (short) 0, postingsEnum8, postingsEnum9);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanFirstQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFirst.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testFilteredQuery4();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query4.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests0.ruleChain;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFields2Builder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule15);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.awaitsfix", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("<unknown>", indexReader18, fields19, fields20, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanOrQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanOr2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBoostingQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.util.Random random0 = null;
        java.lang.Object obj2 = null;
        org.apache.lucene.document.FieldType fieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field4 = org.apache.lucene.util.LuceneTestCase.newField(random0, "", obj2, fieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        java.lang.String str8 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests5, (java.lang.Object) simpleIndexQueryParserTests10);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        java.lang.String str15 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain29;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain29);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain29;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpFilteredQueryWithMaxDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-max-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain29);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader11, terms12, terms13, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanWithinQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanWithin.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoDistanceFilter6();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance6.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.awaitsfix", indexReader12, terms13, terms14, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        java.lang.String str8 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests5, (java.lang.Object) simpleIndexQueryParserTests10);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        java.lang.String str15 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("random", postingsEnum23, postingsEnum24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests18.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain29;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain29);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain29;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain29;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<unknown>" + "'", str8, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<unknown>" + "'", str15, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain29);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.testQueryStringFields1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testNotFilteredQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader9, fields10, fields11, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests15.setUp();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain18;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("node_s_0", postingsEnum7, postingsEnum8, true);
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.badapples", indexReader12, fields13, fields14, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoDistanceFilter10();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_distance10.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests11.testTermQueryBuilder();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testQueryStringRegexpTooManyDeterminizedStates();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-regexp-too-many-determinized-states.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        simpleIndexQueryParserTests11.ensureCleanedUp();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService executorService5 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] { executorService5 };
        java.util.concurrent.ExecutorService executorService7 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] { executorService7 };
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService[][] executorServiceArray13 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4, executorServiceArray6, executorServiceArray8, executorServiceArray10, executorServiceArray12 };
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, executorServiceArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) executorServiceArrayList14);
        org.junit.Assert.assertNotNull(executorServiceArray2);
        org.junit.Assert.assertNotNull(executorServiceArray4);
        org.junit.Assert.assertNotNull(executorServiceArray6);
        org.junit.Assert.assertNotNull(executorServiceArray8);
        org.junit.Assert.assertNotNull(executorServiceArray10);
        org.junit.Assert.assertNotNull(executorServiceArray12);
        org.junit.Assert.assertNotNull(executorServiceArray13);
        org.junit.Assert.assertNotNull(executorServiceArrayList14);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests14.assertDocsSkippingEquals("", indexReader16, 10, postingsEnum18, postingsEnum19, true);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests23 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests23.setUp();
        simpleIndexQueryParserTests23.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setUp();
        simpleIndexQueryParserTests27.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests27);
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain31;
        simpleIndexQueryParserTests23.failureAndSuccessEvents = ruleChain31;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain31;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanNearQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNear.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(testRule13);
        org.junit.Assert.assertNotNull(ruleChain31);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomRealisticUnicodeOfLengthBetween(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.elasticsearch.common.settings.Settings settings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment19 = simpleIndexQueryParserTests0.newNodeEnvironment(settings18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.IndexReader indexReader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.assertReaderEquals("", indexReader31, indexReader32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
        org.junit.Assert.assertNotNull(ruleChain29);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("random", indexReader5, fields6, fields7, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.setUp();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests14);
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain18;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain18;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain18;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) simpleIndexQueryParserTests2);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests2.testSpanContainingQueryParser();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanContaining.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain18);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.monster", postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader12, fields13, fields14, false);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testRegexpQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.rules.RuleChain ruleChain25 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testDefaultBooleanQueryMinShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
        org.junit.Assert.assertNotNull(ruleChain25);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader6, terms7, terms8, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testBooleanParsesFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        org.junit.Assert.assertEquals((double) 0L, (double) (byte) 1, (double) 100);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        org.apache.lucene.document.FieldType fieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newField("tests.badapples", "tests.failfast", fieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testSpanMultiTermPrefixQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-prefix.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testOrFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.iterations(2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 2, -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        org.apache.lucene.index.Fields fields27 = null;
        simpleIndexQueryParserTests22.assertFieldsEquals("random", indexReader25, fields26, fields27, false);
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests22.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests22);
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        org.apache.lucene.index.Fields fields37 = null;
        simpleIndexQueryParserTests22.assertFieldsEquals("tests.failfast", indexReader35, fields36, fields37, true);
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests22.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain40;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testQueryStringFieldsMatch();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-fields-match.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain30);
        org.junit.Assert.assertNotNull(ruleChain40);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: max must be >= min: 10, 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, true);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testNotFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/not-filter.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader4, fields5, fields6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests13);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain17;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain17;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain17;
        org.junit.Assert.assertNotNull("", (java.lang.Object) simpleIndexQueryParserTests1);
        java.lang.String str22 = simpleIndexQueryParserTests1.getTestName();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testGeoBoundingBoxFilter2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<unknown>" + "'", str22, "<unknown>");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFuzzyQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertNotNull(ruleChain13);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        simpleIndexQueryParserTests11.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testMultiMatchQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/multiMatch-query-simple.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests11.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum15, postingsEnum16, true);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("", indexReader20, terms21, terms22, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testNamedRegexpFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        org.junit.Assert.assertEquals(0.0d, (double) 2, (double) (short) 10);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.elasticsearch.test.ElasticsearchTestCase.scaledRandomIntBetween(2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("", indexReader7, (int) (byte) 0, postingsEnum9, postingsEnum10, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testFilteredQuery3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/filtered-query3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.test.ElasticsearchTestCase.randomAsciiOfLength((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setUp();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests4);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain8;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.test.ElasticsearchTestCase.randomUnicodeOfCodepointLengthBetween(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.TermsEnum termsEnum24 = null;
        org.apache.lucene.index.TermsEnum termsEnum25 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertTermsEnumEquals("hi!", indexReader23, termsEnum24, termsEnum25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testSpanMultiTermTermRangeQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/span-multi-term-range-term.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexableField indexableField11 = null;
        org.apache.lucene.index.IndexableField indexableField12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.assertStoredFieldEquals("tests.maxfailures", indexableField11, indexableField12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader3, fields4, fields5, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testTermNamedFilterQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/term-filter-named.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain10);
        org.junit.Assert.assertNotNull(ruleChain13);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.testFuzzyQueryWithFields();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/fuzzy-with-fields.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.setUp();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests5.assertDocsEnumEquals("random", postingsEnum10, postingsEnum11, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain16;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain16;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             simpleIndexQueryParserTests0.testTermsQueryWithMultipleFields();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<unknown>" + "'", str3, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain16);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray4, (double) ' ');
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0d };
        org.junit.Assert.assertArrayEquals(doubleArray8, doubleArray10, (double) ' ');
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray8, (double) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests16.setUp();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests16);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray8, (java.lang.Object) simpleIndexQueryParserTests16);
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests16.assertPositionsSkippingEquals("random", indexReader25, 1, postingsEnum27, postingsEnum28);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests16.testQueryStringTimezone();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/query-timezone.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
        org.junit.Assert.assertNotNull(ruleChain20);
        org.junit.Assert.assertNotNull(testRule21);
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMatchAllEmpty1();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/match_all_empty1.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, true);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("random", indexReader24, (int) '4', postingsEnum26, postingsEnum27, true);
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.assertTermsStatisticsEquals("tests.badapples", terms31, terms32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        simpleIndexQueryParserTests6.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testSpanNotQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanNot.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testFieldMaskingSpanQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/spanFieldMaskingTerm.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        java.lang.String str5 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests7.setUp();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) simpleIndexQueryParserTests7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("random", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame("node_s_0", (java.lang.Object) "", (java.lang.Object) simpleIndexQueryParserTests11);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, true);
        simpleIndexQueryParserTests11.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests11.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<unknown>" + "'", str5, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests9.setUp();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests9);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests9.assertTermsEquals("random", indexReader14, terms15, terms16, false);
        simpleIndexQueryParserTests9.setIndexWriterMaxDocs((int) 'a');
        simpleIndexQueryParserTests9.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests9);
        org.elasticsearch.common.unit.TimeValue timeValue23 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus26 = simpleIndexQueryParserTests9.ensureGreen(timeValue23, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain5);
        org.junit.Assert.assertNotNull(testRule6);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("node_s_0", indexReader8, (int) (short) 0, postingsEnum10, postingsEnum11);
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.maxfailures", indexReader14, fields15, fields16, false);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testGeoBoundingBoxFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_boundingbox3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain19);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testPrefiFilteredQueryBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.index.MergePolicy mergePolicy1 = org.apache.lucene.util.LuceneTestCase.newLogMergePolicy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests6.assertFieldsEquals("", indexReader12, fields13, fields14, false);
        simpleIndexQueryParserTests6.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests6.assertTermsEquals("hi!", indexReader19, terms20, terms21, false);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testGeoPolygonFilter3();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/geo_polygon3.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.String str4 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.setUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests6);
        simpleIndexQueryParserTests6.ensureCheckIndexPassed();
        java.lang.String str11 = simpleIndexQueryParserTests6.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.setUp();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        java.lang.String str16 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests18.setUp();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotSame("", (java.lang.Object) simpleIndexQueryParserTests13, (java.lang.Object) simpleIndexQueryParserTests18);
        org.junit.rules.RuleChain ruleChain22 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain22;
        org.junit.rules.RuleChain ruleChain24 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests6.testNamedAndCachedRegexpWithFlagsFilteredQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/regexp-filter-flags-named-cached.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<unknown>" + "'", str4, "<unknown>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<unknown>" + "'", str11, "<unknown>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<unknown>" + "'", str16, "<unknown>");
        org.junit.Assert.assertNotNull(ruleChain22);
        org.junit.Assert.assertNotNull(ruleChain24);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("node_s_0", postingsEnum12, postingsEnum13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.weekly", indexReader23, fields24, fields25, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testCommonTermsQuery2();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/commonTerms-query2.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.awaitsfix", indexReader4, 1, postingsEnum6, postingsEnum7, true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.env.NodeEnvironment nodeEnvironment10 = simpleIndexQueryParserTests0.newNodeEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testMoreLikeThisIds();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("random", indexReader6, terms7, terms8, false);
        simpleIndexQueryParserTests1.setUp();
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum13, postingsEnum14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader18, (int) (short) 100, postingsEnum20, postingsEnum21, true);
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testDisMax();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/disMax.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newStringField("", "", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.setUp();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests2, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet8 = org.apache.lucene.util.LuceneTestCase.asSet(objArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.setUp();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests10, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet16 = org.apache.lucene.util.LuceneTestCase.asSet(objArray15);
        org.junit.Assert.assertNotNull((java.lang.Object) objSet16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling22 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling23 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling22, throttling23 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling27 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling28 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling27, throttling28 };
        java.util.List<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, (java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray29);
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) throttlingArray24);
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet33 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        java.util.List<java.lang.Object> objList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Object[]) throttlingArray24);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests36.setUp();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 0.0f, simpleIndexQueryParserTests36, 100, 1.0d, 1 };
        java.util.Set<java.lang.Object> objSet42 = org.apache.lucene.util.LuceneTestCase.asSet(objArray41);
        java.lang.Iterable[] iterableArray44 = new java.lang.Iterable[4];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[] objIterableArray45 = (java.lang.Iterable<java.lang.Object>[]) iterableArray44;
        objIterableArray45[0] = objSet8;
        objIterableArray45[1] = objSet16;
        objIterableArray45[2] = objList34;
        objIterableArray45[3] = objSet42;
        java.lang.Iterable[][] iterableArray55 = new java.lang.Iterable[1][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Object>[][] objIterableArray56 = (java.lang.Iterable<java.lang.Object>[][]) iterableArray55;
        objIterableArray56[0] = objIterableArray45;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Iterable<java.lang.Object>[]> objIterableArrayList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(100, objIterableArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't pick 100 random objects from a list of 1 objects");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertTrue("'" + throttling22 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling22.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling23 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling23.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray24);
        org.junit.Assert.assertNotNull(throttlingEnumList25);
        org.junit.Assert.assertTrue("'" + throttling27 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling27.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertTrue("'" + throttling28 + "' != '" + org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER + "'", throttling28.equals(org.apache.lucene.store.MockDirectoryWrapper.Throttling.NEVER));
        org.junit.Assert.assertNotNull(throttlingArray29);
        org.junit.Assert.assertNotNull(throttlingEnumList30);
        org.junit.Assert.assertNotNull(throttlingEnumSet33);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objSet42);
        org.junit.Assert.assertNotNull(iterableArray44);
        org.junit.Assert.assertNotNull(objIterableArray45);
        org.junit.Assert.assertNotNull(iterableArray55);
        org.junit.Assert.assertNotNull(objIterableArray56);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        org.apache.lucene.document.Field.Store store2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.document.Field field3 = org.apache.lucene.util.LuceneTestCase.newTextField("tests.badapples", "tests.nightly", store2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No context information for thread: Thread[id=1, name=main, state=RUNNABLE, group=main]. Is this thread running under a class com.carrotsearch.randomizedtesting.RandomizedRunner runner context? Add @RunWith(class com.carrotsearch.randomizedtesting.RandomizedRunner.class) to your test class. Make sure your code accesses random contexts within @BeforeClass and @AfterClass boundary (for example, static test class initializers are not permitted to access random contexts).");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.Assert.assertNotNull("random", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum6, postingsEnum7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain12;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests1.testMLTMinimumShouldMatch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain12);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader3, fields4, fields5, false);
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // The following exception was thrown during execution in test generation
        try {
            simpleIndexQueryParserTests0.testWildcardBoostQuery();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Resource [/org/elasticsearch/index/query/wildcard-boost.json] not found in classpath");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ruleChain8);
    }
}
